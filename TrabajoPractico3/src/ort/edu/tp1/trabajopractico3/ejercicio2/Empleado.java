package ort.edu.tp1.trabajopractico3.ejercicio2;

public abstract class Empleado {
	private String nombre;
	private int edad;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	//el enunciado dice public pero en clase nos dice que los pongamos en private
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	//el enunciado dice public pero en clase nos dice que los pongamos en private
	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	//este metodo podria ser abstracto
	//public abstract float calcularPago();
	public float calcularPago() {
		return 0.0f;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}
	


	
	

}
