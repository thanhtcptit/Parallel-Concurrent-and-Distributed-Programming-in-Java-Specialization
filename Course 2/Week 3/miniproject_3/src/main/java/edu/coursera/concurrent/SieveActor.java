package edu.coursera.concurrent;

import edu.rice.pcdp.Actor;

import java.util.ArrayList;
import java.util.List;

import static edu.rice.pcdp.PCDP.finish;

/**
 * An actor-based implementation of the Sieve of Eratosthenes.
 *
 * TODO Fill in the empty SieveActorActor actor class below and use it from
 * countPrimes to determin the number of primes <= limit.
 */
public final class SieveActor extends Sieve {
    public static final int MAX_LOCAL_PRIMES = 100;
    /**
     * {@inheritDoc}
     *
     * TODO Use the SieveActorActor class to calculate the number of primes <=
     * limit in parallel. You might consider how you can model the Sieve of
     * Eratosthenes as a pipeline of actors, each corresponding to a single
     * prime number.
     */
    @Override
    public int countPrimes(final int limit) {
        int numPrimes = 0;

        final SieveActorActor actor = new SieveActorActor();
        finish(() -> {
            actor.send(2);
            for (int i = 3; i <= limit; i += 2) {
                actor.send(i);
            }
            actor.send(0);
        });

        SieveActorActor tmp = actor;
        while (tmp != null) {
            numPrimes += tmp.getNumLocalPrimes();
            tmp = tmp.getNextActor();
        }
        return numPrimes;
    }

    /**
     * An actor class that helps implement the Sieve of Eratosthenes in
     * parallel.
     */
    public static final class SieveActorActor extends Actor {
        private SieveActorActor nextActor;

        private List<Integer> localPrimes = new ArrayList<>();

        public SieveActorActor getNextActor() { return nextActor; }

        public int getNumLocalPrimes() { return localPrimes.size(); }

        /**
         * Process a single message sent to this actor.
         *
         * TODO complete this method.
         *
         * @param msg Received message
         */
        @Override
        public void process(final Object msg) {
            final int candidate = (Integer) msg;
            if (candidate <= 0) {
                if (nextActor != null) nextActor.send(msg);
            } else if (checkPrime(candidate)){
                if (localPrimes.size() < SieveActor.MAX_LOCAL_PRIMES) {
                    localPrimes.add(candidate);
                } else {
                    if (nextActor == null) {
                        nextActor = new SieveActorActor();
                    }
                    nextActor.send(msg);
                }
            }
        }

        private boolean checkPrime(int candidate) {
            for (Integer p : localPrimes) {
                if (candidate % p == 0) return false;
            }
            return true;
        }
    }
}
