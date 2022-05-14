package edu.ort.t1.ejercitacion.parcial1;

import java.util.Scanner;

public class EjParcial1Taxi {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		final int EDAD_MINIMA = 18; // la consigna dice mayor a 18 pero interpreto que sera con 18 incluido
		final int EDAD_MAXIMA = 120;// la consigna dice menor a 120 pero interpreto que sera con 120 incluido
		final int BAJADA_BANDERA = 80;
		final int CANT_PASAJEROS_MAXIMO = 3;
		final int CANT_PASAJEROS_MINIMO = 1;
		final char FIN_DE_DATOS = 'Z';
		final int FIN_VIAJES = 30;
		final char VIAJE_CORTO = 'C';
		final char VIAJE_MEDIANO = 'M';
		final char VIAJE_LARGO = 'L';
		int cantPasajeros;
		int importeACobrar;
		String nombrePasajero;
		String nombrePasajeroMasGrande = "";
		int edadPasajero;
		int edadPasajeroMasGrande = Integer.MIN_VALUE; // tmb puedo poner 0 aca o 17 incluso
		int cantViajesCorto = 0;
		int cantViajesMediano = 0;
		int cantViajesLargo = 0;
		int recaudacionTotal = 0;
		double promedioValorPorViaje = 0;
		double porcentajeViajesCortos = 0;
		int cantViajes = 0;
		char distanciaDelViaje;
		int importeACobrarTotal = 0;

		// validacion de primer pedido de informacion para mandar a fin en caso de
		// mandar fin de datos en la primera vez de correr el programa

		do {
			System.out.println(
					"Ingrese la distancia del viaje ('C'(corto),'M'(mediano),'L'(Largo)). Ingrese 'Z' si desea finalizar");
			distanciaDelViaje = input.nextLine().toUpperCase().charAt(0);
		} while (distanciaDelViaje != VIAJE_CORTO && distanciaDelViaje != VIAJE_MEDIANO
				&& distanciaDelViaje != VIAJE_LARGO && distanciaDelViaje != FIN_DE_DATOS);

		// comienzo del while principal

		while (distanciaDelViaje != FIN_DE_DATOS && cantViajes < FIN_VIAJES) {

			switch (distanciaDelViaje) {
			case VIAJE_CORTO:
				cantViajesCorto++;
				break;
			case VIAJE_MEDIANO:
				cantViajesMediano++;
				break;
			case VIAJE_LARGO:
				cantViajesLargo++;
				break;
			}

			do {
				System.out.println("Ingrese la cantidad de pasajeros (>0 y <4)");
				cantPasajeros = Integer.parseInt(input.nextLine());
			} while (cantPasajeros < CANT_PASAJEROS_MINIMO || cantPasajeros > CANT_PASAJEROS_MAXIMO);

			do {
				System.out.println("Ingrese el importe a cobrar (entero > 0)");
				importeACobrar = Integer.parseInt(input.nextLine());
			} while (importeACobrar <= 0);

			importeACobrarTotal = importeACobrar + BAJADA_BANDERA;

			// comienzo del for
			for (int i = 1; i <= cantPasajeros; i++) {
				System.out.println("Ingrese el nombre del pasajero " + i);
				nombrePasajero = input.nextLine();

				do {
					System.out.println("Ingrese la edad del pasajero " + i + " (entre 18 y 120 años)");
					edadPasajero = Integer.parseInt(input.nextLine());
				} while (edadPasajero < EDAD_MINIMA || edadPasajero > EDAD_MAXIMA);

				if (edadPasajero > edadPasajeroMasGrande) {
					edadPasajeroMasGrande = edadPasajero;
					nombrePasajeroMasGrande = nombrePasajero;
				}

			}
			// fin del for

			System.out.println(
					"La persona mas grande es " + nombrePasajeroMasGrande + " y su edad es " + edadPasajeroMasGrande);

			recaudacionTotal += importeACobrarTotal;

			cantViajes++;

			// re inicializacion en cero de variables re usadas a futuro

			importeACobrarTotal = 0;

			edadPasajeroMasGrande = Integer.MIN_VALUE; // tmb puedo poner 0 aca o 17 incluso

			// pedido de vuelta de informacion inicial que estaba afuera del while principal
			if (cantViajes != FIN_VIAJES) {
				do {
					System.out.println(
							"Ingrese la distancia del viaje ('C'(corto),'M'(mediano),'L'(Largo)). Ingrese 'Z' si desea finalizar");
					distanciaDelViaje = input.nextLine().toUpperCase().charAt(0);
				} while (distanciaDelViaje != VIAJE_CORTO && distanciaDelViaje != VIAJE_MEDIANO
						&& distanciaDelViaje != VIAJE_LARGO && distanciaDelViaje != FIN_DE_DATOS);
			}
		}
		// fin del while principal

		if (recaudacionTotal != 0) {
			System.out.println("La cantidad de viajes de la categoria Corta es de " + cantViajesCorto);
			System.out.println("La cantidad de viajes de la categoria Mediano es de " + cantViajesMediano);
			System.out.println("La cantidad de viajes de la categoria Largo es de " + cantViajesLargo);
			System.out.println("La recaudacion total es de " + recaudacionTotal);
			promedioValorPorViaje = (double) recaudacionTotal / cantViajes;
			System.out.println("El promedio de valor por viaje es de " + promedioValorPorViaje);
			porcentajeViajesCortos = (double) cantViajesCorto * 100 / cantViajes;
			System.out.println("El porcentaje de viajes cortos con respecto al total de los viajes realizados es de "
					+ porcentajeViajesCortos + " %");

		} else {
			System.out.println("No se han ingresado datos. Adios");
		}

		input.close();
	}
}
