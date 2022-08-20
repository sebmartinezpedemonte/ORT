package ort.edu.tp1.trabajopractico1.ejercicio2;

public class Test {
	public static void main(String[] args) {
		
		Carrera carrera1 = new Carrera("100 metros", 100);
		
		carrera1.agregarAtleta("Carlos", 15);
		carrera1.agregarAtleta("Miguel", 13);
		carrera1.agregarAtleta("Juan", 13);
		carrera1.agregarAtleta("Mario", 17);
		
		carrera1.ganador();
		
	}
}
