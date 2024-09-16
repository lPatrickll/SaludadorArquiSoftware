package com.ucb.FramkyService;

public class ConverterResponseDto {
    private double value;
    private String type;

    public ConverterResponseDto(double value, String type) {
        this.value = value;
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
