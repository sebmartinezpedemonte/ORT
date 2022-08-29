package ort.edu.tp1.trabajopractico2.ejercicio4;

public class Test {
	public static void main(String[] args) {
			
		Vivienda vivienda1 = new Vivienda("Montañeses", "1234", 4 , "C");
		Persona persona1 = new Persona("Arturo", "Roman", 53);
		vivienda1.agregarPersona("Monica", "Gaztambide", 35);
		vivienda1.agregarPersona(persona1);
		
		Mueble mueble1 = new Mueble("Mesa", "Madera", "Marron");
		vivienda1.agregarMueble(mueble1);
		vivienda1.agregarMueble("Mesada", "Marmol", "Rojo");
		vivienda1.agregarMueble("Perchero", "Metal", "Negro");
		vivienda1.agregarMueble("Sillon", "Cuero", "Azul");
		vivienda1.mostrarDatos();
		
	}
}
