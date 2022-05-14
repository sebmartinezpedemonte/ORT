package edu.ort.t1.ejercitacion.parcial1;

import java.util.Scanner;

public class EjParcial1Autopista {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		int numeroDeAutopista, cantCabinas,numeroCabina = 1, turno;
		int cantCabinaMayorRecaudacion = Integer.MIN_VALUE;
		int cantAutopistaMayorRecaudacion = Integer.MIN_VALUE;
		int totalRecaudadoGeneral = 0;
		int totalRecaudado = 0;
		@SuppressWarnings("unused")
		int contTurno1 = 0, contTurno2 = 0, contTurno3 = 0;
		int cabinasRestantes;
		int totalRecaudadAutopista = 0;
		int numeroCabinaMayorRecaudacion = 0;
		int recaudacionTurno1 = 0;
		int recaudacionTurno2 = 0;
		int recaudacionTurno3 = 0;
		int numeroAutopistaMayorRecaudacion = 0;
		int totalRecaudadoCabina = 0;

		do {
			System.out.println("Ingrese el numero de autopista (entero >=0). Ingrese cero para finalizar.");
			numeroDeAutopista = input.nextInt();
		} while (numeroDeAutopista < 0);

		while (numeroDeAutopista != 0) {
			do {
				System.out.println("Ingrese la cantidad de cabinas (entero >0)");
				cantCabinas = input.nextInt();
			} while (cantCabinas <= 0);
			cabinasRestantes = cantCabinas;

			while (cabinasRestantes > 0) {


					System.out.println("Ingrese los datos de la cabina " + numeroCabina);
				
					for (turno = 1; turno <= 3; turno++) {

						System.out.println("Ingrese el turno " + turno);
						do {
							System.out.println("Ingrese el total recaudado (entero >=0)");
							totalRecaudado = input.nextInt();
						} while (totalRecaudado < 0);
						contTurno1++;


						switch (turno) {
						case 1:
						//	do {
						//		System.out.println("Ingrese el total recaudado (entero >=0)");
						//		totalRecaudado = input.nextInt();
						//	} while (totalRecaudado < 0);
							contTurno1++;
							recaudacionTurno1 += totalRecaudado;
						//	totalRecaudadoCabina += totalRecaudado;

							break;
						case 2:
					//		do {
					//			System.out.println("Ingrese el total recaudado (entero >=0)");
					//			totalRecaudado = input.nextInt();
					//		} while (totalRecaudado < 0);
							contTurno2++;
							recaudacionTurno2 += totalRecaudado;
					//		totalRecaudadoCabina += totalRecaudado;
							break;
						case 3:
					//		do {
					//			System.out.println("Ingrese el total recaudado (entero >=0)");
					//			totalRecaudado = input.nextInt();
					//		} while (totalRecaudado < 0);
							contTurno3++;
							recaudacionTurno3 += totalRecaudado;
					//		totalRecaudadoCabina += totalRecaudado;
							break;
						}
						totalRecaudadoCabina += totalRecaudado;
					}
					if (cantCabinaMayorRecaudacion < totalRecaudadoCabina) {
						cantCabinaMayorRecaudacion = totalRecaudadoCabina;
						numeroCabinaMayorRecaudacion = numeroCabina;
					}

					numeroCabina++;

				///

				cabinasRestantes--;
				totalRecaudadAutopista += totalRecaudadoCabina;
				totalRecaudadoCabina = 0;

			}

			if (cantAutopistaMayorRecaudacion < totalRecaudadAutopista) {
				cantAutopistaMayorRecaudacion = totalRecaudadAutopista;
				numeroAutopistaMayorRecaudacion = numeroDeAutopista;
			}
			System.out.println("Total Recaudado autopista " + totalRecaudadAutopista);
			System.out.println("El número de cabina con mayor recaudación es " + numeroCabinaMayorRecaudacion);

			totalRecaudadoGeneral += totalRecaudadAutopista;
			totalRecaudado = 0;
			totalRecaudadAutopista = 0;
			numeroCabina = 1;

			do {
				System.out.println("Ingrese el numero de autopista (entero >=0). Ingrese cero para finalizar.");
				numeroDeAutopista = input.nextInt();
			} while (numeroDeAutopista < 0);

		}

		if (numeroAutopistaMayorRecaudacion != 0) {
			System.out.println("El total recaudado general es de " + totalRecaudadoGeneral);
			System.out.println("El numero de autopista con mayor recaudacion es la " + numeroAutopistaMayorRecaudacion
					+ " y el monto es de " + cantAutopistaMayorRecaudacion);
			System.out.println("El promedio de la recaudacion por turno 1 es de " + (recaudacionTurno1 / 3));
			System.out.println("El promedio de la recaudacion por turno 2 es de " + (recaudacionTurno2 / 3));
			System.out.println("El promedio de la recaudacion por turno 3 es de " + (recaudacionTurno3 / 3));
		} else {
			System.out.println("No se ha ingresado ningun dato. Adios.");
		}

		input.close();
	}
}
