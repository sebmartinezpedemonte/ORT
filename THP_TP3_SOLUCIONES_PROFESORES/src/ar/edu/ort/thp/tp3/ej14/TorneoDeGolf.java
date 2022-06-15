package ar.edu.ort.thp.tp3.ej14;

import java.util.ArrayList;

public class TorneoDeGolf {
	private String nombre;
	private ArrayList<Hoyo> hoyos;
	private ArrayList<Golfista> participantes;

	public TorneoDeGolf() {
		this("El Torneo de Golf");
	}

	public TorneoDeGolf(String nombre) {
		setNombre(nombre);
		hoyos = new ArrayList<>();
		participantes = new ArrayList<>();
	}

	public void agregarHoyo(int par) {
		// Asigna como numero de hoyo la posicion del mismo en el orden de
		// creacion del circuito del torneo (empezando en 1).
		hoyos.add(new Hoyo(hoyos.size() + 1, par));
	}

	private Golfista buscarParticipante(String nombre) {
		Golfista golfista = null;
		int index = 0;
		while (index < participantes.size() && golfista == null) {
			if (participantes.get(index).getNombre().equals(nombre)) {
				golfista = participantes.get(index);
			} else {
				index++;
			}
		}
		return golfista;
	}

	public String getNombre() {
		return nombre;
	}

	public void listarHoyosNoVisitados() {
		System.out.println("-- Hoyos no visitados");
		for (Hoyo hoyo : obtenerHoyosNoVisitados()) {
			System.out.println(hoyo);
		}
	}

	private ArrayList<Hoyo> obtenerHoyosNoVisitados() {
		ArrayList<Hoyo> noVisitados = new ArrayList<>();
		for (Hoyo hoyo : hoyos) {
			if (hoyo.getCantidadDeJugadoresQuePasaron() == 0) {
				noVisitados.add(hoyo);
			}
		}
		return noVisitados;
	}

	public void listarLiderOLideres() {
		System.out.println("-- Lider o Lideres del Torneo");
		for (Golfista participante : obtenerLideres()) {
			System.out.println(participante);
			participante.detalleRegistro();
		}
	}

	private ArrayList<Golfista> obtenerLideres() {
		ArrayList<Golfista> lideresActuales = new ArrayList<>();
		int mejorPuntaje = Integer.MAX_VALUE;
		int puntaje;
		for (Golfista participante : participantes) {
			puntaje = participante.puntajeTotal();
			if (puntaje <= mejorPuntaje) {
				if (puntaje < mejorPuntaje) {
					mejorPuntaje = puntaje;
					lideresActuales.clear();
				}
				lideresActuales.add(participante);
			}
		}
		return lideresActuales;
	}

	public void registrarHoyo(Golfista golfista, int nroHoyo, int golpes) {
		if (golfista != null) {
			if (nroHoyo > 0 && nroHoyo <= hoyos.size()) {
				if (golfista.registrarHoyo(hoyos.get(nroHoyo - 1), golpes)) {
					System.out.println(golfista.getNombre() + " completo el hoyo " + nroHoyo + " con " + golpes + " golpes.");
				}
			}
		} else {
			System.out.println("ERROR: Y el golfista?");
		}

	}

	public Golfista registrarParticipante(String nombre) {
		Golfista participante = buscarParticipante(nombre);
		if (participante == null) {
			participante = new Golfista(nombre);
			participantes.add(participante);
		}
		System.out.println("Se registro a " + nombre + " como el jugador numero " + participante.getNumero());
		return participante;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
