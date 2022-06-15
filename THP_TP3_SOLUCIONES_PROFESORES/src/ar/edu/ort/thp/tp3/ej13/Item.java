package ar.edu.ort.thp.tp3.ej13;

public class Item {
	private Fecha fecha;
	private String descripcion;
	
	// version ultrareducida a fin de probar el apareador
	public Item(Fecha fecha, String descripcion) {
		this.setFecha(fecha);
		this.setDescripcion(descripcion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public int getValorFecha() {
		return fecha.getNumeroFechaCompleta();
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return fecha + ", " + descripcion;
	}
	
}
