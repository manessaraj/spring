package com.smanes.dataserver.controllers;

import com.smanes.dataserver.services.GreetingService;
import com.smanes.dataserver.services.GreetingServiceConstructorImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;
    private final GreetingService primaryGreetingService;
    public MyController(@Qualifier("greetingServiceConstructorImpl") GreetingService greetingService, GreetingService primaryGreetingService) {
        this.greetingService = greetingService;
        this.primaryGreetingService = primaryGreetingService;
    }

    public String sayHello() {
        return primaryGreetingService.sayGreeting();
    }

}
