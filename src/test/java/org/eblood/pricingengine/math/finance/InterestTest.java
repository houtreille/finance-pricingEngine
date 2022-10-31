package org.eblood.pricingengine.math.finance;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InterestTest {

    @Test
    void getInterestAmount() {

        Double r = 0.05;

        Double r1 = Math.pow(1 + r/1., 1.);
        Double r2 = Math.pow(1 + r/2., 2.);
        Double r1000 = Math.pow(1 + r/100000., 100000.);
        Double rLn = Math.exp(r);

        Double amount = 1000.;


        assertThat(Interest.getInterestAmount(amount, 1.0, r, 1.)).isEqualTo((amount*r)     );
        assertThat(Interest.getInterestAmount(amount, 2.0, r, 1.)).isEqualTo((102.5) );

        assertThat(amount - amount)
                .isLessThan(Interest.getInterestAmount(amount, 1.0, r, 1.))
                .isLessThan(Interest.getInterestAmount(amount, 1.0, r, 2.))
                .isLessThan(Interest.getInterestAmount(amount, 1.0, r, 10.))
                .isLessThan(Interest.getInterestAmount(amount, 1.0, r, 10., true));




    }

    @Test
    void getInterestRate() {

        Double r = 0.05;

        assertThat(Interest.getInterestRate(1.0, r, 1.)).isCloseTo(r, Percentage.withPercentage(0.000001));
    }

    @Test
    void getZeroCouponRate() {

        Double rate = 0.05;




        Double zc = Interest.getZeroCouponRate(2., rate,  1., false);
        Double amountAtMaturity = Interest.getAmountAtMaturity(100. * zc, 2., rate, 1.);

    }
}