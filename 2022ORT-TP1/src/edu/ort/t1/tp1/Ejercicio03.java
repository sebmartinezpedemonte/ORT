package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un numero entero");
		num = input.nextInt();
		
		System.out.println(num*5);
		System.out.println(num/2);
		input.close();
	}

}
