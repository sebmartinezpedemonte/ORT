package ejercicio09Bis;

import java.util.ArrayList;

public class Heladera {
	private String marca;
	private ArrayList<Producto> productos;
	public Heladera(String marca) {
		super();
		this.marca = marca;
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
	
	public Ingrediente verificarStockProducto(String nombre, int cantidad) {
		Ingrediente ingrediente = new Ingrediente(nombre, cantidad, true);
		for(Producto producto : productos) {
			if(producto.getNombre().equals(nombre) && !producto.getFechaVto().estaVencido()) {
				ingrediente.setCantidad(ingrediente.getCantidad() - producto.getCantidad());
			}
		}		
		return ingrediente;
	}
	
	public Producto agregar(String nombre, int cantidad, Fecha fecha) {
		Producto producto = null;
		if(buscarProducto(nombre) == null) {
			producto = new Producto(nombre, cantidad, fecha);
			productos.add(producto);
		}
		return producto;
	}

	public void mostrar() {
		for(Producto producto : productos) {
			System.out.println(producto);
		}
	}
	
	
	@Override
	public String toString() {
		return "Heladera [marca=" + marca + ", productos=" + productos + "]";
	}
	
	
}
