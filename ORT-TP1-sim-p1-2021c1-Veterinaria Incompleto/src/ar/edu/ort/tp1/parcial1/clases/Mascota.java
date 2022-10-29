package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenía hambre";
	private static final String MSG_COM_ENFERMO = " dice: No tenía mucha hambre, pero gracias";

	private static final int CIEN = 100;
	private String nombre;
	private int peso;
	private boolean vacuna;
	private Estado estado;
	

	public Mascota(String nombre, int peso, boolean vacuna, Estado estado) {
		this.nombre = nombre;
		this.peso = peso;
		this.vacuna = vacuna;
		this.estado = estado;
	}


	
	public void comer(double comida, double multiplicador) {		
		if(this.estado.equals(Estado.HAMBRIENTO)) {
			System.out.println(this.nombre + MSG_COM_HAMBRIENTO);
			setEstado(Estado.FELIZ);
		}else if(this.estado.equals(Estado.FELIZ)) {
			setEstado(Estado.ENFERMO);
			System.out.println(this.nombre +MSG_COM_FELIZ);
		}else {
			System.out.println(this.nombre +MSG_COM_ENFERMO);
		}		
		System.out.println("El estado de " +this.nombre + " es: " + estado.getDescripcion());
		double peso = comida * multiplicador;
		System.out.println("Peso inicial " + this.peso);
		this.actualizarPeso(peso);
		System.out.println("Peso final " + this.peso);
	}
	

	
	protected int getPeso() {
		return peso;
	}



	public String getNombre() {
		return nombre;
	}
	//actualizará el peso sumando al actual la multiplicación entre la cantidad de comida recibida y un multiplicador
	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}
	
	protected Estado getEstado() {
		return estado;
	}
	
	protected void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void vacunar() {
		if(vacuna == false) {
			vacuna = true;
		}
	}
	
	public boolean getVacuna() {
		return this.vacuna;
	}
	
}
