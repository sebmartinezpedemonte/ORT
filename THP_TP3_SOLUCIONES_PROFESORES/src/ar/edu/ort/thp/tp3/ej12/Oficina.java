package ar.edu.ort.thp.tp3.ej12;

import java.util.ArrayList;

public class Oficina {

	private int nro;
	private ArrayList<Empleado> empleados;
	private Empleado responsable;
	private Area area;

	public Oficina(int nro, Area area) {
		setNro(nro);
		setArea(area);
		empleados = new ArrayList<Empleado>();
		responsable = null;
	}

	public void agregarEmpleado(int nroLegajo, String nombre, String apellido) {
		Empleado empleado = buscarEmpleado(nombre, apellido);
		if (empleado == null) {
			empleado = new Empleado(nroLegajo, nombre, apellido, this);
			empleados.add(empleado);
			if (responsable == null) {
				responsable = empleado;
			}
		} else {
			System.out.println("El empleado " + nombre + " " + apellido + " ya existe.");
		}
	}

	public void asignarResponsable(int nroLegajo) {
		Empleado empleado = buscarEmpleado(nroLegajo);
		if (empleado != null) {
			responsable = empleado;
		} else {
			System.out.println("El empleado " + nroLegajo + " no es de la oficina y no puede ser su responsable.");
		}
	}
	
	public Empleado buscarEmpleado(int nroLegajo) {
		int index = 0;
		Empleado empleado = null;
		while (index < empleados.size() && empleado == null) {
			if (empleados.get(index).getNroLegajo() == nroLegajo) {
				empleado = empleados.get(index);
			} else {
				index++;
			}
		}
		return empleado;
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

	public String getNombreArea() {
		return area.getNombre();
	}

	public int getNro() {
		return nro;
	}

	public void mostrarDatos() {
		System.out.println("Oficina: " + nro);
		System.out.println("Responsable: " + responsable);
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

	private void setArea(Area area) {
		this.area = area;		
	}

	private void setNro(int nro) {
		this.nro = nro;
	}
	
}