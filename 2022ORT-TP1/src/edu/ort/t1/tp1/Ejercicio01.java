package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nombreDelUsuario;
		
		System.out.println("Ingrese su nombre");
		nombreDelUsuario = input.nextLine();
		System.out.println("Bienvenido " + nombreDelUsuario);
		input.close();

}
}