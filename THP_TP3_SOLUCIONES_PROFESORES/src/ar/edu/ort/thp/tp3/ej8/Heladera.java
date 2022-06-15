package ar.edu.ort.thp.tp3.ej8;

import java.util.ArrayList;

public class Heladera {
	private String marca;
	private ArrayList<Producto> productos;

	public Heladera(String marca) {
		setMarca(marca);
		productos = new ArrayList<>();
	}

	public void agregar(String nombre, int cantidad, Fecha fechaVencimiento) {
		productos.add(new Producto(nombre, cantidad, fechaVencimiento));
	}

	public String getMarca() {
		return marca;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void mostrar() {
		for (Producto producto : productos) {
			System.out.println(producto);
		}
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isEmpty())
			marca = "Sin marca";
		this.marca = marca;
	}

	public Ingrediente verificarStockProducto(String nombre, int cantidad) {
		Ingrediente ingrediente = new Ingrediente(nombre, cantidad, true);
		for (Producto producto : productos) {
			if (producto.getNombre().equals(nombre) && !producto.getFechaVencimiento().estaVencido()) {
				ingrediente.setCantidad(ingrediente.getCantidad() - producto.getCantidad());
			}
		}
		return ingrediente;
	}

}