package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

import java.util.ArrayList;

public class Puerto {
	private String nombre;
	private ArrayList<Amarra> amarras;

	public Puerto(String nombre) {		
		this.nombre = nombre;
		this.amarras = new ArrayList<>();
	}
	
	public void agregarAmarra(Amarra amarra) {
		amarras.add(amarra);
	}
	
	public int barcosConAlquilerMayorA(double alquiler) {
		int cant = 0;
		for(Amarra amarra : amarras) {			
			if(!amarra.isDisponible() && amarra.costoDeAlquiler() > alquiler) {
				cant++;
			}			
		}	
		
		return cant;
	}
	
	public EmbarcacionDeportiva barcoConMayorConsumo() {
		EmbarcacionDeportiva embDep = null;
		EmbarcacionDeportiva embDepMax = null;
		double consumoMax = 0;
		for(Amarra amarra : amarras) {			
			if(!amarra.isDisponible() && amarra.getBarco() instanceof EmbarcacionDeportiva ) {
				embDep =  (EmbarcacionDeportiva) amarra.getBarco();
				if(embDep.calcularConsumo() > consumoMax) {
					consumoMax = embDep.calcularConsumo();
					embDepMax =  embDep;
				}
			}
		}		
		return embDepMax;
	}
	
	
}
