package parcial.thp.bingo;

import java.util.ArrayList;

public class Carton {
	private final int CANTIDAD_NUMEROS = 15;
	private ArrayList<Integer> numeros;
	private int restantes;

	public Carton(ArrayList<Integer> numerosBolillero) {
		this.numeros = new ArrayList<>();
		this.asignarNumeros(numerosBolillero);
		this.restantes = CANTIDAD_NUMEROS;
		this.agregarTodosNumerosAlBolillero(numerosBolillero);
	}

	private void agregarTodosNumerosAlBolillero(ArrayList<Integer> numerosBolillero) {
		for (Integer num : numeros) {
			numerosBolillero.add(num);
		}
	}

	public boolean buscarNumero(int numero) {
		boolean numeroEncontrado = false;
		int i = 0;
		while (numeros.size() > i && !numeroEncontrado) {
			// con el intValue o no?
			if (numeros.get(i) == numero) {
				numeroEncontrado = true;
				restantes--;
			} else {
				i++;
			}
		}
		return numeroEncontrado;
	}

	public int getRestantes() {
		return this.restantes;

	}

	private void asignarNumeros(ArrayList<Integer> numerosBolillero) {
		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
			int random = (int) Math.floor(Math.random() * numerosBolillero.size());
			numeros.add(numerosBolillero.remove(random));
		}
	}

	@Override
	public String toString() {
		return "[" + numeros + "]";
	}

}
