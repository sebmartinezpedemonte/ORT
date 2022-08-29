package ort.edu.tp1.trabajopractico2.ejercicio5;

public class Mueble {
	private String nombre;
	private String material;
	private String color;
	public Mueble(String nombre, String material, String color) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public String getMaterial() {
		return material;
	}
	public String getColor() {
		return color;
	}
	//Mesa de Madera color	Marrón.
	public void mostrarDatos() {
		System.out.println(nombre + " de " + material + " color " + color + ". ");
	}
}
