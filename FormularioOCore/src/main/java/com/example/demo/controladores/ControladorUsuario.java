package com.example.demo.controladores;


import javax.servlet.http.HttpSession;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.demo.modelos.Usuario;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class ControladorUsuario {
	
		
	@RequestMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@RequestMapping(value="/omikuji/save", method=RequestMethod.POST) //El post usualmente hace redirect
	public String saveForm(Usuario usuario, HttpSession session) {
		session.setAttribute("usuario", usuario);
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji")
	public String showForm(HttpSession session, Model model) {
		
		if( session.getAttribute( "usuario" ) != null ) {
			
		}
		return "index.jsp";
		
	}
	
	@RequestMapping("/omikuji/show") //Get usualmente hace return 
	public String showOmikuji(HttpSession session, Model model) {
		
		if( session.getAttribute( "usuario" ) != null ) {
			
		}
		return "show.jsp";
		
	}
	
	
	
	
	
	
	


}
