package ejparcial1componentes;

public class CampoDeTexto extends Componente{

	private boolean multitexto; //es un String o boolean?
	private boolean cursorSituado; 

	public CampoDeTexto(String texto, String color, int ancho, int altura, int ejeX, int ejeY, boolean hablitado,
			boolean multitexto, boolean cursorSituado) {
		super(texto, color, ancho, altura, ejeX, ejeY, hablitado);
		this.multitexto = multitexto;
		this.cursorSituado = cursorSituado;
	}

	protected void situarCursor() {
		if(!cursorSituado) {
			cursorSituado = true;
		}
	}
	
	protected boolean isCursorSituado() {
		return cursorSituado;
	}

	/*
	 * 2 En el caso de un campo de texto: Dibujando Campo de Texto XXX que tiene el cursor ZZZ 
	 * (donde XXX puede ser “multitexto” o “simple” y ZZZ “activado” o “desactivado”)
	 */
	private String esMultitexto() {
		return this.multitexto? "multitexto" : "simple";
	}
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando Campo de Texto "+ this.esMultitexto() +" que tiene el cursor " + this.estaHabilitado());
		
	}
	
	
}
