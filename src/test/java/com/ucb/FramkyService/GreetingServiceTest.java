package com.ucb.FramkyService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    @Test
    void getGreeting() {

        GreetingService greetingService = new GreetingService();
        assertEquals(
                "Preguntate si lo que estas haciendo hoy te acerca al lugar en el que quieres estar manana",
                greetingService.getGreeting()
        );
    }
}