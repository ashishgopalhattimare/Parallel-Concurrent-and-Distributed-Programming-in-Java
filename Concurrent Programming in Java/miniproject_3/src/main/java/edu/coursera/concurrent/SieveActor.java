package edu.coursera.concurrent;

import edu.rice.pcdp.Actor;
import static edu.rice.pcdp.PCDP.finish;

/**
 * An actor-based implementation of the Sieve of Eratosthenes.
 *
 * TODO Fill in the empty SieveActorActor actor class below and use it from
 * countPrimes to determin the number of primes <= limit.
 */
public final class SieveActor extends Sieve {
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
        final SieveActorActor startSieve = new SieveActorActor(2);

        // Finish all the threads before executing the sum
        finish(() -> {
            for(int i = 3; i <= limit; i+= 2) {
                startSieve.send(i);
            }
            startSieve.send(0);
        });

        SieveActorActor temp = startSieve;
        int result = 0;
        while(temp != null) {
            result += temp.numLocalPrimes;
            temp = temp.nextActor;
        }
        return result;
    }

    /**
     * An actor class that helps implement the Sieve of Eratosthenes in
     * parallel.
     */
    public static final class SieveActorActor extends Actor {
        /**
         * Process a single message sent to this actor.
         *
         * TODO complete this method.
         *
         * @param msg Received message
         */

        static final int MAX_LOCAL_PRIMES = 1000;

        int[] localPrimes = new int[MAX_LOCAL_PRIMES];
        private SieveActorActor nextActor;
        private int numLocalPrimes = 0;

        public SieveActorActor(int candidate) {
            localPrimes[numLocalPrimes++] = candidate;
            nextActor = null;
        }

        @Override
        public void process(final Object msg) {

            final int candidate = (Integer)msg;

            if(candidate <= 0) { // end of loop, go to next localPrime, if exist
                if (nextActor != null) {
                    nextActor.send(msg);
                }
            } else {
                final boolean localPrime = isLocallyPrime(candidate);
                if(localPrime) {
                    if(numLocalPrimes < MAX_LOCAL_PRIMES) {
                        localPrimes[numLocalPrimes++] = candidate;
                    }
                    // Send the msg, down the chain
                    else if(nextActor == null) {
                        nextActor = new SieveActorActor(candidate);
                    }
                    else {
                        nextActor.send(msg);
                    }
                }
            }
        }

        private boolean isLocallyPrime(int x) {
            for(int i = 0; i < numLocalPrimes; i++) {
                if(x % localPrimes[i] == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
