package ejparcial1componentes;

public class Etiqueta extends Componente{
	
	private String fuente;

	public Etiqueta(String texto, String color, int ancho, int altura, int ejeX, int ejeY, boolean hablitado,
			String fuente) {
		super(texto, color, ancho, altura, ejeX, ejeY, hablitado);
		this.fuente = fuente;
	}

	//3 En el caso de una etiqueta: “Dibujando Etiqueta con el texto XXX con fuente XXX”   	
	@Override
	public void dibujar() {
		System.out.println("Dibujando una Etiqueta con el texto " + this.getTexto() + 
				" con fuente " + this.fuente);
		
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}
	
	
	
}
