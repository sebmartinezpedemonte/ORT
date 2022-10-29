package ort.edu.tp1.trabajopractico5.ejercicio1;

import java.time.LocalDate;

public class Anio {
	
	private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre", "Noviembre", "Diciembre"};
	private int[] diasMes = {31,28,31, 30, 31,30,31,31,30,31,30,31};
	
	//Recibe el n�mero de mes (entre 1 y 12) y devuelve el nombre del mes en
	//cuesti�n.
	
	public String getNombreDelMes(int numeroMes) {		
		String nombreMes = meses[numeroMes-1];		
		return nombreMes;
	}
	
	//Recibe el n�mero de mes y devuelve la cantidad de d�as transcurridos en el
	//a�o antes de comenzar el mes en cuesti�n.
	
	public int diasTranscurridos(int numeroMes) {
		int cantDiasTranscurridos = 0;
		for(int i = 0; i < numeroMes -1; i++) {
			cantDiasTranscurridos += diasMes[i];
		}		
		return cantDiasTranscurridos;
	}
	
	
	/*
	 * Si el m�todo
	diasTranscurridos(..) es usado una y otra vez, �hay alguna manera de evitar que el
	c�lculo de los d�as transcurridos se haga permanentemente? Si la hay, modific� la
	clase para mejorar su performance.
	 * 
	 */
	public int diasTranscurridos() {
		//LocalDate fechaHoy = LocalDate.now();
		//return fechaHoy.getDayOfYear();
		return LocalDate.now().getDayOfYear();
	}
}
