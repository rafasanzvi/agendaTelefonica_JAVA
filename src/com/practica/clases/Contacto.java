package com.practica.clases;

public class Contacto {
	
	//PROPERTIES
	private String nombre;
	private int telefono;
	
	
	//CONSTRUCTOR
	public Contacto(String nombre, int telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}


	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	//Method to avoid repeated contacts
	public boolean equals(Contacto c) {
		
		if(this.nombre.equalsIgnoreCase(c.getNombre())) {
			return true;
		}
		
		return false;
	}


	//toString method
	@Override
	public String toString() {
		return "El cliente con el nombre: " + nombre + " tiene el número de telefono: " + telefono;
	}
	
	
	
	
	
	
	
	
	
}
