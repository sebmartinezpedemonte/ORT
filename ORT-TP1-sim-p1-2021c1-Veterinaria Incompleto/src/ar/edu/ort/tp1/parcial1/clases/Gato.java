package ar.edu.ort.tp1.parcial1.clases;

public class Gato extends Mascota {


	private static final double MULT_ALIMENTACION = 0.033;
	private static final int PORC_DESC_PESO = -1;
	
	public Gato(String nombre, int peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
		
	}
	
	

	@Override
	public void defecar() {
		System.out.println("Ya fui al baño, recoge mi regalito");
		System.out.println("Peso inicial " + this.getPeso());
		this.actualizarPeso(PORC_DESC_PESO);
		System.out.println("Peso final " + this.getPeso());
		
	}
	@Override
	public void comer(double comida) {
		this.comer(comida, MULT_ALIMENTACION);
		
	}

}
