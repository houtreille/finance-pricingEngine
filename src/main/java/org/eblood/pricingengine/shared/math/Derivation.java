package org.eblood.pricingengine.shared.math;

import java.util.function.DoubleFunction;
import java.util.function.Function;

public class Derivation {

    static double dx = 0.01;

    public static DoubleFunction<Double> derivFunctional(Function<Double, Double> functionToDerive) {
       return x -> (functionToDerive.apply(x + dx) - functionToDerive.apply(x)) / dx;
    }




}
