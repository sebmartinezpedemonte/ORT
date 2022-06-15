package ar.edu.ort.thp.tp3.ej13;

public class Fecha {
	private int anio;
	private int mes;
	private int dia;

	// version ultrareducida de una fecha
	public Fecha(int anio, int mes, int dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}

	public int getNumeroFechaCompleta() {
		return (anio * 100 + mes) * 100 + dia;
	}

	@Override
	public String toString() {
		return "[" + anio + "-" + mes + "-" + dia + "]";
	}

	
}