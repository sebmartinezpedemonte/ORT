package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio33While2 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		int num;
		int numMax;
		int numMin;

		System.out.println("Ingrese un numero");
		num = Integer.parseInt(input.nextLine());
		numMin = num;
		numMax = num;
		while (num != 0) {
			if (num > numMax) {
				numMax = num;
			}
			if (num < numMin) {
				numMin = num;
			}
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
		}
		
			System.out.println("El programa ha finalizado. El num max es " + numMax + " y el num min es " + numMin);
			
	
		
			
		input.close();
	}
}
