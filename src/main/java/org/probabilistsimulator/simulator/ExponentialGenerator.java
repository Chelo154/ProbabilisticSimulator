package org.probabilistsimulator.simulator;

import org.probabilistsimulator.seed.RandomSeedGenerator;

public class ExponentialGenerator extends ProbabilisticDistributionSimulator {

    private final double eventQuantity;

    private final double continuous;

    public ExponentialGenerator(RandomSeedGenerator generator, double eventQuantity, double continuous ){
        super(generator);
        this.continuous = continuous;
        this.eventQuantity = eventQuantity;
    }

    @Override
    public double simulate() {
        double seed = generator.generateDouble();

        double alpha = eventQuantity / continuous;

        double function = 1/alpha;

        return  - function * Math.log(seed);
    }
}
