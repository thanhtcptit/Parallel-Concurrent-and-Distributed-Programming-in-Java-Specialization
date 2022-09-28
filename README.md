# Syllabus

## Course 1: Parallel Programming in Java

This course teaches learners (industry professionals and students) the fundamental concepts of parallel programming in the context of Java 8. Parallel programming enables developers to use multicore computers to make their applications run faster by using multiple processors at the same time. By the end of this course, you will learn how to use popular parallel Java frameworks (such as ForkJoin, Stream, and Phaser) to write parallel programs for a wide range of multicore platforms including servers, desktops, or mobile devices, while also learning about their theoretical foundations including computation graphs, ideal parallelism, parallel speedup, Amdahl's Law, data races, and determinism.

Why take this course?

- All computers are multicore computers, so it is important for you to learn how to extend your knowledge of sequential Java programming to multicore parallelism.
- Java 7 and Java 8 have introduced new frameworks for parallelism (ForkJoin, Stream) that have significantly changed the paradigms for parallel programming since the early days of Java.
- Each of the four modules in the course includes an assigned mini-project that will provide you with the necessary hands-on experience to use the concepts learned in the course on your own, after the course ends.
- During the course, you will have online access to the instructor and the mentors to get individualized answers to your questions posted on forums.

The desired learning outcomes of this course are as follows:

- Theory of parallelism: computation graphs, work, span, ideal parallelism, parallel speedup, Amdahl's Law, data races, and determinism
- Task parallelism using Java’s ForkJoin framework
- Functional parallelism using Java’s Future and Stream frameworks
- Loop-level parallelism with extensions for barriers and iteration grouping (chunking)
- Dataflow parallelism using the Phaser framework and data-driven tasks

Mastery of these concepts will enable you to immediately apply them in the context of multicore Java programs, and will also provide the foundation for mastering other parallel programming systems that you may encounter in the future  (e.g., C++11, OpenMP, .Net Task Parallel Library).

**Week 1: Task Parallelism**

In this module, we will learn the fundamentals of task parallelism. Tasks are the most basic unit of parallel programming. An increasing number of programming languages (including Java and C++) are moving from older thread-based approaches to more modern task-based approaches for parallel programming. We will learn about task creation, task termination, and the “computation graph” theoretical model for understanding various properties of task-parallel programs. These properties include work, span, ideal parallelism, parallel speedup, and Amdahl’s Law. We will also learn popular Java APIs for task parallelism, most notably the Fork/Join framework.

Learning Objectives
- Demonstrate task parallelism using Asynkc/Finish constructs
- Create task-parallel programs using Java's Fork/Join Framework
- Interpret Computation Graph abstraction for task-parallel programs
- Evaluate the Multiprocessor Scheduling problem using Computation Graphs
- Assess sequetional bottlenecks using Amdahl's Law

**Week 2: Functional Parallelism**

Welcome to Module 2! In this module, we will learn about approaches to parallelism that have been inspired by functional programming. Advocates of parallel functional programming have argued for decades that functional parallelism can eliminate many hard-to-detect bugs that can occur with imperative parallelism. We will learn about futures, memoization, and streams, as well as data races, a notorious class of bugs that can be avoided with functional parallelism. We will also learn Java APIs for functional parallelism, including the Fork/Join framework and the Stream API’s.

Learning Objectives
- Demonstrate functional parallelism using the Future construct
- Create functional-parallel programs using Java's Fork/Join Framework
- Apply the princple of memoization to optimize functional parallelism
- Create functional-parallel programs using Java Streams
- Explain the concepts of data races and functional/structural determinism

**Week 3: Loop Parallelism**

Welcome to Module 3, and congratulations on reaching the midpoint of this course! It is well known that many applications spend a majority of their execution time in loops, so there is a strong motivation to learn how loops can be sped up through the use of parallelism, which is the focus of this module. We will start by learning how parallel counted-for loops can be conveniently expressed using forall and stream APIs in Java, and how these APIs can be used to parallelize a simple matrix multiplication program. We will also learn about the barrier construct for parallel loops, and illustrate its use with a simple iterative averaging program example. Finally, we will learn the importance of grouping/chunking parallel iterations to reduce overhead.

Learning Objectives
- Create programs with loop-level parallelism using the Forall and Java Stream constructs
- Evaluate loop-level parallelism in a matrix-multiplication example
- Examine the barrier construct for parallel loops
- Evaluate parallel loops with barriers in an iterative-averaging example
- Apply the concept of iteration grouping/chunking to improve the performance of parallel loops

