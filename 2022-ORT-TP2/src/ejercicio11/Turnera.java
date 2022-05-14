package ejercicio11;

public class Turnera {
	private int turno;
	
	public Turnera(int turno) {
		this.turno = turno;
	}
	public Turnera() {
		this.turno = 0;
	}
	
	public void otorgarProximoTurno() {
		this.turno++;
	}
	
	public int obtenerUltimoNumero() {
		System.out.println(this.turno);
		return this.turno;
	}
	
	public void resetearContador() {
		this.turno = 0;
	}
	
	public void resetearContador(int turnoNuevo) {
		if(turnoNuevo >= 0) {
			this.turno = turnoNuevo;					
		}
		
	}
}
