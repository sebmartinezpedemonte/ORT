package ejercicio02;

import java.util.ArrayList;

public class Oficina {
	private String nombreOficina;
	private ArrayList<Empleado> empleados;

	public Oficina(String nombreOficina) {
		this.nombreOficina = nombreOficina;
		empleados = new ArrayList<>();
	}

	public String getNombreOficina() {
		return this.nombreOficina;
	}

	private Empleado buscarEmpleado(String nombreEmpleado) {
		Empleado empleadoBuscar = null;
		int i = 0;
		while (empleados.size() > i && empleadoBuscar == null) {
			if (empleados.get(i).getNombreEmpleado().equals(nombreEmpleado)) {
				empleadoBuscar = empleados.get(i);
			}
			i++;
		}

		return empleadoBuscar;
	}

	public boolean agregarEmpleado(Empleado empleado) {
		boolean sePudo = false;
		if (buscarEmpleado(empleado.getNombreEmpleado()) == null) {
			empleados.add(empleado);
			sePudo = true;
		}

		return sePudo;
	}

	public void informeOficina() {
		for (Empleado empleados : empleados) {
			System.out.println("Empleado " + empleados.getNombreEmpleado());
		}
	}

}
