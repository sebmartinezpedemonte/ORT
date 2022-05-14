package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio38 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		final String MENSAJE_ACCESO = "Acceso concedido";
		final String MENSAJE_NEGATIVO = "Se ha bloqueado la cuenta";
		final String USUARIO_CORRECTO = "admin";
		final String CONTRASENIA_CORRECTA = "123456";
		final int CANTIDAD_INTENTOS = 3;
		int contadorIntentos = 1;
		String usuario;
		String contrasenia;

		System.out.println("Ingrese su nombre de usuario");
		usuario = input.nextLine();
		System.out.println("Ingrese su contraseña");
		contrasenia = input.nextLine();
		while (!(usuario.equals(USUARIO_CORRECTO) && contrasenia.equals(CONTRASENIA_CORRECTA)) && contadorIntentos < CANTIDAD_INTENTOS) {
			//esta esta mal: !usuario.equals(USUARIO_CORRECTO) && !contrasenia.equals(CONTRASENIA_CORRECTA) && contadorIntentos < CANTIDAD_INTENTOS
			
			contadorIntentos++;
			System.out.println("Ingrese su nombre de usuario");
			usuario = input.nextLine();
			System.out.println("Ingrese su contraseña");
			contrasenia = input.nextLine();
		}

		if (usuario.equals(USUARIO_CORRECTO) && contrasenia.equals(CONTRASENIA_CORRECTA)) {
			System.out.println(MENSAJE_ACCESO);
		} else {
			System.out.println(MENSAJE_NEGATIVO);
		}

		input.close();
	}
}
