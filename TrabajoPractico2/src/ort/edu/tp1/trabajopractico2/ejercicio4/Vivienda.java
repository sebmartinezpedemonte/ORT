package ort.edu.tp1.trabajopractico2.ejercicio4;

import java.util.ArrayList;

public class Vivienda {
	private static int idVivienda = 1;
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	private int nroVivienda;
	
	public Vivienda(String calle, String altura, int piso, String departamento) {
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();
		this.direccion = new Direccion(calle, altura, piso, departamento);
		nroVivienda = idVivienda++;
	}
	
	public void mostrarDatos() {
		System.out.println("Vivienda " + nroVivienda + ": Direccion: " + direccion.calle
				+ " " + direccion.altura + " " + direccion.piso + "° ”" + direccion.departamento  + "”");
		mostrarDatosPersonas();
		mostrarDatosMuebles();
	}
	
	private void mostrarDatosPersonas() {
		System.out.println("Personas:");
		for(Persona p : personas) {
			p.mostrarDatos();
		}		
	}
	
	private void mostrarDatosMuebles() {
		System.out.println("Muebles:");
		for(Mueble p : muebles) {
			p.mostrarDatos();
		}		
	}
	
	public void agregarPersona(Persona persona) {
		if(!personas.contains(persona)) {
			personas.add(persona);
		}
	}
	
	public void agregarMueble(Mueble mueble) {
		if(!muebles.contains(mueble)) {
			muebles.add(mueble);
		}
	}
	
	public void agregarPersona(String nombre, String apellido, int edad) {
		Persona personaAgregar = new Persona(nombre, apellido, edad);
		if(!personas.contains(personaAgregar)) {
			personas.add(personaAgregar);
		}
	}
	
	public void agregarMueble(String nombre, String material, String color) {
		Mueble muebleAgregar = new Mueble(nombre, material, color);
		if(!muebles.contains(muebleAgregar)) {
			muebles.add(muebleAgregar);
		}
	}
	
	
	
	private class Direccion{
		
		private String calle;
		private String altura;
		private int piso;
		private String departamento;		
		
		public Direccion(String calle, String altura, int piso, String departamento) {
			super();
			this.calle = calle;
			this.altura = altura;
			this.piso = piso;
			this.departamento = departamento;
		}
		
				
	}
	
	
	
	
}
