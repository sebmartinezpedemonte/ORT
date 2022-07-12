package parcial2thp;

import java.util.ArrayList;

public class Propuesta {
	private Dia dia;
	private Momento momento;
	private ArrayList<Amigo> amigos;
	private ArrayList<Amigo> amigosNoRegistrados;

	public Propuesta(Dia dia, Momento momento) {
		super();
		this.dia = dia;
		this.momento = momento;
		amigos = new ArrayList<>();
		amigosNoRegistrados = new ArrayList<>();

	}

	public Dia getDia() {
		return dia;
	}

	public Momento getMomento() {
		return momento;
	}

	public int cantAmigos() {
		return amigos.size();
	}

	public void bajarAmigo(Amigo amigo) {

		amigos.remove(amigo);

	}

	public void agregarAmigo(Amigo amigo) {
		amigosNoRegistrados.add(amigo);
		amigos.add(amigo);

	}

	public void listarAmigos() {
		System.out.println("Hay " + this.cantAmigos() + " anotados para el " + dia + "(" + momento + ")");
		for (Amigo amigo : amigos) {
			System.out.println(amigo.getNombre());
		}
	}

	public boolean sinAnotados() {
		return amigos.isEmpty();
	}

	public void listarAmigosNoRegistrados() {
		System.out.println("Amigos no registrados en ninguna propuesta: ");
		for (Amigo amigo : amigos) {
			if(amigos.isEmpty()) {
			System.out.println(amigo.getNombre());
			}
		}
	}

	@Override
	public String toString() {
		return "Propuesta [dia=" + dia + ", momento=" + momento + ", amigos=" + amigos + "]";
	}

}
