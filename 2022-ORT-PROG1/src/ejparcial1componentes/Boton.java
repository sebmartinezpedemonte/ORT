package ejparcial1componentes;

public class Boton extends Componente{

	public Boton(String texto, String color, int ancho, int altura, int ejeX, int ejeY, boolean hablitado) {
		super(texto, color, ancho, altura, ejeX, ejeY, hablitado);
	}

	/*
	 * 1.	En el caso de un botón: “Dibujando Botón con el texto: XXX con un alto de: XXXmm y ancho de: XXXmm”.
	 */
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando Boton con el texto " + this.getTexto() + " con un alto de: " 
				+ this.getAltura() + "mm y ancho de: " + this.getAncho() + "mm");
		
	}
	
	
}
