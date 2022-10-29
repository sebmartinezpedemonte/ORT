package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {

	private int cantidadDeCuerpo;
	private TelaSillon tela;
	
	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantidadDeCuerpo, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		this.cantidadDeCuerpo = cantidadDeCuerpo;
		this.tela = tela;
	}

	
	@Override
	public float calcularPrecioCosto() {
		return this.getCostoBase() + this.tela.getPorcentaje() * this.cantidadDeCuerpo;
	}
	
}
