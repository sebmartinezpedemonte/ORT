package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		
		System.out.println("Ingrese un numero entero");
		num1  = input.nextInt();
		System.out.println("Ingrese otro numero entero");
		num2 = input.nextInt();
		
		if(num1>num2) {
			System.out.println("El numero " + num1 + " es el mayor");
		}else if(num1 < num2) {
			System.out.println("El numero " + num2 + " es el mayor");
		}else {
			System.out.println("Ambos numeros son iguales");
		}
		
		
		
		input.close();
	}
}
