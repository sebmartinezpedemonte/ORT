package ar.edu.ort.thp.tp3.ej2;

public class Empleado {

	private String nombre; 
	private String apellido;
	
	public Empleado(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + " Apellido: " + apellido);
	}

	public boolean mismoNombreCompleto(String nombre, String apellido) {
		return this.nombre.equals(nombre) && this.apellido.equals(apellido);
	}
	
}
