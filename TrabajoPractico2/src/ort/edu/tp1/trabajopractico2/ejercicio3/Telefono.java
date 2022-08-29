package ort.edu.tp1.trabajopractico2.ejercicio3;

public class Telefono {
	private String pais;
	private String caracteristicas;
	private String abonado;
	private TipoDeTelefono tipo;
	//uso String para los numeros de los telefonos porque sino no muestra el cero

	public Telefono(String pais, String caracteristicas, String abonado, TipoDeTelefono tipo) {
		this.pais = pais;
		this.caracteristicas = caracteristicas;
		this.abonado = abonado;
		this.tipo =tipo;
	}
	
	public String getValor() {
		//return "(+" + this.pais + ")" + this.caracteristicas + "-" +  this.abonado;
		//si fuesen String se usa %s
		return String.format("(+%s) %s-%s", this.pais, this.caracteristicas,this.abonado);
	}
	
	public String getTipo() {
		//
		return this.tipo.name();
	}
	public String getTipoFormatoString() {
		//
		return this.tipo.getFormatoString();
	}
	
}
