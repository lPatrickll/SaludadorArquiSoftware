package com.ucb.FramkyService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void testGetGreetingInSpanish() {
        String expectedMessage = "Preguntate si lo que estas haciendo hoy te acerca al lugar en el que quieres estar manana";
        String actualMessage = greetingService.getGreeting();
        assertEquals(expectedMessage, actualMessage);
    }
}