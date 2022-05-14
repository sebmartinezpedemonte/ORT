package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio37 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final int MESES = 12;
		int contMes = 1;
		double sueldo;
		double sueldoFinal = 0;
		
		do {
			System.out.println("Ingrese el sueldo del mes " + contMes);
			sueldo = Double.parseDouble(input.nextLine());
			if(sueldo >= 0) {
				sueldoFinal += sueldo;
				contMes++;
			}
		}while(sueldo >= 0 && contMes<=MESES);
		if(contMes!= 1) {
		System.out.println("El monto percibido por el empleado hasta el mes " + (contMes - 1) + " es de " + sueldoFinal);
		}else {
			System.out.println("No ha cobrado ningun sueldo todavia");
		}
		
		
		input.close();
	}

}
