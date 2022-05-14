package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio37While {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final int MESES = 12;
		int contMes = 2;
		double sueldo;
		double sueldoFinal = 0;
		System.out.println("Ingrese el sueldo del mes " + (contMes-1));
		sueldo = Double.parseDouble(input.nextLine());		
		while(sueldo >= 0 && contMes<=MESES) {
			if(sueldo >= 0) {
				sueldoFinal += sueldo;
				contMes++;
			}
			System.out.println("Ingrese el sueldo del mes " + (contMes-1));
			sueldo = Double.parseDouble(input.nextLine());
		}
				
		if(contMes!= 1) {
		System.out.println("El monto percibido por el empleado hasta el mes " + (contMes - 1) + " es de " + sueldoFinal);
		}else {
			System.out.println("No ha cobrado ningun sueldo todavia");
		}
		
		
		input.close();
	}

}
