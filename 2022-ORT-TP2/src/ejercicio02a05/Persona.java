package ejercicio02a05;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	public Persona() {
		this.nombre = "";
		this.apellido = "";
		// this.domicilio = null;
	}

	public void ponerNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}

	public void ponerApellido(String nuevoApellido) {
		this.apellido = nuevoApellido;
	}

	public String obtenerNombreCompleto() {
		return nombre + " " + apellido;
	}

	public void setDomicilio(Domicilio domicilioNuevo) {
		this.domicilio = domicilioNuevo;
	}

	public Domicilio mostrarDomicilio() {
		return domicilio;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido + " vive en " + domicilio;
	}

}
