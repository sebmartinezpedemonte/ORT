package ejercicio07;

public class Computadora {
	private String marca;
	private Procesador procesador;
	private TipoDeComputadora tipoDeComputadora;
	private LectoraDeDVD lectoraDeDVD;
	
	public Computadora(String marca, Procesador procesador, TipoDeComputadora tipoDeComputadora) {
		this.marca = marca;
		this.procesador = procesador;
		this.tipoDeComputadora = tipoDeComputadora;		
	}
	
	public Computadora(String marca, Procesador procesador, TipoDeComputadora tipoDeComputadora, LectoraDeDVD lectoraDeDVD) {
		this.marca = marca;
		this.procesador = procesador;
		this.tipoDeComputadora = tipoDeComputadora;		
		this.lectoraDeDVD = lectoraDeDVD;
	}
	
	public void prender() {
		System.out.println("Computadora prendiendo");
	}
	
	public void apagar() {
		System.out.println("Computadora apagandose");
	}
	
	public void reiniciar() {
		System.out.println("Computadora reiniciandose");
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", procesador=" + procesador + ", tipoDeComputadora=" + tipoDeComputadora
				+ ", lectoraDeDVD=" + lectoraDeDVD + "]";
	}
	
	
	
}
