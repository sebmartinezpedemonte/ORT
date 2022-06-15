package ejercicio08Bis;

import java.util.ArrayList;

public class AgendaMedica {
	private final int CANT_TURNOS_MAX; //o final y con mayusculas?
	//se puede pasar un final por parametro?
	private int cantTurnosDados;
	private ArrayList<Turno> listaTurnos;
	private ArrayList<Paciente> pacientesAusentes;
	
	public AgendaMedica(int CANT_TURNOS_MAX) {
		pacientesAusentes = new ArrayList<>(); 
		listaTurnos = new ArrayList<>();
		this.CANT_TURNOS_MAX = CANT_TURNOS_MAX;
		this.cantTurnosDados = 0;
	}
	
	private void turnoDado() {
		cantTurnosDados++;
	}
	
	private Turno buscarTurno(String DNI) {
		int i = 0;
		Turno turnoBuscar = null;
		while(listaTurnos.size() > i && turnoBuscar == null) {
			if(listaTurnos.get(i).DNIPaciente().equals(DNI)) {
				turnoBuscar = listaTurnos.get(i);
			}else {
				i++;
			}			
		}		
		return turnoBuscar;
	}
	
	public Resultado registrarTurno(String DNI, String nombre, String apellido, String telefono) {
		Resultado resultado = null;
		if(buscarTurno(DNI)!= null) {
			resultado = Resultado.PACIENTE_CON_TURNO_YA_ASIGNADO;
			System.out.println("Paciente con turno ya asignado");
		}else if(buscarTurno(DNI) == null && cantTurnosDados >= CANT_TURNOS_MAX) {
			resultado = Resultado.MEDICO_NO_TIENE_MAS_TURNOS;
			System.out.println("El medico no tiene mas turnos disponibles");
		}else {
			resultado = Resultado.TURNO_CONFIRMADO;
			this.turnoDado();
			Turno turno = new Turno(DNI, nombre, apellido, telefono);
			listaTurnos.add(turno);
			System.out.println("Turno para el paciente con DNI " + turno.DNIPaciente() + " esta confirmado");
			System.out.println("El turno " + cantTurnosDados + " ha sido confirmado");
		}
		return resultado;
	}
	
	public void listarTurnosAsignados() {
		System.out.println("La cantidad de turnos asignados es : " + cantTurnosDados);
		for(Turno turno : listaTurnos) {
			System.out.println(turno);
		}
	}
	
	public boolean darPresente(String DNI) {
		boolean sePudo = false;
		if(buscarTurno(DNI)!= null) {
			buscarTurno(DNI).setPresente();
			sePudo = true;
			System.out.println("Paciente con DNI " + buscarTurno(DNI).DNIPaciente()+ " dio el presente");
		}
		return sePudo;
	}
	
	public boolean anularTurno(String DNI) {
		boolean sePudo = false;
		if(buscarTurno(DNI)!=null) {
			Turno turno = buscarTurno(DNI);
			listaTurnos.remove(turno);
			System.out.println("Se anulo el turno");	
			this.cantTurnosDados--;
		}		
		return sePudo;
	}
	
	public ArrayList<Paciente> obtenerAusentes(){
		
		Paciente pacienteAusente = null;
		
		for(Turno turno : listaTurnos) {
			
			if(!turno.getSePresento()) {
				pacienteAusente = turno.obtenerAusentes();
				pacientesAusentes.add(pacienteAusente);
			}
		}
		System.out.println("pacientes ausentes:");
		for(Paciente paciente : pacientesAusentes) {
			
			System.out.println(paciente);
		}
		return pacientesAusentes;
	}

	@Override
	public String toString() {
		return "AgendaMedica [CANT_TURNOS_MAX=" + CANT_TURNOS_MAX + ", cantTurnosDados=" + cantTurnosDados
				+ ", listaTurnos=" + listaTurnos + "]";
	}
	
	
}
