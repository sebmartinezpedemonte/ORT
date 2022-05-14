package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio27 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		final int EDAD_MAYOR = 18;
		final int CANT_EDADES = 5;
		double promedio;
		int edad;
		int edadTotal = 0;
		int impares = 0;
		
		
		for(int i = 1; i<=CANT_EDADES; i++) {
			System.out.println("Ingrese la edad numero " + i);
			edad = input.nextInt();			
			edadTotal += edad;	
			if(edad%2!=0 && edad>18) {
				impares++;
			}
				
			
		}
		promedio = ((double)edadTotal/CANT_EDADES);
		System.out.println("El promedio de las " + CANT_EDADES + " cantidad de edades es " + promedio);
		System.out.println("La cantidad de edades impares y mayores a " + EDAD_MAYOR + " es de " + impares);
		
		input.close();
	}
}
