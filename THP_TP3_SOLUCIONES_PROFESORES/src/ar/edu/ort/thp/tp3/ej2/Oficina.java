package ar.edu.ort.thp.tp3.ej2;

import java.util.ArrayList;

public class Oficina {

	private int nro;
	private ArrayList<Empleado> empleados;

	public Oficina(int nro) {
		setNro(nro);
		empleados = new ArrayList<Empleado>();
	}

	public void agregarEmpleado(String nombre, String apellido) {
		Empleado empleadoBuscado = buscarEmpleado(nombre, apellido);
		if (empleadoBuscado == null) {
			empleados.add(new Empleado(nombre, apellido));
		} else {
			System.out.println("El empleado " + nombre + " " + apellido + " ya existe.");
		}

	}

	// rutina especial para precargar Empleados a modo de testing
	void agregarEmpleados() {
		for (int i = 1; i <= 3; i++) {
			empleados.add(new Empleado("Nombre " + nro + i, "Apellido " + nro + i));
		}
	}

	private Empleado buscarEmpleado(String nombre, String apellido) {
		int index = 0;
		Empleado empleado = null;
		while (index < empleados.size() && empleado == null) {
			if (empleados.get(index).mismoNombreCompleto(nombre, apellido)) {
				empleado = empleados.get(index);
			} else {
				index++;
			}
		}
		return empleado;
	}

	public boolean existeEmpleado(String nombre, String apellido) {
		return buscarEmpleado(nombre, apellido) != null;
	}

	public int getNro() {
		return nro;
	}

	public void mostrarDatos() {
		System.out.println("Oficina: " + nro);
		recorrerEmpleados();
	}

	private void recorrerEmpleados() {
		if (empleados.size() > 0) {
			System.out.println("Empleados: ");
			for (Empleado empleado : empleados) {
				empleado.mostrarDatos();
			}
		}
	}

	private void setNro(int nro) {
		this.nro = nro;
	}
}