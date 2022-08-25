package tp2.ej1;

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
		System.out.println(nombre);
		System.out.println(apellido);
		mostrarTelefonos();
		mostrarEmails();
		
		
	}


	private void mostrarEmails() {
		System.out.println("Emails: ");
		for (Email email : emails) {
			System.out.println(email.getValor());
		}
		//o con un toString
		//emails.forEach(System.out::println);		
	}


	private void mostrarTelefonos() {
		for (Telefono tel : telefonos) {
			System.out.println(tel.getTipo() + ": " + tel.getValor());
		}
	}


	public void agregarTelefono(int pais, int caracteristicas, int abonado, TipoDeTelefono tipo) {
		telefonos.add(new Telefono(pais, caracteristicas, abonado,tipo));
	}
	
	
	public void agregarTelefono(Telefono tel) {
		this.telefonos.add(tel);
	}

	public void agregarEmail(String email) {
		this.emails.add(new Email(email));
	}
	

	public void agregarEmail(Email email) {
		this.emails.add(email);		
	}
	
	
	
}
