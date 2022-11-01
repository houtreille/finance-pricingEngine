package org.eblood.pricingengine.shared.math.probability;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NormalLawTest {

    @Test
    void getDensitiy() {
        //Loi Normale Centrée réduite
        NormalLaw normalLaw = new NormalLaw(0., 1.);

        double sum = 0.;
        System.out.println("x;f(x)");
        for (int x = -5; x <= 5 ; x++) {
            double density = normalLaw.getDensitiy(x);
            System.out.println(x+ ";" + density);
            sum+= density;
        }

        assertThat(sum).isCloseTo(1., Percentage.withPercentage(3));


        NormalLaw normalLaw_0_0p2 = new NormalLaw(0., Math.sqrt(0.2));

        sum = 0.;

        System.out.println("x;f(x)");
        for (int x = -5; x <= 5 ; x++) {
            double density = normalLaw_0_0p2.getDensitiy(x);
            System.out.println(x+ ";" + density);
            sum+= density;
        }

        assertThat(sum).isCloseTo(1., Percentage.withPercentage(3.));

    }
}