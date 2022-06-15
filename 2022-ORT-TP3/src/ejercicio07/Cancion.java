package ejercicio07;

public class Cancion {
	private final String nombre;
	private final String autor;
	private int diasPublicacion;
	private int cantReproducciones;
	private Genero genero;
	public Cancion(String nombre, String autor,Genero genero, int diasPublicacion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.diasPublicacion = diasPublicacion; 
		this.cantReproducciones = 0;
		this.genero = genero;
	}
	
	public void escuchar() {
		cantReproducciones++;
	}
	
	public int getCantReproducciones() {
		return cantReproducciones;
	}	
	
	public boolean topeDiasPublicacion() {
		boolean esPremium = false;
		if(this.diasPublicacion > 7) {
			esPremium = true;
		}
		return esPremium;
		//return (this.cantReproducciones > 1000 || this.diasPublicacion > 7)
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getAutor() {
		return autor;
	}
	


	@Override
	public String toString() {
		return "Cancion " + nombre + ", de " + autor + ", publicada hace " + diasPublicacion
				+ " dias" + ", de genero " + genero + "cant reproducciones " + cantReproducciones;
	}
	
	
	
	
}
