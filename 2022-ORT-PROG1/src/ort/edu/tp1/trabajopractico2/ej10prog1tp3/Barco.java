package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public abstract class Barco {
	private String matricula;
	private int eslora;
	private int a�oFabricacion;
	private String nombreDue�o;
	
	public Barco(String matricula, int eslora, int a�oFabricacion, String nombreDue�o) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.a�oFabricacion = a�oFabricacion;
		this.nombreDue�o = nombreDue�o;
	}

	public int getEslora() {
		return eslora;
	}
	
	public abstract double costoDeAlquiler();
	
	public double calcularConsumo() {
		return 0;
	}

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", a�oFabricacion=" + a�oFabricacion
				+ ", nombreDue�o=" + nombreDue�o + "]";
	}
	
}
