package ejercicio14correctoconparametros;

public class Contador {
	
	private int numeroAContar;
	
	public Contador() {
		this.numeroAContar = 0;
	}
	
	public void incrementarValorEn1() {
		this.numeroAContar++;
	}
	
	public int obtenerValor() {
		return this.numeroAContar;
	}
	
}
