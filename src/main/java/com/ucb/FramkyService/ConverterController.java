package com.ucb.FramkyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    ConverterService converterService;

    @Autowired
    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }

    @GetMapping("/status")
    public String getStatus() {
        return "ok";
    }

    @GetMapping("/status2")
    public String getStatus2() {
        return "ok2";
    }

    @PostMapping("/converter/celsius-to-far")
    public ResponseEntity<ConverterResponseDto> celsiusToFahrenheit(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto responseDto = new ConverterResponseDto(
                converterService.calculocelciusToFahrenheit(
                        converterRequestDto.getValue() // Cambiado a getValue()
                ),
                "F"
        );
        return ResponseEntity.ok(responseDto);
    }

    @PostMapping("/converter/dollar")
    public ResponseEntity<ConverterResponseDto> dollarConversion(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto responseDto = new ConverterResponseDto(
                converterService.calculateDollarConversion(
                        converterRequestDto.getValue() // Cambiado a getValue()
                ),
                "USD"
        );
        return ResponseEntity.ok(responseDto);
    }

}
