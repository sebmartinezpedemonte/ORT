package recu1.clases;

import java.util.ArrayList;

public class VoyDeCompras {

	private ArrayList<Articulo> articulosAComprar;
	private ArrayList<Negocio> negocios;

	public VoyDeCompras() {
		articulosAComprar = new ArrayList<Articulo>();
		negocios = new ArrayList<Negocio>();
		// metodo para que funcione el programa
		cargarNegocios();
	}

	private void cargarNegocios() {
		// carga automatica del negocio que simula la conexion a la nube
		Negocio negocio = new Negocio("La Res Puesta",Rubro.CARNICERIA); // Carniceria
		negocio.comprarArticulo(new Articulo(Rubro.CARNICERIA,"carne picada", 50));
		negocio.comprarArticulo(new Articulo(Rubro.CARNICERIA,"asado", 150));
		negocios.add(negocio);
		negocio = new Negocio("No Lo hagas, Vega!",Rubro.VERDULERIA); // Verduleria
		negocio.comprarArticulo(new Articulo(Rubro.VERDULERIA,"cebolla de verdeo", 10));
		negocio.comprarArticulo(new Articulo(Rubro.VERDULERIA,"papas", 100));
		negocios.add(negocio);
		negocio = new Negocio("Ali-Macen",Rubro.ALMACEN); // Almacen
		negocio.comprarArticulo(new Articulo(Rubro.ALMACEN,"queso rallado", .5));
		negocio.comprarArticulo(new Articulo(Rubro.ALMACEN,"fosforos", 10));
		negocios.add(negocio);
	}

	private Articulo buscarArticulo(String nombreArticulo) {
		Articulo articulo = null;
		int pos = 0;
		while (pos < articulosAComprar.size() && !articulosAComprar.get(pos).getNombre().equals(nombreArticulo)) {
			pos++;
		}
		if (pos < articulosAComprar.size())
			articulo = articulosAComprar.get(pos);
		return articulo;
	}

	public void cargarCosasAComprar(Rubro rubro, String nombreArticulo, double cantidad) {
		Articulo articulo;
		articulo = buscarArticulo(nombreArticulo);
		if (articulo != null) {
			System.out.println("Este producto (" + nombreArticulo + ") ya estaba cargado");
			articulo.agregar(cantidad);
			System.out.println("La cantidad ingresada (" + cantidad + ") se suma a la anterior. (Queda en " + articulo.getCantidad() +")");
		} else {
			articulosAComprar.add(new Articulo(rubro,nombreArticulo, cantidad));
		}
	}

	private void mostrarArticulos(String mensaje, ArrayList<Articulo> articulos) {
		System.out.println(mensaje);
		if (articulos.isEmpty()) {
			System.out.println("Ninguno!");
		} else
			for (Articulo articulo : articulos) {
				System.out.println(articulo);
			}
	}

	private void realizarCompraEnNegocio(Negocio negocio, ArrayList<Articulo> articulosComprados) {
		int i = 0;
		Articulo articuloAComprar;
		while (i < articulosAComprar.size()) {
			articuloAComprar = articulosAComprar.get(i);
			if (negocio.venderArticulo(articuloAComprar)) {
				articulosComprados.add(articulosAComprar.remove(i));
			} else {
				i++;
			}
		}

	}

	private ArrayList<Articulo> realizarCompras() {
		ArrayList<Articulo> articulosComprados = new ArrayList<Articulo>();
		int i = 0;
		while (i < negocios.size() && !articulosAComprar.isEmpty()) {
			realizarCompraEnNegocio(negocios.get(i), articulosComprados);
			i++;
		}
		return articulosComprados;
	}

	public void salirDeCompras() {
		mostrarArticulosComprados("Articulos Comprados", realizarCompras());
		mostrarArticulos("Articulos Sin Comprar", articulosAComprar);
	}
	private void mostrarArticulosComprados(String mensaje, ArrayList<Articulo>articulos) {
		System.out.println(mensaje);
		if(articulos.isEmpty()){
			System.out.println("Ninguno!");
		}else {
			for (Articulo articulo : articulos) {
				System.out.println(articulo.getRubro() + " " + buscarNombreNegocio(articulo.getRubro()) + " - " + articulo.getNombre() + " (" + articulo.getCantidad() + ")");
		
			}
		}
	}
	
	private String buscarNombreNegocio (Rubro rubro) {
		int i = 0;
		String respuesta = null;
		
		
		while(i < negocios.size() && respuesta == null) {
			
			if(negocios.get(i).getRubro().equals(rubro)) {
				respuesta = negocios.get(i).getNombre();
			}else {
				i++;
			}
		}
		return respuesta;
	}

}
