package ejercicio09;

import java.util.ArrayList;

public class Receta {
	private int codigo;
	private String nombre;
	private ArrayList<Ingrediente> ingredientes;
	public Receta(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		ingredientes = new ArrayList<>();
	}
	
	public Ingrediente buscarIngrediente(String producto) {
		Ingrediente ingredienteBuscar = null;
		int i = 0;
		while(ingredientes.size() > i && ingredienteBuscar == null) {
			if(ingredientes.get(i).getProducto().equals(producto)) {
				ingredienteBuscar = ingredientes.get(i);
			}else {
				i++;
			}
		}		
		return ingredienteBuscar;
	}
	
	public Ingrediente agregarIngrediente(String producto, int cantidad, boolean esRefrigerado) {
		Ingrediente ingredienteAgregar = null;
		if(buscarIngrediente(producto) == null) {
			ingredienteAgregar = new Ingrediente(producto, cantidad, esRefrigerado);
			ingredientes.add(ingredienteAgregar);
		}		
		return ingredienteAgregar;
	}
	
	public void mostrar() {
		for(Ingrediente ingrediente : ingredientes) {
			System.out.println(ingrediente);
		}
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	
	
	
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	@Override
	public String toString() {
		return "Receta [codigo=" + codigo + ", nombre=" + nombre +"]";
	}
	
	
	
}
