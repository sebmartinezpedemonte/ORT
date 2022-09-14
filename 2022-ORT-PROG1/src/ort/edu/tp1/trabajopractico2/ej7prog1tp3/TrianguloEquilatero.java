package ort.edu.tp1.trabajopractico2.ej7prog1tp3;

public class TrianguloEquilatero extends GrupoDeFiguras{

	private double lado;
	

	public TrianguloEquilatero(String color, double lado) {
		super(color);
		this.lado = lado;
		
	}
	
	@Override
	public double area() {
		return (Math.sqrt(3)/4) * (this.lado*this.lado);
				 
	}
	
	@Override
	public double perimetro() {
		return this.lado*3;
	}


	

}
