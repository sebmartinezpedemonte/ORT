package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio17bis2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int EDAD_JUB_HOMBRE = 65, EDAD_JUB_MUJER = 60;
		int edad;
		char genero;
		String nombre;

		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Ingrese su edad");
		edad = input.nextInt();
		System.out.println("Ingrese su genero, 'F' para mujeres, 'M' para hombres");
		genero = input.next().toUpperCase().charAt(0);
		

		if ((edad >= 1 && edad <= 120) && (genero == 'M' || genero == 'F')) {
			if ((genero == 'M' && edad >= EDAD_JUB_HOMBRE) || (genero == 'F' && edad >= EDAD_JUB_MUJER)) {
				System.out.println(nombre + ", usted esta en edad de jubilarse");
			} else {
				System.out.println(nombre + ", usted no esta en edad de jubilarse");
			}	
		} else {
			System.out.println("Usted ha ingresado valores erroneos");
			
		}
		input.close();
	}
}
