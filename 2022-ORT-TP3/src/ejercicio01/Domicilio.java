package ejercicio01;

public class Domicilio {
	private String calle;
	private String numero;
	private String ciudad;



	public Domicilio(String calle, String numero, String ciudad) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}

	public void setCalle(String calleNueva) {
		this.calle = calleNueva;
	}

	public String getCalle() {
		return this.calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numeroNuevo) {
		this.numero = numeroNuevo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudadNueva) {
		this.ciudad = ciudadNueva;
	}

	@Override
	public String toString() {
		return calle + " " + numero + " en la ciudad de " + ciudad;
	}

}
