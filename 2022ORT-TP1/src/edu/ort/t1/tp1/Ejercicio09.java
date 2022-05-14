package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int ang1,ang2,ang3;
		System.out.println("Ingrese el valor del primer angulo del triangulo");
		ang1 = input.nextInt();
		System.out.println("Ingrese el valor del segundo angulo del triangulo");
		ang2 = input.nextInt();
		ang3 = 180 - (ang1 + ang2);
		System.out.println("El valor del angulo restante es de " + ang3);
		
		input.close();
	}
}
