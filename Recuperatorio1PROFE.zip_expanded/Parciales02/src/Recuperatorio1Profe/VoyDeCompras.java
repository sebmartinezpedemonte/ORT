package Recuperatorio1Profe;

import java.util.ArrayList;


public class VoyDeCompras {
	
	private ArrayList<Negocio> negocios ;
	private ArrayList<Articulo> articulosAComprar ;
	
	
	public VoyDeCompras() {
		this.negocios = new ArrayList<>();
		this.articulosAComprar = new ArrayList<>();

	}
	
	public void cargarCosasAComprar(String nombreArticulo, double cantidad) {
		Articulo articulo;
		articulo = this.buscarArticulo(nombreArticulo);
		
		if(articulo != null) {
			
		System.out.println("Este producto (" + nombreArticulo + ") ya estaba cargado");
		articulo.actualizarCantidad(cantidad);
		System.out.println("La cantidad ingresada (" + cantidad + ") se suma a la anterior. (Queda en " + articulo.getCantidad() +")");
		}else {
			this.articulosAComprar.add(new Articulo(nombreArticulo, cantidad));
		}
		
	}
	
	public void salirDeCompras() {
		ArrayList<Articulo> articulosComprados;
		articulosComprados = this.realizarCompras();
		this.mostrarArticulos(articulosComprados, "Articulos Comprados");
		this.mostrarArticulos(this.articulosAComprar, "Articulos Sin Comprar");
		
	}
	
	private void realizarCompraEnNegocio(Negocio negocio, ArrayList<Articulo> articulosComprados) {
		int i = 0;
		Articulo articuloAComprar;
		
		while(i < this.articulosAComprar.size()) {
			articuloAComprar = this.articulosAComprar.get(i);
			if(negocio.venderArticulo(articuloAComprar)) {
				articulosComprados.add(this.articulosAComprar.remove(i));
			}else {
				i++;
			}
		}	
		
	}
	
	
	private ArrayList<Articulo> realizarCompras(){
		ArrayList<Articulo> articulosComprados = new ArrayList<Articulo>();
		int i = 0;
		Negocio negocio;
		
		while(i < this.negocios.size() && !this.articulosAComprar.isEmpty()) {
			negocio = this.negocios.get(i);
			this.realizarCompraEnNegocio(negocio, articulosComprados);
			i++;
		}
		return articulosComprados;
		
	}
	
	public void mostrarArticulos(ArrayList<Articulo> articulos, String mensaje) {
		System.out.println(mensaje);;
		for (Articulo articulo: articulos) {
			System.out.println(articulo);
		}
	}
	
	private Articulo buscarArticulo(String nombreArticulo) {
		int i = 0;
		Articulo articulo;
		Articulo articuloEncontrado = null;
		
		while(i < this.articulosAComprar.size() && articuloEncontrado == null) {
			articulo = this.articulosAComprar.get(i);
			if(articulo.getNombre().equals(nombreArticulo)) {
				articuloEncontrado = articulo;
			}else {
				i++;
			}
		}
		return articuloEncontrado;
		
	}

	@Override
	public String toString() {
		return "VoyDeCompras [negocios=" + negocios + ", articulosAComprar=" + articulosAComprar + "]";
	}

	public void agregarNegocio(Negocio negocio1) {
		negocios.add(negocio1);
		
	}
	

}
