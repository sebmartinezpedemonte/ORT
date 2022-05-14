/*
 * Un zool�gico necesita alimentar y obtener informaci�n de un le�n que se encuentra
en rehabilitaci�n luego de una cirug�a.
Por d�a se alimenta 3 veces a este le�n y por cada tanda se lo alimenta hasta que
este no tenga m�s ganas de comer.
Cada vez que se le da comida dentro de una tanda se debe ingresar la cantidad en
kg (n�mero entero) de alimento que se le dio y se le debe preguntar si quiere seguir
comiendo('S','N')
Se desea saber cu�l de las 3 comidas fue la que el Le�n comi� m�s Kg de alimento
y cu�l fue esa cantidad, el total en kg de alimento recibido y promedio de alimento
por tanda.
 */

package edu.ort.t1.ejercitacion.parcial1;

import java.util.Scanner;

public class EjParcial1Zoologico {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		final int VECES_POR_DIA = 3;
		char seguirComiendo;
		int kilos;
		int cantKilosManiana = 0;
		int cantKilosTarde = 0;
		int cantKilosNoche = 0;
		int totalKilos = 0;
		double promedioPorTanda;
		int totalKilosTanda = 0;

		for (int i = 1; i <= VECES_POR_DIA; i++) {
			System.out.println("Esta es la tanda " + i + " del dia");
			System.out.println("Ingrese la cantidad de kilos que se le dio");
			kilos = Integer.parseInt(input.nextLine());
			while (kilos <= 0) {
				System.out.println("Error, la cantidad de kilos a ingresar debe ser mayor a cero");
				System.out.println("Ingrese la cantidad de kilos que se le dio");
				kilos = Integer.parseInt(input.nextLine());
			}
			totalKilosTanda += kilos;
			System.out.println("Desea seguir comiendo? 'S' , 'N' ");
			seguirComiendo = input.nextLine().toUpperCase().charAt(0);
			while (seguirComiendo != 'S' && seguirComiendo != 'N') {
				System.out.println("Error.Caracter invalido");
				System.out.println("Desea seguir comiendo? 'S' , 'N' ");
				seguirComiendo = input.nextLine().toUpperCase().charAt(0);
			}
			while (seguirComiendo == 'S') {
				System.out.println("Ingrese la cantidad de kilos que se le dio");
				kilos = Integer.parseInt(input.nextLine());
				while (kilos <= 0) {
					System.out.println("Error, la cantidad de kilos a ingresar debe ser mayor a cero");
					System.out.println("Ingrese la cantidad de kilos que se le dio");
					kilos = Integer.parseInt(input.nextLine());
				}
				totalKilosTanda += kilos;
				System.out.println("Desea seguir comiendo? 'S' , 'N' ");
				seguirComiendo = input.nextLine().toUpperCase().charAt(0);
				while (seguirComiendo != 'S' && seguirComiendo != 'N') {
					System.out.println("Error.Caracter invalido");
					System.out.println("Desea seguir comiendo? 'S' , 'N' ");
					seguirComiendo = input.nextLine().toUpperCase().charAt(0);
				}
			}
			switch (i) {
			case 1:
				cantKilosManiana = totalKilosTanda;
				break;
			case 2:
				cantKilosTarde = totalKilosTanda;
				break;
			case 3:
				cantKilosNoche = totalKilosTanda;
				break;
			}
			totalKilos += totalKilosTanda;
			totalKilosTanda = 0;

		}
		if (cantKilosManiana > cantKilosTarde && cantKilosManiana > cantKilosNoche) {
			System.out.println("El leon comio mas alimento a la ma�ana y consumio " + cantKilosManiana + " kilos");
		} else if (cantKilosTarde > cantKilosManiana && cantKilosTarde > cantKilosNoche) {
			System.out.println("El leon comio mas alimento a la tarde y consumio " + cantKilosTarde + " kilos");
		}else if(cantKilosNoche > cantKilosManiana && cantKilosNoche > cantKilosTarde) {
			System.out.println("El leon comio mas alimento a la noche y consumio " + cantKilosNoche + " kilos");
		}else {
			System.out.println("El leon no consumio mas en una tanda que en las otras");
		}
		promedioPorTanda = (double)totalKilos/VECES_POR_DIA;
		System.out.println("El leon comio en total " + totalKilos + " kilos");
		System.out.println("El promedio de kilos por tanda fue de " + promedioPorTanda);
		input.close();
	}
}
