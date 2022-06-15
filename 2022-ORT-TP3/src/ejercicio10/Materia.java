package ejercicio10;

public class Materia {
	private String nombre;
	private double notaFinal;
	public Materia(String nombre, double notaFinal) {
		super();
		this.nombre = nombre;
		this.notaFinal = notaFinal;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getNotaFinal() {
		return notaFinal;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", notaFinal=" + notaFinal + "]";
	}
	
	
}
