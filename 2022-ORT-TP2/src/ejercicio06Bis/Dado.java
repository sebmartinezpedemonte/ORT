package ejercicio06Bis;

public class Dado {
	private int valor;
	private double promediodado1;
	private double promediodado2;;
	private int sumaResultadosDado1;;
	private int sumaResultadosDado2;

	public int getValor() {
		return this.valor;
	}

	private int tirarDado() {
		valor = (int) (Math.random() * (6) + 1);
		return valor;
	}

	public void mostrarResultado(Dado dado1, Dado dado2) {
		dado1.tirarDado();
		dado2.tirarDado();
		if (dado1.getValor() == dado2.getValor()) {
			System.out.println("El resultado es el mismo y es con el valor " + dado1.getValor());
		} else if (dado1.getValor() > dado2.getValor()) {
			System.out.println("El dado 1 gano con el puntaje " + dado1.getValor());
		} else {
			System.out.println("El dado 2 gano con el puntaje " + dado2.getValor());
		}

		for (int i = 0; i < 100; i++) {
			dado1.tirarDado();
			sumaResultadosDado1 += dado1.getValor();
			dado2.tirarDado();
			sumaResultadosDado2 += dado2.getValor();

		}
		System.out.println("El promedio de los resultados de 100 lanzamientos de los dos dados: ");
		promediodado1 = (double) sumaResultadosDado1 / 100;
		System.out.println("Promedio dado 1 = " + promediodado1);
		promediodado2 = (double) sumaResultadosDado2 / 100;
		System.out.println("Promedio dado 2 = " + promediodado2);
	}

}
