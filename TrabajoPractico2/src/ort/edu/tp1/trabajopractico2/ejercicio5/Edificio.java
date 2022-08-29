package ort.edu.tp1.trabajopractico2.ejercicio5;

import java.util.ArrayList;

public class Edificio {

	private ArrayList<Vivienda> viviendas;// inner class composicion. Un edificio tiene que tener viviendas
	private String calle;
	private String altura;
	private static int idVivienda = 1;
	private static int idEdificio = 1;
	@SuppressWarnings("unused")
	private int nroEdificio;

	public Edificio(String calle, String altura) {
		this.calle = calle;
		this.altura = altura;
		this.viviendas = new ArrayList<>();
		this.nroEdificio = idEdificio++;
	}

	public String getCalle() {
		return calle;
	}

	public String getAltura() {
		return altura;
	}

	public void realizarMudanza(int pisoOrigen, String departamentoOrigen, int pisoDestino,
			String departamentoDestino) {
		ArrayList<Persona> personasMudar = new ArrayList<>();
		ArrayList<Mueble> mueblesMudar = new ArrayList<>();
		Vivienda viviendaOrigen = buscarViviendaPorPisoYDepartamento(pisoOrigen, departamentoOrigen);
		Vivienda viviendaDestino = buscarViviendaPorPisoYDepartamento(pisoDestino, departamentoDestino);
		if (viviendaOrigen != null && viviendaDestino != null) {
			System.out.println("Vivienda: " + viviendaDestino.nroVivienda);
			System.out.println("Direccion: " + calle + " " + altura + " ");
			viviendaDestino.mostrarDatos();
			personasMudar = viviendaOrigen.removerPersonas(pisoOrigen, departamentoOrigen);
			viviendaDestino.agregarPersonas(pisoDestino, departamentoDestino, personasMudar);
			mueblesMudar = viviendaOrigen.removerMuebles(pisoOrigen, departamentoOrigen);
			viviendaDestino.agregarMuebles(pisoDestino, departamentoDestino, mueblesMudar);
			System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA " + viviendaOrigen.nroVivienda + " A VIVIENDA "
					+ viviendaDestino.nroVivienda);

		}
	}

	public void mostrarViviendas() {
		for (Vivienda v : viviendas) {
			System.out.println("Vivienda " + v.nroVivienda + ":");
			System.out.println("Direccion: " + calle + " " + altura + " ");
			v.mostrarDatos();
		}
	}

	public void agregarVivienda(int pisoIngresado, String departamentoIngresado) {
		Vivienda viviendaAgregar = new Vivienda(pisoIngresado, departamentoIngresado);
		if (!viviendas.contains(viviendaAgregar)) {
			viviendas.add(viviendaAgregar);
		}
	}

	public void agregarPersonaAViviendaPorNroVivienda(int nroVivienda, String nombre, String apellido, int edad) {
		Vivienda viviendaAgregarPersona = buscarViviendaPorNroVivienda(nroVivienda);
		if (viviendaAgregarPersona != null) {
			viviendaAgregarPersona.agregarPersona(nombre, apellido, edad);
		}
	}

	public void agregarMuebleAViviendaPorNroVivienda(int nroVivienda, String nombre, String material, String color) {
		Vivienda viviendaAgregarmueble = buscarViviendaPorNroVivienda(nroVivienda);
		if (viviendaAgregarmueble != null) {
			viviendaAgregarmueble.agregarMueble(nombre, material, color);
		}
	}

	public void agregarPersonaAViviendaPorPisoYDepartamento(int pisoIngresado, String departamentoIngresado,
			String nombre, String apellido, int edad) {
		Vivienda viviendaAgregarPersona = buscarViviendaPorPisoYDepartamento(pisoIngresado, departamentoIngresado);
		if (viviendaAgregarPersona != null) {
			viviendaAgregarPersona.agregarPersona(nombre, apellido, edad);
		}
	}

	public void agregarMuebleAViviendaPorPisoYDepartamento(int pisoIngresado, String departamentoIngresado,
			String nombre, String material, String color) {
		Vivienda viviendaAgregarmueble = buscarViviendaPorPisoYDepartamento(pisoIngresado, departamentoIngresado);
		if (viviendaAgregarmueble != null) {
			viviendaAgregarmueble.agregarMueble(nombre, material, color);

		}
	}

	public void agregarPersonaAViviendaPorNroVivienda(int nroVivienda, Persona persona) {
		Vivienda viviendaAgregarPersona = buscarViviendaPorNroVivienda(nroVivienda);
		if (viviendaAgregarPersona != null) {
			viviendaAgregarPersona.agregarPersona(persona);
		}
	}

	public void agregarMuebleAViviendaPorNroVivienda(int nroVivienda, Mueble mueble) {
		Vivienda viviendaAgregarmueble = buscarViviendaPorNroVivienda(nroVivienda);
		if (viviendaAgregarmueble != null) {
			viviendaAgregarmueble.agregarMueble(mueble);
		}
	}

	public void agregarPersonaAViviendaPorPisoYDepartamento(int pisoIngresado, String departamentoIngresado,
			Persona persona) {
		Vivienda viviendaAgregarPersona = buscarViviendaPorPisoYDepartamento(pisoIngresado, departamentoIngresado);
		if (viviendaAgregarPersona != null) {
			viviendaAgregarPersona.agregarPersona(persona);
		}
	}

	// private ArrayList<Persona> mudarPersonas(int pisoOrigen, String
	// departamentoOrigen) {
	// private ArrayList<Persona> removerPersonas(int pisoOrigen, String
	// departamentoOrigen) {
	public void agregarPersonasAViviendaPorPisoYDepartamento(int pisoIngresado, String departamentoIngresado,
			ArrayList<Persona> personasAgregar) {
		Vivienda viviendaAgregarPersona = buscarViviendaPorPisoYDepartamento(pisoIngresado, departamentoIngresado);
		// ArrayList<>
		if (viviendaAgregarPersona != null) {
			viviendaAgregarPersona.removerPersonas(pisoIngresado, departamentoIngresado);
		}
	}

	public void agregarMuebleAViviendaPorPisoYDepartamento(int pisoIngresado, String departamentoIngresado,
			Mueble mueble) {
		Vivienda viviendaAgregarmueble = buscarViviendaPorPisoYDepartamento(pisoIngresado, departamentoIngresado);
		if (viviendaAgregarmueble != null) {
			viviendaAgregarmueble.agregarMueble(mueble);
		}
	}

	private Vivienda buscarViviendaPorPisoYDepartamento(int pisoIngresado, String departamentoIngresado) {
		Vivienda viviendaBuscar = null;
		int i = 0;
		while (viviendas.size() > i && viviendaBuscar == null) {
			if (viviendas.get(i).pisoYDepartamentoVivienda.piso == pisoIngresado
					&& viviendas.get(i).pisoYDepartamentoVivienda.departamento.equals(departamentoIngresado)) {
				viviendaBuscar = viviendas.get(i);
			} else {
				i++;
			}
		}
		return viviendaBuscar;
	}

	private Vivienda buscarViviendaPorNroVivienda(int nroViviendaIngresada) {
		Vivienda viviendaBuscar = null;
		int i = 0;
		while (viviendas.size() > i && viviendaBuscar == null) {
			if (viviendas.get(i).nroVivienda == (nroViviendaIngresada)) {
				viviendaBuscar = viviendas.get(i);
			} else {
				i++;
			}
		}
		return viviendaBuscar;
	}

	private class Vivienda {

		private PisoYDepartamentoVivienda pisoYDepartamentoVivienda;// inner class composicion. Una vivienda tiene que
																	// tener piso y departamento
		private ArrayList<Persona> personas;
		private ArrayList<Mueble> muebles;
		private int nroVivienda;
		// private static int idVivienda = 1;

		public Vivienda(int piso, String departamento) {
			this.personas = new ArrayList<>();
			this.muebles = new ArrayList<>();
			this.pisoYDepartamentoVivienda = new PisoYDepartamentoVivienda(piso, departamento);
			nroVivienda = idVivienda++;

		}

		private void agregarPersonas(int pisoDestino, String departamentoDestino, ArrayList<Persona> personasMudar) {
			Vivienda vivienda1 = buscarViviendaPorPisoYDepartamento(pisoDestino, departamentoDestino);
			if (vivienda1 != null) {
				for (Persona p : personasMudar) {
					vivienda1.agregarPersona(p);
				}
			}
		}

		private ArrayList<Persona> removerPersonas(int pisoOrigen, String departamentoOrigen) {
			ArrayList<Persona> personasMudar = new ArrayList<>();
			Vivienda vivienda1 = buscarViviendaPorPisoYDepartamento(pisoOrigen, departamentoOrigen);
			if (vivienda1 != null && !personas.isEmpty()) {
				for (Persona p : personas) {
					personasMudar.add(p);
				}
				personas.clear();
			}
			return personasMudar;
		}

		private void agregarMuebles(int pisoDestino, String departamentoDestino, ArrayList<Mueble> mueblesMudar) {
			Vivienda vivienda1 = buscarViviendaPorPisoYDepartamento(pisoDestino, departamentoDestino);
			if (vivienda1 != null) {
				for (Mueble m : mueblesMudar) {
					vivienda1.agregarMueble(m);
				}
			}
		}

		private ArrayList<Mueble> removerMuebles(int pisoOrigen, String departamentoOrigen) {
			ArrayList<Mueble> mueblesMudar = new ArrayList<>();
			Vivienda vivienda1 = buscarViviendaPorPisoYDepartamento(pisoOrigen, departamentoOrigen);
			if (vivienda1 != null && !muebles.isEmpty()) {
				for (Mueble m : muebles) {
					mueblesMudar.add(m);
				}
				muebles.clear();
			}
			return mueblesMudar;
		}

		public void mostrarDatos() {

			System.out.println("Departamento: " + pisoYDepartamentoVivienda.piso + "° ”"
					+ pisoYDepartamentoVivienda.departamento + "”");
			// if(!personas.isEmpty()) {
			mostrarDatosPersonas();
			// }
			// if(!muebles.isEmpty()) {
			mostrarDatosMuebles();
			// }
		}

		private void mostrarDatosPersonas() {
			System.out.println("Personas:");
			for (Persona p : personas) {
				p.mostrarDatos();
			}
		}

		private void mostrarDatosMuebles() {
			System.out.println("Muebles:");
			for (Mueble p : muebles) {
				p.mostrarDatos();
			}
		}

		public void agregarPersona(Persona persona) {
			if (!personas.contains(persona)) {
				personas.add(persona);
			}
		}

		public void agregarMueble(Mueble mueble) {
			if (!muebles.contains(mueble)) {
				muebles.add(mueble);
			}
		}

		public void agregarPersona(String nombre, String apellido, int edad) {
			Persona personaAgregar = new Persona(nombre, apellido, edad);
			if (!personas.contains(personaAgregar)) {
				personas.add(personaAgregar);
			}
		}

		public void agregarMueble(String nombre, String material, String color) {
			Mueble muebleAgregar = new Mueble(nombre, material, color);
			if (!muebles.contains(muebleAgregar)) {
				muebles.add(muebleAgregar);
			}
		}

		private class PisoYDepartamentoVivienda {

			private int piso;
			private String departamento;

			public PisoYDepartamentoVivienda(int piso, String departamento) {

				this.piso = piso;
				this.departamento = departamento;
			}

		}
	}

}
