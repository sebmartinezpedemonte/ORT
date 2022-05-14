package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int costoHora, cantHoras, salarioSemanal, salarioMensual;
		
		System.out.println("Ingrese el valor monetario de una hora de trabajo");
		costoHora = input.nextInt();
		System.out.println("Ingrese la cantidad de horas trabajadas por dia por un trabajador");
		cantHoras = input.nextInt();
		
		salarioSemanal = (costoHora * cantHoras)*5 + (costoHora * cantHoras)/2;
		System.out.println("El salario semanal es de $" + salarioSemanal);
		salarioMensual = salarioSemanal * 4;
		System.out.println("El salario mensual es de $" + salarioMensual);
		
		
		input.close();
	}
}
