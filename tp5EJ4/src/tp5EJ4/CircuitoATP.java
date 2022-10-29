package tp5EJ4;

public class CircuitoATP {
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}
	public void cargarData() {
		this.jugadores = //completar
		this.torneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon","Shangai"};
		this.resultados = new int[][] {	{1,3,4,1,3},
										{3,2,3,4,1},
										{2,1,5,5,2},
										{4,5,1,2,5},
										{5,4,2,3,4}};
		
				
	}
	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> Jugadors = new ArrayList<>();
		//Completar
		return Jugadors;
	}
	public String procesarTorneosJugador(String Jugador) {
		String competencias = "";
		//Completar
		return competencias;
	}
	public String obtenerResultadoJugador(String jugador, String torneo) {
		//Completar
	}
	private int buscoJugador(String Jugador) {
		int posJugador = -1;
		//Completar
		return posJugador;
	}
	private int buscoTorneo(String torneo) {
		int posTorneo = -1;
		//Completar
		return posTorneo;
	}
	public int procesarPeorPosTorneoJugador(String jugador) {
		//Completar
	}
}
