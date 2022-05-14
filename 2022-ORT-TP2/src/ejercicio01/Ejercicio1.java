package ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {

	int num1, num2;
	
	public int sumar(int num1, int num2) {
		return num1+num2;
		
	}
	
	public int pedirNumero(String msj, int min, int max) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int numero;
		do {
			System.out.println(msj + ": ");
			numero = input.nextInt();			
		}while(numero <min || numero > max);
	return numero;
	}
	
	
}
