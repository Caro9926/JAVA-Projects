package com.model;

public class Usuario {
	protected Integer id;
    protected int pin;
	public Usuario(Integer id, int pin) {
		super();
		this.id = id;
		this.pin = pin;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
    
    
}
