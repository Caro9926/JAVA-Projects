package com.example.demo.controladores;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.ui.Model;

@Controller
public class ControladorContador {

	@RequestMapping(value ="/", method=RequestMethod.GET )
	public String index(HttpSession session) {
			
	    	// Si el conteo aún no está en sesión
			if (session.getAttribute("count") == null) {
				session.setAttribute("count", 0);// Usa setAttribute para inicializar el conteo en la sesión
			}
			Integer IncConteo = (Integer) session.getAttribute("count");
			session.setAttribute("count",  IncConteo + 1);
			
			return "index.jsp";
		}

		
	@RequestMapping(value="/counter",method=RequestMethod.GET )
	public String showCount(HttpSession session, Model model) {
		
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		
		Integer ActCount = (Integer) session.getAttribute("count");
		model.addAttribute("MostrarConteo", ActCount);
		
		return "show.jsp";
	}
	
	@RequestMapping("/countdouble")
	public String showCount2(HttpSession session) {

		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		
		Integer ActCount = (Integer) session.getAttribute("count");
		session.setAttribute("count", ActCount + 2);

		return "count2.jsp";
	}
	
	
	
	@RequestMapping("/back")
	public RedirectView reset(HttpSession session) {
		session.setAttribute("count", 0);
		return new RedirectView("counter");
	}
}
