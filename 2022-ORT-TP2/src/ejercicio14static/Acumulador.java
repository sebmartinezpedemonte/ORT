package ejercicio14static;

public class Acumulador {
	private static double numeroAAcumular;
	
	public Acumulador() {
		Acumulador.numeroAAcumular =0;
	}
	
	public static void incrementarValor(double valor) {
		Acumulador.numeroAAcumular += valor;
	}
	
	public static double obtenerValor() {
		return Acumulador.numeroAAcumular;
	}
	
}
