package ar.edu.ort.thp.tp3.ej2;

import java.util.ArrayList;

public class Area {

	private String nombre;
	private ArrayList<Oficina> oficinas;

	public Area(String nombre) {
		setNombre(nombre);
		this.oficinas = new ArrayList<Oficina>();
	}

	public void agregarEmpleado(int nroOficina, String nombre, String apellido) {
		Oficina oficinaBuscada = buscarOficina(nroOficina);
		if (oficinaBuscada != null) {
			oficinaBuscada.agregarEmpleado(nombre, apellido);
		} else {
			// debo recurrir a getNombre o a this.nombre, porque el parametro
			// nombre es el nombre del empleado
			System.out.println("La oficina " + nroOficina + " no existe en el area " + getNombre() + ".");
		}
	}

	public void agregarOficina(int nroOficina) {
		Oficina oficinaBuscada = buscarOficina(nroOficina);
		if (oficinaBuscada == null) {
			oficinas.add(new Oficina(nroOficina));
		} else {
			System.out.println("La oficina " + nroOficina + " ya existe en el area " + nombre + ".");
		}
	}

	// rutina especial para precargar Areas a modo de testing
	void agregarOficinas() {
		Oficina oficina;
		for (int i = 1; i <= 3; i++) {
			oficina = new Oficina(i);
			oficina.agregarEmpleados();
			oficinas.add(oficina);
		}
	}

	private Oficina buscarOficina(int nroOficina) {
		int index = 0;
		Oficina oficina = null;
		while (index < oficinas.size() && oficina == null) {
			if (oficinas.get(index).getNro() == nroOficina) {
				oficina = oficinas.get(index);
			} else {
				index++;
			}
		}
		return oficina;
	}

	public boolean existeEmpleado(String nombre, String apellido) {
		boolean existe = false;
		int index = 0;
		while (index < oficinas.size() && !existe) {
			existe = oficinas.get(index).existeEmpleado(nombre, apellido);
			index++;
		}
		return existe;
	}

	public String getNombre() {
		return nombre;
	}

	public void mostrarDatos() {
		System.out.println("Area: " + nombre);
		recorrerOficinas();
	}

	private void recorrerOficinas() {
		if (oficinas.size() > 0) {
			System.out.println("Oficinas: ");
			for (Oficina oficina : oficinas) {
				oficina.mostrarDatos();
			}
		}
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}