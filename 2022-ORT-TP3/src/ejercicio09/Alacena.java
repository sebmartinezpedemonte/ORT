package ejercicio09;

import java.util.ArrayList;

public class Alacena {
	private String fabricante;
	private ArrayList<Producto> productos;
	public Alacena(String fabricante) {
		super();
		this.fabricante = fabricante;
		productos = new ArrayList<>();
	}
	
	private Producto buscarProducto(String nombre) {
		Producto productoBuscar = null;
		int i = 0;
		while(productos.size()>i && productoBuscar == null ) {
			if(productos.get(i).getNombre().equals(nombre)){
				productoBuscar = productos.get(i);
			}else {
				i++;
			}
		}		
		return productoBuscar;
	}
	
	public Producto agregar(String nombre, int cantidad,String fecha) {
		Producto producto = null;
		if(buscarProducto(nombre) == null) {
			producto = new Producto(nombre, cantidad, fecha);
			productos.add(producto);
		}
		System.out.println("Poniendo en la alacena " + nombre + " cantidad " + cantidad + " vencimiento " + fecha);
		return producto;
	}
	
	public void mostrar() {
		System.out.println("Alacena:");
		for(Producto producto : productos) {
			System.out.println(producto);
		}
	}
	
	public Ingrediente verificarStockProducto(String nombre, int cantidad) {
		Ingrediente ingrediente = new Ingrediente(nombre, cantidad, false);
		for(Producto producto : productos) {
			if(producto.getNombre().equals(nombre)) {
				ingrediente.setCantidad(ingrediente.getCantidad() - producto.getCantidad());
			}
		}		
		return ingrediente;
	}
	

	@Override
	public String toString() {
		return "Alacena [fabricante=" + fabricante + ", productos=" + productos + "]";
	}
	
	
	
}
