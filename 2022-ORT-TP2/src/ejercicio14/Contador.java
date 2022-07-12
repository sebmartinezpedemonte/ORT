package ejercicio14;

public class Contador {
	
	private int numeroAContar;
	
	public Contador() {
		this(0);
	}
	
	public Contador (int cantIni) {
		numeroAContar = cantIni;
	}
	
	public void incrementarValorEn1() {
		this.numeroAContar++;
	}
	
	public int obtenerValor() {
		return this.numeroAContar;
	}
	
}
