package tp1.tp4.tj3;

import java.util.Scanner;

public class LectorEnteros{
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";
	private static final String MENSAJE_NULL_STRING = "El valor para mensaje no puede ser null";
	
	private Scanner scanner;

	private int cargar(String mensaje) {		
		int resultado = 0;
		System.out.println(mensaje);
		try {
			resultado = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("El valor ingresado no es un entero");
		}
		return resultado;
	}
	public LectorEnteros(Scanner scanner) {
		setScanner(scanner);
	}

	public int pedir() {
		return this.cargar(MENSAJE_CARGA_ENTERO);
	}
	
	public int pedir(String mensaje) {
		if (mensaje == null) {
			throw new IllegalArgumentException(MENSAJE_NULL_STRING);
		}
		return this.cargar(mensaje);	
	}

	public int pedir(String mensaje, int limiteA, int limiteB){
		int numero = 0;
		if(mensaje.isEmpty()) {
			numero = this.pedir();
		}else {
		 numero = this.pedir(mensaje + " entre " + limiteA + " y " + limiteB);		
		}
		return numero;
	}
	
	
	
	public int pedir(String mensaje, RangoDeEnteros rangoValido){
		int nac = 0;
		if(rangoValido == null) {
			throw new NullPointerException("El rango no puede ser nulo");
		}
		if(mensaje == null) {
			throw new NullPointerException("El mensaje no puede ser nulo");
		}
		
		int limiteA = rangoValido.getLimiteInferior();
		int limiteB = rangoValido.getLimiteSuperior();
		nac = this.pedir(mensaje, limiteA, limiteB);
		
		if(!rangoValido.incluye(nac)){
			throw new IllegalArgumentException(MENSAJE_FUERA_DE_RANGO);
			}
		return nac;
	}
	
	
	public int pedir(String mensaje, int limiteA, int limiteB, int finalC){
		int numero = 0;
		if(mensaje.isEmpty()) {
			numero = this.pedir();
		}else {
		 numero = this.pedir(mensaje + " entre " + limiteA + " y " + limiteB + " y si esta vivo escribir " + finalC);
		}
		return numero;
	}
	
	public int pedir(String mensaje, RangoDeEnteros rangoValido, int finalC){
		int fallecimiento = 0;
		if(rangoValido == null) {
			throw new NullPointerException("El rango no puede ser nulo");
		}
		if(mensaje == null) {
			throw new NullPointerException("El mensaje no puede ser nulo");
		}
		
		int limiteA = rangoValido.getLimiteInferior();
		int limiteB = rangoValido.getLimiteSuperior();
		fallecimiento = this.pedir(mensaje, limiteA, limiteB, finalC);
		
		if(!rangoValido.incluye(fallecimiento) && fallecimiento != -1){
			throw new IllegalArgumentException(MENSAJE_FUERA_DE_RANGO);
			}
		return fallecimiento;
	}
	
	
	
	
	private void setScanner(Scanner scanner) {
		if(scanner == null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
			this.scanner = new Scanner(System.in);
		
	}
}
