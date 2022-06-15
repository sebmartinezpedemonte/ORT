package ar.edu.ort.thp.tp3.ej11;

import java.util.ArrayList;

public class Almacen {

	private ArrayList<Producto> productos;
	private double temperaturaInterna;
	private boolean refrigerado;

	public Almacen(boolean refrigerado, double temperatura) {
		productos = new ArrayList<Producto>();
		temperaturaInterna = temperatura;
		setRefrigerado(refrigerado);
	}

	public void almacenarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public Producto buscarProducto(String nombreProducto) {
		int i = 0;
		Producto producto;
		Producto productoEncontrado = null;

		while (i < productos.size() && productoEncontrado == null) {
			producto = productos.get(i);
			if (producto.getNombre().equals(nombreProducto)) {
				productoEncontrado = producto;
			} else {
				i++;
			}
		}
		return productoEncontrado;
	}

	/**
	 * Version mas completa de BuscarProducto porque puede ser que haya mas de
	 * una unidad de algun producto.
	 * 
	 * @param nombreProducto
	 * @return una coleccion con todas las instancias del producto.
	 */
	public ArrayList<Producto> buscarProductoRepetido(String nombreProducto) {
		ArrayList<Producto> productoBuscado = new ArrayList<>();
		for (Producto producto : productos) {
			if (producto.getNombre().equals(nombreProducto)) {
				productoBuscado.add(producto);
			}
		}
		return productoBuscado;
	}

	public ArrayList<Producto> extraerProductosVencidos() {
		ArrayList<Producto> productosVencidos = new ArrayList<Producto>();
		int i = 0;
		Producto producto;
		while (i < productos.size()) {
			producto = productos.get(i);
			if (producto.estaVencido()) {
				productosVencidos.add(producto);
				productos.remove(i);
			} else {
				i++;
			}
		}
		return productosVencidos;
	}

	public double getTemperaturaInterna() {
		return temperaturaInterna;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	private void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

}
