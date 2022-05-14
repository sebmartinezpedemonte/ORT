package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio36 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		double numero, promedio;
		int cantNumeros = 0;
		int sumaNumeros = 0;
		
		do {
			System.out.println("Ingrese un numero");
			numero = Double.parseDouble(input.nextLine());
			cantNumeros++;
			sumaNumeros += numero;
			promedio = sumaNumeros/cantNumeros;			
		}while(promedio<20);
		
		System.out.println("La cantidad de numeros ingresados es de " + cantNumeros + " y el promedio final es de " + promedio);
		
		
		
		input.close();
	}
}
