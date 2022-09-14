package ort.edu.tp1.trabajopractico3.ejercicio4;

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
	
	public String getStringTipoLavarropas() {
		return tipo.getnombreTipo();
	}
	//preguntar como hacer esto, no me sirve getClass().getCanonicalName()
	//se hace con getClass().getSimplelName()
	/*@Override
	public String getNombreClase() {
		return "Lavarropas";
	}
	*/
	//Lavarropas Drean semi automático, carga máxima 6kg, modelo CONCEPT 5.05: $6799.
	
	@Override
	public String detalleCompleto() {
		return "Lavarropas " + super.getMarca() + " " +  tipo.getnombreTipo() + ", carga maxima " 
				+ cargaMaxima + "kg, modelo " + super.getModelo() + ": $" + super.getPrecio() +".";
	}

	@Override
	public void imprimir() {
System.out.println("Lavarropas " + super.getMarca() + " " +  tipo.getnombreTipo() + ", carga maxima " 
				+ cargaMaxima + "kg, modelo " + super.getModelo() + ": $" + super.getPrecio() +".");		
	}
}
