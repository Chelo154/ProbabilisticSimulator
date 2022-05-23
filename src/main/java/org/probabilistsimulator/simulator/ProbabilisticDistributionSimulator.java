package org.probabilistsimulator.simulator;

import org.probabilistsimulator.seed.RandomSeedGenerator;

import java.util.Random;

public abstract class ProbabilisticDistributionSimulator {
    protected RandomSeedGenerator generator;

    public ProbabilisticDistributionSimulator(RandomSeedGenerator generator){
        this.generator = generator;
    }

    public abstract double simulate();
}
