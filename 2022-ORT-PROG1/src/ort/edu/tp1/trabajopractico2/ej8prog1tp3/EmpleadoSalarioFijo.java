package ort.edu.tp1.trabajopractico2.ej8prog1tp3;

public class EmpleadoSalarioFijo extends Empleado{

	private final int ANTIGUEDAD_BASICA = 2;
	private final int ANTIGUEDAD_MEDIA = 5;
	private final int ANTIGUEDAD_INTERMEDIA = 10;
	
	private int antiguedad;
	private double sueldoBasico;
	
	public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int añoIngreso, int antiguedad,
			double sueldoBasico) {
		super(dni, nombre, apellido, añoIngreso);
		this.antiguedad = antiguedad;
		this.sueldoBasico = sueldoBasico;
	}
	
	@Override
	public double calcularSalario() {
		double salario = this.sueldoBasico;
		if(antiguedad < ANTIGUEDAD_BASICA ) {
			salario = sueldoBasico;
		}else if(antiguedad <= ANTIGUEDAD_MEDIA ) {
			salario = sueldoBasico*1.05;
		}else if(antiguedad <= ANTIGUEDAD_INTERMEDIA) {
			salario = sueldoBasico *1.10;
		}else {
			salario = sueldoBasico *1.15;
		}
		return salario;
	}
	
}
