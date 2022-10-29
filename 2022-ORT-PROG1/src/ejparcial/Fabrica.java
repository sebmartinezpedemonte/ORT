package ejparcial;

import java.util.ArrayList;

public class Fabrica {
	private ArrayList<Producto> productos;
	
	public Fabrica() {
		this.productos = new ArrayList<>();
	}
	
	public void agregarProductos(Producto prod) {
		this.productos.add(prod);
	}
	
	public void mostrarBuenos() {
		for(Producto prod : productos) {
			if(prod.esBueno()) {
				System.out.println(prod.toString());
				
			}
		}
	}
	
	public double promedioKmsHastaMantenimiento() {
		double promedioKms = 0;
		int cantKmsTotales = 0;
		int cantVehiculos = 0;
		for(Producto prod : productos){
			if(prod instanceof Vehiculo) {
				cantKmsTotales += ((Vehiculo)prod).getCantKms();
				cantVehiculos++;
			}
		}
		promedioKms = (double)cantKmsTotales / cantVehiculos;
		
		return promedioKms;
	}
}
