package clase7bis;

public class Auto {
	
	private String marca;
	private String modelo;
	private String patente;
	private Color color;
	
	public Auto(String marca, String modelo, String patente, Color color) {
		super();
		setMarca(marca);
		setModelo(modelo);
		setPatente(patente);
		setColor(color);
	}
	
	public String getMarca() {
		return marca;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	private void setPatente(String patente) {
		this.patente = patente;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return marca + " " + modelo + " " + patente + " " + color;
	}
	
	
	
}