**Week 4: Data flow Synchronization and Pipelining**

Welcome to the last module of the course! In this module, we will wrap up our introduction to parallel programming by learning how data flow principles can be used to increase the amount of parallelism in a program. We will learn how Java’s Phaser API can be used to implement “fuzzy” barriers, and also “point-to-point” synchronizations as an optimization of regular barriers by revisiting the iterative averaging example. Finally, we will also learn how pipeline parallelism and data flow models can be expressed using Java APIs.

Learning Objectives
- Create split-phase barriers using Java's Phaser construct
- Create point-to-point synchronization patterns using Java's Phaser construct
- Evaluate parallel loops with point-to-point synchronization in an iterative-averaging example
- Analyze pipeline parallelism using the principles of point-to-point synchronization
- Interpret data flow parallelism using the data-driven-task construct


## Course 2: Concurrent Programming in Java 

This course teaches learners (industry professionals and students) the fundamental concepts of concurrent programming in the context of Java 8.   Concurrent programming enables developers to efficiently and correctly mediate the use of shared resources in parallel programs.  By the end of this course, you will learn how to use basic concurrency constructs in Java such as threads, locks, critical sections, atomic variables, isolation, actors, optimistic concurrency and concurrent collections, as well as their theoretical foundations (e.g., progress guarantees, deadlock, livelock, starvation, linearizability).

Why take this course?

- It is important for you to be aware of the theoretical foundations of concurrency to avoid common but subtle programming errors. 
- Java 8 has modernized many of the concurrency constructs since the early days of threads and locks.
- During the course, you will have online access to the instructor and mentors to get individualized answers to your questions posted on the forums.
- Each of the four modules in the course includes an assigned mini-project that will provide you with the necessary hands-on experience to use the concepts learned in the course on your own, after the course ends.

The desired learning outcomes of this course are as follows:

- Concurrency theory: progress guarantees, deadlock, livelock, starvation, linearizability
- Use of threads and structured/unstructured locks in Java
- Atomic variables and isolation
- Optimistic concurrency and concurrent collections in Java (e.g., concurrent queues, concurrent  hashmaps)
- Actor model in Java

Mastery of these concepts will enable you to immediately apply them in the context of concurrent Java programs, and will also help you master other concurrent programming system that you may encounter in the future  (e.g., POSIX threads, .NET threads).

**Week 1: Threads and Locks**

In this module, we will learn about threads and locks, which have served as primitive building blocks for concurrent programming for over five decades. All computing platforms today include some form of support for threads and locks, and make them available for use by developers in a wide range of programming languages. We will learn how threads can be created, joined, and synchronized using structured (e.g., synchronized statements/methods) and unstructured (e.g., java.util.concurrent libraries) locks in Java. We will also learn about new classes of bugs that can arise when concurrent programs need to access shared resources. These bugs are referred to as violations of liveness/progress guarantees, and include deadlock, livelock, and starvation. We will conclude this module by studying different solutions to the classical "Dining Philosophers" problem, and use these solutions to illustrate instances of deadlock, livelock and starvation.

Learning Objectives
- Understand the role of Java threads in building concurrent programs
- Create concurrent programs using Java threads and the synchronized statement (structured locks)
- Create concurrent programs using Java threads and lock primitives in the java.util.concurrent library (unstructured locks)
- Analyze programs with threads and locks to identify liveness and related concurrency bugs
- Evaluate different approaches to solving the classical Dining Philosophers Problem

**Week 2: Critical Sections and Isolation**

In this module, we will learn different approaches to coordinating accesses to shared resources without encountering the deadlock or livelock bugs studied earlier. Critical/isolated sections are higher-level concurrent programming constructs (relative to locks) that simplify the implementation of mutual exclusion by guaranteeing the absence of deadlocks and livelocks. Object-based isolation relaxes the constraints imposed by critical sections by allowing mutual exclusion to be specified on a per-object basis, as illustrated in the Spanning Tree example. Java's atomic variables represent an important, but restricted, case of object-based isolation that is implemented efficiently on all hardware platforms. Finally, we will learn how object-based isolation can be further relaxed with read/write access modes.

Learning Objectives
- Create concurrent programs with critical sections to coordinate accesses to shared resources
- Create concurrent programs with object-based isolation to coordinate accesses to shared resources with more overlap than critical sections
- Evaluate different approaches to implementing the Concurrent Spanning Tree algorithm
- Create concurrent programs using Java's atomic variables
- Evaluate the impact of read vs. write operations on concurrent accesses to shared resources

