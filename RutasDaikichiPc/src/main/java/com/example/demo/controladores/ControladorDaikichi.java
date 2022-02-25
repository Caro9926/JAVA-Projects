package com.example.demo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi {
	
	@RequestMapping(value ="/daikichi", method=RequestMethod.GET) 
	   
    public String hola() { 
            return "¡Bienvenido!";
    }
	
	@RequestMapping(value ="/daikichi/today", method=RequestMethod.GET) 
	   
    public String today() { 
            return "¡Hoy encontrarás suerte en todos tus esfuerzos!";
    }
	
	@RequestMapping(value ="/daikichi/tomorrow", method=RequestMethod.GET) 
	   
    public String tomorrow() { 
            return "¡Mañana será un día con nuevas oportunidades!";
    }
	

}
