package ejercicio02bis;


public class Oficina {
	private String nombreOficina;
	private Empleado empleado;

	public Oficina(String nombreOficina, Empleado empleado) {
		this.nombreOficina = nombreOficina;
		this.empleado = empleado;
		
	}

	public String getNombreOficina() {
		return this.nombreOficina;
	}
	


	public void informeOficina() {
		System.out.println("Empleado " + empleado.getNombreEmpleado());
	}

}
