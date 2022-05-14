package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio35 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		String nombre;
		int edad =0;
		int edadMinima = Integer.MAX_VALUE;
		String nombreMasJoven = "";
		
		do {
			System.out.println("Ingrese su nombre");
			nombre = input.nextLine();
			if(!nombre.equals("*")) {
			System.out.println("Ingrese su edad");
			edad = Integer.parseInt(input.nextLine());
			if(!nombre.equals("*") && edad >0) {
				if(edad<edadMinima) {
					nombreMasJoven = nombre;
					edadMinima = edad;
				}else if(edad<=0) {
					System.out.println("La edad debe ser un numero positivo mayor a cero");
				}
			}}
			
			}while(!nombre.equals("*"));
		if(edad>0) {
			System.out.println("el nombre de la persona mas joven es " + nombreMasJoven + " y su edad es " + edadMinima);
		}else {
			System.out.println("No se han ingresado datos");
		}
		
		
		input.close();
	}
}
