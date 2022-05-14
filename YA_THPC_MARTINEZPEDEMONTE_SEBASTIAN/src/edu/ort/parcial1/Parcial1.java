package edu.ort.parcial1;

import java.util.Scanner;

public class Parcial1 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		final char FINAL_ABRUPTO = 'F';
		final char KARTING_ROJO = 'R';
		final char KARTING_VERDE = 'V';
		final int CANT_VUELTAS_MAXIMA = 5;
		int cantVecesPianito = 0;
		int cantVueltasRojo = 0;
		int cantVueltasVerde = 0;
		char karting;
		int cantVecesPianitoVerde = 0;
		int cantVecesPianitoRojo = 0;
		double promedioPianitoVerde = 0;
		double promedioPianitoRojo = 0;

		do {
			System.out.println("Que karting paso? (Rojo 'R', Verde 'V' ) o hubo un final abrupto 'F'");
			karting = input.nextLine().toUpperCase().charAt(0);
		} while (karting != FINAL_ABRUPTO && karting != KARTING_ROJO && karting != KARTING_VERDE);

		while (cantVueltasRojo < CANT_VUELTAS_MAXIMA && cantVueltasVerde < CANT_VUELTAS_MAXIMA
				&& karting != FINAL_ABRUPTO) {

			do {
				System.out.println("Cuantas veces piso el pianito?");
				cantVecesPianito = Integer.parseInt(input.nextLine());
			} while (cantVecesPianito < 0);

			switch (karting) {

			case KARTING_VERDE:
				cantVueltasVerde++;
				cantVecesPianitoVerde += cantVecesPianito;
				break;

			case KARTING_ROJO:
				cantVueltasRojo++;
				cantVecesPianitoRojo += cantVecesPianito;
				break;
			}


				do {
					System.out.println("Que karting paso? (Rojo 'R', Verde 'V' ) o hubo un final abrupto 'F'");
					karting = input.nextLine().toUpperCase().charAt(0);
				} while (karting != FINAL_ABRUPTO && karting != KARTING_ROJO && karting != KARTING_VERDE);

			

		}

		if (karting == FINAL_ABRUPTO) {
			System.out.println("Indefinido");
		} else if (cantVueltasVerde < cantVueltasRojo) {
			System.out.println("Gano el karting rojo");
		} else {
			System.out.println("Gano el karting verde");

		}
		
		if (karting != FINAL_ABRUPTO) {
			promedioPianitoVerde = (double) cantVecesPianitoVerde / cantVueltasVerde;
			promedioPianitoRojo = (double) cantVecesPianitoRojo / cantVueltasRojo;
			


			if (promedioPianitoVerde > promedioPianitoRojo) {
				System.out.println(
						"El karting rojo piso menos veces en promedio el pianito en el total de sus vueltas con un promedio de "
								+ promedioPianitoRojo + " veces");
			} else if (promedioPianitoVerde < promedioPianitoRojo) {
				System.out.println(
						"El karting verde piso menos veces en promedio el pianito en el total de sus vueltas con un promedio de "
								+ promedioPianitoVerde + " veces");
			} else {
				System.out.println("Ambos pisaron el pianito en promedio la misma cantidad de veces");
			}

		}

		input.close();
	}
}
