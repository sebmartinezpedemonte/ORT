package ort.edu.p1.tp3.ej12;

public class Persona implements Priorizable, Notificable{
	private String DNI, nombre, apellido;
	private int edad;
	private MotivoTest motivo;
	public Persona(String dNI, String nombre, String apellido, int edad, MotivoTest motivo) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.motivo = motivo;
	}
	@Override
	public void notificar(String mensaje) {
		System.out.println(nombre + " " + mensaje);
		
	}
	@Override
	public int tienePrioridad() {
		return PRIORIDAD;
	}
	

	
	public int getEdad() {
		return this.edad;
	}
	
	protected MotivoTest getMotivo() {
		return this.motivo;
	}
	
	public boolean esPrioritario() {
		return tienePrioridad() == PRIORIDAD;
	}
	
}
