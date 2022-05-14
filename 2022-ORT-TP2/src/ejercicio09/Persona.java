package ejercicio09;

public class Persona {
	private String DNI;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	public Persona(String DNI, String nombre, String apellido, Domicilio domicilio) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
	}

	public String getDNI() {
		return this.DNI;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido + " con DNI " + DNI + " quien vive en " + domicilio;
	}

}
