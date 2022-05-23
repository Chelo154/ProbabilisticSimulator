package org.probabilistsimulator.simulator;

import org.probabilistsimulator.seed.RandomSeedGenerator;

public class PoissonGenerator extends ProbabilisticDistributionSimulator{

    private final double eventQuantity;
    private final double continous;

    public PoissonGenerator(RandomSeedGenerator generator, double eventQuantity, double continous){
        super(generator);
        this.continous = continous;
        this.eventQuantity = eventQuantity;
    }

    @Override
    public double simulate() {
        double alpha = eventQuantity / continous;

        double exponential = Math.exp(-alpha);

        double success = 0;

        double p = 1;

        while(p > exponential){
            p *= generator.generateDouble();

            success++;
        }

        return success;
    }
}
