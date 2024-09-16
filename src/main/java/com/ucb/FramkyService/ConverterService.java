package com.ucb.FramkyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    private ConfigParam configParam;

    @Autowired
    public ConverterService(ConfigParam configParam) {
        this.configParam = configParam;
    }

    public double calculocelciusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double calculofarenheitToCelsius(double fahrenheit) {
        // Corrige la fórmula
        return (fahrenheit - 32) * 5 / 9;
    }

    public double calculateDollarConversion(double bolivian) {
        return bolivian * configParam.getOficialDollar();
    }
}
