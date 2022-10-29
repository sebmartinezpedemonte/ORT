package ort.edu.tp1.trabajopractico5.ejercicio2;

import java.time.LocalDate;

public class Anio {
	private Mes mes;
	//private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre", "Noviemebre", "Diciembre"};
	private int[] diasMes = {31,28,31, 30, 31,30,31,31,30,31,30,31};
	
	//Recibe el número de mes (entre 1 y 12) y devuelve el nombre del mes en
	//cuestión.
	
	public String getNombreDelMes(int numeroMes) {
		Mes mes = Mes.ENERO;
		switch(numeroMes) {
		case 1: mes = Mes.ENERO;
		break;
		case 2: mes = Mes.FEBRERO;
		break;
		case 3: mes = Mes.MARZO;
		break;
		case 4: mes = Mes.ABRIL;
		break;
		case 5: mes = Mes.MAYO;
		break;
		case 6: mes = Mes.JUNIO;
		break;
		case 7: mes = Mes.JULIO;
		break;
		case 8: mes = Mes.AGOSTO;
		break;
		case 9: mes = Mes.SEPTIEMBRE;
		break;
		case 10: mes = Mes.OCTUBRE;
		break;
		case 11: mes = Mes.NOVIEMBRE;
		break;
		case 12: mes = Mes.DICIEMBRE;
		break;
		default: mes = Mes.ERROR;		
		}
		String nombreMes = mes.getNombreMes();
		
		
		return nombreMes;
	}
	
	//Recibe el número de mes y devuelve la cantidad de días transcurridos en el
	//año antes de comenzar el mes en cuestión.
	
	public int diasTranscurridos(int numeroMes) {
		int cantDiasTranscurridos = 0;
		for(int i = 0; i < numeroMes -1; i++) {
			cantDiasTranscurridos += diasMes[i];
		}		
		return cantDiasTranscurridos;
	}
	
	
	/*
	 * Si el método
	diasTranscurridos(..) es usado una y otra vez, ¿hay alguna manera de evitar que el
	cálculo de los días transcurridos se haga permanentemente? Si la hay, modificá la
	clase para mejorar su performance.
	 * 
	 */
	public int diasTranscurridos() {
		//LocalDate fechaHoy = LocalDate.now();
		//return fechaHoy.getDayOfYear();
		return LocalDate.now().getDayOfYear();
	}
}
