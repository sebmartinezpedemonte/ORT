package ejercicio14correctoconparametros;

public class Promedio {
	private double promedio;

	private Contador contador;
	private Acumulador acumulador;


	public Promedio(Contador contador, Acumulador acumulador) {
		this.promedio = 0;
		this.contador = contador;
		this.acumulador = acumulador;

	}

	public void incrementar(double valor) {
		contador.incrementarValorEn1();
		acumulador.incrementarValor(valor);

	}

	public double obtenerValor() {
		if (contador.obtenerValor() >= 1) {
			promedio = acumulador.obtenerValor() / (contador.obtenerValor());
		}
		return this.promedio;
	}

}
