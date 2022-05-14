package ejercicio07;

public class LectoraDeDVD {
	private String marca;
	private boolean capazDeGrabar;
	
	public LectoraDeDVD(String marca, boolean capazDeGrabar) {
		this.marca = marca;
		this.capazDeGrabar = capazDeGrabar;
	}

	@Override
	public String toString() {
		return "LectoraDeDVD [marca=" + marca + ", capazDeGrabar=" + capazDeGrabar + "]";
	}
	
	
}
