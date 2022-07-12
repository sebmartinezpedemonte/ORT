package recuperatorio.fpr;

import java.util.ArrayList;

public class Negocio {
	
	private String nombre;
	private ArrayList<Articulo> articulos;
	
	public Negocio(String nombre) {
		setNombre(nombre);
		this.articulos = new ArrayList<>();
		

	}
	
	
	public boolean venderArticulo(Articulo articulo) {
		boolean sePudo = false;
		Articulo articuloVender = buscarArticulo(articulo.getNombre());
		
		if (articuloVender != null && articulo.getCantidad() <= articuloVender.getCantidad() ) {
			this.actualizarStock(articulo);
			sePudo = true;
		}
		return sePudo;
		
	}
	
	public void actualizarStock(Articulo articulo) {
		articulo.actualizarStock(articulo.getCantidad());
	}
	
private Articulo buscarArticulo (String nombre) {
		
		Articulo articuloBuscar = null;
		int pos = 0;
		
		while(pos < articulos.size() && articuloBuscar == null ) {
			if(articulos.get(pos).getNombre().equals(nombre)) {
				articuloBuscar = articulos.get(pos);
			}else {
				pos++;
			}
		}
		return articuloBuscar;
	}

	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Negocio [nombre=" + nombre + ", articulos=" + articulos + "]";
	}


}
