package ejercicio00VideosCimino;

public class Porcentaje {
	private double porcCuerda;
	private double porcViento;
	private double porcPercusion;
	public Porcentaje(double porcCuerda, double porcViento, double porcPercusion) {
		super();
		this.porcCuerda = porcCuerda;
		this.porcViento = porcViento;
		this.porcPercusion = porcPercusion;
	}
	@Override
	public String toString() {
		return "Porcentaje [porcCuerda=" + porcCuerda + ", porcViento=" + porcViento + ", porcPercusion="
				+ porcPercusion + "]";
	}
	
	
}
