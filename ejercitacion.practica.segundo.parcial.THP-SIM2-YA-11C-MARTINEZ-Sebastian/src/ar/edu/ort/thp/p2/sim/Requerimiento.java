package ar.edu.ort.thp.p2.sim;

public class Requerimiento {
	private String nombre;
	private double cantidad;
	public Requerimiento(String nombre, double cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public double getCantidad() {
		return cantidad;
	}



	@Override
	public String toString() {
		return "Requerimiento [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
	
}
