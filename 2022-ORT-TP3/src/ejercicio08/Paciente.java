package ejercicio08;

public class Paciente {
	private String DNI;
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Paciente(String DNI, String nombre, String apellido, String telefono) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}



	public String getDNI() {
		return this.DNI;
	}

	@Override
	public String toString() {
		return "Paciente [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ "]";
	}
	
	
	
	
}
