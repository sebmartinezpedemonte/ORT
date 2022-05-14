package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2;
		System.out.println("Ingrese un numero entero");
		num1 = input.nextInt();
		System.out.println("Ingrese otro numero entero");
		num2 = input.nextInt();
		/*
		 * if(num2!=0) { if(num1>num2) { if(num1%num2==0) {
		 * System.out.println("El mayor es divisble por el menor"); }else {
		 * System.out.println("El mayor no es divisible por el menor"); } }else if
		 * (num2<num1){ if(num2%num1 == 0) {
		 * System.out.println("El mayor es divisible por el menor"); }else {
		 * System.out.println("El mayor no es divisible por el menor"); } }else {
		 * System.out.
		 * println("Ambos numeros son iugales, por lo tanto son divisibles entre ellos"
		 * ); } }else { System.out.println("No se puede dividir por cero"); }
		 */
		if ((num1 > num2 && num2 == 0) || (num2 > num1 && num1 == 0)) {
			System.out.println("No se puede dividir por cero");
		} else if (num2 == num1) {
			System.out.println("Ambos numeros son iguales");
		} else if ((num1 > num2 && num1 % num2 == 0) || (num2 > num1 && num2 % num1 == 0)) {
			System.out.println("El mayor es divisble por el menor");
		} else {
			System.out.println("El mayor no es divisble por el menor");
		}

		input.close();
	}
}
