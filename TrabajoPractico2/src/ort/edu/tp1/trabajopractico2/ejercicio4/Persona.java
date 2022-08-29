package ort.edu.tp1.trabajopractico2.ejercicio4;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edadIngresada) {
		if(edadIngresada > 0)
		this.edad = edadIngresada;
	}
	//Arturo Roman, Edad: 53
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + " " + apellido + ", Edad: "+ edad);
	}
}
