package org.eblood.pricingengine.shared.math;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class FunctionalProgrammingTest {

    @Test
    void function() {
        Function<String, String> squaredFunction = x -> "("+ x + "^2)";
        Function<String, String> times2Function = x -> "("+ x + "*2)";


        Function<String, String> times2ThenSquared = squaredFunction.compose(times2Function);
        Function<String, String> squaredThenTimes2 = squaredFunction.andThen(times2Function);

        System.out.println(times2ThenSquared.apply("x"));
        System.out.println(squaredThenTimes2.apply("x"));
    }



}
