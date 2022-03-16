package com.example.demo.servicios;


import java.util.Optional;
import org.mindrot.jbcrypt.BCrypt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.modelos.LoginUser;
import com.example.demo.modelos.User;
import com.example.demo.repositorios.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo; //Para emplear mi repositorio
	
	public User getUserById(Long id) {
		Optional<User> user = userRepo.findById(id); 
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}
	
	
	public User register(User newUser, BindingResult result) {
		Optional<User> userGet = userRepo.findByEmail(newUser.getEmail());
		if(userGet.isPresent()) {
			result.rejectValue("email", "Not Unique", "Email is already registered");
		}
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "Matches", "Confirm password y password deben ser iguales.");
		}
		
				
		if(result.hasErrors()) {
			return null;
		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		
		User user = userRepo.save(newUser);
		
		return user;
	}
	
	public User login(LoginUser newLoginObject, BindingResult result) {
		Optional<User> usuarioObtenido = userRepo.findByEmail(newLoginObject.getEmail());
		User usuario=null;
		if(!usuarioObtenido.isPresent()) {
			result.rejectValue("email", "Existence", "Email is not registered.");
		}
		else {
			usuario = usuarioObtenido.get();
			if(!BCrypt.checkpw(newLoginObject.getPassword(), usuario.getPassword())) {
				result.rejectValue("password", "Matches", "Password invalid!");
			}
		}
		if(result.hasErrors()) {
			return null;
		}
		
		return usuario;
	}

}
