package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio33While {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		int num;
		int numMax = Integer.MIN_VALUE;
		int numMin = Integer.MAX_VALUE;

		System.out.println("Ingrese un numero");
		num = Integer.parseInt(input.nextLine());
		while (num != 0) {
			if (num > numMax && num != 0) {
				numMax = num;
			}
			if (num < numMin && num != 0) {
				numMin = num;
			}
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
		}
		if (numMin != Integer.MAX_VALUE) {
			System.out.println("El programa ha finalizado. El num max es " + numMax + " y el num min es " + numMin);
			
		}else {
			System.out.println("El programa ha finalizado");
		}
			
		input.close();
	}
}
