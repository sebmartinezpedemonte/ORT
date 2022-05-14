package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int ancho, largo, valorM2, valorTerreno, cantMetrosAlambre;
		System.out.println("Ingrese el ancho de un terreno");
		ancho = input.nextInt();
		System.out.println("Ingrese el largo de un terreno");
		largo = input.nextInt();
		System.out.println("Ingrese el valor del metro cuadrado de tierra");
		valorM2 = input.nextInt();
		
		valorTerreno = ancho*largo*valorM2;
		cantMetrosAlambre = (ancho * 2 + largo * 2) * 3;
		System.out.println("El valor total del terreno es de " + valorTerreno);
		System.out.println("La cantidad de metros de alambre para cercarlo completamente a tres alturas distintas es de " + cantMetrosAlambre);
		
		
		input.close();
	}
}
