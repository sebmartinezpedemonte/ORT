package ejercicio11Static;

public class Turnera {
	private static int turno;
	//si es static el constructor parametrizado no tiene sentido
	//public Turnera(int turno) {
	//	Turnera.turno = turno;
	//}
	public Turnera() {
		Turnera.turno = 0;
	}
	
	public static void otorgarProximoTurno() {
		Turnera.turno++;
	}
	
	public static int obtenerUltimoNumero() {
		System.out.println(Turnera.turno);
		return Turnera.turno;
	}
	
	public static void resetearContador() {
		Turnera.turno = 0;
	}
	
	public static void resetearContador(int turnoNuevo) {
		if(turnoNuevo >= 0) {
			Turnera.turno = turnoNuevo;					
		}
		
	}
}
