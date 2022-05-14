package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio20 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num1, num2;
	char operador;
	System.out.println("Ingrese un numero entero");
	num1=input.nextInt();
	System.out.println("Ingrese otro numero entero");
	num2=input.nextInt();
	System.out.println("Ingrese un operador (+ , - , * , /)");
	operador = input.next().charAt(0);
	
	switch(operador) {
	case '+': 
		System.out.println(num1 + num2);
		break;
	case '-':
		System.out.println(num1-num2);
		break;
	case '*':
		System.out.println(num1*num2);
		break;
	case '/':
		if(num2!=0) {
			System.out.println(num1/num2);
		}else {
			System.out.println("Error, no se puede dividir por cero");
		}
		break;
		default:
			System.out.println("Error, el caracter ingresado es incorrecto");
	}
	
	
	
	
	
	input.close();
}
}
