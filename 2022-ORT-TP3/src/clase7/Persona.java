package clase7;

public class Persona {
	private String nombre;
	private String  apellido;
	private String DNI;
	
	public Persona(String nombre, String apellido, String DNI) {
		super();
		setNombre(nombre);
		setApellido(apellido);
		setDNI(DNI);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	private void setDNI(String dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}
	
	
}
