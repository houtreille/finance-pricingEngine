package org.eblood.pricingengine.shared.math.probability;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NormalLaw extends ProbabilityLaw {

    double mu;
    double rho;



    @Override
    public double getDensitiy( double x) {
        return (1./(rho * Math.sqrt(2 * Math.PI))) * Math.exp ( -(1/2.) * Math.pow((x-mu)/rho,2.));
    }
}
