package com.example.helloworld1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class HelloWorld1Application {

	@RequestMapping(value="/")
	public String index() {
		return " <h1> HELLO WORLD <h1> ";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld1Application.class, args);
	}

}
