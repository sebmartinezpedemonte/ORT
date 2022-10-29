package tp5EJ4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//1
		CircuitoATP circuito = new CircuitoATP();
		//2
		ArrayList<Jugador> jugadores =	circuito.procesarInfo();
		//3
		System.out.println("Resultado final campeonato");
		for (Jugador jugador : jugadores) {
			System.out.println(jugador);
		}
		//4
		String delbonis = circuito.procesarTorneosJugador("Delbonis");
		System.out.println(delbonis);
		//5
		String schwartzman = circuito.obtenerResultadoJugador("Schwartzman", "RolandGarros");
		System.out.println(schwartzman);
		//6
		int peorPella = circuito.procesarPeorPosTorneoJugador("Pella");
		//System.out.println("Peor Resultado de Pella en el año: " + peorPella);
		

	}

}
