package tp1.tp4.tj3;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento = 0;
		int anioActual = Year.now().getValue();
		Scanner input = new Scanner(System.in);
		int entero = 0;
		int anioInicioNacimientos = 1900;
		int edad = 0;
		
		RangoDeEnteros rangoNac = new RangoDeEnteros(anioInicioNacimientos, anioActual);
		LectorEnteros lector = null;
		
		try {
		lector = new LectorEnteros(input);
		}catch(IllegalArgumentException e) {
			e.getMessage();
		}
		
		try {
			
		//entero =lector.pedir();		
		//do {
		nacimiento = lector.pedir("Ingrese un año de nacimiento", rangoNac);
		while(!rangoNac.incluye(nacimiento)) {
			nacimiento = lector.pedir("Ingrese un año de nacimiento", rangoNac);
		}
		RangoDeEnteros rangoVida = new RangoDeEnteros(nacimiento, anioActual);
		do {
		fallecimiento = lector.pedir("Ingrese el año de fallecimiento" , rangoVida, -1);
		}while(!rangoVida.incluye(fallecimiento) && fallecimiento != -1);
		edad = fallecimiento - nacimiento;
		if(fallecimiento == -1) {
			edad = anioActual - nacimiento;
			System.out.println("La persona tiene " + edad + " años y esta viva");
		//}else if(edad < 0){
			
		//}else if(nacimiento < rangoNac.getLimiteInferior() || fallecimiento > rangoNac.getLimiteSuperior() ) {
			
		}
		else {
			edad = fallecimiento - nacimiento;
			System.out.println("La persona vivio " + edad + " años.");
		}
		}catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());			
		}catch(InputMismatchException e) {
			System.out.println("No es un entero");
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

		
		input.close();
	}
}
