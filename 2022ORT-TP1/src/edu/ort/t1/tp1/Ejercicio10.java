package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double capital1, capital2, capital3, valorTotal, porcentajeAportado1, porcentajeAportado2, porcentajeAportado3;
		String persona1, persona2, persona3;
		
		System.out.println("Ingrese el nombre del primer socio");
		persona1 = input.nextLine();
		System.out.println("Ingrese el nombre del segundo socio");
		persona2 = input.nextLine();
		System.out.println("Ingrese el nombre del tercer socio");
		persona3 = input.nextLine();
		
		System.out.println("Ingrese el monto ingresado por " + persona1);
		capital1 = input.nextInt();
		System.out.println("Ingrese el monto ingresado por " + persona2);
		capital2 = input.nextInt();
		System.out.println("Ingrese el monto ingresado por " + persona3);
		capital3 = input.nextInt();
		
		valorTotal = capital1 + capital2 + capital3;
		porcentajeAportado1 = (capital1 * 100) /valorTotal;
		porcentajeAportado2 = (capital2 * 100) /valorTotal;
		porcentajeAportado3 = (capital3 * 100) /valorTotal;
		
		System.out.println("El valor total aportado es de " + valorTotal);
		
		System.out.println(persona1 + " aporto el " + porcentajeAportado1 + "%");
		System.out.println(persona2 + " aporto el " + porcentajeAportado2 + "%");
		System.out.println(persona3 + " aporto el " + porcentajeAportado3 + "%");
				
		input.close();
	}
}
