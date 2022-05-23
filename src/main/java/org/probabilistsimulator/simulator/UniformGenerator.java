package org.probabilistsimulator.simulator;

import org.probabilistsimulator.seed.RandomSeedGenerator;

public class UniformGenerator extends ProbabilisticDistributionSimulator {

    private final double left;
    private final double right;

    public UniformGenerator(RandomSeedGenerator generator, double left, double right){
        super(generator);
        this.left = left;
        this.right = right;
    }

    @Override
    public double simulate() {
        double seed = generator.generateDouble();

        return left + (right - left) * seed;
    }
}
