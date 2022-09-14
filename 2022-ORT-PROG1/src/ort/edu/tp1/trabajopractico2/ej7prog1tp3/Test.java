package ort.edu.tp1.trabajopractico2.ej7prog1tp3;


public class Test {
	public static void main(String[] args) {

		GrupoDeFiguras grupo = new GrupoDeFiguras();

		grupo.agregarFiguras(new TrianguloEquilatero("verde", 12));
		grupo.agregarFiguras(new Rectangulo("rojo", 5, 5));
		grupo.agregarFiguras(new Circunferencia("amarillo", 4));
		
		grupo.mostrarInfoDeFiguras();
		
	}
}
