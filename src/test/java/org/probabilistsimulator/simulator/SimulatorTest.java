package org.probabilistsimulator.simulator;

import org.junit.Before;
import org.junit.Test;
import org.probabilistsimulator.seed.StandardRandom;

import static org.assertj.core.api.Assertions.*;

public class SimulatorTest {

    private Simulator simulator;

    @Before
    public void setUp(){
        simulator = new Simulator(new StandardRandom());
    }

    @Test
    public void simulateUniform(){
        double left = 100;
        double right = 150;

        double simulated = simulator.simulateUniform(left,right);

        assertThat(simulated)
                .isBetween(left,right);
    }

    @Test
    public void simulateExponential(){
        double quantity = 50;
        double time = 60;

        double maxFrecuency = quantity/time;

        double simulated = simulator.simulateExponential(quantity,time);

        assertThat(simulated)
                .isNotZero();
    }

    @Test
    public void simulateNormal(){
        double media = 200;
        double deviation = 25;

        double simulated = simulator.simulateNormal(media,deviation);

        assertThat(simulated)
                .isNotZero();
    }

    @Test
    public void simulateBinomial(){
        double simulated = simulator.simulateBinomial();

        assertThat(simulated)
                .isNotZero();
    }

    @Test
    public void simulatePoisson(){
        double quantity = 50;
        double time = 60;

        double simulated = simulator.simulatePoisson(quantity,time);

        assertThat(simulated)
                .isLessThanOrEqualTo(quantity);
    }

}