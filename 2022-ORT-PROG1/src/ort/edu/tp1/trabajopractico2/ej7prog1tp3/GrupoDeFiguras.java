package ort.edu.tp1.trabajopractico2.ej7prog1tp3;

import java.util.ArrayList;

public class GrupoDeFiguras {
	private String color;
	private ArrayList<GrupoDeFiguras> figuras;
	
	public GrupoDeFiguras() {
		
		this.figuras = new ArrayList<>();
	}
	
	public GrupoDeFiguras(String color) {
		this.color = color;
		this.figuras = new ArrayList<>();
	}
	
	public void agregarFiguras(GrupoDeFiguras fig) {
		figuras.add(fig);
	}
	
	public double area() {
		return 0; 
	}
	
	public double perimetro() {
		return 0;
	}
	
	public void mostrarInfoDeFiguras() {
		figuras.forEach(System.out::println);
		/*for(GrupoDeFiguras fig : figuras) {
			System.out.println(fig);
		}*/
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " de color " + this.color
				+ " con un area de " + (float)this.area() + " y un perimetro de " + (float)this.perimetro();
	}
	
}
