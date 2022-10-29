package ejparcial1componentes;

public class Main {
	public static void main(String[] args) {
		Boton boton1 = new Boton("Hola", "Azul", 12, 15, 5, 2, true);
		Boton boton2 = new Boton("Chau", "Verde", 12, 15, 5, 2, false);
		CampoDeTexto campo1 = new CampoDeTexto("Aqui...", "Naranja", 5, 8, 9, 10, true, true, false);
		CampoDeTexto campo2 = new CampoDeTexto("Alla...", "Rojo", 5, 8, 9, 10, false, false, false);
		Etiqueta etiqueta1 = new Etiqueta("Cantando...", "Gris", 10, 20, 30, 40, false, "Comic Sans");
		Etiqueta etiqueta2 = new Etiqueta("Cantando...", "Gris", 10, 20, 30, 40, false, "Comic Sans");
		Ventana ventana1 = new Ventana("Google", "Blanco", 15, 20 , 25, 30, true, Estado.ABIERTA);
		VentanaDeError ventanaError = new VentanaDeError("Yahoo", "Amarillo", 15, 20 , 25, 30, true, Estado.MINIMIZADA, "Comic Sans", "Mala conexion");
		
		ventana1.agregarComponente(boton1);
		ventana1.agregarComponente(boton2);
		ventana1.agregarComponente(campo1);
		ventana1.agregarComponente(campo2);
		ventana1.agregarComponente(etiqueta1);
		ventana1.agregarComponente(etiqueta2);
		
		ventana1.dibujar();
		ventanaError.dibujar();
/*		
 * 	public VentanaDeError(String texto, String color, int ancho, int altura, int ejeX, int ejeY, boolean hablitado,
			Estado estado, String fuente, String textoError) {
		super(texto, color, ancho, altura, ejeX, ejeY, hablitado, estado);
		this.etiqueta = new Etiqueta(textoError, color, ancho, altura, ejeX, ejeY, hablitado, fuente);
		this.boton = new Boton(texto, color, ancho, altura, ejeX, ejeY, hablitado);
	}
 */
				
	}
}
