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
		
		
		if(this.existeContacto(c)) {
			
			System.out.println("El contacto con el nombre " + c + " ya existe.");
			
		} else if(agendaLlena()){
			
			System.out.println("La agenda está llena, no se pueden añadir más contactos");
			
		} else {
			
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
		}
	
	
	
	public boolean existeContacto(Contacto c) {
		
		for(int i = 0; i < contactos.length; i++) {
			if(contactos[i] != null && c.equals(contactos[i])) {
				return true;
			}
		}
		return false;
	}
	
	
	public void listarContactos() {
		
		for(int i = 0; i < contactos.length; i++) {
			
			if(contactos[i] != null) {
				System.out.println(contactos[i]);
			}
		}
	}
	
	
	public void buscarContactos(String nombre) {
		
		boolean encontrado = false;
		
		for(int i = 0; i < contactos.length && !encontrado; i++) {
			
			if(contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Su teléfono es: " + contactos[i].getTelefono());
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			System.out.println("No se ha encontrado el contacto");
		}
	}
	
	
	public boolean agendaLlena() {
		
			for(int i = 0; i < contactos.length; i++) {
			
			if(contactos[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	
	public void eliminarContacto(Contacto c) {
		
		boolean encontrado = false;
		
		for(int i = 0; i < contactos.length && !encontrado; i++) {
			
			if(contactos[i] != null && contactos[i].equals(c)) {
				contactos[i] = null; // De esta forma borramos el elemento; 
				encontrado = true;
			}
		}
		
		if(encontrado) {
			System.out.println("Se ha eliminado el encontacto: " + c);
		}
		
	}
	
	
	public int huecosLibres() { //Consistiría en contar los nulos
		
		int contactosLibres = 0;
		
		for(int i = 0; i < contactos.length; i++) {
			if(contactos[i] == null) {
				contactosLibres++;
			}
		}
		
		return contactosLibres;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}