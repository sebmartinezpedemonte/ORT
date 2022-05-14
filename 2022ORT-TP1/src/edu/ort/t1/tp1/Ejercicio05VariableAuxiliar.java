package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio05VariableAuxiliar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1; //como prueba num1 = 1 y num2 = 3;
		int num2;
		int aux;
		
		
		System.out.println("Ingrese el primer numero");
		num1 = input.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = input.nextInt();
		System.out.println("el primer numero es " + num1);
		System.out.println("el segundo numero es " + num2);
		
		aux = num1; //aux = 1; //guardo en un lugar temporal a la variable num1
		num1 = num2; //num1 = 3
		num2 = aux; //num2 = 1; //recupero el valor de num1
		System.out.println("el primer numero es " + num1);
		System.out.println("el segundo numero es " + num2);
		input.close();
		
		
		
				
	}
}
