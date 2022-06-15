package ejercicio10;

import java.util.ArrayList;

public class Carrera {
	private final int MAX_CANT_CANDIDATOS = 1;
	private final int MIN_CANT_MATERIAS = 5;
	private String nombre;
	private ArrayList<Alumno> alumnos;

	public Carrera(String nombre) {
		this.nombre = nombre;
		alumnos = new ArrayList<>();
	}

	public ArrayList<String> obtenerCandidatos(double promedioMinimo) {
		ArrayList<String> candidatos = new ArrayList<>();
		Alumno alumnoIngresado = null;
		int j=0;
		while (candidatos.size()<= MAX_CANT_CANDIDATOS && alumnoIngresado == null && j <= MAX_CANT_CANDIDATOS) {
			for (Alumno alumno : alumnos) {
				if (buscarCandidato(promedioMinimo) != null && alumno.promedio() >= promedioMinimo && alumno.cantMaterias() >=5) {
					candidatos.add(alumno.getNombre() + " " + alumno.getEmail());
					alumnoIngresado = alumno;				
				}else {
					j++;
				}
			}
		}
		for (int i = 0; i < candidatos.size(); i++) {
			System.out.println((i + 1) + " " + candidatos.get(i));
		}
		if(candidatos.size() == 0) {
			System.out.println("No hay candidatos");
		}
		return candidatos;
	}

	private Alumno buscarCandidato(double promedioMinimo) {
		Alumno alumnoBuscar = null;
		int i = 0;
		while (alumnos.size() > i && alumnoBuscar == null) {
			if (alumnos.get(i).promedio() >= promedioMinimo && alumnos.get(i).cantMaterias() >= MIN_CANT_MATERIAS) {
				alumnoBuscar = alumnos.get(i);
			} else {
				i++;
			}
		}

		return alumnoBuscar;
	}

	private Alumno buscarAlumno(String email) {
		Alumno alumnoBuscar = null;
		int i = 0;
		while (alumnos.size() > i && alumnoBuscar == null) {
			if (alumnos.get(i).getEmail().equals(email)) {
				alumnoBuscar = alumnos.get(i);
			} else {
				i++;
			}
		}

		return alumnoBuscar;
	}

	public boolean agregarAlumno(String nombre, String email) {
		boolean sePudo = false;
		if (buscarAlumno(email) == null) {
			Alumno alumno1 = new Alumno(nombre, email);
			alumnos.add(alumno1);
			sePudo = true;
			System.out.println("Se agrego al alumno " + alumno1.getNombre());
		} else {
			System.out.println("El alumno ya esta en la base de datos");
		}

		return sePudo;
	}

	public void agregarAlumno(Alumno alumno) {
		if (buscarAlumno(alumno) == null) {
			alumnos.add(alumno);
		}
	}

	private Alumno buscarAlumno(Alumno alumno) {
		Alumno alumnoBuscar = null;
		int i = 0;
		while (alumnos.size() > i && alumnoBuscar == null) {
			if (alumnos.get(i).equals(alumno)) {
				alumnoBuscar = alumnos.get(i);
			} else {
				i++;
			}
		}
		return alumnoBuscar;
	}

	@Override
	public String toString() {
		return "Carrera [MAX_CANT_CANDIDATOS=" + MAX_CANT_CANDIDATOS + ", MIN_CANT_MATERIAS=" + MIN_CANT_MATERIAS
				+ ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}

}
