package ar.edu.ort.thp.tp3.ej8;

import java.util.ArrayList;

public class Alacena {
	private String fabricante;
	private ArrayList<Producto> productos;

	public Alacena(String fabricante) {
		setFabricante(fabricante);
		productos = new ArrayList<>();
	}

	public void agregar(String nombre, int cantidad, Fecha fechaVencimiento) {
		productos.add(new Producto(nombre, cantidad, fechaVencimiento));
	}

	public String getFabricante() {
		return fabricante;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void mostrar() {
		for (Producto producto : productos) {
			System.out.println(producto);
		}
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Ingrediente verificarStockProducto(String nombre, int cantidad) {
		Ingrediente ingrediente = new Ingrediente(nombre, cantidad, true);
		for (Producto producto : productos) {
			if (producto.getNombre().equals(nombre)) {
				ingrediente.setCantidad(ingrediente.getCantidad() - producto.getCantidad());
			}
		}
		return ingrediente;
	}
}