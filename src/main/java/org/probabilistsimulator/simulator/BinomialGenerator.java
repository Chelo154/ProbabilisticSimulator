package org.probabilistsimulator.simulator;

import org.probabilistsimulator.seed.RandomSeedGenerator;

public class BinomialGenerator extends ProbabilisticDistributionSimulator{

    public BinomialGenerator(RandomSeedGenerator generator) {
        super(generator);
    }

    @Override
    public double simulate() {
        return generator.generateDouble();
    }
}
