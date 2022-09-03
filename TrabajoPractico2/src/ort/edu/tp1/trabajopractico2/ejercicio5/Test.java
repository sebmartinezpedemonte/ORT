package ort.edu.tp1.trabajopractico2.ejercicio5;

public class Test {
	public static void main(String[] args) {
		Edificio edificio1 = new Edificio("Montañeses", "1234");	
		edificio1.agregarVivienda( 4 , "C");		
		Mueble mueble1 = new Mueble("Mesa", "Madera", "Marron");
		Persona persona1 = new Persona("Arturo", "Roman", 53);
		Persona persona2 = new Persona("Monica", "Gaztambide", 35);
		edificio1.agregarPersonaAViviendaPorPisoYDepartamento(4, "C", persona1);
		edificio1.agregarPersonaAViviendaPorPisoYDepartamento(4, "C", persona2);
		edificio1.agregarMuebleAViviendaPorNroVivienda(1, mueble1);
		//edificio1.agregarPersonaAViviendaPorNroVivienda(1, "Monica", "Gaztambide", 35);
			
		edificio1.agregarMuebleAViviendaPorNroVivienda(1, "Mesada", "Marmol", "Rojo");
		edificio1.agregarMuebleAViviendaPorPisoYDepartamento(4, "C", "Perchero", "Metal", "Negro");
		edificio1.agregarMuebleAViviendaPorPisoYDepartamento(4, "C","Sillon", "Cuero", "Azul");
		edificio1.mostrarViviendas();
		System.out.println();
		System.out.println();
		edificio1.agregarVivienda(2, "B");
		edificio1.realizarMudanza(4, "C", 2, "B");
		edificio1.mostrarViviendas();
		//edificio1.realizarMudanza(4, "C", 2, "B");
		//edificio1.mostrarViviendas();
		
		
	}
}
