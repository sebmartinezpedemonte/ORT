package ort.edu.tp1.trabajopractico3.ejercicio4;

public enum TipoLavarropas {
	AUTOMATICO("automatico"),
	SEMIAUTOMATICO("semi automatico");
	
	private String nombreTipo;
	
	private TipoLavarropas(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	
	public String getnombreTipo() {
		return nombreTipo;
	}
}
