package ort.edu.p1.tp3.ej12;

import java.util.ArrayList;

public class Centro {
	
	private ArrayList<Dia> dias;
	
	public Centro() {
		this.dias = new ArrayList<>();
	}
	
	public double revisar() {
		double porcentajeAfuera = 0;
		int cantPersonasAfuera = 0;
		int totalPersonas= 0;
		for(Dia dia : dias) {
			totalPersonas += dia.getCantPersonas();
			if(!dia.alcanzanCantidadTests()) {
				cantPersonasAfuera += dia.revisar();
			}
		}
		if(totalPersonas >0) {
			porcentajeAfuera = (double)cantPersonasAfuera*100/totalPersonas;
		}
		return porcentajeAfuera;
	}
	
	public void mostrarDiaConMasPrioritarios() {
		Dia diaMasPrioritarios = null;
		int cantPrioritariosMax = 0;
		if(dias.size()>0) {
			for(Dia dia : dias) {
				if(dia.getCantPrioritarios() > cantPrioritariosMax) {
					cantPrioritariosMax = dia.getCantPrioritarios();
					diaMasPrioritarios = dia;
				}
			}
			System.out.println("fecha " + diaMasPrioritarios.getFecha() + " cant " + cantPrioritariosMax);
		}
	}
	
	public void agregarDia(Dia dia) {
		this.dias.add(dia);
	}
	
	
	
}
