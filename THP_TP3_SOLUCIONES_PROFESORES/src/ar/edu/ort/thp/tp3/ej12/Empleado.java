package ar.edu.ort.thp.tp3.ej12;

public class Empleado {

	private int nroLegajo;
	private String apellido;
	private String nombre; 
	private Oficina oficina;
	
	public Empleado(int nroLegajo, String nombre, String apellido, Oficina oficina) {
		setLegajo(nroLegajo);
		setNombre(nombre);
		setApellido(apellido);
		setOficina(oficina);
	}
	
	public int getNroLegajo() {
		return nroLegajo;
	}
	
	public String getUbicacion() {
		return "Oficina " + oficina.getNro() + " - Area " + oficina.getNombreArea();
	}

	public boolean mismoNombreCompleto(String nombre, String apellido) {
		return this.nombre.equals(nombre) && this.apellido.equals(apellido);
	}

	public void mostrarDatos() {
		System.out.println(this);
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	private void setLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	@Override
	public String toString() {
		return "Empleado [nroLegajo=" + nroLegajo + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", getUbicacion()=" + getUbicacion() + "]";
	}

}
