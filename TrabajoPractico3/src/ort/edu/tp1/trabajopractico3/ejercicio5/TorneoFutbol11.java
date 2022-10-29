package ort.edu.tp1.trabajopractico3.ejercicio5;

public class TorneoFutbol11 extends TorneoFutbol{

	public TorneoFutbol11() {
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 11";
	}

	@Override
	public int puntajePartidoGanado() {
		return 3;
	}

	@Override
	public int puntajePartidoPerdido() {
		return 0;
	}

	@Override
	public int puntajeVallaInvicta() {
		return 0;
	}

	@Override
	public int puntajeGanador4Goles() {
		return 0;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 0;
	}

}
