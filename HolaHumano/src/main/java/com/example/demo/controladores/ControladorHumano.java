package com.example.demo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControladorHumano {
	
	
	@RequestMapping("/")
	public String index(
			@RequestParam(value="name", required=false) String name, 
			@RequestParam(value = "last_name", required = false) String lastname){
		String result = "Hello"; 
		
		if(name ==null){
			result = result + "You don't search anybody"; 
			
		}
		else {
			result = result + name; 
		}
		
		if(lastname == null) {
			result = result + "You don't search anybody" ; 
		}
		else {
		    result = result + lastname; 
		}
		
		return result; 
    }
	

	

}
