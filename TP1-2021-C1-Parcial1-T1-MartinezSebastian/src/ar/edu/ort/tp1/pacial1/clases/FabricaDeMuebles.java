package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable{
	// TODO A completar
	
	private ArrayList<Mueble> mueblesFabricados;
	private String nombre;

	public FabricaDeMuebles(String nombre) {
		this.mueblesFabricados = new ArrayList<>();
		this.nombre = nombre;
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;
		if(m !=null) {
			System.out.println("Fabricando el mueble: ");
			m.mostrar();
			retorno = this.mueblesFabricados.add(m);
		}
		return retorno;
	}

	public boolean seHaFabricado(String modelo) {
		boolean seHaFabricado = false;
		int i = 0;
		while(!seHaFabricado && this.mueblesFabricados.size() > i) {
			if(this.mueblesFabricados.get(i).modeloCorrecto(modelo)) {
				seHaFabricado = true;
			}else {
				i++;
			}
		}
		return seHaFabricado;
	}

	@Override
	public void mostrar() {
		//Fábrica de muebles: Súper Fábrica 2000
		//Se han fabricado: 4 Mesas, 3 Sillas y 5 Sillones
		//La venta total fue: $52115,34
		System.out.println("Fábrica de muebles: " + this.nombre);
		
		int mesas = 0;
		int sillas = 0;
		int sillones = 0;
		float importeTotal = 0;
		
		for(Mueble mueble : mueblesFabricados) {
			if(mueble instanceof Mesa) {
				mesas++;
			}else if(mueble instanceof Silla) {
				sillas++;
			}else {
				sillones++;
			}
			importeTotal += mueble.calcularPrecioVenta();
		}
		System.out.printf("Se han fabricado: %d Mesas, %d Sillas y %d Sillones", mesas, sillas, sillones);
		System.out.println();
		System.out.println("La venta total fue: $" + importeTotal);
		// TODO Auto-generated method stub
		
	}
}
