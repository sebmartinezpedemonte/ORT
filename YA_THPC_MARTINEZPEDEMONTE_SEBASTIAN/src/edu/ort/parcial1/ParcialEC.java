package edu.ort.parcial1;

import java.util.Scanner;

public class ParcialEC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TOPE_VUELTAS = 5;
		final char VERDE = 'V';
		final char ROJO = 'R';
		final char FIN = 'F';
		char colorKarting;
		int cantVecesPianitoEnVuelta;
		boolean colorValido;
		int cantVueltasV = 0;
		int cantPianitoV = 0;
		int cantVueltasR = 0;
		int cantPianitoR = 0;
		double promedioV;
		double promedioR;
		String mensaje;
		System.out.println("\"Bienvenidos a ORTKarts!");
		do {
			System.out.println("Ingrese el color del karting:");
			colorKarting = input.nextLine().toUpperCase().charAt(0);
			;
			colorValido = (colorKarting == ROJO) || (colorKarting == VERDE) || (colorKarting == FIN);
		} while (!colorValido);
		while ((colorKarting != FIN) && (cantVueltasV < TOPE_VUELTAS) && (cantVueltasR < TOPE_VUELTAS)) {
			do {
				System.out.println("Ingrese la cantidad de veces que piso el pianito: ");
				cantVecesPianitoEnVuelta = Integer.parseInt(input.nextLine());
			} while (cantVecesPianitoEnVuelta < 0);
			if (colorKarting == VERDE) {
				cantVueltasV++;
				cantPianitoV += cantVecesPianitoEnVuelta;
			} else {
				cantVueltasR++;
				cantPianitoR += cantVecesPianitoEnVuelta;
			}
			if ((cantVueltasV != TOPE_VUELTAS) && (cantVueltasR != TOPE_VUELTAS)) {
				do {
					System.out.println("Ingrese el color del karting:");
					colorKarting = input.nextLine().toUpperCase().charAt(0);
					colorValido = (colorKarting == ROJO) || (colorKarting == VERDE) || (colorKarting == FIN);
				} while (!colorValido);
			}
		}
		input.close();
		if (colorKarting == FIN) {
			mensaje = "Carrera INDEFINIDA!";
		} else if (cantVueltasV > cantVueltasR) {
			mensaje = "Gano el VERDE!";
		} else {
			mensaje = "Gano el ROJO!";
		}
		System.out.println(mensaje);
		promedioV = (double)cantPianitoV/cantVueltasV;
		promedioR = (double)cantPianitoR/cantVueltasR;
		if (promedioV < promedioR) {
			mensaje = "El karting verde en promedio piso menos veces el pianito";
		} else {
			mensaje = "El karting rojo en promedio piso menos veces el pianito";
		}
		System.out.println(mensaje);
	}
}

