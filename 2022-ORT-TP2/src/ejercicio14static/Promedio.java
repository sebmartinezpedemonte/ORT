package ejercicio14static;

import java.util.Scanner;

public class Promedio {
	final static Scanner input = new Scanner(System.in);
	private static double promedio;
	private static double nota;
	

	public Promedio() {
		Promedio.promedio = 0;

	}

	private static double pedirValor() {

		do {

			System.out.println("Ingrese la nota (nro entre 0 y 10) del alumno " + (Contador.obtenerValor() + 1));
			nota = input.nextDouble();

		} while (nota < 0 || nota > 10);

		return nota;

	}

	public static void incrementar() {
		int alumnos;
		do {
		System.out.println("Ingrese la cantidad de alumnos");
		alumnos = input.nextInt();
		}while(alumnos <=0);
		
		while ((Contador.obtenerValor()) < alumnos) {
			pedirValor();
			Acumulador.incrementarValor(nota);			
			Contador.incrementarValorEn1();			
		}
		
		promedio = Acumulador.obtenerValor() / (Contador.obtenerValor());
	}

	public static double obtenerValor() {
		
		return Promedio.promedio;
	}

}
