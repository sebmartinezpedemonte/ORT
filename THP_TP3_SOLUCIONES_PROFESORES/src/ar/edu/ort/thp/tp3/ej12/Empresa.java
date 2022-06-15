package ar.edu.ort.thp.tp3.ej12;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Area> areas;
	private int ultimoLegajo;

	public Empresa(String nombre) {
		setNombre(nombre);
		areas = new ArrayList<Area>();
		ultimoLegajo = 0;
	}

	public void agregarArea(String nombreArea) {
		Area area = buscarArea(nombreArea);
		if (area == null) {
			areas.add(new Area(nombreArea));
		} else {
			System.out.println("El area " + nombreArea + " ya existe.");
		}
	}

	public void agregarEmpleado(String nombreArea, int nroOficina, String nombre, String apellido) {
		if (!existeEmpleado(nombre, apellido)) {
			Area areaBuscada = buscarArea(nombreArea);
			if (areaBuscada != null) {
				areaBuscada.agregarEmpleado(nroOficina, nuevoLegajo(), nombre, apellido);
			} else {
				System.out.println("El area " + nombreArea + " no existe.");
			}
		} else {
			System.out.println("El empleado " + nombre + " " + apellido + " ya existe.");
		}
	}
	
	public void asignarResponsable(String nombreArea, int nroOficina, int nroLegajo) {
		Area areaBuscada = buscarArea(nombreArea);
		if (areaBuscada != null) {
			areaBuscada.asignarResponsable(nroOficina, nroLegajo);
		} else {
			System.out.println("El area " + nombreArea + " no existe.");
		}
	}

	private int nuevoLegajo() {
		return ++ultimoLegajo;
	}

	public void agregarOficina(String nombreArea, int nroOficina) {
		Area areaBuscada = buscarArea(nombreArea);
		if (areaBuscada != null) {
			areaBuscada.agregarOficina(nroOficina);
		} else {
			System.out.println("El area " + nombreArea + " no existe.");
		}
	}

	private Area buscarArea(String nombreArea) {
		int index = 0;
		Area area = null;
		while (index < areas.size() && area == null) {
			if (areas.get(index).getNombre().compareTo(nombreArea) == 0) {
				area = areas.get(index);
			} else {
				index++;
			}
		}
		return area;
	}

	private boolean existeEmpleado(String nombre, String apellido) {
		boolean existe = false;
		int index = 0;
		while (index < areas.size() && !existe) {
			existe = areas.get(index).existeEmpleado(nombre, apellido);
			index++;
		}
		return existe;
	}

	public void listarEmpleados() {
		mostrarDatos();
		recorrerAreas();
	}

	private void mostrarDatos() {
		System.out.println("Empresa: " + this.nombre);
	}

	private void recorrerAreas() {
		if (areas.size() > 0) {
			System.out.println("Areas: ");
			for (int i = 0; i < areas.size(); i++) {
				Area area = areas.get(i);
				area.mostrarDatos();
			}
		}
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}