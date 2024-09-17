package com.ucb.FramkyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${greeting.messages.en}")
    private String defaultGreetingMessage;

    @Value("${greeting.messages.es}")
    private String spanishGreetingMessage;

    public String getGreeting(String language) {
        switch (language.toLowerCase()) {
            case "es":
                return spanishGreetingMessage;
            case "en":
            default:
                return defaultGreetingMessage;
        }
    }

    public String getPersonalizedGreeting(String name, String language) {
        String greetingMessage = getGreeting(language);
        return String.format("%s, %s", name, greetingMessage);
    }
}
