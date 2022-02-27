package com.example.demo.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.modelos.Vendedor;
@Controller
public class ControladorVendedores {
public static ArrayList<Vendedor> listaPersonas = new ArrayList<Vendedor>();
	
	
	@RequestMapping(value ="/", method=RequestMethod.GET )
	public String index(Model model) {
		
		if(listaPersonas.size() == 0) {
			listaPersonas.add(new Vendedor("Grace Hooper", "Copper Wire", 5.25, "Metal strips.Also an ilustration of nanoseconds",
					"Little Things Corner Store"));
		
		
		}
		model.addAttribute("listaPersonas", listaPersonas); 
		
		return "index.jsp"; 

	}
}
