package ort.edu.tp1.clase02;
//clase contenedora

import java.util.ArrayList;

public class Escuela {

	private ArrayList<Alumno> alumnos;

	public Escuela() {
		alumnos = new ArrayList<>();
	}

	// clase contenida
	// Inner class o clase anidada
	private class Alumno {

		private String nombre;
		private String apellido;
		private String dni;

		public Alumno(String nombre, String apellido, String dni) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
		}

	}

	public Alumno getAlumnoRandom() {
		return alumnos.get(0);
	}

	public void crearAlumno(String nombre, String apellido, String dni) {
		alumnos.add(new Alumno(nombre, apellido, dni));
	}
}
