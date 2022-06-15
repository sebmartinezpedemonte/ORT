package ejercicio05;

public class Ejemplar {
	private String ID;
	private String fechaPrestamo;
	private Estado estado;
	public Ejemplar(String iD, String fechaPrestamo, Estado estado) {
		super();
		ID = iD;
		this.fechaPrestamo = fechaPrestamo;
		this.estado = estado;
	}
	public String getID() {
		return ID;
	}
	public String getFechaPrestamo() {
		return fechaPrestamo;
	}
	public Estado getEstado() {
		return this.estado;
	}
	@Override
	public String toString() {
		return "Ejemplar [ID=" + ID + ", fechaPrestamo=" + fechaPrestamo + ", estado=" + estado + "]";
	}
	

	
	
	
}
