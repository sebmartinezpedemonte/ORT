package tp4.ej5;

public class Camion {

	private int id; // = new int[10];
	private double costoXKmRecorrido;
	private final int CANT_ID = 10;
	private static int idSumando = 0;; 

	public Camion(double costoXKmRecorrido) {
		this.costoXKmRecorrido = costoXKmRecorrido;
		this.id = idSumando++;
	}


	public int getId() {
		return id;
	}

	public double getCostoXKmRecorrido() {
		return costoXKmRecorrido;
	}

	public int getCANT_ID() {
		return CANT_ID;
	}
	
	

}
