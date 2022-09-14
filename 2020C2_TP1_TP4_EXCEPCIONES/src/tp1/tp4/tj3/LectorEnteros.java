package tp1.tp4.tj3;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private Scanner scanner;

	private int cargar(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(scanner.nextLine());
	}
	public LectorEnteros(Scanner scanner) {
		// TODO implementar
		return 0;
	}

	public int pedir(String mensaje) {
		// TODO implementar
		return 0;
	}

	public int pedir(String mensaje, int limiteA, int limiteB){
		// TODO implementar
		return 0;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido){
		// TODO implementar
		return 0;
	}
}
