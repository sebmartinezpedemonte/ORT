package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2;
		System.out.println("Ingrese un numero entero");
		num1 = input.nextInt();
		
		System.out.println("Ingrese otro numero entero mayor o igual al primero");
		num2 = input.nextInt();
		if(num2>=num1) {
		System.out.println("Incluyendolos");
		for(int i = 0; i <=(num2-num1);i++) {
			System.out.println((num1 + i));
		}
		
		System.out.println("Excluyendolos");
		for(int i = 1; i<(num2-num1); i++) {
			System.out.println((num1 + i));
		}
		}else {
			System.out.println("El segundo numero ingresado no es mayor o igual al primero");
		}
		input.close();
	}
}
