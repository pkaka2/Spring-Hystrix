package com.spring.Hystrix;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerImpl implements GreetingController {

    public String greeting(@PathVariable("username") String username) {
        return String.format("Hello %s!\n", username);
    }
}