package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public class Yate extends Barco{

	private final double VALOR_BASE_YATE = 5000;
	private final double VALOR_ADICIONAL_YATE = 9000;
	private int cantCamarotes;
	public Yate(String matricula, int eslora, int a�oFabricacion, String nombreDue�o, int cantCamarotes) {
		super(matricula, eslora, a�oFabricacion, nombreDue�o);
		this.cantCamarotes = cantCamarotes;
	}
	
	@Override
	public double costoDeAlquiler() {
		return precioBase() + adicional();
	}
	
	private double precioBase() {
		return VALOR_BASE_YATE * super.getEslora();
	}
	
	private double adicional() {
		return VALOR_ADICIONAL_YATE * cantCamarotes;
	}
	
}
