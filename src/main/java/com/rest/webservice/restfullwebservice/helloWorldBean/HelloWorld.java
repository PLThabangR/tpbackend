package com.rest.webservice.restfullwebservice.helloWorldBean;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4201")
@RestController
public class HelloWorld {
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "hello world";
	}

	@GetMapping(path="/hello-world-bean1")
	public HelloWorldBean helloWorldBean() {
	//throw new RuntimeException("Some error has occured contact support at");
	return new HelloWorldBean("Hello world from bean changed now");
	}



}
