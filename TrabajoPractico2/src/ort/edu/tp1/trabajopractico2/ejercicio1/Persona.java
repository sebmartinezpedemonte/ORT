package ort.edu.tp1.trabajopractico2.ejercicio1;

import java.util.ArrayList;



public class Persona {
	
	private String nombre;
	private String apellido;
	
	private ArrayList<Email> emails; // Agregacion 0.. n
	private ArrayList<Telefono> telefonos; //Agregacion 0.. n
	
	public Persona(String nombre, String apellido) {
		emails = new ArrayList<>();
		telefonos = new ArrayList<>();
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public void mostrarTodo() {
		System.out.println(nombre + ", " + apellido);
		if(!telefonos.isEmpty()) {
			mostrarTelefonos();
		}
		if(!emails.isEmpty()) {
			mostrarEmails();
		}
		
		
	}


	private void mostrarEmails() {
		System.out.println("email: ");
		for (Email email : emails) {
			System.out.println(email.getValor());
		}
		//o con un toString- agregando metodo toString en las demas clases-
		//emails.forEach(System.out::println);		
	}


	private void mostrarTelefonos() {
		System.out.println("Telefonos:");
		for (Telefono tel : telefonos) {
			System.out.println(tel.getTipoFormatoString()+ ": " + tel.getValor());
		}
	}


	public void agregarTelefono(String pais, String caracteristicas, String abonado, TipoDeTelefono tipo) {
		Telefono telefono = new Telefono(pais, caracteristicas, abonado , tipo);
		if(!telefonos.contains(telefono)) {
			telefonos.add(telefono);
		}		
	}
	
	
	public void agregarTelefono(Telefono tel) {
		if(!telefonos.contains(tel)) {
		this.telefonos.add(tel);
		}
	}

	public void agregarEmail(String email) {
		Email emailAgregar = new Email("email");
		if(!emails.contains(emailAgregar)) {
			emails.add(emailAgregar);
		}
	}
	

	public void agregarEmail(Email email) {
		if(!emails.contains(email)) {
		this.emails.add(email);
		}	
	}
	
	
	
}
