package edu.ort.t1.ejercitacion.parcial1;

import java.util.Scanner;

public class EjPracticaUnidad1 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		final String RUL = "RUL";
		final String BJK = "BJK";
		final String PKR = "PKR";
		final double PORCENTAJE_LIMITE_MENOR = 0.2;
		final double DINERO_MINIMO_INICIAL = 500;
		final double PRECIO_RUL = 100;
		final double PRECIO_BJK = 200;
		final double PRECIO_PKR = 500;
		final double DINERO_MAXIMO = 5000;
		double dineroLimiteMenor;
		@SuppressWarnings("unused")
		double dineroInsuficiente;
		String nombre;
		double dineroAApostar;
		String juego;
		int resultado = (int) (Math.random() * (3 - 0));
		int contRul = 0;
		int contBjk = 0;
		int contPkr = 0;
		double juegosTotales = 0;
		double dineroGanado = DINERO_MAXIMO;
		System.out.println(resultado);
		String salirJuego;
		boolean salir = true;

		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Cuanto dinero desea apostar(minimo 500)?");
		dineroAApostar = Double.parseDouble(input.nextLine());
		while (dineroAApostar < DINERO_MINIMO_INICIAL) {
			System.out.println("Error. La cangtidad minima es de : " + DINERO_MINIMO_INICIAL);
			System.out.println("Cuanto dinero desea apostar(minimo 500)?");
			dineroAApostar = Double.parseDouble(input.nextLine());
		}
		dineroLimiteMenor = (dineroAApostar * PORCENTAJE_LIMITE_MENOR);
		while (dineroAApostar >= dineroLimiteMenor && dineroAApostar >= PRECIO_RUL && dineroGanado <= DINERO_MAXIMO && salir) {

			dineroGanado = dineroAApostar;
			do {
				System.out.println("A que juego desea jugar, Ruleta, BlackJack o Pocker (RUL, BJK o PKR)");
				juego = input.nextLine().toUpperCase();
			} while (!juego.equals(RUL) && !juego.equals(BJK) && !juego.equals(PKR));
			

			
			resultado = (int) (Math.random() * (3 - 0));
			
			System.out.println(resultado);
			switch (juego) {
			case "RUL":
				System.out.println("El valor de la ruleta es de " + PRECIO_RUL);
				if (dineroAApostar >= PRECIO_RUL) {
					dineroAApostar = dineroAApostar - PRECIO_RUL;
					contRul++;
					switch (resultado) {
					case 0:
						break;
					case 1:
						dineroAApostar = dineroAApostar + PRECIO_RUL;
						break;
					case 2:
						dineroAApostar = dineroAApostar + (2 * PRECIO_RUL);
						break;
					}
					break;

				} else {
					System.out.println("“no le alcanza el dinero para este juego”");
				}
				break;

			case "BKJ":
				System.out.println("El valor de la ruleta es de " + PRECIO_BJK);
				if (dineroAApostar >= PRECIO_BJK) {
					dineroAApostar = dineroAApostar - PRECIO_BJK;
					contBjk++;
					switch (resultado) {
					case 0:
						break;
					case 1:
						dineroAApostar = dineroAApostar + PRECIO_BJK;
						break;
					case 2:
						dineroAApostar = dineroAApostar + (2 * PRECIO_BJK);
						break;
					}
					break;

				} else {
					System.out.println("“no le alcanza el dinero para este juego”");
				}
				break;

			case "PKR":
				System.out.println("El valor de la ruleta es de " + PRECIO_PKR);
				if (dineroAApostar >= PRECIO_PKR) {
					dineroAApostar = dineroAApostar - PRECIO_PKR;
					contPkr++;
					switch (resultado) {
					case 0:
						break;
					case 1:
						dineroAApostar = dineroAApostar + PRECIO_PKR;
						break;
					case 2:
						dineroAApostar = dineroAApostar + (2 * PRECIO_PKR);
						break;
					}
					break;

				} else {
					System.out.println("No le alcanza el dinero para este juego");
				}
				break;
			}
			System.out.println("El dinero restante es de " + dineroAApostar);
			
			System.out.println("Si desea salir escriba salir, sino presione enter para continuar");
			salirJuego = input.nextLine().toUpperCase();
			salir = !salirJuego.equals("SALIR");

			
		}
		
		juegosTotales = contRul + contBjk + contPkr;
		System.out.println("El dinero restante es de " + dineroAApostar);
		System.out.println(nombre + " jugo a la ruleta " + contRul + " veces que es un porcentaje de "
				+ (contRul * 100 / juegosTotales) + " % " + "Se jugo al BlackJack " + contBjk
				+ " veces que es un porcentaje de " + (contBjk * 100 / juegosTotales) + " % " + "Se jugo al pocker "
				+ contPkr + " veces que es un porcentaje de " + (contPkr * 100 / juegosTotales) + " % ");
		

		input.close();
	}
}
