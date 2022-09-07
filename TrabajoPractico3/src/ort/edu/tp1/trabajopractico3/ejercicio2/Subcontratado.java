package ort.edu.tp1.trabajopractico3.ejercicio2;

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
	
	public float getCantHoras() {
		return cantHoras;
	}
	public float getPrecioHora() {
		return precioHora;
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
