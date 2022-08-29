package ort.edu.tp1.trabajopractico2.ejercicio2;

import java.util.ArrayList;


public class Persona {
	
	private String nombre;
	private String apellido;
	
	private ArrayList<Email> emails; // Agregacion 0.. n
	private ArrayList<Telefono> telefonos; //Agregacion 0.. n
	private ArrayList<Mascota> mascotas; //Agregacion 0.. n
	
	public Persona(String nombre, String apellido) {
		emails = new ArrayList<>();
		telefonos = new ArrayList<>();
		this.mascotas = new ArrayList<>();
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
		if(!mascotas.isEmpty()) {
			mostrarMascotas();
		}
		
	}

	public void mostrarMascotas() {
		System.out.println("Mascotas:");
		for(Mascota m : mascotas) {
			System.out.println(m.getTipoMascota() + ", " + m.getNombreMascota());
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
		System.out.println("Telefonos: ");
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
	
	public void agregarMascota(Mascota mascota) {
		if(!mascotas.contains(mascota)) {
		this.mascotas.add(mascota);
		}	
	}
	
	public void agregarMascota(String nombreMascota, String tipoMascota) {
		Mascota mascotaAgregar = new Mascota(nombreMascota, tipoMascota);
		if(buscarMascota(nombreMascota) == null && !mascotas.contains(mascotaAgregar)) {
			mascotas.add(mascotaAgregar);
		}
	}
	
	public void removerEmail(Email email) {
		emails.remove(email);
	}
	
	public void removerTelefono(Telefono telefono) {
		telefonos.remove(telefono);
	}
	
	public void removerMascota(Mascota mascota) {
		mascotas.remove(mascota);
	}
	
	private Mascota buscarMascota(String nombreMascota) {
		Mascota mascotaBuscar = null;
		int i = 0;
		while(mascotas.size() > i && mascotaBuscar == null) {
			if(mascotas.get(i).getNombreMascota().equals(nombreMascota)) {
				mascotaBuscar = mascotas.get(i);
			}else {
				i++;
			}
		}
		return mascotaBuscar;
	}
	
	public void removerMascotaPorNombre(String nombreMascota) {
		Mascota mascotaRemover = buscarMascota(nombreMascota);
		if(mascotaRemover != null) {
			mascotas.remove(mascotaRemover);
		}
	}
	
	private Email buscarEmail(String email) {
		Email emailBuscar = null;
		int i = 0;
		while(emails.size() > i && emailBuscar == null) {
			if(emails.get(i).getValor().equals(email)) {
				emailBuscar = emails.get(i);
			}else {
				i++;
			}
		}
		return emailBuscar;
	}
	
	public void removerEmail(String email) {
		Email emailRemover = buscarEmail(email);
		if(emailRemover != null) {
			emails.remove(emailRemover);
		}
	}
	
	
	private Telefono buscarTelefono(String telefono) {
		Telefono telefonoBuscar = null;
		int i = 0;
		while(telefonos.size() > i && telefonoBuscar == null) {
			if(telefonos.get(i).getValor().equals(telefono)) {
				telefonoBuscar = telefonos.get(i);
			}else {
				i++;
			}
		}
		return telefonoBuscar;
	}
	
	public void removerTelefonoPorString(String telefono) {
		Telefono telefonoRemover = buscarTelefono(telefono);
		if(telefonoRemover != null) {
			telefonos.remove(telefonoRemover);
		}
	}
	
	
	
	
	public void removerTodosTelefonos() {
		telefonos.clear();
	}
	
	public void removerTodosEmails() {
		emails.clear();
	}
	
	public void removerTodasMascotas() {
		mascotas.clear();
	}
	
	
	
}
