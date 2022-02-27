package com.example.demo.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.modelos.Fruta;

@Controller
public class ControladorFruta {
public static ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();
	
	
	@RequestMapping(value ="/", method=RequestMethod.GET )
	public String index(Model model) {
		
		if(listaFrutas.size() == 0) {
			listaFrutas.add(new Fruta("Kiwi", 1.5));
			listaFrutas.add(new Fruta("Mango", 2.0));
			listaFrutas.add(new Fruta("Goji Berries", 4.0));
			listaFrutas.add(new Fruta("Guava", 0.75));
		
		
		}
		model.addAttribute("listaFrutas", listaFrutas); 
		
		return "index.jsp"; 

	}

}
