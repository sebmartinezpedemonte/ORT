package ej0introObjetosClase1;

public class Principal {
	public static void main(String[] args) {
		Persona persona1;
		persona1 = new Persona();
		Persona persona2 = new Persona();
		System.out.println(persona1);
		System.out.println(persona2);
		persona1.nombre = "Luis";
		persona1.apellido = "Gomez";
		persona1.edad = 30;

		// referencia de memoria del objeto
		// System.out.println(persona1);
		// System.out.println(persona1.nombreCompleto());

		persona1.mostrarDatos();

		persona1.nombre = "Maria";
		persona1.apellido = "Garcia";
		persona1.edad = 30;

		persona1.mostrarDatos();
		persona1.cambiarEdad(35);
		persona1.cambiarNombre("Carlos");
		persona1.mostrarDatos();
		System.out.println("/////////");
		
		System.out.println(persona1.esMayorDe(20));
		System.out.println(persona1.esMayorDe(40));
		
		persona1.cambiarNombreYApellido("Pepe", "Pompin");
		persona1.mostrarDatos();
	}

}
