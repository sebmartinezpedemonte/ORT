package ejercicio14correctoconparametros;

public class Acumulador {
	private double numeroAAcumular;
	
	public Acumulador() {
		this.numeroAAcumular =0;
	}
	
	public void incrementarValor(double valor) {
		this.numeroAAcumular += valor;
	}
	
	public double obtenerValor() {
		return this.numeroAAcumular;
	}
	
}
