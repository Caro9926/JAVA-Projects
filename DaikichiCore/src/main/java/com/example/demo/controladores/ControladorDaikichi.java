package com.example.demo.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi {
	
	@RequestMapping(value ="/", method=RequestMethod.GET) 
	   
    public String hola2() { 
            return "Práctica Core-Viernes";
    }
	
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
	
	@RequestMapping(value ="/daikichi/travel/{city}", method=RequestMethod.GET )
	public String ShowCity(@PathVariable("city") String city) {
		
		return "Congratulations! Soon you will travel to " + city; 
	}
	
	@RequestMapping(value ="/daikichi/lotto/{id}", method=RequestMethod.GET )
	public String ShowMessage(@PathVariable("id") int id) {
		if (id % 2 == 0) {
			return "You will take a great trip in the near future, but beware of tempting offers";
		}
		else {
			return "You've enjoyed the fruits of your labor, but now is a great time to spend time with family and friends"; 
		}
		
	}
	

}

