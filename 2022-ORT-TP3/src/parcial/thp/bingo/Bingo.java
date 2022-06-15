package parcial.thp.bingo;

import java.util.ArrayList;

public class Bingo {
	private final int PARTICIPANTES_MINIMOS = 5;
	private final int PARTICIPANTES_MAXIMOS = 100;
	private ArrayList<Participante> participantes;
	private Bolillero bolillero;
	private ArrayList<Participante> ganadores;
	private int cantBolillas = 0;

	public Bingo() {

	}

	public void simularRonda(int cantParticipantes) {
		
		if (cantParticipantes >= PARTICIPANTES_MINIMOS && cantParticipantes <= PARTICIPANTES_MAXIMOS) {

			bolillero = new Bolillero();
			participantes = new ArrayList<Participante>();
			ganadores = new ArrayList<>();
			// creando/inicializando participantes
			for (int i = 0; i < cantParticipantes; i++) {
				Participante player = new Participante(i + 1, bolillero.getNumeros());
				participantes.add(player);
			}

			int salio = -1;
			while (!buscarGanadores()) {
				cantBolillas++;
				salio = bolillero.sacarNumero();
				for (Participante participante : participantes) {
					participante.verificarNumero(salio);
				}
			}
			imprimirGanador(cantParticipantes, salio);
		} else {
			System.out.println("Cantidad de participantes erronea");
		}
	}

	private boolean buscarGanadores() {
		for (Participante participante : participantes) {
			if (participante.getCarton().getRestantes() == 0) {
				ganadores.add(participante);
			}
		}
		return ganadores.size() > 0;
	}

	private void imprimirGanador(int cantPart, int salio) {
		System.out.println("*************************************************");
		System.out.println("*** Arranca la ronda con " + cantPart + "  participantes!! ***");
		for (Participante ganador : ganadores) {
			
			System.out.println(
					"---> El participante " + ganador.getId() + "  canto BINGO con el numero  " + salio + " !!!");
		}
		System.out.println("*** Se tiraron " + cantBolillas + " numeros antes de conocer a el o los ganadores!! ***");
		System.out.println("Demos paso a los ganadores y sus cartones:\n" + ganadores);
	}
}
