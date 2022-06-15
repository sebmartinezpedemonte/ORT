package ar.edu.ort.thp.tp3.ej14;

import java.util.ArrayList;

public class Hoyo {
	private int numero;
	private int valorPar;
	private ArrayList<Golfista> yaPasaron;

	public Hoyo(int numero, int valorPar) {
		setValorPar(valorPar);
		// No necesita setter porque es un valor plenamente controlado.
		this.numero = numero;
		yaPasaron = new ArrayList<>();
	}

	public int getValorPar() {
		return valorPar;
	}
	
	public boolean registrar(Golfista jugador) {
		boolean ok = false;
		if (yaPasaron.contains(jugador)) {
			System.out.println("ERROR: El jugador " + jugador.getNombre() + " ya paso por el hoyo " + numero);
		} else {
			yaPasaron.add(jugador);
			ok = true;
		}
		return ok;
	}

	private void setValorPar(int valorPar) {
		this.valorPar = valorPar;
	}

	public int getNumero() {
		return numero;
	}

	public int getCantidadDeJugadoresQuePasaron() {
		return yaPasaron.size();
	}

	@Override
	public String toString() {
		return "Hoyo [numero=" + numero + ", valorPar=" + valorPar + ", yaPasaron=" + yaPasaron.size() + "]";
	}

}
