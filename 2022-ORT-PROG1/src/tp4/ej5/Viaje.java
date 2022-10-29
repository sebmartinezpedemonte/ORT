package tp4.ej5;

public class Viaje {
	

	private double kmsViaje;
	private int idCamion;
	private String idChofer;
	public Viaje(double kmsViaje, int idCamion, String idChofer) {
		super();
		this.kmsViaje = kmsViaje;
		this.idCamion = idCamion;
		this.idChofer = idChofer;
	}
	public double getKmsViaje() {
		return kmsViaje;
	}
	public int getIdCamion() {
		return idCamion;
	}
	public String getIdChofer() {
		return idChofer;
	}
	
	
	
}
