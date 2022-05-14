package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio29 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int nota;
		boolean notaAceptable = false;
		
		do {
			System.out.println("Ingrese una nota que este entre 0 y 10");
			nota = input.nextInt();
			if(nota>=0 && nota<=10) {
				notaAceptable = true;
			}else {
				System.out.println("La nota ingresada no esta dentro de los parametros pedidos, intente de vuelta");
			}
		
		}while(!notaAceptable);
		
		System.out.println("La nota es " + nota);
		
		input.close();
	}
}
