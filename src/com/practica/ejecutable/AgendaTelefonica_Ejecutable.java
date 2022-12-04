package com.practica.ejecutable;

import java.util.Scanner;

import com.practica.clases.Agenda;
import com.practica.clases.Contacto;

public class AgendaTelefonica_Ejecutable {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		
		Agenda agendaTelefonica = new Agenda(3);
		String nombre;
		int telefono;
		
		Contacto c;
		
		
		while(!salir) {
			
			System.out.println("1. Añadir contacto");
			System.out.println("2. Listar contacto");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Existe contacto");
			System.out.println("5. Eliminar contacto");
			System.out.println("6. Contactos disponibles");
			System.out.println("7. Agenda llena");
			System.out.println("8. Salir");
			

				System.out.println("Escribe una de las opciones");
				opcion = sc.nextInt();
				
				switch (opcion) {
				case 1: 
					
					System.out.println("Escribir un nombre");
					nombre = sc.next();
					
					System.out.println("Escribir un teléfono");
					telefono = sc.nextInt();
					
					c = new Contacto(nombre, telefono);
					
					agendaTelefonica.añadirContacto(c);
					
					break;
				case 2:
					
					agendaTelefonica.listarContactos();
					
					break;
				case 3:
					
					System.out.println("Escribir un nombre");
					nombre = sc.next();
					
					agendaTelefonica.buscarContactos(nombre);
					
					break;
				case 4:
					
					System.out.println("Escribir un nombre");
					nombre = sc.next();
					
					c = new Contacto(nombre, 0);
					
					agendaTelefonica.existeContacto(c);
					
					break;
				case 5:
					
					System.out.println("Escribir un nombre");
					nombre = sc.next();
					
					c = new Contacto(nombre, 0);
					
					agendaTelefonica.eliminarContacto(c);
					
					break;
				case 6:
					
					System.out.println("Hay " + agendaTelefonica.huecosLibres() + " contactos libres.");
					
					
					break;
				case 7:
					
					if(agendaTelefonica.agendaLlena()) {
						System.out.println("La agenda está llena");
					}else {
						System.out.println("Aun puedes meter contactos");
					}
					
					break;
				case 8:
					
					salir = true;
					
					break;
				default:
					System.out.println("Solo números entre 1 y 8");
				}
		}
		

	}

}
