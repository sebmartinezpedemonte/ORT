package recuperatorio.fpr;

public class Articulo {
	
	private String nombre;
	private int cantidad;
	
	public Articulo(String nombre, int cantidad) {
		setNombre(nombre);
		setCantidad(cantidad);
	}
	
	public void actualizarCantidad(int cantRecibida) {
		this.cantidad += cantRecibida;
	}
	
	

	public void actualizarStock(int cantidadRestar) {
		this.cantidad -= cantidadRestar;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public int getCantidad() {
		return cantidad;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
