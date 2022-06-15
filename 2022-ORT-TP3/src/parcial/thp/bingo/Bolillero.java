package parcial.thp.bingo;

import java.util.ArrayList;

public class Bolillero {
	private static final int CANTIDAD_NUMEROS = 90;
	private ArrayList<Integer> numeros;

	public Bolillero() {
		numeros = new ArrayList<>();
		agregarTodosNumerosAlBolillero();
	}

	public boolean tieneNumeros() {
		return !numeros.isEmpty();
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	private void agregarTodosNumerosAlBolillero() {
		for (int i = 1; i <= CANTIDAD_NUMEROS; i++) {
			numeros.add(i);
		}
	}

	public int sacarNumero() {
		int numeroSacar = 0;
		if (tieneNumeros()) {
			int random = (int) Math.floor(Math.random() * numeros.size());
			numeroSacar = numeros.remove(random);
		}
		return numeroSacar;
	}

	public int getNumerosEmitidos() {
		return numeros.size();
	}

}
