package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {

	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;

	public Conejo(String nombre, int peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}


	@Override
	public void defecar() {
		System.out.println("Ya fui al baño, toma mis pequeñas cosas");
		System.out.println("Peso inicial " + this.getPeso());
		this.actualizarPeso(PORC_DESC_PESO);
		System.out.println("Peso final " + this.getPeso());
	}



	@Override
	public void comer(double comida) {
		this.comer(comida, MULT_ALIMENTACION);		
	}












}
