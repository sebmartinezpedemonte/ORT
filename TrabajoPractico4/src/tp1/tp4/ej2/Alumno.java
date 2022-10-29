package tp1.tp4.ej2;

import tp1.tp4.tj3.RangoDeEnteros;

public class Alumno extends Persona {

	public static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
	private int numeroLegajo;

	public Alumno(String nombreCompleto, int anioNacimiento, int numeroLegajo) {
		super(nombreCompleto, anioNacimiento);
		this.setNumeroLegajo(numeroLegajo);
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		if (RANGO_NRO_DOCUMENTO.incluye(numeroLegajo)) {
			this.numeroLegajo = numeroLegajo;
		}else {			
			throw new IllegalArgumentException("El DNI ingresado no es valido");
		}

		
	}

	@Override
	public String toString() {
		return super.toString() + "Alumno [numeroLegajo=" + numeroLegajo + "]";
	}

}
