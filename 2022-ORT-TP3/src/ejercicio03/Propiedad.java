package ejercicio03;

public class Propiedad {
	private String domicilio;
	private double precio;
	private TipoPropiedad tipoPropiedad;
	
	public Propiedad(String domicilio, double precio, TipoPropiedad tipoPropiedad) {
		super();
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipoPropiedad = tipoPropiedad;
	}

	public String getDomicilio() {
		return domicilio;
	}
	

	public double getPrecio() {
		return precio;
	}

	public TipoPropiedad getTipoPropiedad() {
		return tipoPropiedad;
	}

	@Override
	public String toString() {
		return "Propiedad [domicilio=" + domicilio + ", precio=" + precio + ", tipoPropiedad=" + tipoPropiedad + "]";
	}
	
	
	
	
}
