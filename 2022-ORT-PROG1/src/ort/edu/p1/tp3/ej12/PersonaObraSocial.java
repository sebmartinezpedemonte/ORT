package ort.edu.p1.tp3.ej12;

public class PersonaObraSocial extends Persona{
	
	private String nombrePrestador;
	private int nroAfiliado;
	public PersonaObraSocial(String dNI, String nombre, String apellido, int edad, MotivoTest motivo,
			String nombrePrestador, int nroAfiliado) {
		super(dNI, nombre, apellido, edad, motivo);
		this.nombrePrestador = nombrePrestador;
		this.nroAfiliado = nroAfiliado;
	}
	
	@Override
	public int tienePrioridad() {
		int pri = SIN_PRIORIDAD;
		if(tuvoContactoEstrecho() || super.getEdad() >= EDAD_MAYOR) {
			pri = PRIORIDAD;
		}
		return pri;
	}
	
	private boolean tuvoContactoEstrecho() {
		return getMotivo() == MotivoTest.CONTACTO_ESTRECHO;
	}
}
