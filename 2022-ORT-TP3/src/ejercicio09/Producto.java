package ejercicio09;

public class Producto {
	private String nombre;
	private int cantidad;	// stock de ese producto
	private String fechaVto;

	public Producto(String nombre, int cantidad, String fechaVto) {
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
	public String getFechaVto() {
		return fechaVto;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", fechaVto=" + fechaVto + "]";
	}
	
	
	
	
	
	
	
}
