package com.example.demo.modelos;

public class Vendedor {
	public String nombre; 
	public String item; 
	public double price; 
	public String description; 
	public String vendor;
	public Vendedor(String nombre, String item, double price, String description, String vendor) {
		super();
		this.nombre = nombre;
		this.item = item;
		this.price = price;
		this.description = description;
		this.vendor = vendor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	} 
	

}
