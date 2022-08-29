package ort.edu.tp1.trabajopractico2.ejercicio3;

import java.util.ArrayList;

public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personas; //Agregacion o Composicion? Podria ser composicion ya que el hito necesitaria al menos una persona?
	public Hito(String fecha, String descripcion) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personas = new ArrayList<>();
	}
	public String getFecha() {
		return fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public void mostrarPersonasHito() {
		System.out.println("Personas que estuvieron en el hito:");
		for(Persona p : personas) {
			System.out.println(p.getApellido() + ", " + p.getNombre());
		}		
	}
	
	public void agregarPersonaAHito(Persona persona) {
		personas.add(persona);
	}
}
