package recuperatorio.fpr;

import java.util.ArrayList;



public class Aplicacion {
	
	private String nombre;
	private ArrayList<Negocio> negocios;
	private ArrayList<Articulo> articulosQueNecesitamos;
	
	
	public Aplicacion(String nombre) {
		setNombre(nombre);
		this.negocios = new ArrayList<>();
		this.articulosQueNecesitamos = new ArrayList<>();

	}
	
	public void cargarCosasAComprar(String nombre, int cantidad) {

		Articulo articuloBuscado = buscarArticulo(nombre);

		if (nombre != null && cantidad > 0 ) {
			
			if (articuloBuscado == null) {
				Articulo articulo = new Articulo (nombre,cantidad);
				articulosQueNecesitamos.add(articulo);			
				}else {
				System.out.println("El articulo" + nombre + " ya esta cargado en la lista y se sumara la nueva cantidad (" + cantidad + ") a la cantidad requerida anterior");
				articuloBuscado.actualizarCantidad(cantidad);
				}
			
		}	
	}
	
	
	private ArrayList<Articulo> realizarCompras() {
		
		ArrayList<Articulo> articulosComprados = new ArrayList<>();
		int i = 0;
		int j = 0;
		
		Articulo articuloMover = null;
		
		while(negocios.size() > i && articulosQueNecesitamos.size() >0) {
			while(articulosQueNecesitamos.size() >j) {
			if(negocios.get(i).venderArticulo(articulosQueNecesitamos.get(j))) {
				articuloMover = articulosQueNecesitamos.get(j);
				articulosComprados.add(articuloMover);
				articulosQueNecesitamos.remove(articuloMover);	
				
			}else {
				j++;				
			}
			}
			i++;
				
		}
		return articulosComprados;
	}

	public void salirDeCompras() {
		
		ArrayList<Articulo> articulosComprados;
		
		articulosComprados = this.realizarCompras();
		
		if(articulosComprados.size() > 0) {
			System.out.println("Articulos que se compraron");
			for (Articulo articulo : articulosComprados) {
				System.out.println(articulo.getNombre());
			}
		}else {
			System.out.println("No se compraron articulos");
		}
		
		if(articulosQueNecesitamos.size() > 0) {
			System.out.println("Articulos que no se consiguieron");
			for (Articulo articulo : articulosQueNecesitamos) {
				System.out.println(articulo.getNombre());
			}
		}else {
			System.out.println("Se compraron todos los articulos de la lista");
		}
			
	}
	
	private Articulo buscarArticulo (String nombre) {
		
		Articulo articuloBuscar = null;
		int pos = 0;
		
		while(pos < articulosQueNecesitamos.size() && articuloBuscar == null ) {
			if(articulosQueNecesitamos.get(pos).getNombre().equals(nombre)) {
				articuloBuscar = articulosQueNecesitamos.get(pos);
			}else {
				pos++;
			}
		}
		return articuloBuscar;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void agregarNegocio(Negocio negocio) {
		negocios.add(negocio);
	}

	@Override
	public String toString() {
		return "Aplicacion [nombre=" + nombre + ", negocios=" + negocios + ", articulosQueNecesitamos="
				+ articulosQueNecesitamos + "]";
	}
	
	
	
	
	

}
