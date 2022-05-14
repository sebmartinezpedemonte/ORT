package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		char operador;
		boolean finalizar = false;

		System.out.println("Ingrese la operacion a realizar (+ - * / ) o F para finalizar");
		operador = input.next().charAt(0);
		if (operador == 'F' || operador == 'f') {
			finalizar = true;
		}
		while (!finalizar) {
			System.out.println("Ingrese un numero entero");
			num1 = input.nextInt();
			System.out.println("Ingrese otro numero entero");
			num2 = input.nextInt();

			switch (operador) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				if (num2 != 0) {
					System.out.println((double)num1 / (double)num2);
				} else {
					System.out.println("Error, no se puede dividir por cero");
				}
				break;
			default:
				System.out.println("Error, el caracter ingresado es incorrecto");
			}
			System.out.println("Ingrese la operacion a realizar (+ - * / ) o F para finalizar");
			operador = input.next().charAt(0);
			if (operador == 'F' || operador == 'f') {
				finalizar = true;
			}
		}

		input.close();

	}
}
