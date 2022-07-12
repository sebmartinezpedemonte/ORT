package recu1.clases;

import java.util.ArrayList;

public class Negocio {

	private ArrayList<Articulo> articulosEnStock;
	private String nombre;
	private Rubro rubro;

	public Negocio(String nombre, Rubro rubro) {
		this.nombre = nombre;
		this.rubro = rubro;
		articulosEnStock = new ArrayList<Articulo>();
	}

	private Articulo buscarArticulo(String nombreArticulo) {
		Articulo articulo = null;
		int pos = 0;
		while (pos < articulosEnStock.size() && !articulosEnStock.get(pos).getNombre().equals(nombreArticulo)) {
			pos++;
		}
		if (pos < articulosEnStock.size())
			articulo = articulosEnStock.get(pos);
		return articulo;
	} 

	public void comprarArticulo(Articulo articulo) {
		Articulo articuloEnStock = buscarArticulo(articulo.getNombre());
		if (articuloEnStock != null) {
			articuloEnStock.agregar(articulo.getCantidad());
		} else {
			articulosEnStock.add(articulo);
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public boolean venderArticulo(Articulo articuloAComprar) {
		boolean resultado = false;
		Articulo articuloEnStock = buscarArticulo(articuloAComprar.getNombre());
		if (articuloEnStock != null) {
			resultado = articuloEnStock.retirarSiAlcanza(articuloAComprar.getCantidad());
		}
		return resultado;
	}
	
	public Rubro getRubro() {
		return rubro;
	}
	

	@Override
	public String toString() {
		return "Negocio [articulosEnStock=" + articulosEnStock + ", nombre=" + nombre + ", rubro=" + rubro + "]";
	}
	
}