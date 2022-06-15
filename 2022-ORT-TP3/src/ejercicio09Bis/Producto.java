package ejercicio09Bis;

public class Producto {
	private String nombre;
	private int cantidad;	// stock de ese producto
	private Fecha fechaVto;

	public Producto(String nombre, int cantidad, Fecha fechaVto) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaVto = fechaVto;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public Fecha getFechaVto() {
		return fechaVto;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", fechaVto=" + fechaVto + "]";
	}
	
	
	
	
	
	
	
}
