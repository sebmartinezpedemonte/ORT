package ar.edu.ort.thp.tp3.ej10;

public class ResumenCarrera {

	private String fechaHora;
	private int cantidadPilotos;

	public ResumenCarrera(String fechaHora, int cantidadPilotos) {
		// No lleva setters ni getters puse solo se va a usar para mostrar el
		// Resumen por pantalla, no se usa para otra cosa.
		// De ser necesario solo deberian agregarse los getters porque los datos
		// de ingreso estan totalmente controlados y definidos por la Carrera.
		this.fechaHora = fechaHora;
		this.cantidadPilotos = cantidadPilotos;
	}

	@Override
	public String toString() {
		return "ResumenCarrera [fechaHora=" + fechaHora + ", cantidadPilotos=" + cantidadPilotos + "]";
	}

}
