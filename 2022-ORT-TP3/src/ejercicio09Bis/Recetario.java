package ejercicio09Bis;

import java.util.ArrayList;

public class Recetario {
	private ArrayList<Receta> recetas;
	
	public Recetario() {
		recetas = new ArrayList<>();
	}
	
	
	public ArrayList<Ingrediente> prepararListadoAComprar(String nombreReceta, Heladera heladera, Alacena alacena, int cantidad){
		ArrayList<Ingrediente> ingredientes = new ArrayList<>();
		Ingrediente ingredienteFaltante;
		Receta receta = buscarReceta(nombreReceta);
		if(receta != null) {
			for(Ingrediente ingrediente : receta.getIngredientes()) {
				if(ingrediente.isEsRefrigerado()) {
					ingredienteFaltante = heladera.verificarStockProducto(ingrediente.getProducto(), ingrediente.getCantidad()*cantidad);
				}else {
					ingredienteFaltante = alacena.verificarStockProducto(ingrediente.getProducto(), ingrediente.getCantidad()*cantidad);

				}				
				if(ingredienteFaltante.getCantidad() > 0) {
					ingredientes.add(ingredienteFaltante);
				}
			}
		}
		
		return ingredientes;
	}
	
	public ArrayList<Receta> recetasPosiblesAPreparar(Heladera heladera, Alacena alacena, int cantidadPorciones){
		ArrayList<Receta> recetasPosibles = new ArrayList<>();
		for(Receta receta : recetas) {
			if(prepararListadoAComprar(receta.getNombre(), heladera, alacena, cantidadPorciones).size() == 0) {
				recetasPosibles.add(receta);
			}
		}
		return recetasPosibles;
	}
	
	
	public Receta buscarReceta(String nombre) {
		Receta recetaBuscar = null;
		int i = 0;
		while(recetas.size() > i && recetaBuscar == null) {
			if(recetas.get(i).getNombre().equals(nombre)) {
				recetaBuscar = recetas.get(i);
			}else {
				i++;
			}			
		}		
		return recetaBuscar;
	}
	
	
	
	public Receta buscarReceta(int codigo) {
		Receta recetaBuscar = null;
		int i = 0;
		while(recetas.size() > i && recetaBuscar == null) {
			if(recetas.get(i).getCodigo() == (codigo)) {
				recetaBuscar = recetas.get(i);
			}else {
				i++;
			}			
		}		
		return recetaBuscar;
	}
	

	
	public Receta agregarReceta(int codigo, String nombre) {
		Receta receta = null;
		if(buscarReceta(codigo) == null) {
			receta = new Receta(codigo, nombre);
			recetas.add(receta);
		}		
		return receta;
	}
	
	public Ingrediente agregarIngredienteAReceta( int codigo, int cantidad, boolean esRefrigerado, String producto ) {
		Ingrediente ingredienteAgregar = null;
		Receta receta = null;
		if(buscarReceta(codigo) != null) {
			receta = buscarReceta(codigo);
			receta.agregarIngrediente( producto, cantidad, esRefrigerado);
		}
		return ingredienteAgregar;
	}
	
	public void mostrar() {
		for(Receta receta : recetas) {
			System.out.println(receta);
			receta.mostrar();
			
		}
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Recetario [recetas=" + recetas + "]";
	}
	
}
