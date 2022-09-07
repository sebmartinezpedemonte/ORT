package ort.edu.tp1.trabajopractico3.ejercicio4;

public class Heladera extends Electrodomestico{
	
	private int capacidad;
	private TipoHeladera tipo;
	public Heladera(String marca, String modelo, int nroSerie, int voltaje, boolean estado, double precio,
			int capacidad, TipoHeladera tipo) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.capacidad = capacidad;
		this.tipo = tipo;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public TipoHeladera getTipoHeladera() {
		return tipo;
	}

	
	//Heladera Whirlpool, modelo H2745, no frost, capacidad 250 litros: $14999.
	
	@Override
	public String detalleCompleto() {
		return "Heladera " + super.getMarca() + ", modelo" + super.getModelo() + ", " +  tipo.getNombreTipo()
		+ ", capacidad " + capacidad + " litros: $" + super.getPrecio() +"." ;
	}
	
	@Override
	public void imprimir() {
		System.out.println(	 "Heladera " + super.getMarca() + ", modelo" + super.getModelo() + ", " +  tipo.getNombreTipo()
		+ ", capacidad " + capacidad + " litros: $" + super.getPrecio() +".");		
	}
	@Override
	public String toString() {
		return "Heladera " + super.toString();
	}
	
	
}
