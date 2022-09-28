package edu.coursera.distributed;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * A basic and very limited implementation of a file server that responds to GET
 * requests from HTTP clients.
 */
public final class FileServer {
    /**
     * Main entrypoint for the basic file server.
     *
     * @param socket Provided socket to accept connections on.
     * @param fs A proxy filesystem to serve files from. See the PCDPFilesystem
     *           class for more detailed documentation of its usage.
     * @throws IOException If an I/O error is detected on the server. This
     *                     should be a fatal error, your file server
     *                     implementation is not expected to ever throw
     *                     IOExceptions during normal operation.
     */
    public void run(final ServerSocket socket, final PCDPFilesystem fs)
            throws IOException {
        /*
         * Enter a spin loop for handling client requests to the provided
         * ServerSocket object.
         */
        while (true) {
            Socket s = socket.accept();

            InputStream stream = s.getInputStream();
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buffered = new BufferedReader(reader);

            String line = buffered.readLine();
            assert  line != null;
            assert line.startsWith("GET");
            final String path = line.split(" ")[1];
            final PCDPPath fullPath = new PCDPPath(path);

            OutputStream out = s.getOutputStream();
            PrintWriter printer = new PrintWriter(out);

            String content = fs.readFile(fullPath);
            if (content != null) {
                printer.write("HTTP/1.0 200 OK\r\n");
                printer.write("Server: FileServer\r\n");
                printer.write("\r\n");
                printer.write(content + "\r\n");
            } else {
                printer.write("HTTP/1.0 404 Not Found\r\n");
                printer.write("Server: FileServer\r\n");
                printer.write("\r\n");
            }
            printer.close();

            stream.close();
            out.close();
            s.close();
        }
    }
}
