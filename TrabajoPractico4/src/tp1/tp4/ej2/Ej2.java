package tp1.tp4.ej2;

import java.util.Scanner;

import tp1.tp4.tj3.LectorEnteros;
import tp1.tp4.tj3.RangoDeEnteros;

public class Ej2 {

	public static void main(String[] args) {
		/*
		Persona unaPersona = null ;
		try {
		unaPersona = new Persona( "Juan" , 1984 , 2018 );
		} catch (RuntimeException re) {
		System.out.println(re.getMessage());
		} finally {
		System.out.println( "Los datos de la persona son " + unaPersona);
		}
		*/
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
		final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2019);
		
		Alumno alu = null;
		int dni = 0, anioNacimiento = 0;
		String nombreCompleto;

		while (alu == null) {
			try {
				do {
				System.out.println("Ingresa el nombre del alumno:");
				nombreCompleto = input.nextLine();
				}while(nombreCompleto == null || nombreCompleto.isBlank());
				try {
					do {
					anioNacimiento = lector.pedir("Ingresa su anio de nacimiento");
					}while(!RANGO_ANIO_NACIMIENTO.incluye(anioNacimiento));
					try {
						do {
						dni = lector.pedir("Ingrese su DNI");
						}while(!RANGO_NRO_DOCUMENTO.incluye(dni));
					}catch(RuntimeException e) {
						System.out.println(e.getMessage());
					}
				}catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
				
				
				alu = new Alumno(nombreCompleto, anioNacimiento, dni);
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		input.close();
		System.out.println(alu.toString());

		if (alu.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}
	
	}
	

}