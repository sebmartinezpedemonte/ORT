package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("Ingrese un numero natural"); //N = {1, 2 ,...}
		num1 = input.nextInt();
		System.out.println("Ingrese otro numero natural");
		num2= input.nextInt();
		System.out.println("suma " + (num1+num2));
		System.out.println("resta " + (num1 - num2));
		System.out.println("multiplicacion " + (num1*num2));
		System.out.println("division " + (num1/num2));
		
		input.close();
	}
}
