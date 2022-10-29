package ort.edu.tp1.trabajopractico5.ejercicio1;

public class Main {
	public static void main(String[] args) {

		/*
		 * En el programa principal mostr� cu�ntos d�as transcurrieron antes (no sera
		 * desde el comienzo del a�o?) del comienzo del a�o y qu� d�a del a�o es el d�a
		 * de cumplea�os de cada integrante del grupo.
		 */
		Anio anio = new Anio();
		String nombreMes= anio.getNombreDelMes(10);
		System.out.println(nombreMes);
		// fecha de hoy: 22/10/2022
		int diasTranscurridos = anio.diasTranscurridos(10) + 22;
		System.out.println("Dias transcurridos desde el comienzo del a�o: " + diasTranscurridos);
		int diasTranscurridosConLocalDate = anio.diasTranscurridos();
		System.out.println("Dias transcurridos desde el comienzo del a�o: " + diasTranscurridosConLocalDate
				+ " (Usando DateTime)");

		// cumplea�os Sebastian 12 de octubre
		int cumpleaniosSebastian = anio.diasTranscurridos(10) + 12;
		System.out.println("Dia del a�o del cumplea�os de Sebastian: " + cumpleaniosSebastian);
		int cumpleaniosFacundo = anio.diasTranscurridos(4) + 2;
		System.out.println("Dia del a�o del cumplea�os de Facundo: " + cumpleaniosFacundo);
		int cumpleaniosFranco = anio.diasTranscurridos(10) + 12;
		System.out.println("Dia del a�o del cumplea�os de Franco: " + cumpleaniosFranco);
		int cumpleaniosMatias = anio.diasTranscurridos(8) + 10;
		System.out.println("Dia del a�o del cumplea�os de Matias: " + cumpleaniosMatias);
		int cumpleaniosNicolas = anio.diasTranscurridos(10) + 12;
		System.out.println("Dia del a�o del cumplea�os de Nicolas: " + cumpleaniosNicolas);
		int cumpleaniosGonzalo = anio.diasTranscurridos(10) + 12;
		System.out.println("Dia del a�o del cumplea�os de Gonzalo: " + cumpleaniosGonzalo);

	}
}
