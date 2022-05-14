package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio31ConWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char ingreso;

		System.out.println("¿Deseás continuar? [S/N]");
		ingreso = input.nextLine().toUpperCase().charAt(0);

		while (ingreso != 'N' && ingreso != 'S') {
			System.out.println("¿Deseás continuar? [S/N]");
			ingreso = input.nextLine().charAt(0);
		}

		input.close();
	}
}
