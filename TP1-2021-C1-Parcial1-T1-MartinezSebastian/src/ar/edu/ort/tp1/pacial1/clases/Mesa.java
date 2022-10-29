package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private long largo;
	private long ancho;
	private TipoMesa tipoMesa;
	
	
	public Mesa(String modelo, float costoBase, float porcentajeGanancia, long largo, long ancho, TipoMesa tipoMesa) {
		super(modelo, costoBase, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.tipoMesa = tipoMesa;
	}
	
	//TODO A completar
	
	//(costo base * multiplicador del tipo de mesa + 0.2 * largo * ancho)
	@Override
	public float calcularPrecioCosto() {
		return this.getCostoBase() * this.tipoMesa.getMultiplicadorValor()
				+ COEFICIENTE_SUPERFICIE * this.largo * this.ancho;
	}
	

}
