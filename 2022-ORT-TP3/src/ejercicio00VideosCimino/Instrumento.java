package ejercicio00VideosCimino;

public class Instrumento {
	private String ID;
	private double precio;
	private TipoInstrumento tipoInstrumento;
	public Instrumento(String iD, double precio, TipoInstrumento tipoInstrumento) {
		super();
		ID = iD;
		this.precio = precio;
		this.tipoInstrumento = tipoInstrumento;
	}
	public String getID() {
		return ID;
	}
	public double getPrecio() {
		return precio;
	}
	public TipoInstrumento getTipoInstrumento() {
		return tipoInstrumento;
	}
	@Override
	public String toString() {
		return "Instrumento [ID=" + ID + ", precio=" + precio + ", tipoInstrumento=" + tipoInstrumento + "]";
	}
	
	
}
