package ort.edu.tp1.trabajopractico3.ejercicio4;

public enum TipoTelevisor {
	SMART("smart"),
	NO_SMART("no smart");
	
	private String nombreTipo;
	
	private TipoTelevisor(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	
	public String getNombreTipo() {
		return this.nombreTipo;
	}
}
