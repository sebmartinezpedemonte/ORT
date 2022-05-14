package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		
		System.out.println("Ingrese un numero entero");
		num1  = input.nextInt();
		System.out.println("Ingrese otro numero entero");
		num2 = input.nextInt();
		System.out.println("Ingrese otro numero entero");
		num3 = input.nextInt();
		//si los 3 son distintos
		
		if(num1>num2 && num1>num3) {
			System.out.println("El numero " + num1 + " es el mayor");
		}else if(num2 > num3 ) {
			System.out.println("El numero " + num2 + " es el mayor");
		}else {
			System.out.println("El numero " + num3 + " es el mayor");
				
		}
		
		input.close();
	}
}
