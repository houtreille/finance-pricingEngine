package org.eblood.pricingengine.service.option;

import org.eblood.pricingengine.shared.finance.OptionType;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FxOptionVanillaPricingServiceImpl {

    public String price(Double spotValue, Double strikeValue, Double vol, Double r, Double q, Date valuationDate, Date maturityDate, OptionType optionType) {

        return "Fx Option Vanilla Controller";



    }


}
