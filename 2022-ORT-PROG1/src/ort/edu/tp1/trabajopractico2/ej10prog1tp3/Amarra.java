package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public class Amarra {
	private int nroAmarra;
	private String ubicacion;
	private boolean disponible;
	private Barco barco;
	
	public Amarra(int nroAmarra, String ubicacion) {
		super();
		this.nroAmarra = nroAmarra;
		this.ubicacion = ubicacion;
		this.disponible = true;		
		
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void alquilarAmarra(Barco barco) {
		if(this.disponible && barco!=null) {
		this.barco = barco;
		this.disponible = false;
		}
	}

	public Barco getBarco() {
		return barco;
	}
	
	public double costoDeAlquiler() {
		return barco.costoDeAlquiler();
	}

	
	
}
