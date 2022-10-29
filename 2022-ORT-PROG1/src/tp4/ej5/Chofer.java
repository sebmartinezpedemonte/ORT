package tp4.ej5;

public class Chofer {
	private String id;
	private String nombre;
	private double pagoPorViaje;
	public Chofer(String id, String nombre, double pagoPorViaje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pagoPorViaje = pagoPorViaje;
	}
	public String getId() {
		return id;
	}
	public double getPagoPorViaje() {
		return pagoPorViaje;
	}
	
	
}
