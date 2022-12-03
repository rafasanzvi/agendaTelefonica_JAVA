package com.practica.clases;

public class Agenda {

	//Agenda está formada por un conjunto de contactos, por lo que se trata de un array de contactos
	private Contacto[] contactos;
	
	
	//CONSTRUCTORS
	public Agenda() {
		this.contactos = new Contacto[10]; //El valor al array cuando es una propiedad se le suele dar en el constructor
	}
	
	public Agenda(int tamaño) {
		this.contactos = new Contacto[tamaño]; 
	}
	
	public void añadirContacto(Contacto c) { // c es el contacto que se pasará
		
		boolean encontrado = false;
		
		for(int i = 0; i < contactos.length && !encontrado; i++) {
			
			if(contactos[i] == null) {
				contactos[i] = c;
				encontrado = true;
			}
		}
		
		if(encontrado) {
			System.out.println("El contacto se añadió sin problemas");
		} else {
			System.out.println("No ha podido ser añadido");
			}
	
		}
	
	
	
	public boolean existeContacto(Contacto c) {
		
	}
	
	
}