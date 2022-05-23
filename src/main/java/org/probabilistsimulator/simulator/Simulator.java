package org.probabilistsimulator.simulator;

import org.probabilistsimulator.seed.RandomSeedGenerator;

import java.util.Random;

public class Simulator {
    private final RandomSeedGenerator generator;

    public Simulator(RandomSeedGenerator generator) {
        this.generator = generator;
    }

    public double simulateUniform(double left, double right){
        return new UniformGenerator(generator,left, right)
                .simulate();
    }

    public double simulateExponential(double quantity,double continuous){
        return new ExponentialGenerator(generator,quantity,continuous)
                .simulate();
    }

    public double simulateNormal(double media, double deviation){
        return new NormalGenerator(generator,media,deviation)
                .simulate();
    }

    public double simulateBinomial(){
        return new BinomialGenerator(generator)
                .simulate();
    }

    public double simulatePoisson(double quantity, double continuous){
        return new PoissonGenerator(generator,quantity,continuous)
                .simulate();
    }
}
