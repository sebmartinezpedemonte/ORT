package ar.edu.ort.thp.tp3.ej8;

import java.util.ArrayList;

public class Test {
	private static Heladera heladera;
	private static Alacena alacena;
	private static Recetario recetario;

	public static void main(String[] args) {
		heladera = new Heladera("Samsung");
		alacena = new Alacena ( "Tommy" );

		recetario = new Recetario();
		
		ponerEnHeladera("Banana", 2, new Fecha(10,6,2021));
		ponerEnHeladera("Leche", 50, new Fecha(15,6,2021));
		ponerEnHeladera("Leche", 100, new Fecha(15,8,2021));
		ponerEnHeladera("Leche", 250, new Fecha(15,9,2021));
		
		ponerEnAlacena("Azucar", 10, new Fecha(1,10,2022));
		ponerEnAlacena("Azucar", 40, new Fecha(1,11,2022));
		
		agregarReceta(1, "Licuado de banana");
		agregarIngrediente (1, 1, true, "Banana");
		agregarIngrediente (1, 200, true, "Leche");
		agregarIngrediente (1, 50, false, "Azucar");
		
		mostrarHeladera();
		mostrarAlacena();
		mostrarRecetario();
		
		probarPrepararListadoAComprar("Licuado de banana", 1);
		recetasPosiblesAPreparar(1);
	}
	
	private static void agregarIngrediente ( int codigo, int cantidad, boolean esRefrigerado, String producto ) {
		System.out.println("Agregando en la receta c�digo " + codigo + " cantidad " + cantidad + " regrigerado " + esRefrigerado 
				+ " producto " + producto);
		recetario.agregarIngredienteAReceta(codigo, cantidad, esRefrigerado, producto);
	}
	
	private static void agregarReceta ( int codigo, String nombre ) {
		System.out.println("Agregando receta codigo " + codigo + " nobre " + nombre);
		recetario.agregarReceta(codigo, nombre);
	}
	
	private static void mostrarAlacena() {
		System.out.println("Alacena:");
		alacena.mostrar();
	}
	
	private static void mostrarHeladera() {
		System.out.println("Heladera:");
		heladera.mostrar();
	}
	
	private static void mostrarRecetario() {
		System.out.println("Recetas:");
		recetario.mostrar();
	}
	
	private static void ponerEnAlacena(String nombre, int cantidad, Fecha fechaVencimiento) {
		System.out.println("Poniendo en la alacena " + nombre + " cantidad " + cantidad + " vencimiento " + fechaVencimiento);
		alacena.agregar(nombre, cantidad, fechaVencimiento);
	}
	
	private static void ponerEnHeladera(String nombre, int cantidad, Fecha fechaVencimiento) {
		System.out.println("Poniendo en la heladera " + nombre + " cantidad " + cantidad + " vencimiento " + fechaVencimiento);
		heladera.agregar(nombre, cantidad, fechaVencimiento);
	}
	
	private static void probarPrepararListadoAComprar (String nombreRecetaACocinar, int cantidad) {
		System.out.println("Listado a comprar");
		ArrayList<Ingrediente> ingredientes = recetario.prepararListadoAComprar(nombreRecetaACocinar, heladera, alacena, cantidad);
		for (Ingrediente ingrediente: ingredientes) {
			System.out.println(ingrediente);
		}
	}
	
	private static void recetasPosiblesAPreparar (int cantidad) {
		System.out.println("Listado de recetas posibles a realizar");
		ArrayList<Receta> recetas = recetario.recetasPosiblesAPreparar(heladera, alacena, cantidad);
		for (Receta receta: recetas) {
			System.out.println(receta);
		}
	}

}
