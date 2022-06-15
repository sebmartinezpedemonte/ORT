package ejercicio05;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private int fechaNac;
	public String getNombre() {
		return nombre;
	}
	
	
	public Autor(String nombre, String nacionalidad, int fechaNac) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fechaNac = fechaNac;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}
	public int getFechaNac() {
		return fechaNac;
	}
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fechaNac=" + fechaNac + "]";
	}
	
}
