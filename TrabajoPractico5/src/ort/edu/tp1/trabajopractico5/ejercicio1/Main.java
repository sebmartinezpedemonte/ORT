package ort.edu.tp1.trabajopractico5.ejercicio1;

public class Main {
	public static void main(String[] args) {

		/*
		 * En el programa principal mostrá cuántos días transcurrieron antes (no sera
		 * desde el comienzo del año?) del comienzo del año y qué día del año es el día
		 * de cumpleaños de cada integrante del grupo.
		 */
		Anio anio = new Anio();
		String nombreMes= anio.getNombreDelMes(10);
		System.out.println(nombreMes);
		// fecha de hoy: 22/10/2022
		int diasTranscurridos = anio.diasTranscurridos(10) + 22;
		System.out.println("Dias transcurridos desde el comienzo del año: " + diasTranscurridos);
		int diasTranscurridosConLocalDate = anio.diasTranscurridos();
		System.out.println("Dias transcurridos desde el comienzo del año: " + diasTranscurridosConLocalDate
				+ " (Usando DateTime)");

		// cumpleaños Sebastian 12 de octubre
		int cumpleaniosSebastian = anio.diasTranscurridos(10) + 12;
		System.out.println("Dia del año del cumpleaños de Sebastian: " + cumpleaniosSebastian);
		int cumpleaniosFacundo = anio.diasTranscurridos(4) + 2;
		System.out.println("Dia del año del cumpleaños de Facundo: " + cumpleaniosFacundo);
		int cumpleaniosFranco = anio.diasTranscurridos(10) + 12;
		System.out.println("Dia del año del cumpleaños de Franco: " + cumpleaniosFranco);
		int cumpleaniosMatias = anio.diasTranscurridos(8) + 10;
		System.out.println("Dia del año del cumpleaños de Matias: " + cumpleaniosMatias);
		int cumpleaniosNicolas = anio.diasTranscurridos(10) + 12;
		System.out.println("Dia del año del cumpleaños de Nicolas: " + cumpleaniosNicolas);
		int cumpleaniosGonzalo = anio.diasTranscurridos(10) + 12;
		System.out.println("Dia del año del cumpleaños de Gonzalo: " + cumpleaniosGonzalo);

	}
}
