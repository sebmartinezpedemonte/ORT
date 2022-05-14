package edu.ort.t1.tp.obligatorio;

import java.util.Scanner;

public class TpObligatorio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ANIO_ACTUAL = 2022;
		char genero;
		int anioNac;
		int nivEstudios;
		char pregHijos;
		int edad;
		int cantHijos;
		
		System.out.println("Ingrese su genero (M para “Masculino”, F para “Femenino” y X para “No Binario”)");
		genero = input.nextLine().toUpperCase().charAt(0);
		if (genero == 'M' || genero == 'F' || genero == 'X') {
			switch (genero) {
			case 'M':
				System.out.println("Bienvenido");
				break;
			case 'F':
				System.out.println("Bienvenida");
				break;
			case 'X':
				System.out.println("Bienvenide");
				break;
			}
			System.out.println("Ingrese su año de nacimiento");
			anioNac = Integer.parseInt(input.nextLine());
			edad = ANIO_ACTUAL - anioNac;
			if (edad >= 18 && edad <= 120) {
				System.out.println(
						"Ingrese un numero entre 0 y 5 que represente su nivel de estudios, siendo 0 Primaria abandonada 1 Primaria terminada 2 Secundario terminado 3 Terciario terminado 4 Universitario terminado 5 Posgrado terminado");
				nivEstudios = Integer.parseInt(input.nextLine());
				if (nivEstudios == 0||nivEstudios == 1 || nivEstudios == 2 || nivEstudios == 3 || nivEstudios == 4 || nivEstudios == 5) {
					System.out.println("Tiene hijos? S para “Sí” o N para “No” ");
					pregHijos = input.nextLine().toUpperCase().charAt(0);
					if (pregHijos == 'S' || pregHijos == 'N') {
						if (pregHijos == 'S') {
							System.out.println("Cuantos hijos tiene?");
							cantHijos = Integer.parseInt(input.nextLine());
							if (cantHijos >= 1) {
								if ((nivEstudios == 0 || nivEstudios == 1) && (edad > 20) && cantHijos>1) {
									System.out.println("Deberias terminar la escuela");
									System.out.println("Sabemos que no es faci, pero te vamos a ayudar");
									System.out.println("Gracias por participar");
								} else if (nivEstudios == 3 || nivEstudios == 4 || nivEstudios == 5 || edad > 50) {
									System.out.println("Nunca dejes de aprender");
								} else {
									System.out.println("Gracias por participar");

								}

							} else {
								System.out.println("Error");
							}
						} else {
							if((nivEstudios == 0 || nivEstudios == 1)  && (edad >20)){
								System.out.println("Deberias terminar la escuela");
							}else if(nivEstudios == 3 || nivEstudios == 4 || nivEstudios == 5 || edad >50) {
								System.out.println("Nunca dejes de aprender");
							}
							System.out.println("Gracias por participar");
						}
					} else {
						System.out.println("Error");
					}
				} else {
					System.out.println("Error");
				}

			} else {
				System.out.println("Error");
			}

		} else {
			System.out.println("Error");
		}
		input.close();
	}
}
