package com.smanes.dataserver.controllers;

import com.smanes.dataserver.services.GreetingService;
import com.smanes.dataserver.services.PropertyInjectedGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }


}
