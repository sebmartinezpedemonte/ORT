package parciales.practica;

import java.util.Scanner;

/*
 * Nos piden un programa para procesar la informaci�n de los veh�culos que pasan por una casilla de
peaje por la cual solamente transitan autom�viles, motos y camionetas.
Por cada veh�culo que pase por la misma el operador ingresa la patente, el tipo de veh�culo
(M - Moto, A - Autom�vil, C - Camioneta) y la hora (sin minutos de 0 a 23).
La hora pico es de 9 a 18hs, y durante la misma se incrementan las tarifas en un 50%.
El costo del peaje en horario no pico es:
- Motos $50
- Autom�vil $100
- Camioneta $150
Se solicita mostrar cu�nto abon� de peaje cada veh�culo que cruza el mismo.
En caso de no querer procesar m�s veh�culos, el operador debe ingresar "FIN" en la patente.
Una vez finalizada la carga, se solicita:
- Mostrar la recaudaci�n total de la casilla de peaje
- El porcentaje de veh�culos tipo Automovil que pasaron por la casilla
�Ojo! Si no pas� ning�n veh�culo, ten�s que mostrar un mensaje informando esta situaci�n.
�No te olvides de validar los datos!

Ejemplo 1:
Ingresa la patente del Veh�culo. (Fin para finalizar la carga)
ABD222
Ingres� tipo de veh�culo (M - Moto, A - Automovil, C - Camioneta)
M
Ingres� la hora (solo la hora) de 0 a 23
4
El peaje del veh�culo ABD222 es 50.0
Ingresa la patente del Veh�culo. (Fin para finalizar la carga)
ADF332I
Ingres� tipo de veh�culo (M - Moto, A - Automovil, C - Camioneta)
A
Ingres� la hora (solo la hora) de 0 a 23
17
El peaje del veh�culo ADF332I es 150.0
Ingresa la patente del Veh�culo. (Fin para finalizar la carga)
OOE111
Ingres� tipo de veh�culo (M - Moto, A - Automovil, C - Camioneta)
C
Ingres� la hora (solo la hora) de 0 a 23
90
Ingres� la hora (solo la hora) de 0 a 23
8
El peaje del veh�culo OOE111 es 150.0
Ingresa la patente del Veh�culo. (Fin para finalizar la carga)
EDR190
Ingres� tipo de veh�culo (M - Moto, A - Autom�vil, C - Camioneta)
R
Ingres� tipo de veh�culo (M - Moto, A - Automovil, C - Camioneta)
A
Ingres� la hora (solo la hora) de 0 a 23
12
El peaje del veh�culo EDR190 es 150.0
Ingresa la patente del Veh�culo. (Fin para finalizar la carga)
FIN
El porcentaje de Autos es de 50.0%
El total recaudado es 500.0
Ejemplo 2
Ingresa la patente del Veh�culo. (Fin para finalizar la carga)
Fin
No se ingresaron veh�culos

 */

public class THP_PARCIAL_1_PEAJE_TEMA1 {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		
		final int HORA_PICO_COMIENZO = 9;
		final int HORA_PICO_FIN = 18;
		final double INCREMENTO = 1.5;
		final double PEAJE_MOTO = 50;
		final double PEAJE_AUTOMOVIL = 100;
		final double PEAJE_CAMIONETA = 150;
		final String FINALIZACION = "FIN";
		final int HORA_MINIMA = 0;
		final int HORA_MAXIMA = 23;
		
		String patente;
		char tipoDeVehiculo;
		int hora;
		double recaudacionTotal = 0;
		int contadorVehiculos = 0;
		@SuppressWarnings("unused")
		int cantMoto = 0;
		int cantAuto = 0;
		@SuppressWarnings("unused")
		int cantCamioneta = 0;
		double peaje = 0;
		double porcentajeAuto;
		
		
		System.out.println("Ingresa la patente del Veh�culo. (Fin para finalizar la carga)");
		patente = input.nextLine().toUpperCase();
		while(!patente.equals(FINALIZACION)) {
			System.out.println("Ingres� tipo de veh�culo (M - Moto, A - Automovil, C - Camioneta)");
			tipoDeVehiculo = input.nextLine().toUpperCase().charAt(0);
			while(tipoDeVehiculo != 'M' && tipoDeVehiculo != 'A' && tipoDeVehiculo != 'C') {
				System.out.println("Ingres� tipo de veh�culo (M - Moto, A - Automovil, C - Camioneta)");
				tipoDeVehiculo = input.nextLine().toUpperCase().charAt(0);
			}

			System.out.println("Ingres� la hora (solo la hora) de 0 a 23");
			hora = Integer.parseInt(input.nextLine());
			while(!(hora >= HORA_MINIMA && hora <= HORA_MAXIMA)) {
				System.out.println("Ingres� la hora (solo la hora) de 0 a 23");
				hora = Integer.parseInt(input.nextLine());
			}


			
			switch(tipoDeVehiculo) {
			case 'M':
				cantMoto++;
				peaje = PEAJE_MOTO;
				break;
			case 'A':
				cantAuto++;
				peaje = PEAJE_AUTOMOVIL;
				break;
			case 'C':
				cantCamioneta++;
				peaje = PEAJE_CAMIONETA;
				break;
			}
			if(hora>=HORA_PICO_COMIENZO && hora <= HORA_PICO_FIN && tipoDeVehiculo == 'M') {
				peaje = PEAJE_MOTO * INCREMENTO;				
			}else if(hora>=HORA_PICO_COMIENZO && hora <= HORA_PICO_FIN && tipoDeVehiculo == 'A') {
				peaje = PEAJE_AUTOMOVIL * INCREMENTO;
			}else if(hora>=HORA_PICO_COMIENZO && hora <= HORA_PICO_FIN && tipoDeVehiculo == 'C') {
				peaje = PEAJE_CAMIONETA * INCREMENTO;
			}

			
			
			System.out.println("El peaje del veh�culo " + patente + " es " + peaje);
			recaudacionTotal += peaje;
			contadorVehiculos++;

			System.out.println("Ingresa la patente del Veh�culo. (Fin para finalizar la carga)");
			patente = input.nextLine();
			
		}
		if(contadorVehiculos > 0) {
		porcentajeAuto = cantAuto*100/contadorVehiculos;
		System.out.println("El porcentaje de Autos es de " + porcentajeAuto + "%");
		System.out.println("El total recaudado es de " + recaudacionTotal);
		}else {
			System.out.println("No se ingresaron veh�culos");
		}
		
		
		
		input.close();
	}
}
