package ejercicio06;

public class Pelicula {
	private String nombre;
	private Categoria categoriaPelicula;
	public Pelicula(String nombre, Categoria categoriaPelicula) {
		super();
		this.nombre = nombre;
		this.categoriaPelicula = categoriaPelicula;
	}
	public String getNombre() {
		return nombre;
	}
	public Categoria getCategoriaPelicula() {
		return categoriaPelicula;
	}
	
	public boolean esPremium() {
		boolean esPremium = false;
		if(this.categoriaPelicula.equals(Categoria.PREMIUM)) {
			esPremium = true;
		}
		return esPremium;
	}
	
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", categoriaPelicula=" + categoriaPelicula + "]";
	}
	
	
}
