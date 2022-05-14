package edu.ort.t1.ejercitacion.parcial1;

import java.util.Scanner;

public class Ej_ParcialLunes {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		final int EDAD_MAXIMA = 120;
		final int EDAD_MINIMA = 18;
		final char VOTO_SI = 'S';
		final char VOTO_NO = 'N';
		final char VOTO_BLANCO = 'B';
		final char FIN = 'F';
		char voto;
		int edad;
		int edadTotal = 0;
		int cantVotantes = 0;
		int cantVotoSi = 0;
		int cantVotoNo = 0;
		@SuppressWarnings("unused")
		int cantVotoBlanco = 0;
		double porcentajeVotantesNo = 0;
		double promedioDeEdadDeLosVotantes = 0;

		do {
			System.out.println(
					"Desea que se poden los árboles? “S”, “N”, “B” (si votan en blanco) o ‘F’ (para finalizar el proceso).");
			voto = input.nextLine().toUpperCase().charAt(0);
		} while (voto != VOTO_SI && voto != VOTO_NO && voto != VOTO_BLANCO && voto != FIN);

		while (voto != FIN) {

			do {
				System.out.println("Ingrese su edad (debe ser mayor a 18 años y menor a 120 años)");
				edad = Integer.parseInt(input.nextLine());
			} while (edad < EDAD_MINIMA || edad > EDAD_MAXIMA);

			switch (voto) {
			case VOTO_SI:
				cantVotoSi++;
				break;
			case VOTO_NO:
				cantVotoNo++;
				break;
			case VOTO_BLANCO:
				cantVotoBlanco++;
				break;
			}

			cantVotantes++;
			edadTotal += edad;

			do {
				System.out.println(
						"Desea que se poden los árboles? “S”, “N”, “B” (si votan en blanco) o ‘F’ (para finalizar el proceso).");
				voto = input.nextLine().toUpperCase().charAt(0);
			} while (voto != VOTO_SI && voto != VOTO_NO && voto != VOTO_BLANCO && voto != FIN);

		}

		if (cantVotantes != 0) {

			if (cantVotoSi > cantVotoNo && cantVotoSi > cantVotoNo) {
				System.out.println("Gano el Si");
			} else if (cantVotoSi < cantVotoNo && cantVotoSi < cantVotoNo) {
				System.out.println("Gano el no");
			} else {
				System.out.println("Indeterminado");
			}

			porcentajeVotantesNo = (double) cantVotoNo * 100 / cantVotantes;
			promedioDeEdadDeLosVotantes = (double) edadTotal / cantVotantes;

			System.out.println(
					"El porcentaje de votantes que no desea que los arboles se poden es de " + porcentajeVotantesNo + " %");
			System.out.println("El promedio de edad de los votantes es de " + promedioDeEdadDeLosVotantes);

		} else {
			System.out.println("No se ingresaron datos. Adios");
		}

		input.close();
	}
}
