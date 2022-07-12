package ar.edu.ort.thp.p2.sim;

public class Test {
	
	private static Cocina cocina;

	public static void main(String[] args) {
		
		cocina = new Cocina();
		cocina.almacenarProducto(new Producto("Garbanzos", 20, 5), false);
		cocina.almacenarProducto(new Producto("Carne", 100, 20), true);
		cocina.almacenarProducto(new Producto("Tomate", 10, 6), false);
		cocina.almacenarProducto(new Producto("Harina", 20, 10), false);
		cocina.almacenarProducto(new Producto("Harina", 80, 50), false);
		cocina.almacenarProducto(new Producto("Huevos", 60, 12), false);
		cocina.almacenarProducto(new Producto("Leche", 100, 10), true);

		extraerProducto("Tomate", false, 8);
		extraerProducto("Tomate", false, 8);
		extraerProducto("Harina", false, 60);
		extraerProducto("Leche", true, 50);
		extraerProducto("Espinaca", false, 4);
		
		//Al extraer mas pasa algo que no entiendo: 
		//no entiendo por que usando el while (en el metodo borrarListaProductosVacios()) 
		//se borran estos productos cuando estan en cero
		//pero no todos los productos se borran cuando uso el for,
		//y con el for each directamente se rompe/no anda
		
		//extraerProducto("Leche", true, 50);
		//extraerProducto("Carne", true, 20);
		//extraerProducto("Harina", false, 60);
		cocina.listaRequerimientos();
		cocina.mostrarTodo();

	}

	private static void extraerProducto(String nombreProducto, boolean esRefrigerado, int cantidadRequerida) {
		int extraido = cocina.extraerProducto(nombreProducto, esRefrigerado, cantidadRequerida);
		System.out.println("Se pidio: " + cantidadRequerida + " de " + nombreProducto + ", se extrajo: " + extraido);
	}

}
