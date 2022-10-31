package org.eblood.pricingengine.shared.math;

import java.util.function.Function;

public class Integral {

    public static Double integrateFunction(Function<Double, Double> functionToIntegrate, Double a, Double b, int steps) {

        Double sum = 0.;
        Double dt = (b - a) / steps;
/*

        Double den = 0.;

        if(steps == 5){
            den = 2.;
        } if(steps == 10){
            den = 4.;
        } if(steps == 20){
            den = 8.;
        }

*/



        for (int i = 0; i < steps; i++) {
            sum += (functionToIntegrate.apply(a + dt*i) +  functionToIntegrate.apply(a + dt*(i+1))   ) / ( 2/dt );
        }

        return sum;
    }


}
