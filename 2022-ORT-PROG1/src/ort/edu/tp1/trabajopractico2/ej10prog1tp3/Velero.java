package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public class Velero extends Barco{

	private  final double VALOR_BASE_VELERO = 10000;
	private  final double VALOR_ADICIONAL_VELERO = 5000;
	private int cantMastiles;
	
	public Velero(String matricula, int eslora, int añoFabricacion, String nombreDueño, int cantMastiles) {
		super(matricula, eslora, añoFabricacion, nombreDueño);
		this.cantMastiles = cantMastiles;
	}

	@Override
	public double costoDeAlquiler() {
		return precioBase() + adicional();
	}
	
	private double precioBase() {
		return VALOR_BASE_VELERO * super.getEslora();
	}
	
	private double adicional() {
		return VALOR_ADICIONAL_VELERO * cantMastiles;
	}

	
}
