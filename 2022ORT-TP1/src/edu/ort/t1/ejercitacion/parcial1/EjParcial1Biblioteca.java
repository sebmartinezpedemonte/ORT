/*
 * 1) La biblioteca de la ciudad necesita organizar y tener un recuento de los libros que
tiene en sus 5 estantes.
Por cada uno de los 5 estantes, se ingresan libros:
Por cada uno de esos libros ingresar:
Nombre del libro (FIN = No hay más libros para ese estante)
Género (I Infantil, N  Novela, H  Historia)
Cantidad de páginas que tiene el libro (mayor a 0)
Una vez finalizado el ingreso de datos de 1 estante, se debe mostrar por pantalla el
nombre del libro que más páginas tiene, con su cantidad correspondiente.
Al finalizar el ingreso de datos de todos los estantes, mostrar:
Cantidad de libros por género
Promedio de libros por estante
 */

package edu.ort.t1.ejercitacion.parcial1;

import java.util.Scanner;

public class EjParcial1Biblioteca {
	public static void main(String[] args) {

		final Scanner input = new Scanner(System.in);

		final String FINALIZAR = "FIN";
		final int ESTANTES_TOTALES = 5;
		String nombreLibro;
		char genero;
		int cantPaginas;
		String libroMaxPaginas = "";
		int maxPaginas = 0;
		int promedioLibros;
		int generoInfantil = 0;
		int generoNovela = 0;
		int generoHistoria = 0;
		int librosTotales = 0;

		for (int i = 1; i <= ESTANTES_TOTALES; i++) {
			System.out.println("Ingrese los libros del estante " + i);
			System.out.println("Ingrese nombre del libro o FIN para continuar con el siguiente estante");
			nombreLibro = input.nextLine().toUpperCase();
			while (!nombreLibro.equals(FINALIZAR)) {
				System.out.println("Ingrese genero del libro ('I'  Infantil, 'N'  Novela, 'H'  Historia)");
				genero = input.nextLine().toUpperCase().charAt(0);
				while (genero != 'I' && genero != 'N' && genero != 'H') {
					System.out.println("Error. Ingrese genero del libro ('I'  Infantil, 'N'  Novela, 'H'  Historia)");
					genero = input.nextLine().toUpperCase().charAt(0);
				}
				switch (genero) {
				case 'I':
					generoInfantil++;
					break;
				case 'N':
					generoNovela++;
					break;
				case 'H':
					generoHistoria++;
					break;
				}
				System.out.println("Ingrese la cantidad de hojas que tiene el libro (numero mayor a 0)");
				cantPaginas = Integer.parseInt(input.nextLine());
				while (cantPaginas <= 0) {
					System.out.println("La cantidad de paginas es invalida, ingrese nuevamente un numero mayor a 0.");
					cantPaginas = Integer.parseInt(input.nextLine());
				}
				if (cantPaginas > maxPaginas) {
					maxPaginas = cantPaginas;
					libroMaxPaginas = nombreLibro;
				}
				librosTotales++;
				System.out.println("Ingrese nombre del libro o FIN para continuar con el siguiente estante");
				nombreLibro = input.nextLine().toUpperCase();
			}
			if(maxPaginas!=0) {
			System.out.println("El nombre del libro con mas paginas es " + libroMaxPaginas + " y tiene " + maxPaginas
					+ " paginas");

			}else {
				System.out.println("No se han ingresado libros en este Estante ");
			}
			libroMaxPaginas = "";
			maxPaginas = 0;
			
		}
		System.out.println("La cantidad de libros por genero es: Infantil " + generoInfantil + " Novela " + generoNovela
				+ " Historia " + generoHistoria);
		promedioLibros = librosTotales / ESTANTES_TOTALES;
		System.out.println("El promedio de libros por estante es de " + promedioLibros);

		input.close();

	}

}

