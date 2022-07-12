package Recuperatorio1Profe;

public class Articulo {
	private String nombre;
	private double cantidad;
	
	public Articulo(String nombre, double cantidad) {
		setNombre(nombre);
		setCantidad(cantidad);
	}
	
	public void actualizarCantidad(double cantidad) {
		this.cantidad += cantidad;
	}
	
	public boolean vender(double cantidad) {
		boolean resultado = false;
		
		if(this.cantidad >= cantidad) {
			this.cantidad -= cantidad;
			resultado = true;
		}
		return resultado;
	}
	
	public String toString() {
		String articuloEnCadena;
		articuloEnCadena = "Nombre: " + this.nombre;
		articuloEnCadena += " - Cantidad: " + this.cantidad;
		return articuloEnCadena;
	}
	
	

	public String getNombre() {
		return nombre;
	}


	public double getCantidad() {
		return cantidad;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
