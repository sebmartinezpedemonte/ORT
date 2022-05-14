package ejercicio07;

public class Main {
	public static void main(String[] args) {
		LectoraDeDVD lectoraDeDVD1 = new LectoraDeDVD("Samsung", false);
		Procesador procesador1 = new Procesador("AMD", "G-Force", 50, 100);
		Computadora computadora1 = new Computadora("Dell", procesador1, TipoDeComputadora.LAPTOP, lectoraDeDVD1);
		
		Computadora computadora2 = new Computadora("Dell", new Procesador("AMD", "G-Force", 50, 100), TipoDeComputadora.LAPTOP, new LectoraDeDVD("Samsung", false));
		
		
		System.out.println(computadora2);
		Persona persona1 = new Persona("Carlos", "Gomez", "34123654", computadora1);

		System.out.println(persona1);
		
		procesador1.peligroNivelTemperaturaCritica(120);
	}
}
