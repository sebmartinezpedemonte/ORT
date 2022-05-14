package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double COMISION = 0.16;
		final double SUELDO_FIJO = 44000;
		double monto, sueldoFinal;
		
		System.out.println("Ingrese el monto total de las ventas realizadas por un vendedor durante un mes");
		monto = input.nextDouble();
		sueldoFinal = SUELDO_FIJO + (monto * COMISION);
		System.out.println("El sueldo final del vendedor es de " + sueldoFinal);
		
		input.close();
	}
}
