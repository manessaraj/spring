package com.smanes.dataserver.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceImplTest {

    private GreetingService greetingService;
    @BeforeEach
    void setUp() {
        this.greetingService = new GreetingServiceConstructorImpl();
    }

    @Test
    void testGreetings() {
        assertNotEquals(this.greetingService.sayGreeting(), "");
    }
}