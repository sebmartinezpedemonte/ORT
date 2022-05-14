package ejercicio07;

public class Procesador {
	final String marca;
	final String modelo;
	final double nivelActualDeTemperatura;
	final double nivelTemperaturaCritica;
	
	public Procesador(String marca, String modelo, double nivelActualDeTemperatura, double nivelTemperaturaCritica ) {
		this.marca = marca;
		this.modelo = modelo;
		this.nivelActualDeTemperatura = nivelActualDeTemperatura;
		this.nivelTemperaturaCritica = nivelTemperaturaCritica;		
	}
	
	public void peligroNivelTemperaturaCritica(double nivelActualDeTemperaturaNuevo) {
		if(nivelActualDeTemperaturaNuevo > nivelTemperaturaCritica) {
			System.out.println("El nivel de temperatura del procesador es critica");
		}
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", nivelActualDeTemperatura="
				+ nivelActualDeTemperatura + ", nivelTemperaturaCritica=" + nivelTemperaturaCritica + "]";
	}
	
}
