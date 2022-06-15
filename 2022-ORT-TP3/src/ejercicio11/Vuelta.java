package ejercicio11;

public class Vuelta {
	private double tiempoSegundos;

	public Vuelta(double tiempoSegundos) {
		super();
		this.tiempoSegundos = tiempoSegundos;
	}

	public double getTiempoSegundos() {
		return tiempoSegundos;
	}

	@Override
	public String toString() {
		return "Vuelta [tiempoSegundos=" + tiempoSegundos + "]";
	}
	
	
	
}
