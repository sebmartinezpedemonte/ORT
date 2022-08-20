package ort.edu.tp1.clase01.clases;

public class Hijo {
	private String nombre;

	public String getNombre() {
		return nombre;
	}
	
	

	public Hijo(String nombre) {
		super();
		this.nombre = nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Hijo getCopia() {
		return new Hijo(nombre);
	}
	
	
}
