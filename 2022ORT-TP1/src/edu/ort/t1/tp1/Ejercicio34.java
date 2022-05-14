package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio34 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		double altura, promedio, alturaTotal=0;
		int contadorJugadores = 0;
		
		System.out.println("Ingrese la altura de cada jugador del equipo de baloncesto. Ingrese cero para finalizar");
		altura = Double.parseDouble(input.nextLine());
		while(altura!=0) {
			if(altura>0) {
			alturaTotal += altura;

			contadorJugadores ++;
			}else {
				System.out.println("La altura debe ser un numero positivo");
			}
			System.out.println("Ingrese la altura del proximo jugador del equipo de baloncesto. Ingrese cero para finalizar");
			altura = Double.parseDouble(input.nextLine());
		}
		if(contadorJugadores >0) {
			promedio = alturaTotal/contadorJugadores;
			System.out.println("la estatura promedio del equipo es de " + promedio);
		}else {
			System.out.println("No se han ingresado alturas");
		}
		
		
		input.close();
	}

}
