package ort.edu.tp1.clase01;

import java.util.Scanner;

public class Test {
	//la variable static pertenece a la clase, cuando se instancia es compartida por todas las instancias

	
	//es una variable de clase, es compartida por las instancias
	//de Test. se puede utilizar sin instanciar
	public static final Scanner scan = new Scanner(System.in);
	//es una constante (no se puede modificar((final)). No hace
	//falta qu instancia Test (porque es static)
	public static final String ERROR_DE_DATOS = "Mensaje de error";
	
	//Es una variable de instancia, es particular para cada instancia de test
	private int contador = 0;
	public int contadorPublic = 0;
	
	public static void main(String[] args) {
		System.out.println("Hola");
		System.out.println("Hola");
		System.out.println("Hola");
		System.out.println("Hola");
		System.out.println("Hola");
		System.out.println("Hola");
		
		System.out.println(Test.ERROR_DE_DATOS);
	}
}
