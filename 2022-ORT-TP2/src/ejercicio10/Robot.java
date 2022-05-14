package ejercicio10;

public class Robot {
	private String nombre;
	
	public Robot(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludar() {
		System.out.println("Hola, mi nombre es " + this.nombre + ". ¿En que puedo ayudarte?");
	}
	
	public void saludar(String nombreCompleto) {
		System.out.println("Hola " + nombreCompleto + ", mi nombre es " + this.nombre + ". ¿En que puedo ayudarte?");
	}
}
