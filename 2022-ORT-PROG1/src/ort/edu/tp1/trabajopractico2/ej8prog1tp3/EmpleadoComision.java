package ort.edu.tp1.trabajopractico2.ej8prog1tp3;

public class EmpleadoComision extends Empleado{
	private final int SAL_MIN = 20000;
	private int clientes;
	private double montoPorCliente;
	public EmpleadoComision(String dni, String nombre, String apellido, int añoIngreso, int clientes,
			double montoPorCliente) {
		super(dni, nombre, apellido, añoIngreso);
		this.clientes = clientes;
		this.montoPorCliente = montoPorCliente;
	}
	
	
	public int getClientes() {
		return clientes;
	}
	
	public double calcularSalario() {
		double salario = this.clientes * this.montoPorCliente;
		if(salario< SAL_MIN ) {
			salario = SAL_MIN;
		}		
		return salario;
	}

	@Override
	public String toString() {
		return super.toString() + " EmpleadoComision [SAL_MIN=" + SAL_MIN + ", clientes=" + clientes + ", montoPorCliente="
				+ montoPorCliente + "]";
	}
	
	
}
