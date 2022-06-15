package ejercicio05;

import java.util.ArrayList;

public class Libro {
	private String titulo;
	private int año;
	private ArrayList<Ejemplar> ejemplares;
	private Genero genero;
	private Editorial editorial;
	private Autor autor;
	public Libro(String titulo, int año, Genero genero, Editorial editorial, Autor autor) {
		super();
		ejemplares = new ArrayList<>();
		this.titulo = titulo;
		this.año = año;
		this.genero = genero;
		this.editorial = editorial;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getAño() {
		return año;
	}
	public Genero getGenero() {
		return genero;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", año=" + año + ", ejemplares=" + ejemplares + ", genero=" + genero
				+ ", editorial=" + editorial + ", autor=" + autor + "]";
	}
	
	
}
