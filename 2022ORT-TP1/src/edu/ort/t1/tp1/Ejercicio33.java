package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio33 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		int num;
		int numMax = Integer.MIN_VALUE;
		int numMin = Integer.MAX_VALUE;
		
		do {
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
			if(num>numMax && num!=0) {
				numMax = num;
			}
			if(num<numMin && num!= 0) {
				numMin = num;
			}
		}while(num!=0);
		if(numMin != Integer.MAX_VALUE)
		System.out.println("El num max es " + numMax + " y el num min es " + numMin);
		
		
		
		input.close();
	}
}
