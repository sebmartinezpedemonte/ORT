package ar.edu.ort.thp.tp3.ej13;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Item> coleccion1 = new ArrayList<>();
		
		coleccion1.add(new Item(new Fecha(1968, 4, 19), "Nacio Paco" ));
		coleccion1.add(new Item(new Fecha(1970, 1, 4), "Nacio Miguel" ));
		coleccion1.add(new Item(new Fecha(1973, 9, 25), "Nacio Analia" ));
		coleccion1.add(new Item(new Fecha(1980, 1, 5), "Nacio Julito" ));
		
		ArrayList<Item> coleccion2 = new ArrayList<>();
		coleccion2.add(new Item(new Fecha(1969, 7, 20), "Un gran paso para el hombre..."));
		coleccion2.add(new Item(new Fecha(1977, 9, 5), "Lanzamiento Voyager 1"));
		coleccion2.add(new Item(new Fecha(1985, 11, 20), "Se lanza el primer Windows"));
		coleccion2.add(new Item(new Fecha(2006, 3, 21), "Aparece Twitter"));

		ApareadorItems.listarOrdenado(coleccion1, coleccion2);
	}
}