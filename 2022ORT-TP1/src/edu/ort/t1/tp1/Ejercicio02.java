package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, promedio;
		
		System.out.println("Ingrese la nota del primer trimestre");
		nota1 = input.nextDouble();
		System.out.println("Ingrese la nota del segundo trimestre");
		nota2 = input.nextDouble();
		System.out.println("Ingrese la nota del tercer trimestre");
		nota3 = input.nextDouble();
		
		promedio = (nota1 + nota2 + nota3)/3;
		
		System.out.println("El promedio es " + promedio);
		input.close();
	}
}
