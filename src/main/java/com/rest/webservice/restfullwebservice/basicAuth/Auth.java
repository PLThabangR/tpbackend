package com.rest.webservice.restfullwebservice.basicAuth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= "http://localhost:4200" )
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class Auth {

    @GetMapping(path="/basicAuth")
    public AuthenticationBean hellobeaan(){

        return new AuthenticationBean();
    }
}
