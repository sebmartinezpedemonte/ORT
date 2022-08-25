package tp2.ej1;

public class Telefono {
	private int pais;
	private int caracteristicas;
	private int abonado;
	private TipoDeTelefono tipo;
	
	public Telefono(int pais, int caracteristicas, int abonado, TipoDeTelefono tipo) {
		this.pais = pais;
		this.caracteristicas = caracteristicas;
		this.abonado = abonado;
		this.tipo =tipo;
	}
	
	public String getValor() {
		//return "(+" + this.pais + ")" + this.caracteristicas + "-" +  this.abonado;
		//si fuesen String se usa %s
		return String.format("(+ %d ) %d-%d", this.pais, this.caracteristicas,this.abonado);
	}
	
	public String getTipo() {
		//
		return this.tipo.name();
	}
	
}
