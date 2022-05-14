package ejercicio01;

import java.util.Scanner;

public class Ejercicio01THP {
	final public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero1 = 0, numero2 = 0;
		int resultado = sumar(numero1,numero2);
		System.out.println(resultado);
				
	}
	
	public static int sumar(int num1, int num2) {
		int resultadoSuma;
		System.out.println("Ingrese el primer numero");
		num1 = input.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = input.nextInt();
		resultadoSuma = num1 + num2;	
		
		return resultadoSuma;
	}	
}
