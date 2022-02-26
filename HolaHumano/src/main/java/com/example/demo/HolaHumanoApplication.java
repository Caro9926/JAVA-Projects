package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class HolaHumanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaHumanoApplication.class, args);
	}
	
	@RequestMapping(value ="/nada", method=RequestMethod.GET) 
	   
    public String hola2() { 
            return "Práctica 2-Viernes";
    }
	

}