**Week 3: Actors**

In this module, we will learn another high-level approach to concurrent programming called the "Actor" model. A major difference between the Actor model and the Isolated Sections model is that there are no data races possible in the Actor model because it does not allow for any form of shared variables. However, as in all concurrent programming models, higher-level forms of nondeterminism are still possible in the Actor model due to an inherent asynchrony in the order in which messages may be delivered. We will study multiple examples of concurrency using the Actor model, including the classical Sieve of Eratosthenes algorithm to generate prime numbers, as well as producer-consumer patterns with both unbounded and bounded buffers.

Learning Objectives
- Understand the Actor model for building concurrent programs
- Create simple concurrent programs using the Actor model
- Analyze an Actor-based implementation of the Sieve of Eratosthenes program
- Create Actor-based implementations of the Producer-Consumer pattern
- Create Actor-based implementations of concurrent accesses on a bounded resource

**Week 4: Concurrent Data Structures**

In this module, we will study Concurrent Data Structures, which form an essential software layer in all multithreaded programming systems. First, we will learn about Optimistic Concurrency, an important multithreaded pattern in which two threads can "optimistically" make progress on their assigned work without worrying about mutual conflicts, and only checking for conflicts before "committing" the results of their work. We will then study the widely-used Concurrent Queue data structure. Even though the APIs for using concurrent queues are very simple, their implementations using the Optimistic Concurrency model can be complex and error-prone. To that end, we will also learn the formal notion of Linearizability to better understand correctness requirements for concurrent data structures. We will then study Concurrent Hash Maps, another widely-used concurrent data structure. Finally, we discuss a concurrent algorithm for finding a Minimum Spanning Tree of an undirected graph, an algorithm that relies on the use of Concurrent Data Structures under the covers.

Learning Objectives
- Understand the principle of optimistic concurrency in concurrent algorithms
- Understand implementation of concurrent queues based on optimistic concurrency
- Understand linearizability as a correctness condition for concurrent data structures
- Create concurrent Java programs that use the java.util.concurrent.ConcurrentHashMap library
- Analyze a concurrent algorithm for computing a Minimum Spanning Tree of an undirected graph


## Course 3: Distributed Programming in Java

This course teaches learners (industry professionals and students) the fundamental concepts of Distributed Programming in the context of Java 8.  Distributed programming enables developers to use multiple nodes in a data center to increase throughput and/or reduce latency of selected applications.  By the end of this course, you will learn how to use popular distributed programming frameworks for Java programs, including Hadoop, Spark, Sockets, Remote Method Invocation (RMI), Multicast Sockets, Kafka, Message Passing Interface (MPI), as well as different approaches to combine distribution with multithreading.

Why take this course?

- All data center servers are organized as collections of distributed servers, and it is important for you to also learn how to use multiple servers for increased bandwidth and reduced latency.
- In addition to learning specific frameworks for distributed programming, this course will teach you how to integrate multicore and distributed parallelism in a unified approach.
- Each of the four modules in the course includes an assigned mini-project that will provide you with the necessary hands-on experience to use the concepts learned in the course on your own, after the course ends.
- During the course, you will have online access to the instructor and the mentors to get individualized answers to your questions posted on forums.

The desired learning outcomes of this course are as follows:

- Distributed map-reduce programming in Java using the Hadoop and Spark frameworks
- Client-server programming using Java's Socket and Remote Method Invocation (RMI) interfaces
- Message-passing programming in Java using the Message Passing Interface (MPI)
- Approaches to combine distribution with multithreading, including processes and threads, distributed actors, and reactive programming

Mastery of these concepts will enable you to immediately apply them in the context of distributed Java programs, and will also provide the foundation for mastering other distributed programming frameworks that you may encounter in the future  (e.g., in Scala or C++).

**Week 1: DISTRIBUTED MAP REDUCE**

In this module, we will learn about the MapReduce paradigm, and how it can be used to write distributed programs that analyze data represented as key-value pairs. A MapReduce program is defined via user-specified map and reduce functions, and we will learn how to write such programs in the Apache Hadoop and Spark projects. TheMapReduce paradigm can be used to express a wide range of parallel algorithms. One example that we will study is computation of the TermFrequency – Inverse Document Frequency (TF-IDF) statistic used in document mining; this algorithm uses a fixed (non-iterative) number of map and reduce operations. Another MapReduce example that we will study is parallelization of the PageRank algorithm. This algorithm is an example of iterative MapReduce computations, and is also the focus of the mini-project associated with this module.

