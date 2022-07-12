package recu1.clases;

public class Articulo {

	private Rubro rubro;
	private String nombre;
	private double cantidad;

	public Articulo(Rubro rubro, String nombre, double cantidad) {
		this.rubro = rubro;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public void agregar(double cantidad) {
		this.cantidad +=cantidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	public Rubro getRubro() {
		return rubro;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean retirarSiAlcanza(double cantidad) {
		boolean resultado = false;
		if (this.cantidad >= cantidad) {
			this.cantidad -= cantidad;
			resultado = true;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Articulo [rubro=" + rubro + ", nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}

}
