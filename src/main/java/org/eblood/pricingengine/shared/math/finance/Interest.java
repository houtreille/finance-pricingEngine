package org.eblood.pricingengine.shared.math.finance;

public class Interest {


    public static Double getInterestRate(Double tenor, Double rate, Double compoundByYear) {
        return  getInterestAmount(1.,tenor,rate,compoundByYear, false);
    }

    public static Double getInterestAmount(Double amount, Double tenor, Double rate, Double compoundByYear) {
        return  getInterestAmount(amount,tenor,rate,compoundByYear, false);
    }

    public static Double getInterestAmount(Double amount, Double tenor, Double rate, Double compoundByYear, boolean continuous) {
        if(continuous) {
            return amount * (1 + Math.exp(rate)) - amount;
        } else {
            return amount * Math.pow(1 + rate/compoundByYear, tenor * compoundByYear) - amount;
        }
    }

    public static Double getZeroCouponRate(Double tenor, Double rate, Double compoundByYear, boolean continuous){
        return 1. / (1. + getInterestRate(tenor,rate, compoundByYear));
    }

    public static Double getAmountAtMaturity(Double amount, Double tenor, Double rate, Double compoundByYear) {
        return amount + getInterestAmount(amount, tenor, rate, compoundByYear);
    }

}
