package ejparcial;

public abstract class Producto implements Evaluable{
	private String nombre;
	private String descripcion;
	
	public Producto(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public boolean esBueno() {
		return this.evaluar().equals(EstadoFuncionamiento.BUENO);
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + ". Descripcion: " + this.descripcion + ".";
	}
	
	
}
