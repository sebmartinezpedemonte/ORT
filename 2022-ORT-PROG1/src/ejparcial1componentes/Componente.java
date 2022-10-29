package ejparcial1componentes;

public abstract class Componente implements Dibujable{
	
	private String texto;
	private String color;
	private int ancho;
	private int altura;
	private int ejeX;
	private int ejeY;
	private boolean hablitado;
	
	public Componente(String texto, String color, int ancho, int altura, int ejeX, int ejeY, boolean hablitado) {
		super();
		this.texto = texto;
		this.color = color;
		this.ancho = ancho;
		this.altura = altura;
		this.ejeX = ejeX;
		this.ejeY = ejeY;
		this.hablitado = hablitado;
	}

	protected String getTexto() {
		return texto;
	}

	protected int getAncho() {
		return ancho;
	}

	protected int getAltura() {
		return altura;
	}
	/*
	 * Dibujando Campo de Texto XXX que tiene el cursor ZZZ 
	 * (donde XXX puede ser “multitexto” o “simple” y ZZZ “activado” o “desactivado”)
	 */
	
	protected String estaHabilitado() {
		return this.hablitado ? "activado" : "desactivado";
	}
	
}
