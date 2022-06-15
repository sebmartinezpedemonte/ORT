package ar.edu.ort.thp.tp3.ej9;

public class ResumenAlumno {

	private int notasAprobadas;
	private double promedioNotas;

	public ResumenAlumno(int aprobadas, double promedio) {
		notasAprobadas = aprobadas;
		promedioNotas = promedio;
	}

	public int getNotasAprobadas() {
		return notasAprobadas;
	}

	public double getPromedioNotas() {
		return promedioNotas;
	}

}