package ar.edu.ort.tp1.parcial1.clases;

public class Gato extends Mascota {


	private static final double MULT_ALIMENTACION = 0.033;
	private static final int PORC_DESC_PESO = -1;
	private static final String MSG_IR_AL_BANIO = "Fui al baño, como gato";

	
	
	public Gato(String nombre, double peso, boolean vacunada, Estado estado) {
		super(nombre, peso, vacunada, estado);
		// TODO Auto-generated constructor stub
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
