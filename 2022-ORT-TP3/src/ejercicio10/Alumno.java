package ejercicio10;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String email;
	private ArrayList<Materia> materias;

	public Alumno(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
		materias = new ArrayList<>();
	}

	private Materia buscarMateria(String nombre) {
		Materia materiaBuscar = null;
		int i = 0;
		while (materias.size() > i && materiaBuscar == null) {
			if (materias.get(i).getNombre().equals(nombre)) {
				materiaBuscar = materias.get(i);
			} else {
				i++;
			}
		}
		return materiaBuscar;
	}

	public boolean agregarMateria(String nombre, double notaFinal) {
		boolean sePudo = false;
		if (buscarMateria(nombre) == null) {
			Materia materia1 = new Materia(nombre, notaFinal);
			materias.add(materia1);
			sePudo = true;
			System.out.println("Se pudo añadir la materia con nombre " + materia1.getNombre());
		} else {
			System.out.println("Materia ya anotada");
		}

		return sePudo;
	}

	public int cantMaterias() {
		return materias.size();
	}

	public double promedio() {
		double promedio = 0;
		if (cantMaterias() > 0) {
			promedio = notasMaterias() / cantMaterias();
		}
		return promedio;
	}

	private double notasMaterias() {
		double notasMaterias = 0;
		for (Materia materia : materias) {
			notasMaterias += materia.getNotaFinal();
		}

		return notasMaterias;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", email=" + email + ", materias=" + materias + "]";
	}

}
