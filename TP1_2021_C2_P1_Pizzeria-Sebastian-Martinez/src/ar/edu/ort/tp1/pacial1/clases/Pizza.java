package ar.edu.ort.tp1.pacial1.clases;

public abstract class Pizza implements Mostrable {

	private static final String MSG_GANANCIA_INVALIDA = "Ganancia inv�lida";
	private static final String MSG_COSTO_INVALIDO = "Costo inv�lido";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre inv�lido";
	//TODO A completar

	public Pizza(String nombre, float costoDeProduccion, float porcentajeGanancia) {
		//TODO A completar
	}

	//TODO A completar
	public abstract float getPrecioDeCosto();


	public float getPrecioDeVenta() {
		//TODO A completar
	}


	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.nombre;
	}
	
}
