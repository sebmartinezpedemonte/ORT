package ejercicio05;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private ArrayList<Libro> libros;
	
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		libros = new ArrayList<>();
	}
	
	public Respuesta prestar(Libro libro, Lector lector) {
		Respuesta respuestaPosible = Respuesta.NO_HAY_EJEMPLARES;
		
		return respuestaPosible;
	}
	
	
	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", libros=" + libros + ", lectores=" + "]";
	}


	
	
}
