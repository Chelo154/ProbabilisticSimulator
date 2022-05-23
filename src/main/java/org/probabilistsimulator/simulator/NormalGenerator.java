package org.probabilistsimulator.simulator;

import org.probabilistsimulator.seed.RandomSeedGenerator;

public class NormalGenerator extends ProbabilisticDistributionSimulator{

    private final double medium;
    private final double deviation;

    public NormalGenerator(RandomSeedGenerator generator,double medium, double deviation){
        super(generator);
        this.medium = medium;
        this.deviation = deviation;
    }

    @Override
    public double simulate() {
        double sum = 0;

        for(int i = 0; i < 12; i++){
            double seed = generator.generateDouble();
            sum += seed;
        }

        return  deviation * (sum - 6) + medium;
    }
}
