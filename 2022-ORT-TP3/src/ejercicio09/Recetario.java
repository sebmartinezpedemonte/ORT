package ejercicio09;

import java.util.ArrayList;

public class Recetario {
	private ArrayList<Receta> recetas;
	
	public Recetario() {
		recetas = new ArrayList<>();
	}
	
	
	public ArrayList<Ingrediente> prepararListadoAComprar(String nombreReceta, Heladera heladera, Alacena alacena, int cantidad){
		ArrayList<Ingrediente> ingredientesFaltantes = new ArrayList<>();
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
					ingredientesFaltantes.add(ingredienteFaltante);
				}
			}
		}
		if(ingredientesFaltantes.size() > 0) {
		System.out.println("Ingredientes faltantes : ");
		for (Ingrediente ingrediente: ingredientesFaltantes) {
			System.out.println("Ingrediente faltante " + ingrediente);
		}
		}else {
			System.out.println("No hace falta comprar ingredientes");
		}
		
		return ingredientesFaltantes;
	}
	
	
	
	public ArrayList<Receta> recetasPosiblesAPreparar(Heladera heladera, Alacena alacena, int cantidadPorciones){
		ArrayList<Receta> recetasPosibles = new ArrayList<>();
		for(Receta receta : recetas) {
			if(prepararListadoAComprar(receta.getNombre(), heladera, alacena, cantidadPorciones).size() == 0) {
				recetasPosibles.add(receta);
			}
		}
		System.out.println("Listado de recetas posibles a realizar");
		for(Receta receta : recetasPosibles) {
			System.out.println(receta);
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
		System.out.println("Agregando receta codigo " + codigo + " nombre " + nombre);
		return receta;
	}
	
	public Ingrediente agregarIngredienteAReceta( int codigo, int cantidad, boolean esRefrigerado, String producto ) {
		Ingrediente ingredienteAgregar = null;
		Receta receta = null;
		if(buscarReceta(codigo) != null) {
			receta = buscarReceta(codigo);
			receta.agregarIngrediente( producto, cantidad, esRefrigerado);
		}
		System.out.println("Agregando en la receta codigo " + codigo + " cantidad " + cantidad + " regrigerado " + esRefrigerado 
				+ " producto " + producto);
		return ingredienteAgregar;
	}
	
	public void mostrar() {
		System.out.println("Recetas:");
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
