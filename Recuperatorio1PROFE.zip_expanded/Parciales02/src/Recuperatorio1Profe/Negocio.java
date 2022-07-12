package Recuperatorio1Profe;

import java.util.ArrayList;


public class Negocio {

	@SuppressWarnings("unused")
	private String nombre;
	private ArrayList<Articulo> articulosEnStock;
	
	public Negocio(String nombre) {
		
		setNombre(nombre);
		this.articulosEnStock = new ArrayList<>();
		
	}
	
	private Articulo buscarArticulo(String nombreArticulo) {
		int i = 0;
		Articulo articulo;
		Articulo articuloEncontrado = null;
		
		while(i < this.articulosEnStock.size() && articuloEncontrado == null) {
			articulo = this.articulosEnStock.get(i);
			if(articulo.getNombre().equals(nombreArticulo)) {
				articuloEncontrado = articulo;
				}else {
					i++;
				}
			
		}
		return articuloEncontrado;
		
		
	}
	
	
	public boolean venderArticulo(Articulo articuloAComprar) {
		Articulo articuloEnStock;
		boolean resultado = false;
		articuloEnStock = this.buscarArticulo(articuloAComprar.getNombre());
		
		if(articuloEnStock != null) {
			resultado = articuloEnStock.vender(articuloAComprar.getCantidad());	
		}
		return resultado;
		
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Negocio [nombre=" + nombre + ", articulosEnStock=" + articulosEnStock + "]";
	}

	public ArrayList<Articulo> getArticulosEnStock() {
		return articulosEnStock;
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarArticulo(Articulo articulo1) {
		articulosEnStock.add(articulo1);
		
	}


}
	

