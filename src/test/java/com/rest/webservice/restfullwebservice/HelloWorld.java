package com.rest.webservice.restfullwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping(path="/helloWorld")
    public String helloWorld() {
        return "hello world";
    }

}
