package org.eblood.pricingengine.controller;

import org.eblood.pricingengine.service.option.FxOptionVanillaPricingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricingFxOptionController {

    @Autowired
    FxOptionVanillaPricingServiceImpl fxOptionVanillaPricingService;

    @GetMapping("/option/fx/vanilla")
    public String priceFxVanilla(){
        return fxOptionVanillaPricingService.price(null, null, null, null, null, null, null, null);
    }


}
