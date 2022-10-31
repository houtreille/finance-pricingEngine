package org.eblood.pricingengine.shared.math;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

class IntegralTest {

    @Test
    void integrateFunction() {
        Function<Double, Double> squareX = x -> x*x;

        Double i1 = Integral.integrateFunction(squareX, 2. , 5. , 100);
        System.out.println(i1);
    }
}