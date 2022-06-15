package ar.edu.ort.thp.tp3.ej14;

import java.util.ArrayList;

public class Golfista {
	private static int ultimoNro = 0;
	private int numero;
	private String nombre;

	private ArrayList<RegistroHoyo> hoyosJugados;

	public Golfista(String nombre) {
		this.setNombre(nombre);
		numero = proximoNumero();
		hoyosJugados = new ArrayList<>();
	}
	
	public void detalleRegistro() {
		for (RegistroHoyo registroHoyo : hoyosJugados) {
			System.out.println(registroHoyo);
		};
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumero() {
		return numero;
	}

	private int proximoNumero() {
		return ++ultimoNro;
	}

	public int puntajeTotal() {
		int pt = 0;
		for (RegistroHoyo registroHoyo : hoyosJugados) {
			pt += registroHoyo.getPuntaje();
		}
		return pt;
	}

	public boolean registrarHoyo(Hoyo hoyo, int golpes) {
		boolean ok = false;
		if (hoyo.registrar(this)) {
			hoyosJugados.add(new RegistroHoyo(hoyo, golpes));
			ok = true;
		}
		return ok;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Golfista [numero=" + numero + ", nombre=" + nombre + ", hoyosJugados=" + hoyosJugados.size()
				+ ", puntajeTotal=" + puntajeTotal() + "]";
	}

}
