package ort.edu.tp1.trabajopractico2.ej8prog1tp3;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<>();
	}
	
	public void agregarEmpleados(Empleado emp) {
		empleados.add(emp);
	}
	
	public void mostrarSalarios() {
		for(Empleado emp : empleados) {
			System.out.println(emp.getNombre() + " " + emp.getApellido() + " cobra: $" + emp.calcularSalario());
		}
	}

	public Empleado empleadoConMasClientes() {
		Empleado empleadoMax = null;
		int cantMax = 0;
		for(Empleado emp : empleados) {
			if(emp instanceof EmpleadoComision) {
				EmpleadoComision empCom = (EmpleadoComision) emp ;
				if(empCom.getClientes() > cantMax) {
					empleadoMax = emp;
				}
			}
		}		
		return empleadoMax;
	}
	
}
