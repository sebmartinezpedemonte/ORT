package ejercicio01;

public class Persona {
	private final String DNI;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	public Persona(String DNI, String nombre, String apellido, Domicilio domicilio) {
		super();
		this.DNI = DNI;
		setNombre(nombre);
		setApellido(apellido);
		setDomicilio(domicilio);
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

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getDNI() {
		return DNI;
	}

	public String obtenerNombreCompleto() {
		return nombre + " " + apellido;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio
				+ "]";
	}

}
