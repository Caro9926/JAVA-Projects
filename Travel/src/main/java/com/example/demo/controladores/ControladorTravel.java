package com.example.demo.controladores;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.modelos.Travel;
import com.example.demo.servicios.TravelServicio;

@Controller
public class ControladorTravel {
	
	private TravelServicio travelServicio;
	
	public ControladorTravel (TravelServicio travelServicio) { //Constructor 
		this.travelServicio=travelServicio;
	}
	
	@RequestMapping( value = "/expenses", method = RequestMethod.GET ) //Visualizar los datos 
	public String PrincipalPage(@ModelAttribute("travel") Travel newTravel,Model model) {
		List<Travel> listaTravels =  travelServicio.SelectAllTravels(); //Se va luego al atributo
		model.addAttribute("listaTravels", listaTravels);
		return "index.jsp";
	}  //Show the page with method get
	
	
	@RequestMapping( value = "/expenses", method = RequestMethod.POST ) //Cuando enviamos los datos
	public String PrincipalPage(@Valid @ModelAttribute("travel") Travel newTravel,BindingResult result,Model model) {
		if(result.hasErrors()) {
			List<Travel> listaTravels=  travelServicio.SelectAllTravels();
			model.addAttribute("listaTravels", listaTravels);
			return "index.jsp";
		}
		else {
			travelServicio.CreateTravel(newTravel);
			
			return "redirect:/expenses";
		}
	}
	
	@RequestMapping( value = "/expenses/edit/{id}", method = RequestMethod.GET ) //Para ver los datos a editar
	public String View(@PathVariable("id") Long id,@ModelAttribute("travel") Travel editarTravel,HttpSession session) {
		editarTravel = travelServicio.FindId(id);
		session.setAttribute("id", editarTravel.getId());
		session.setAttribute("expense", editarTravel.getExpense());
		session.setAttribute("vendor", editarTravel.getVendor());
		session.setAttribute("amount", editarTravel.getAmount());
		session.setAttribute("description", editarTravel.getDescription());
		return"edit.jsp";
	}
	
	@RequestMapping( value = "/logout", method = RequestMethod.GET )
	public String logout( HttpSession session ) {
		session.removeAttribute( "id" );
		session.removeAttribute( "expense" );
		session.removeAttribute( "vendor" );
		session.removeAttribute( "amount" );
		session.removeAttribute( "description" );
		
		return "redirect:/expenses";
	}
	@RequestMapping( value = "/expenses/edit/{id}", method = RequestMethod.PUT ) //Colocar los datos a editar
	public String editarTravel( @Valid @ModelAttribute("travel") Travel editarTravel, BindingResult result,
								 HttpSession session) {
		if ( result.hasErrors() ) {
			return "edit.jsp";
		}
		else {
			session.setAttribute("expense", editarTravel.getExpense());
			session.setAttribute("vendor",editarTravel.getVendor());
			session.setAttribute("amount", editarTravel.getAmount());
			session.setAttribute("description", editarTravel.getDescription());
			travelServicio.updateTravels(editarTravel);
			return "redirect:/expenses";
		}
	}
	
	@RequestMapping( value = "/expenses/eliminar/{id}", method = RequestMethod.DELETE )
	public String eliminarGasto( @PathVariable("id") long id ) {
		travelServicio.deleteFromId(id);
		return "redirect:/expenses";
	}
	
	@RequestMapping( value = "/expenses/{id}", method = RequestMethod.GET )
	public String View(@PathVariable("id") Long id,HttpSession session) {
		Travel travel = travelServicio.FindId(id); //Jalando de nuestro servicio
		session.setAttribute("expense", travel.getExpense());
		session.setAttribute("vendor",travel.getVendor());
		session.setAttribute("amount", travel.getAmount());
		session.setAttribute("description", travel.getDescription());
		return "show.jsp";
	}

}
