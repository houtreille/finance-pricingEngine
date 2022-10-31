package org.eblood.pricingengine.shared.math.finance;

import java.util.Date;

public class OptionUtils {

    public double getD1(double S, double K, double vol, double r, double t, double T ) {
        Double ttm = getTtm(t, T);
        return   (1./(vol * Math.sqrt(ttm))) * (Math.log(S/K)  +  (r + ((vol*vol) / 2.)) * ttm);
    }

    public double getD2(double S, double K, double vol, double r, double t, double T ) {
        return getD1(S,K,vol, r, t, T) - vol * Math.sqrt(T - t);
    }


    public double getTtm(double t, Double T) {
        return T - t;
    }


    public double getTtm(Date valuationDate, Date maturityDate) {
        return -1;
    }


}
