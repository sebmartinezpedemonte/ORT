package ort.edu.tp1.trabajopractico3.ejercicio3;

public class Licuadora extends Electrodomestico {
	
	private int potencia;
	private int cantVelocidades;
	public Licuadora(String marca, String modelo, int nroSerie, int voltaje, boolean estado, double precio,
			int potencia, int cantVelocidades) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}
	public int getPotencia() {
		return potencia;
	}
	public int getCantVelocidades() {
		return cantVelocidades;
	}

	@Override
	public String detalleCompleto() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Licuadora " + super.toString();
	}
	
	
}
