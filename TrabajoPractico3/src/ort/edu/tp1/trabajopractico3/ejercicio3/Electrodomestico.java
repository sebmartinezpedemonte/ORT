package ort.edu.tp1.trabajopractico3.ejercicio3;

public abstract class Electrodomestico {
	
	private String marca;
	private String modelo;
	private int nroSerie;
	private int voltaje;
	private boolean estado;//encendido/apagado
	private double precio;
	
	public Electrodomestico(String marca, String modelo, int nroSerie, int voltaje, boolean estado, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nroSerie = nroSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getNroSerie() {
		return nroSerie;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public boolean isEstado() {
		return estado;
	}

	public double getPrecio() {
		return precio;
	}
	//con este metodo puedo conseguir el nombre de la clase pero preferi usar el toString() de las clases hijas
	public String getNombreClase() {
		return this.getClass().getSimpleName();
	}
	
	public abstract String detalleCompleto();
	
	@Override
	public String toString() {
		return ", " + marca + ", modelo " + modelo;
		//o solo este toString y noToString en las clases hijas
		//return this.getClass().getSimpleName() + ", " + marca + ", modelo " + modelo;
	}

	
	
	
	
	
}
