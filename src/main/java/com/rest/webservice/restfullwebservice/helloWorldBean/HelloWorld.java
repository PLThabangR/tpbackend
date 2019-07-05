package com.rest.webservice.restfullwebservice.helloWorldBean;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4206")
@RestController
public class HelloWorld {
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "hello world";
	}

//	@GetMapping(path="/hello-world-bean1")
//	public HelloWorldBean helloWorldBean() {
//	//throw new RuntimeException("Some error has occured contact support at");
//	return new HelloWorldBean("Hello world from bean changed now");
//	}

	@GetMapping(path="/hello-world-bean1")
	public HelloWorldBean helloWorldBean() {
		//throw new RuntimeException("Some error has occured contact support at");
		return new HelloWorldBean("Hello world from bean changed now");
	}







	//Access to XMLHttpRequest at 'http://localhost:8090/users/thabang/todos' from origin 'http://localhost:4206' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.


}
