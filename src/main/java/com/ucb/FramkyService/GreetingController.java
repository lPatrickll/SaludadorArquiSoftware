package com.ucb.FramkyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "en") String language) {
        return greetingService.getGreeting(language);
    }

    @GetMapping("/greet-personalized")
    public String greetPersonalized(@RequestParam String name, @RequestParam(defaultValue = "en") String language) {
        return greetingService.getPersonalizedGreeting(name, language);
    }
}