Learning Objectives
- Explain the MapReduce paradigm for analyzing data represented as key-value pairs.
- Apply the MapReduce paradigm to programs written using the Apache Hadoop framework.
- Create Map Reduce programs using the Apache Spark framework.
- Acknowledge the TF-IDF statistic used in data mining, and how it can be computed using the MapReduce paradigm
- Create an implementation of the PageRank algorithm using the Apache Spark framework

**Week 2: CLIENT-SERVER PROGRAMMING**

In this module, we will learn about client-server programming, and how distributed Java applications can communicate with each other using sockets. Since communication via sockets occurs at the level of bytes, we will learn how to serialize objects into bytes in the sender process and to deserialize bytes into objects in the receiver process. Sockets and serialization provide the necessary background for theFile Server mini-project associated with this module. We will also learn about Remote Method Invocation (RMI), which extends the notion of method invocation in a sequential program to a distributed programming setting. Likewise, we will learn about multicast sockets,which generalize the standard socket interface to enable a sender to send the same message to a specified set of receivers; this capability can be very useful for a number of applications, including news feeds,video conferencing, and multi-player games. Finally, we will learn about distributed publish-subscribe applications, and how they can be implemented using the Apache Kafka framework.

Learning Objectives
- Generate distributed client-server applications using sockets.
- Demonstrate different approaches to serialization and deserialization of data structures for distributed programming.
- Recall the use of remote method invocations as a higher-level primitive for distributed programming (compared to sockets)
- Evaluate the use of multicast sockets as a generalization of sockets.
- Employ distributed publish-subscribe applications using the Apache Kafka framework.

**Week 3: MESSAGE PASSING**

In this module, we will learn how to write distributed applications in the Single Program Multiple Data (SPMD) model, specifically by using the Message Passing Interface (MPI) library. MPI processes can send and receive messages using primitives for point-to-point communication, which are different in structure and semantics from message-passing with sockets. We will also learn about the message ordering and deadlock properties of MPI programs. Non-blocking communications are an interesting extension of point-to-point communications, since they can be used to avoid delays due to blocking and to also avoid deadlock-related errors. Finally, we will study collective communication, which can involve multiple processes in a manner that is more powerful than multicast and publish-subscribe operations. The knowledge of MPI gained in this module will be put to practice in the mini-project associated with this module on implementing a distributed matrix multiplication program in MPI.

Learning Objectives
- Create distributed applications using the Single Program Multiple Data (SPMD) model.
- Create message-passing programs using point-to-point communication primitives in MPI
- Identify message ordering and deadlock properties of MPI programs.
- Evaluate the advantages of non-blocking communication relative to standard blocking communication primitives.
- Explain collective communication as a generalization of point-to-point communication.

**Week 4: COMBINING DISTRIBUTION AND MULTITHREADING**

In this module, we will study the roles of processes and threads as basic building blocks of parallel, concurrent, and distributed Java programs. With this background, we will then learn how to implement multithreaded servers for increased responsiveness in distributed applications written using sockets, and apply this knowledge in the mini-project on implementing a parallel file server using both multithreading and sockets. An analogous approach can also be used to combine MPI and multithreading, so as to improve the performance of distributed MPI applications. Distributed actors serve as yet another example of combining distribution and multithreading. A notable property of the actor model is that the same high-level constructs can be used to communicate among actors running in the same process and among actors in different processes; the difference between the two cases depends on the application configuration, rather the application code. Finally, we will learn about the reactive programming model,and its suitability for implementing distributed service oriented architectures using asynchronous events.

Learning Objectives
- Distinguish processes and threads as basic building blocks of parallel, concurrent, and distributed Java programs.
- Create multithreaded servers in Java using threads and processes.
- Demonstrate how multithreading can be combined with message-passing programming models like MPI
- Analyze how the actor model can be used for distributed programming.
- Assess how the reactive programming model can be used for distrubted programming.


# Certificate

![Certificate](https://s3.amazonaws.com/coursera_assets/meta_images/generated/CERTIFICATE_LANDING_PAGE/CERTIFICATE_LANDING_PAGE~YKPPU25EHR77/CERTIFICATE_LANDING_PAGE~YKPPU25EHR77.jpeg)