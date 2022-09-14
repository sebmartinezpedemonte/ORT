package ort.edu.tp1.trabajopractico2.ej7prog1tp3;

public class Circunferencia extends GrupoDeFiguras{
	
	private double radio;
	
	public Circunferencia(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public double area() {
		return Math.PI*(radio*radio);
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*radio;
	}


	
	
}
