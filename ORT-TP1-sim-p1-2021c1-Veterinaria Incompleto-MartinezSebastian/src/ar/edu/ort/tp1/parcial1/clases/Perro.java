package ar.edu.ort.tp1.parcial1.clases;

public class Perro extends Mascota {

	private static final double MULT_ALIMENTACION = 0.05;
	private static final double PORC_DESC_PESO = -3;
	private static final String MSG_IR_AL_BANIO = "Fui al baño, como perro";
	
	private static final String LADRAR = "guau woof";

	public Perro(String nombre, double peso, boolean vacunada, Estado estado) {
		super(nombre, peso, vacunada, estado);
		
	}
	
	public void ladrar() {
		System.out.println(LADRAR);
	}
	
	
	@Override
	public void comer(double comida) {
		//llamamos al super en este caso ya que no es recursividad porque este metodo tiene un solo parametro
		this.comer(comida, MULT_ALIMENTACION);		
	}

	@Override
	public void defecar() {
		System.out.println(MSG_IR_AL_BANIO);
		this.actualizarPeso(PORC_DESC_PESO);
		
	}
}
