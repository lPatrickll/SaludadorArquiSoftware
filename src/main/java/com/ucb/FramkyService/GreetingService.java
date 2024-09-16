package com.ucb.FramkyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {


    @Value("${Saludo}")
    private String SaludoOff;

    public String getGreeting() {
        return SaludoOff;
    }
}
