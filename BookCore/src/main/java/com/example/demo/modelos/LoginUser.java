package com.example.demo.modelos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginUser {
	
	@NotBlank(message = "Please, you must register an email")
	@Email(message="Insert a valid email")
	private String email;
	
	@NotBlank(message = "Please, you must register a password")
	@Size(min = 8, max=128,message = "The password must have a minimum of 3 characters and a maximum of 80")
	private String password;
	
	public LoginUser() {
		
	}

	public LoginUser(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
