package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int EDAD_MIN = 6;
		final double ALT_MIN = 1.50;

		String nombre;
		int edad;
		double altura;
		boolean entraAlJuego;

		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Ingrese su edad");
		edad = input.nextInt();
		System.out.println("Ingrese su altura");
		altura = input.nextDouble();

		if (edad > EDAD_MIN || altura > ALT_MIN) {
			entraAlJuego = true;
			System.out.println(nombre + " podes entrar a la monta?a rusa");

		} else {
			entraAlJuego = false;
			System.out.println(nombre + " no podes entrar a la monta?a rusa. Edad o altura insuficiente");
		}

		System.out.println("It is " + entraAlJuego + " that " + nombre + " can enter the rollercoaster");

		input.close();
	}

}
