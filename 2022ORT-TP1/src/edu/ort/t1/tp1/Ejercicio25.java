package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ancho, largo;
		System.out.println("Ingrese el numero que representa el ancho de una matriz de cruces");
		ancho = input.nextInt();
		System.out.println("Ingrese el numero que representa el largo de una matriz de cruces");
		largo = input.nextInt();

		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("x");
			}
			System.out.println();
		}

		input.close();
	}
}
