package ejercicio07;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private Computadora computadora;
	
	public Persona(String nombre, String apellido, String dni, Computadora computadora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.computadora = computadora;
	}
	
	public void trabajar() {
		System.out.println(nombre + " " + apellido + " esta trabajando");
	}
	public void descansar() {
		System.out.println(nombre + " " + apellido + " esta descansando");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", computadora=" + computadora
				+ "]";
	}
	
	
}
