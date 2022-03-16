package com.example.demo.modelos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3,max = 100,message = "The title must have a minimum of 3 characters and a maximum of 50")
	private String title;
	
	@NotNull
	@Size(min = 3,max = 100,message = "The author must have a minimum of 3 characters and a maximum of 80")
	private String author;
	
	@NotBlank(message = "Thought cannot be empty")
	@Lob //Objetos pesados
	@Size(min = 5,message = "The thought must have a minimum of 5 characters and a maximum of 500")
	private String think;
	
	@ManyToOne(fetch = FetchType.LAZY) //Hago la unión 
	@JoinColumn(name = "user_id")
	private User user;
	
	public Book() {
		
	}
	
	
	public Book(Long id,
			@NotNull @Size(min = 3, max = 100, message = "The title must have a minimum of 3 characters and a maximum of 50") String title,
			@NotNull @Size(min = 3, max = 100, message = "The author must have a minimum of 3 characters and a maximum of 80") String author,
			@NotBlank(message = "Thought cannot be empty") @Size(min = 5, message = "The thought must have a minimum of 5 characters and a maximum of 500") String think,
			User user) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.think = think;
		this.user = user;
	}


	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getThink() {
		return think;
	}


	public void setThink(String think) {
		this.think = think;
	}
	
	

}
