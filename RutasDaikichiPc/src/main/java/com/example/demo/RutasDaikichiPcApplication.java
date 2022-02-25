package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //Decorador, que es un servidor que estará activo
@RestController //Te permite retorna json or strings
public class RutasDaikichiPcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RutasDaikichiPcApplication.class, args);
	}

	@RequestMapping(value ="/", method=RequestMethod.GET) 
   
    public String hola1() { 
            return "Práctica 1-Viernes";
    }
	
	
	
	
	
}