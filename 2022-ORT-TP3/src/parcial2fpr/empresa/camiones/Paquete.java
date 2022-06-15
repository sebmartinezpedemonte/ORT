package parcial2fpr.empresa.camiones;

public class Paquete {
	private double peso;
	private double valor;
	private Provincia provinciaATransportar;
	
	public Paquete(double peso, double valor,  Provincia provinciaATransportar) {
		super();
		this.peso = peso;
		this.valor = valor;
		this.provinciaATransportar = provinciaATransportar;
	}
	
	public Provincia getProvinciaATransportar() {
		return this.provinciaATransportar;
	}
	
	public double getPeso() {
		return peso;
	}


	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Paquete [peso=" + peso + ", valor=" + valor + ", provinciaATransportar=" + provinciaATransportar + "]";
	}


	
}
