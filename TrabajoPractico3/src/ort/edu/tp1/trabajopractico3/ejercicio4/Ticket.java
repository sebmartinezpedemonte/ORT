package ort.edu.tp1.trabajopractico3.ejercicio4;

import java.util.ArrayList;

public class Ticket implements Imprimible{
	
	private String fecha;
	private Cliente cliente;
	private ArrayList<Electrodomestico> electrodomesticosComprados;
	
	public Ticket(String fecha, Cliente cliente, ArrayList<Electrodomestico> electrodomesticosComprados) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
		this.electrodomesticosComprados = electrodomesticosComprados;
	}
	
	@Override
	public void imprimir() {
		if(electrodomesticosComprados.size()>0) {
		double total = 0;
		System.out.println("Ticket de venta");
		System.out.println("Articulos:");
		
		for(Electrodomestico elec : electrodomesticosComprados) {
			elec.imprimir();	
			total += elec.getPrecio();
		}
		
				
		System.out.println("Total: $" + total);
		System.out.println("Cliente: ");
		System.out.println("Cuil: " + cliente.getCuil());
		System.out.println("Nombre y apellido: " + cliente.getNombre() + " " + cliente.getApellido());
		System.out.println("Fecha: " + fecha);
		}
		
	}
	
	
	
}
