package ejercicio14static;

public class Contador {
	
	private static int numeroAContar;
	
	public Contador() {
		Contador.numeroAContar = 0;
	}
	
	public static void incrementarValorEn1() {
		Contador.numeroAContar++;
	}
	
	public static int obtenerValor() {
		return Contador.numeroAContar;
	}
	
}
