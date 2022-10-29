package tp5EJ4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CircuitoATP {
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}
	public void cargarData() {
		this.jugadores = new String[] {"Pella", "Del Potro", "Schwartzman", "Mayer" , "Delbonis"};
		this.torneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon","Shangai"};
		this.resultados = new int[][] {	{1,3,4,1,3},
										{3,2,3,4,1},
										{2,1,5,5,2},
										{4,5,1,2,5},
										{5,4,2,3,4}};
		/*
		 * matriz de valores enteros
		 *  de 5x5 que contiene en qué
		 *   puesto finalizó cada tenista 
		 *   en cada torneo, donde 
		 *   cada fila es un tenista y
		 *   cada columna un torneo.
		 */
				
	}
	//Tal que procese la matriz, cree las instancias de jugadores, procese los
	//resultados de cada uno y retorne la lista de jugadores.
	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> Jugadors = new ArrayList<>();
		for(int i = 0; i < this.jugadores.length ; i++) {
			Jugador jg = new Jugador(this.jugadores[i]);
			Jugadors.add(jg);
			for(int j = 0 ; j < this.torneos.length ; j++) {
			jg.procesarResultado(this.resultados[i][j]);
			}			
		}
		
		return Jugadors;
	}
	//tal que retorne, para el jugador enviado por parámetro, el resultado de todos
	//los torneos en un string con el nombre del torneo y su puesto en el mismo.
	//Por ejemplo:
	//Del Potro: Australia:3 USOpen:2 RolandGarros:3 Wimbledon:4 Shangai:1
	public String procesarTorneosJugador(String Jugador) {
		String competencias = "";
		String nombre = "";
		int posJug = this.buscoJugador(Jugador);
		if(posJug != -1) {			
			for(int i = 0; i< jugadores.length; i++) {
				competencias += this.torneos[i] + ":" + this.resultados[posJug][i] + " ";
			}
		}
		//nombre = this.jugadores[posJug];
		competencias = Jugador + ":" + competencias;
		return competencias;
	}
	//tal que devuelva el puesto en que finalizó un jugador (enviado por parámetro)
	//en un torneo (enviado por parámetro) y lo devuelva en un string. Ejemplo:
	//Resultado de Schwartzman en RolandGarros:5
	public String obtenerResultadoJugador(String jugador, String torneo) {
		//Completar
		String resultado = "";
		int posJug = this.buscoJugador(jugador);
		int posTorneo = this.buscoTorneo(torneo);
		int puesto = this.resultados[posJug][posTorneo];
		resultado = "Resultado de " + jugador + " en " + torneo + ":" + puesto;		
		return resultado;
	}
	
	//el cual recibe el nombre de un jugador y devuelve la posición del mismo
	//dentro del array de jugadores. En caso de que no exista, devolver -1.
	private int buscoJugador(String Jugador) {
		int posJugador = -1;
		int i = 0;		
		while(i < this.jugadores.length && posJugador == -1) {
			if(this.jugadores[i].equals(Jugador)) {
				posJugador = i;
			}else {
				i++;
			}
		}		
		return posJugador;
	}
	
	//tal que reciba el nombre de un torneo y devuelva la posición correspondiente
	//del mismo en el array de torneos. En caso de que no exista, devolver -1.
	private int buscoTorneo(String torneo) {
		int posTorneo = -1;
		int i = 0;
		while(i < this.torneos.length && posTorneo ==-1) {
			if(this.torneos[i].equals(torneo)) {
				posTorneo = i;
			}else {
				i++;
			}
		}
		return posTorneo;
	}
	//tal que devuelva la peor posición en un torneo del jugador enviado por
	//parámetro. Ejemplo:
	//Peor Resultado de Pella en el año: 4
	public int procesarPeorPosTorneoJugador(String jugador) {
		int peorPosicion = 5;		
		int posJugador = this.buscoJugador(jugador);
		int[] resultadosJugador = new int[this.torneos.length];
		for(int i = 0 ; i < this.torneos.length ; i++) {
			resultadosJugador[i] = this.resultados[posJugador][i];
		}
		peorPosicion = largest(resultadosJugador);		
		System.out.println("Peor Resultado de " + jugador + " en el año: " + peorPosicion);
		return peorPosicion;
	}

	
	public int largest(int[] arr) {    
        int i;   
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];       
        return max;
    }
	
}
