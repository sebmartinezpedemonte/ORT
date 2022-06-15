package parcial.thp.bingo;

import java.util.ArrayList;

public class Participante {

	private int id;
	private Carton carton;
	
	public Participante(int id, ArrayList<Integer> numeros) {
		this.id = id;
		carton = new Carton(numeros);
	}

	public int getId() {
		return id;
	}
	
	public boolean verificarNumero(int numero) {
		return carton.buscarNumero(numero);
	}

	@Override
	public String toString() {
		return "Participante " + id + ", numeros del carton :" + carton + "]";
	}

	public Carton getCarton() {
		return this.carton;
	}
	
	
	
	
	
	
}
