package ar.edu.ort.thp.tp3.ej11;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(1, 7, 2021);
		Fecha fechaVencida = new Fecha(1, 6, 2021);
		
		Chef chef = new Chef();
		chef.almacenarProducto(new Producto("Garbanzos", 365, fecha), false);
		chef.almacenarProducto(new Producto("Carne", 10, fecha), true);
		chef.almacenarProducto(new Producto("Tomate", 10, fecha), true);
		chef.almacenarProducto(new Producto("Harina", 365, fecha), false);
		chef.almacenarProducto(new Producto("Huevos", 10, fecha), false);
		chef.almacenarProducto(new Producto("Leche", 2, fechaVencida), true);
		chef.almacenarProducto(new Producto("Leche", 2, fecha), true);
		
		chequear(chef, "Garbanzos", false);
		chequear(chef, "Carne", true);
		chequear(chef, "Tomate", true);
		chequear(chef, "Harina", false);
		chequear(chef, "Huevos", false);
		chequear(chef, "Leche", true);

		ArrayList<Producto> productosVencidos = chef.extraerProductosVencidos();
		System.out.println("Cantidad de productos vencidos: " + productosVencidos.size());
		listarVencidos(productosVencidos);	
	}

	private static void listarVencidos(ArrayList<Producto> productosVencidos) {
		for (Producto producto : productosVencidos) {
			System.out.println(producto);
		}
		
	}

	private static void chequear(Chef chef, String producto, boolean refrigerado) {
		System.out.println("Chequeando " + producto);
		System.out.println(chef.chequearProducto(producto, refrigerado));
	}
}
