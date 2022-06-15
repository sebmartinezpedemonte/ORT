package ar.edu.ort.thp.tp3.ej11;

public class Producto {

	private String nombre;
	private int cantDiasFresco;
	private Fecha fechaAlmacenamiento;
	
	public Producto(String nombre, int cantDiasFresco, Fecha fechaAlmacenamiento) {
		setNombre(nombre);
		setCantDiasFresco(cantDiasFresco);
		setFechaAlmacenamiento(fechaAlmacenamiento);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setCantDiasFresco(int cantDiasFresco) {
		this.cantDiasFresco = cantDiasFresco;
	}

	private void setFechaAlmacenamiento(Fecha fechaAlmacenamiento) {
		this.fechaAlmacenamiento = fechaAlmacenamiento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantDiasFresco() {
		return cantDiasFresco;
	}

	public Fecha getFechaAlmacenamiento() {
		return fechaAlmacenamiento;
	}

	public boolean estaVencido() {
		return Fecha.esFechaMenor(Fecha.sumarDias(fechaAlmacenamiento, cantDiasFresco));
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantDiasFresco=" + cantDiasFresco + ", fechaAlmacenamiento="
				+ fechaAlmacenamiento + "]";
	}
}
