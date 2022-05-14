package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cant;
		int num;
		int numMayor = Integer.MIN_VALUE;
		int posicion = 1;
		int posicionMayor = 0;
		
		
		System.out.println("Ingrese la cantidad de numeros enteros que desea ingresar");
		cant = input.nextInt();
		
		for(int i = 1; i<=cant; i ++) {
			System.out.println("Ingrese el numero numero " + i);
			num = input.nextInt();
			if(num>numMayor) {
				numMayor = num;
				posicionMayor = posicion;
			}
			posicion++;
		}
		System.out.println("El numero mayor es " + numMayor + " y estaba en la posicion " + posicionMayor);
		input.close();
	}
}
