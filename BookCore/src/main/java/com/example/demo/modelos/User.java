package com.example.demo.modelos;


import java.util.List;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Size(min=3, max=30, message="The name must have a minimum of 3 characters and a maximum of 80")
	private String name;
	
	
	@Email(message="Enter an email valid")
	private String email;
	
	@NotNull(message="The message must no be in blank")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	@NotNull
	@Size(min = 8, max=128,message = "The password must have a minimum of 3 characters and a maximum of 80")
	private String password;
	

	@Transient
	@Size(min = 8, max=128,message = "The password must have a minimum of 3 characters and a maximum of 80")
	private String confirm;
	
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Book> books;
	
	
	public User() {
		
	}
	
	public List<Book> getBooks() {
		return books;
	}

	public void setLibros(List<Book> books) {
		this.books = books;
	}

	

	public User(Long id,
			@Size(min = 3, max = 30, message = "The name must have a minimum of 3 characters and a maximum of 80") String name,
			@Email(message = "Enter an email valid") String email,
			@NotNull(message = "The message must no be in blank") Date birthday,
			@NotNull @Size(min = 8, max = 128, message = "The password must have a minimum of 3 characters and a maximum of 80") String password,
			@Size(min = 8, max = 128, message = "The password must have a minimum of 3 characters and a maximum of 80") String confirm,
			List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.password = password;
		this.confirm = confirm;
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	
	

}
