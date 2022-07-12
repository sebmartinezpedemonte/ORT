package parcial2thp;

public class Amigo {
	private String nombre;
	private String domicilio;
	
	
	public Amigo(String nombre, String domicilio) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
	}


	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "Amigo [nombre=" + nombre + ", domicilio=" + domicilio + "]";
	}
	
}
