package ort.edu.tp1.trabajopractico3.ejercicio2;

public class Asalariado extends Empleado{
	
	private float sueldo;

	public Asalariado() {
		super();
	}
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}
	
	//este metodo especializa el comportamiento de la superclase
	@Override
	public float calcularPago() {
		return sueldo;
	}
	//este metodo extiende el comportamiento de la superclase
	@Override
	public String toString() {
		return "Asalariado " + super.getNombre() + " gana:" + sueldo;
	}

	
	
	
	
}
