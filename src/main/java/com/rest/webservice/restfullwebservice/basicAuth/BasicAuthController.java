package com.rest.webservice.restfullwebservice.basicAuth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins= "http://localhost:4205" )
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class BasicAuthController {

        @GetMapping(path="/basicAuth")
        public AuthenticationBean HelloWorld(){
            return  new AuthenticationBean("You are authenticated");
        }
    }



