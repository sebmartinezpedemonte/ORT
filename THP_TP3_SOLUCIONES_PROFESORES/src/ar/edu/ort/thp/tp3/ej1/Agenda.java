package ar.edu.ort.thp.tp3.ej1;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;

	/**
	 * Constructor de la clase, que inicializa el ArrayList personas. El ArrayList
	 * es privado, dado que la forma que tenemos de acceder a los elementos que se
	 * encuentran en el mismo es sólo a través de los métodos de esta clase. De esta
	 * forma, mantenemos un buen encapsulamiento.
	 */
	public Agenda() {
		personas = new ArrayList<>();
	}

	/**
	 * Recibe por parámetro un dni, realiza una búsqueda en el ArrayList, retornando
	 * como resultado null si no encuentra a la persona solicitada, o un objeto
	 * Persona de lograrlo.
	 * 
	 * @param dni El dni de la persona a buscar
	 * @return Persona o null
	 */
	private Persona buscarPersona(String dni) {
		Persona personaABuscar = null;
		int i = 0;
		while (i < personas.size() && !personas.get(i).getDni().equals(dni)) {
			i++;
		}
		if (i < personas.size())
			personaABuscar = personas.get(i);
		return personaABuscar;
	}

	/**
	 * Recibe por parámetro todos los datos necesarios para registrar una persona, y
	 * si no existe dicho dni previamente, agrega un nuevo objeto Persona dentro del
	 * ArrayList.
	 * 
	 * @param dni       El dni de la persona
	 * @param apellido  El apellido de la persona
	 * @param domicilio El domicilio de la persona
	 * @param nombre    El nombre de la persona
	 * @return Confirmación de la acción
	 */
	public boolean agregarPersona(String dni, String apellido, String nombre, String domicilio) {
		boolean pudeAgregar = false;

		if (buscarPersona(dni) == null) {
			pudeAgregar = personas.add(new Persona(dni, apellido, nombre, domicilio));
		}

		return pudeAgregar;
	}

	/**
	 * Recibe por parámetro un dni y, si el mismo existe en el listado, elimina a
	 * dicha persona de la lista.
	 * 
	 * @param dni El dni de la persona a eliminar
	 * @return La persona removida, o null.
	 */
	public Persona removerPersona(String dni) {
		Persona personaARemover = buscarPersona(dni);
		if (personaARemover != null) {
			personas.remove(personaARemover);
		}
		return personaARemover;
	}

	/**
	 * Recibe por parámetro un dni y una dirección. Si algún registro con dicho dni
	 * existe en la lista actualmente, modifica la dirección antigua de la persona
	 * en cuestión con la obtenida por parámetro. Retorna un booleano indicando si
	 * la operación fue exitosa o no.
	 * 
	 * @param dni       El dni de la persona a modificar
	 * @param domicilio La nueva direccion
	 * @return
	 */
	public boolean modificarDomicilio(String dni, String domicilio) {
		Persona personaAModificar = buscarPersona(dni);

		if (personaAModificar != null) {
			personaAModificar.setDomicilio(domicilio);
		}
		return personaAModificar != null;
	}

	/**
	 * Emite por pantalla en formato de listado cada una de las personas con sus
	 * respectivos atributos
	 */
	public void listarPersonas() {
		// ¿Hay personas en el array?
		if (personas.size() > 0) {
			System.out.println("LISTA DE PERSONAS EN AGENDA: ");
			for (Persona persona : personas) {
				System.out.println(persona);
			}
		} else {
			System.out.println("AGENDA VAC�?A!");
		}
	}

}
