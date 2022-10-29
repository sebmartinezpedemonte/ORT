package ejparcial1componentes;

public class VentanaDeError extends Ventana{
	
	private Etiqueta etiqueta;
	private Boton boton;
	
	
	//D)	Un constructor con parámetros para la VentanaDeError que permita ingresar el texto de error.
	//Ventana de Error: es una ventana con las mismas características y comportamiento que una 
	//Ventana pero que ya tiene una etiqueta que mostrará un mensaje de error y un botón con el texto “Aceptar”.
	
	/*
	public VentanaDeError(String texto, String color, int ancho, int altura, int ejeX, int ejeY, boolean hablitado,
			Estado estado, String textoErrorEtiqueta, String colorEtiqueta, int anchoEtiqueta, int alturaEtiqueta, int ejeXEtiqueta, int ejeYEtiqueta, boolean hablitadoEtiqueta, String fuenteEtiqueta,
			String textoBoton, String colorBoton, int anchoBoton, int alturaBoton, int ejeXBoton, int ejeYBoton, boolean hablitadoBoton) {
		super(texto, color, ancho, altura, ejeX, ejeY, hablitado, estado);
		this.etiqueta = new Etiqueta(textoErrorEtiqueta, colorEtiqueta, anchoEtiqueta, alturaEtiqueta, ejeXEtiqueta, ejeYEtiqueta, hablitadoEtiqueta, fuenteEtiqueta);
		this.boton = new Boton("Aceptar", colorBoton, anchoBoton, alturaBoton, ejeXBoton, ejeYBoton, hablitadoBoton);
	}
*/

	public VentanaDeError(String texto, String color, int ancho, int altura, int ejeX, int ejeY, boolean hablitado,
			Estado estado, String fuente, String textoError) {
		super(texto, color, ancho, altura, ejeX, ejeY, hablitado, estado);
		this.etiqueta = new Etiqueta(textoError, color, ancho, altura, ejeX, ejeY, hablitado, fuente);
		this.boton = new Boton(texto, color, ancho, altura, ejeX, ejeY, hablitado);
		this.agregarComponente(etiqueta);
		this.agregarComponente(boton);
		
	}
	
	

	
	
}
