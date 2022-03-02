package com.example.demo.modelos;

public class Usuario {
	public long number; 
	public String name;
	public String nameperson;  
	public String hobby; 
	public String thing; 
	public String comment;
	public Usuario(long number, String name, String nameperson, String hobby, String thing, String comment) {
		super();
		this.number = number;
		this.name = name;
		this.nameperson = nameperson;
		this.hobby = hobby;
		this.thing = thing;
		this.comment = comment;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameperson() {
		return nameperson;
	}
	public void setNameperson(String nameperson) {
		this.nameperson = nameperson;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getThing() {
		return thing;
	}
	public void setThing(String thing) {
		this.thing = thing;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	} 
	
	
}
