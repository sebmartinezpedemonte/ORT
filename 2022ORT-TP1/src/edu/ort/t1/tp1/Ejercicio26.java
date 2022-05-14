package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MULTIPLO_INICIAL = 3;
		final int MULTIPLO_EVITAR = 5;
		int n;
		
		System.out.println("Ingrese un numero natural");
		n = input.nextInt();
		//n = Integer.parseInt(input.nextLine());
		
		for(int i = 1; i <= n; i++) {
			if((MULTIPLO_INICIAL*i)%MULTIPLO_EVITAR != 0) {
				System.out.println(MULTIPLO_INICIAL*i);
			}
		}
		

		
		
		
		
		input.close();
	}

}
