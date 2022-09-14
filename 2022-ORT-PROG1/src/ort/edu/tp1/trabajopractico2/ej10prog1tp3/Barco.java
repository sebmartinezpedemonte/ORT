package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public abstract class Barco {
	private String matricula;
	private int eslora;
	private int añoFabricacion;
	private String nombreDueño;
	
	public Barco(String matricula, int eslora, int añoFabricacion, String nombreDueño) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.añoFabricacion = añoFabricacion;
		this.nombreDueño = nombreDueño;
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
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", añoFabricacion=" + añoFabricacion
				+ ", nombreDueño=" + nombreDueño + "]";
	}
	
}
