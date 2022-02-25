package com.codingdojo;


public class Nodo  {
	public int value;
    public Nodo next;
    public Nodo(int value) {
        
    }
	public Nodo(int value, Nodo next) {
		super();
		this.value = value;
		this.next = null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Nodo getNext() {
		return next;
	}
	public void setNext(Nodo next) {
		this.next = next;
	}
	
	
}
