package ar.edu.ort.thp.tp3.ej8;

public class Producto {
	private String nombre;
	private int cantidad;
	private Fecha fechaVencimiento;
	
	public Producto(String nombre, int cantidad, Fecha fechaVencimiento) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public Fecha getFechaVencimiento() {
		return fechaVencimiento;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", fechaVencimiento=" + fechaVencimiento + "]";
	}

}