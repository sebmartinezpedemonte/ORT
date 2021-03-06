package ejercicio14;

import java.util.Scanner;


public class Promedio {
	final Scanner input = new Scanner(System.in);
	private double promedio;
	private double nota;
	private Contador contador;
	private Acumulador acumulador;

	public Promedio(Contador contador, Acumulador acumulador) {
		this.promedio = 0;
		this.contador = contador;
		this.acumulador = acumulador;

	}

	private double pedirValor() {

		do {

			System.out.println("Ingrese la nota (nro entre 0 y 10) del alumno " + (contador.obtenerValor() + 1));
			nota = input.nextDouble();

		} while (nota < 0 || nota > 10);

		return nota;

	}

	public void incrementar() {
		int alumnos;
		do {
		System.out.println("Ingrese la cantidad de alumnos");
		alumnos = input.nextInt();
		}while(alumnos <=0);
		
		while ((contador.obtenerValor()) < alumnos) {
			pedirValor();
			acumulador.incrementarValor(nota);			
			contador.incrementarValorEn1();			
		}
		
		promedio = acumulador.obtenerValor() / (contador.obtenerValor());
	}

	public double obtenerValor() {
		
		return this.promedio;
	}

}
