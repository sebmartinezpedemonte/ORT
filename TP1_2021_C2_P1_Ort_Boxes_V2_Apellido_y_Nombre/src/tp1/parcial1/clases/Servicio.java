package tp1.parcial1.clases;

public abstract class Servicio implements Detallable {
	
	
	//TODO A completar


	public Servicio(String descripcion, double porcentajeGanancia, String patente) {
	}

	public abstract double calcularPrecioCosto();
	
	public double calcularPrecioVenta() {
		double costo = this.calcularPrecioCosto();
		return costo+(this.porcentajeGanancia*costo/100);
	}
	

	

	
}
