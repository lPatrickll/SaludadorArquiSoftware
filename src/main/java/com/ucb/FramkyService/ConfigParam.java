
package com.ucb.FramkyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigParam {

    @Value("${DolarOff}")
    private double oficialDollar;

    public double getOficialDollar() {
        return oficialDollar;
    }

    public void setOficialDollar(double oficialDollar) {
        this.oficialDollar = oficialDollar;
    }
}
