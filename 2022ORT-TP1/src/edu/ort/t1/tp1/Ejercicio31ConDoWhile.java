package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio31ConDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char ingreso;

		do {
			System.out.println("¿Deseás continuar? [S/N]");
			ingreso = input.nextLine().toUpperCase().charAt(0);
		} while (ingreso != 'S' && ingreso != 'N');

		input.close();
	}
}
