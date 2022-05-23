package org.probabilistsimulator.seed;

import java.util.Random;

public class StandardRandom implements RandomSeedGenerator {

    private final Random random;

    public StandardRandom(){
        random = new Random();
    }

    @Override
    public int generateInt() {
        return random.nextInt();
    }

    @Override
    public double generateDouble() {
        return random.nextDouble();
    }
}
