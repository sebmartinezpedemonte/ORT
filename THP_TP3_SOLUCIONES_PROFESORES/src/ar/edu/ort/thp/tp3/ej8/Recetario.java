package ar.edu.ort.thp.tp3.ej8;

import java.util.ArrayList;

public class Recetario {
	private ArrayList<Receta> recetas;

	public Recetario() {
		recetas = new ArrayList<>();
	}

	public void agregarReceta(int codigo, String nombre) {
		recetas.add(new Receta(codigo, nombre));
	}

	private Receta buscarReceta(int codigo) {
		Receta receta = null;
		int index = 0;
		while (receta == null && index < recetas.size()) {
			if (recetas.get(index).getCodigo() == codigo) {
				receta = recetas.get(index);
			} else {
				index++;
			}
		}
		return receta;
	}

	private Receta buscarReceta(String nombre) {
		Receta receta = null;
		int index = 0;
		while (receta == null && index < recetas.size()) {
			if (recetas.get(index).getNombre().equals(nombre)) {
				receta = recetas.get(index);
			} else {
				index++;
			}
		}
		return receta;
	}

	public void agregarIngredienteAReceta(int codigo, int cantidad, boolean esRefrigerado, String producto) {
		Receta receta = buscarReceta(codigo);
		if (receta != null) {
			receta.agregarIngrediente(producto, cantidad, esRefrigerado);
		}
	}

	public void mostrar() {
		for (Receta receta : recetas) {
			System.out.println(receta);
			receta.mostrar();
		}
	}

	public ArrayList<Ingrediente> prepararListadoAComprar(String nombreRecetaACocinar, Heladera heladera,
			Alacena alacena, int cantidad) {
		ArrayList<Ingrediente> ingredientes = new ArrayList<>();
		Ingrediente ingredienteFaltante;
		Receta receta = buscarReceta(nombreRecetaACocinar);
		if (receta != null) {
			for (Ingrediente ingrediente : receta.getIngredientes()) {
				if (ingrediente.isEsRefrigerado()) {
					ingredienteFaltante = heladera.verificarStockProducto(ingrediente.getProducto(),
							ingrediente.getCantidad() * cantidad);
				} else {
					ingredienteFaltante = alacena.verificarStockProducto(ingrediente.getProducto(),
							ingrediente.getCantidad() * cantidad);
				}
				if (ingredienteFaltante.getCantidad() > 0) {
					ingredientes.add(ingredienteFaltante);
				}
			}
		}
		return ingredientes;
	}

	public ArrayList<Receta> recetasPosiblesAPreparar(Heladera heladera, Alacena alacena, int cantidad) {
		ArrayList<Receta> recetasPosibles = new ArrayList<>();
		for (Receta receta : recetas) {
			if (prepararListadoAComprar(receta.getNombre(), heladera, alacena, cantidad).size() == 0) {
				recetasPosibles.add(receta);
			}
		}
		return recetasPosibles;
	}

}