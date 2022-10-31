package org.eblood.pricingengine.shared.math;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

class DerivationTest {

    @Test
    void derivFunctional() {

        Function<Double,Double> f_x_ = x -> x*x;
        System.out.println(f_x_.apply(5.));



        Double fDeriv5 = Derivation.derivFunctional(f_x_).apply(5.);

        Double sinDeriv = Derivation.derivFunctional(Math::sin).apply(Math.PI * 2);

        System.out.println(fDeriv5);
        System.out.println(sinDeriv);
    }
}