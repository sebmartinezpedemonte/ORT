package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("Ingrese un numero entero");
		num  = input.nextInt();
		System.out.print("El numero es ");
		if(num % 2 == 0) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
		
		
		input.close();
	}
}
