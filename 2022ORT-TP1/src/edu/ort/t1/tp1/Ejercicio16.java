package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int inscriptos, asientosDisponibles, asientosFaltantes;
		
		System.out.println("Ingrese la cantidad de inscriptos a la conferencia");
		inscriptos = input.nextInt();
		System.out.println("Ingrese la cantidad de asientos disponibles en el auditorio");
		asientosDisponibles = input.nextInt();
		asientosFaltantes = inscriptos - asientosDisponibles;
		
		if(asientosDisponibles >= inscriptos) {
			System.out.println("Alcanzan los asientos");
		}else {
			System.out.println("No alcanzan los asientos, se necesitan " + asientosFaltantes + " mas asientos" );
		}
		
		
		
		
		
		
		
		input.close();
	}

}
