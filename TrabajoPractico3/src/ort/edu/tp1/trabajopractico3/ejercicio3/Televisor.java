package ort.edu.tp1.trabajopractico3.ejercicio3;

public class Televisor extends Electrodomestico{
	
	private int dimension;
	private TipoTelevisor tipo;
	
	public Televisor(String marca, String modelo, int nroSerie, int voltaje, boolean estado, double precio,
			int dimension, TipoTelevisor tipo) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.dimension = dimension;
		this.tipo = tipo;
	}

	public int getDimension() {
		return dimension;
	}

	public TipoTelevisor getTipo() {
		return tipo;
	}


	//Televisor smart Philips 49 pulgadas, modelo 49PGFS: $14370.
	@Override
	public String detalleCompleto() {
		// TODO Auto-generated method stub
		return "Televisor " + tipo.getNombreTipo() + " " + super.getMarca() + " " + dimension
				+" pulgadas, modelo " + super.getModelo() + ": $" + super.getPrecio()+".";
	}

	@Override
	public String toString() {
		return "Televisor " + super.toString();
	}


	
	
	
}
