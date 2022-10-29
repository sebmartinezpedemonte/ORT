package ort.edu.p1.tp3.ej12;

import java.util.ArrayList;

public class Dia {
	
	private final String MENSAJE ="No hay cupos para hoy";
	private final int MAX_TESTS_DIA = 50;
	private String fecha;
	private boolean esHabil;
	private ArrayList<Persona> personas;
	
	public Dia(String fecha, boolean esHabil) {
		this.personas = new ArrayList<>();
		this.fecha = fecha;
		this.esHabil = esHabil;
	}
	
	public boolean alcanzanCantidadTests() {
		return personas.size() <= MAX_TESTS_DIA;
	}
	
	public int revisar() {
		int cantPersonasAfuera = 0;
		int posicionPersona = 0;		
		for(Persona persona : personas) {
			posicionPersona ++;
			if(posicionPersona > MAX_TESTS_DIA  ) {
				cantPersonasAfuera++;
				persona.notificar(MENSAJE);
			}
		}
		/* otra forma 
		for(int i = 0; i < personas.size(); i++) {
			if(i > MAX_TESTS_DIA  ) {
				personas.get(i).notificar(MENSAJE);
				cantPersonasAfuera++;
			}
				
		}
		*/
		return cantPersonasAfuera;
	}
	
	public int getCantPersonas() {
		return personas.size();
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public int getCantPrioritarios() {
		int cant = 0;
		for(Persona persona : personas) {
			if(persona.esPrioritario()) {
				cant++;
			}
		}		
		return cant;
	}
	
	public double promedioEdadPersonasSinOS() {
		double promedioEdad = 0;
		int cantPersSinOS = 0;
		int sumaEdades = 0;
		for(Persona persona : personas) {
			if(!(persona instanceof PersonaObraSocial)) {
				sumaEdades += persona.getEdad();
				cantPersSinOS++;
			}
		}
		if(cantPersSinOS>0) {
			promedioEdad = (double)sumaEdades/cantPersSinOS;
		}
		return promedioEdad;
	}
	
	public Dia agregarPersonas(Persona persona) {
		this.personas.add(persona);
		return this;
	}
	
	
}
