package parciales.practica;

import java.util.Scanner;

public class THP_PARCIAL_1_ENCUESTA_EDIFICIO {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		final int ALTURA_TOTAL_EDIFICIO = 30;
		final int PISO_MINIMO = 0;
		final int CORTE = 0;
		int piso;
		int depto = 0;
		char tienePerro = 'X';
		char tieneGato = 'X';
		int totalEncuestas = 0;
		double porcentajeTienenMascota = 0;
		int departamentosUnicoTipoMascota = 0;
		char perro = 'X';
		char gato = 'X';
		int contadorDeptosConMascota = 0;

		int pisoGatoMasArriba = Integer.MIN_VALUE;
		int deptoGatoMasArriba = Integer.MIN_VALUE;
		int totalDeptosMascota = 0;

		System.out.println("Ingrese un piso ('0' para terminar):");
		piso = Integer.parseInt(input.nextLine());
		while (piso < PISO_MINIMO || piso > ALTURA_TOTAL_EDIFICIO) {
			System.out.println("Error, debe estar en el rango [0 a 30]");
			System.out.println("Ingrese un piso ('0' para terminar):");
			piso = Integer.parseInt(input.nextLine());

		}
		while (piso != CORTE) {
			final boolean PISOS1A10 = piso >= 1 && piso <= 10;
			final boolean DEPTOSTIPO1 = depto < 1 || depto > 4;
			final boolean PISOS11A20 = piso >= 11 && piso <= 20;
			final boolean DEPTOSTIPO2 = depto < 1 || depto > 3;
			final boolean PISOS21A30 = piso >= 21 && piso <= 30;
			final boolean DEPTOSTIPO3 = depto < 1 || depto > 2;

			if (PISOS1A10) {

				do {
					System.out.println("Ingrese el depto (1-4) para el piso " + piso + ":");
					depto = Integer.parseInt(input.nextLine());
				} while (depto < 1 || depto > 4);
				do {
					System.out.println("Tiene perro? (S/N):");
					perro = input.nextLine().toUpperCase().charAt(0);
					if (perro == 'S') {
						tienePerro = perro;

					}
				} while (perro != 'S' && perro != 'N');
				do {
					System.out.println("Tiene gato? (S/N):");
					gato = input.nextLine().toUpperCase().charAt(0);
					if (gato == 'S') {
						tieneGato = gato;

					}
				} while (gato != 'S' && gato != 'N');

			}

			else if (PISOS11A20) {

				do {
					System.out.println("Ingrese el depto (1-3) para el piso " + piso + ":");
					depto = Integer.parseInt(input.nextLine());
				} while (depto < 1 || depto > 3);
				do {
					System.out.println("Tiene perro? (S/N):");
					perro = input.nextLine().toUpperCase().charAt(0);
					if (perro == 'S') {
						tienePerro = perro;

					}
				} while (perro != 'S' && perro != 'N');
				do {
					System.out.println("Tiene gato? (S/N):");
					gato = input.nextLine().toUpperCase().charAt(0);
					if (gato == 'S') {
						tieneGato = gato;

					}
				} while (gato != 'S' && gato != 'N');

			}

			//
			else if (PISOS21A30) {

				do {
					System.out.println("Ingrese el depto (1-2) para el piso " + piso + ":");
					depto = Integer.parseInt(input.nextLine());
				} while (depto < 1 || depto > 2);
				do {
					System.out.println("Tiene perro? (S/N):");
					perro = input.nextLine().toUpperCase().charAt(0);
					if (perro == 'S') {
						tienePerro = perro;

					}
				} while (perro != 'S' && perro != 'N');
				do {
					System.out.println("Tiene gato? (S/N):");
					gato = input.nextLine().toUpperCase().charAt(0);
					if (gato == 'S') {
						tieneGato = gato;

					}
				} while (gato != 'S' && gato != 'N');

			}

			//

			totalEncuestas++;
			if (tieneGato == gato || tienePerro == perro) {
				contadorDeptosConMascota++;
			}

			if ((tieneGato == gato && tienePerro != perro) || ((tieneGato != gato && (tienePerro == perro)))) {
				departamentosUnicoTipoMascota++;
			}

			if (piso > pisoGatoMasArriba && gato == 'S') {
				pisoGatoMasArriba = piso;
				deptoGatoMasArriba = depto;

			}

			System.out.println("Ingrese un piso ('0' para terminar):");
			piso = Integer.parseInt(input.nextLine());
			while (piso < 0 || piso > ALTURA_TOTAL_EDIFICIO) {
				System.out.println("Error, debe estar en el rango [0 a 30]");
				System.out.println("Ingrese un piso ('0' para terminar):");
				piso = Integer.parseInt(input.nextLine());
			}

			totalDeptosMascota += contadorDeptosConMascota;
			contadorDeptosConMascota = 0;

		}
		System.out.println("Departamentos encuestados: " + totalEncuestas);
		if (totalEncuestas != 0) {
			if (totalDeptosMascota != 0) {
				porcentajeTienenMascota = (double) totalDeptosMascota * 100 / totalEncuestas;
				System.out.println("Porcentaje de departamentos con mascotas: " + porcentajeTienenMascota);
				System.out.println("Departamentos con solo perro o gato: " + departamentosUnicoTipoMascota);
				if (pisoGatoMasArriba != Integer.MIN_VALUE) {
					System.out.println("El gato que vive más arriba está en el piso " + pisoGatoMasArriba + " depto "
							+ deptoGatoMasArriba);
				} else {
					System.out.println("No hay gatos en el edificio");
				}

			} else {
				System.out.println("Ningun departamento tiene mascota");
			}
		} else {
			System.out.println("No se han ingresado datos para la encuesta");
		}

		input.close();
	}
}
