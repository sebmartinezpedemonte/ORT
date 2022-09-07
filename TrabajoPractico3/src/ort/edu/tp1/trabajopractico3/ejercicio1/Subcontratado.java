package ort.edu.tp1.trabajopractico3.ejercicio1;

public class Subcontratado extends Empleado{

	private float cantHoras;
	private float precioHora;
	
	public Subcontratado() {
		super();
	}
	public Subcontratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}
	
	//este metodo especializa el comportamiento de la superclase
	@Override
	public float calcularPago() {
		return precioHora*cantHoras;
	}
	
	//este metodo extiende el comportamiento de la superclase
	@Override
	public String toString() {
		return "Subcontratado " + super.getNombre() + " gana:" + this.calcularPago();
	}


	
	
	
}
