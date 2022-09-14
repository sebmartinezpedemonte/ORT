package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public class Velero extends Barco{

	private  final double VALOR_BASE_VELERO = 10000;
	private  final double VALOR_ADICIONAL_VELERO = 5000;
	private int cantMastiles;
	
	public Velero(String matricula, int eslora, int a�oFabricacion, String nombreDue�o, int cantMastiles) {
		super(matricula, eslora, a�oFabricacion, nombreDue�o);
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
