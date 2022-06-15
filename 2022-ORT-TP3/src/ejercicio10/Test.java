package ejercicio10;

public class Test {
	public static void main(String[] args) {
		Carrera carrera1 = new Carrera("Ingeniera");

		Alumno alumno1 = new Alumno("Carlos", "carlos@gmail.com");
		Alumno alumno2 = new Alumno("Miguel", "miguel@gmail.com");
		Alumno alumno3 = new Alumno("Maria", "maria@gmail.com");

		carrera1.agregarAlumno(alumno1);
		carrera1.agregarAlumno(alumno2);
		carrera1.agregarAlumno(alumno3);
		
		alumno1.agregarMateria("Fisica", 8);
		alumno1.agregarMateria("Quimica", 8);
		alumno1.agregarMateria("Matematica", 8);
		alumno1.agregarMateria("Algebra", 8);
		alumno1.agregarMateria("Laboratorio", 8);
		
		alumno2.agregarMateria("Fisica", 8);		
		alumno2.agregarMateria("Quimica", 2);
		alumno2.agregarMateria("Matematica", 10);
		alumno2.agregarMateria("Algebra", 6);
		alumno2.agregarMateria("Laboratorio", 9);
		
		alumno3.agregarMateria("Fisica", 7);
		alumno3.agregarMateria("Quimica", 7);
		alumno3.agregarMateria("Matematica", 7);
		alumno3.agregarMateria("Algebra", 7);
		alumno3.agregarMateria("Laboratorio", 6);
		
		System.out.println(carrera1.obtenerCandidatos(7));
		
		System.out.println(carrera1.obtenerCandidatos(10));


		
		
		
		/*
		carrera1.agregarAlumno("Carlos", "carlos@gmail.com");
		carrera1.agregarAlumno("Miguel", "miguel@gmail.com");
		carrera1.agregarAlumno("MigueL", "miguel@gmail.com");
		carrera1.agregarAlumno("MigueL", "miguel@gmail.com");
		carrera1.agregarAlumno("MigueL", "miguel@gmail.com");
		carrera1.agregarAlumno("MigueL", "miguel@gmail.com");
		*/
		
		
	}

}
