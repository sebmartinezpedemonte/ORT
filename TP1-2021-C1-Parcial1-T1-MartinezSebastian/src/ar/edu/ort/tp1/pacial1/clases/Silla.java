package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla tipo;
		
	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto, MaterialSilla tipo) {
		super(modelo, costoBase, porcentajeGanancia);
		this.tipo = tipo;
		this.alto = alto;
		
	}
	
	@Override
	public float calcularPrecioCosto() {
		return this.getCostoBase() + this.tipo.getMultiplicadorValor() * this.alto;
	}
	
	//TODO A completar

	

}
