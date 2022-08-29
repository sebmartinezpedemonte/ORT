package ort.edu.tp1.trabajopractico2.ejercicio1;

public enum TipoDeTelefono {
	FAX("Fax"),
	FIJO("Fijo"),
	CELULAR("Celular");
	
	private String formato;
	
	private TipoDeTelefono(String formato) {
		this.formato = formato;
	}
	
	public String getFormatoString() {
		return this.formato;
	}
}
