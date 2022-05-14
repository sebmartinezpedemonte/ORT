package ar.edu.ort.thp;

public class ClaseUno { //convencion CamelCase

	public static void main(String[] args) {

		// bit 0 o 1
		// byte: 8 bits 2 ^ 8 = 256
		// 0 al 255 o -128 a +127

		// int: 4 bytes o 32 bits (enteros)
		// -2.147.483.648 al +2.147.483.648

		// int edad = 0; //reserva un espacio de memoria. Solo cuando declaro la
		// variable tengo que poner el tipo de variable

		// o tmb
		int edad; // declaracion
		edad = 30; // asignacion: variable = expresion
		int x = 0; // declaracion con inicializacion

		System.out.println(edad);

		edad = edad + 5; // variable <= expresion
		// o edad +=5;
		System.out.println(edad);
		System.out.println(x);
		/*
		 * System.out.println("123" +"456"); //String
		 * 
		 * System.out.println(123 + 456); //int
		 * 
		 * System.out.println("123" + 456); //Java convierte el int 456 a String
		 * 
		 * System.out.println("1 + 2 = " + 1 + 2); //Java convierte el int 1 + 2 a
		 * String por orden izq a der
		 * 
		 * System.out.println("1 + 2 = " + ( 1 + 2)); //java respeta la precedencia del
		 * parentesis y dsp izq a der
		 * 
		 * System.out.println(100 - 10);
		 * 
		 * System.out.println(10*10);
		 * 
		 * System.out.println(7/2); //como son int no pone decimales
		 * 
		 * System.out.println(2 + 3 * 4);
		 * 
		 * System.out.println((2 + 3) * 4); //expresion
		 */

	}
}
