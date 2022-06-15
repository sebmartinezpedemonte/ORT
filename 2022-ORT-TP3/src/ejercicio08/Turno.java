package ejercicio08;

public class Turno {
	private boolean sePresento;
	private Paciente pacienteInscripto;
	@SuppressWarnings("unused")
	private String DNIPaciente;

	public Turno(String DNI, String nombre, String apellido, String telefono) {
		pacienteInscripto = new Paciente(DNI, nombre, apellido, telefono);
		sePresento = false;
	}

	public boolean getSePresento() {
		return this.sePresento;
	}

	
	
	public void setPresente() {
		sePresento = true;
	}

	public String DNIPaciente() {
		return pacienteInscripto.getDNI();
	}

	public Paciente obtenerAusentes() {
		Paciente pacienteAusente = null;
		if (!this.getSePresento()) {
			pacienteAusente = pacienteInscripto;
		}
		return pacienteAusente;
	}

	@Override
	public String toString() {
		return "Turno [sePresento=" + sePresento + " pacienteInscripto=" + pacienteInscripto;
	}

}
