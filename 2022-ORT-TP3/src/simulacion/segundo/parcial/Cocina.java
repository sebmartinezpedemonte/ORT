package simulacion.segundo.parcial;

import java.util.ArrayList;

public class Cocina {

	private Deposito refrigerados;
	private Deposito noRefrigerados;

	public Cocina() {
		refrigerados=new Deposito(TipoDeposito.REFRIGERADO);
		noRefrigerados=new Deposito(TipoDeposito.NO_REFRIGERADO);
	}

	public void almacenarProducto(Producto producto, boolean esRefrigerado) {
		if (esRefrigerado) {
			refrigerados.almacenarProducto(producto);
		} else {
			noRefrigerados.almacenarProducto(producto);
		}
	}

	public int extraerProducto(String nombreProducto, boolean esRefrigerado, int cantidadRequerida) {
		int extraido;
		if (esRefrigerado)
			extraido = refrigerados.extraerProducto(nombreProducto, cantidadRequerida);
		else
			extraido = noRefrigerados.extraerProducto(nombreProducto, cantidadRequerida);
		return extraido;
	}
	
	public ArrayList<Requerimiento> listaRequerimientos(){
		ArrayList<Requerimiento> requerimientos = new ArrayList<>();
		requerimientos.addAll(refrigerados.listaRequerimientos());
		requerimientos.addAll(noRefrigerados.listaRequerimientos());
		for(Requerimiento requerimiento : requerimientos) {
			System.out.println(requerimiento);
		}
		return requerimientos;
	}
	
	public void mostrarTodo() {
		refrigerados.mostrarTodo();
		System.out.println("*************************");
		noRefrigerados.mostrarTodo();
		
	}

	@Override
	public String toString() {
		return "Cocina [refrigerados=" + refrigerados + ", noRefrigerados=" + noRefrigerados + "]";
	}
	
}