package ort.edu.tp1.trabajopractico2.ej8prog1tp3;

public abstract class Empleado {
	
	private String dni;
	private String nombre;
	private String apellido;
	private int a�oIngreso;
	
	public Empleado(String dni, String nombre, String apellido, int a�oIngreso) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.a�oIngreso = a�oIngreso;
	}
	
	public abstract double calcularSalario();
	
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return apellido;
	}
	

	
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", a�oIngreso=" + a�oIngreso
				+ "]";
	}
	
	
	
}
