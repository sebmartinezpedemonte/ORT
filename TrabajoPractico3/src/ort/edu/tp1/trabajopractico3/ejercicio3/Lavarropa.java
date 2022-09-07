package ort.edu.tp1.trabajopractico3.ejercicio3;

public class Lavarropa extends Electrodomestico{
	
	private int cargaMaxima;
	private TipoLavarropas tipo; //Automatico o semiautomico
	//o private boolean esAutomatico;
	public Lavarropa(String marca, String modelo, int nroSerie, int voltaje, boolean estado, double precio,
			int cargaMaxima, TipoLavarropas tipo) {
		super(marca, modelo, nroSerie, voltaje, estado, precio);
		this.cargaMaxima = cargaMaxima;
		this.tipo = tipo;
	}
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	public TipoLavarropas getTipo() {
		return tipo;
	}


	//Lavarropas Drean semi automático, carga máxima 6kg, modelo CONCEPT 5.05: $6799.
	@Override
	public String detalleCompleto() {
		return "Lavarropas " + super.getMarca() + " " +  tipo.getnombreTipo() + ", carga maxima " 
				+ cargaMaxima + "kg, modelo " + super.getModelo() + ": $" + super.getPrecio() +".";
	}
	@Override
	public String toString() {
		return "Lavarropa " + super.toString();
	}
	
	
}
