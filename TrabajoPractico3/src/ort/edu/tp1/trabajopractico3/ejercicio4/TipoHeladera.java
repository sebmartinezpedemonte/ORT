package ort.edu.tp1.trabajopractico3.ejercicio4;

public enum TipoHeladera {
	FROST("frost"),
	NO_FROST("no frost");
	
	private String nombreTipo;
	
	private TipoHeladera(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	
	public String getNombreTipo() {
		return this.nombreTipo;
	}
}
