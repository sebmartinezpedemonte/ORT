package ort.edu.tp1.trabajopractico2.ej7prog1tp3;

public class Rectangulo extends GrupoDeFiguras{
	private double longitud;
	private double ancho;
	
	public Rectangulo(String color, double longitud, double ancho) {
		super(color);
		this.longitud = longitud;
		this.ancho = ancho;
	}
	
	@Override
	public double area() {
		return this.longitud* this.ancho; 
	}
	
	@Override
	public double perimetro() {
		return this.longitud*2 + this.ancho*2;
	}


	
	
}
