package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia;
		System.out.println("Ingrese un numero de dia");
		dia = input.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Error");
		}

		input.close();
	}
}
