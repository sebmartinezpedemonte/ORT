package ejercicio01;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Persona> personas;

	public Agenda() {
		personas = new ArrayList<>();
	}

	private Persona buscarPersona(String DNI) {
		Persona personaABuscar = null;
		int i = 0;
		while (personaABuscar == null && this.personas.size() > i) {
			if (this.personas.get(i).getDNI().equals(DNI)) {
				personaABuscar = this.personas.get(i);
			}
			i++;
		}
		return personaABuscar;
	}

	public boolean agregarPersona(String DNI, String nombre, String apellido, Domicilio domicilio) {
		boolean pudoAgregar = false;
		Persona personaAAgregar;
		personaAAgregar = buscarPersona(DNI);
		if (personaAAgregar == null) {
			personaAAgregar = new Persona(DNI, nombre, apellido, domicilio);
			this.personas.add(personaAAgregar);
			// personas.add(new Persona(DNI, nombre, apellido, domicilio));
			pudoAgregar = true;
		}
		return pudoAgregar;
	}

	public Persona removerPersona(String DNI) {
		Persona personaARemover;
		personaARemover = buscarPersona(DNI);
		if (personaARemover != null) {
			this.personas.remove(personaARemover);
		}
		return personaARemover;
	}
	
	public boolean modificarDomicilio(String DNI, Domicilio domicilio) {
		boolean pudoModificar = false;
		if(this.buscarPersona(DNI) != null) {
			this.buscarPersona(DNI).setDomicilio(domicilio);
			pudoModificar = true;
		}		
		return pudoModificar;
	}
	
	
	

	public void listarPersonas() {
		for (Persona personas : personas) {
			System.out.println(personas.obtenerNombreCompleto());
		}
	}

	public Persona devolverUltimo() {
		Persona ultimaPersona = null;
		//if(!(personas.isEmpty())){}
		if (personas.size() > 0) {
			ultimaPersona = personas.get(personas.size() - 1);
		}
		return ultimaPersona;
	}

	public void eliminarTodosElementosAMano() {
		for (int i = 0; i < personas.size() - 1; i++) {
			personas.remove(i);
		}
	}

}
