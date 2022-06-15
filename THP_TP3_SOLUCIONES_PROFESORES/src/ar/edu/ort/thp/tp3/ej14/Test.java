package ar.edu.ort.thp.tp3.ej14;

public class Test {

	public static void main(String[] args) {
		TorneoDeGolf torneo = new TorneoDeGolf();
		
		torneo.agregarHoyo(4);
		torneo.agregarHoyo(2);
		torneo.agregarHoyo(3);
		torneo.agregarHoyo(5);
		torneo.agregarHoyo(4);
		
		Golfista g1 = torneo.registrarParticipante("Angel Caverna");
		Golfista g2 = torneo.registrarParticipante("Augusto Barrioriver");
		Golfista g3 = torneo.registrarParticipante("Roberto Debisiesto");
		
		torneo.registrarHoyo(g1, 1, 3);
		torneo.registrarHoyo(g2, 1, 4);
		torneo.registrarHoyo(g3, 5, 3);
		torneo.registrarHoyo(g1, 1, 3);
		torneo.registrarHoyo(g1, 2, 3);
		torneo.registrarHoyo(g2, 2, 2);
		torneo.registrarHoyo(g3, 4, 3);
		
		torneo.listarLiderOLideres();	
		torneo.listarHoyosNoVisitados();
	}

}