package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio32 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int nota;

		System.out.println("Ingrese una nota que este entre 4 y 10 o un 2");
		nota = input.nextInt();
		
		while(!(nota >= 4 && nota<=10) && nota != 2) {
			System.out.println("La nota ingresada no esta dentro de los parametros pedidos, intente de vuelta");
			System.out.println("Ingrese una nota que este entre 4 y 10 o un 2");

			nota = input.nextInt();
		}
		
				
		System.out.println("La nota es " + nota);
		
		input.close();
	}
}
