package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {
	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;
	private static final String MSG_IR_AL_BANIO = "Fui al baño, como conejo";
	
	public Conejo(String nombre, double peso, boolean vacunada, Estado estado) {
		super(nombre, peso, vacunada, estado);		
	}

	@Override
	public void comer(double comida) {
		this.comer(comida, MULT_ALIMENTACION);		
	}

	@Override
	public void defecar() {
		System.out.println(MSG_IR_AL_BANIO);
		this.actualizarPeso(PORC_DESC_PESO);
		
	}
}
