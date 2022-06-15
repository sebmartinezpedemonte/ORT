package ejercicio03ResueltoProfesor;

import java.util.ArrayList;

public class Inmobiliaria {

	@SuppressWarnings("unused")
	private String nombre;
	private ArrayList<Barrio> barrios;

	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
		barrios = new ArrayList<>();
	}

	private Barrio buscarBarrio(Barrio barrio) {
		int i = 0;
		Barrio barrioBuscar = null;
		while (this.barrios.size() > i && barrioBuscar == null) {
			if (this.barrios.get(i).equals(barrio)) {
				barrioBuscar = this.barrios.get(i);
			} else {
				i++;
			}
		}
		return barrioBuscar;
	}

	public boolean agregarBarrio(Barrio barrio) {
		boolean sePudo = false;
		if (buscarBarrio(barrio) == null) {
			barrios.add(barrio);
			sePudo = true;
		}
		return sePudo;
	}

	public void mostrarPropiedades() {
		for (Barrio barrios : barrios) {
			barrios.mostrarPropiedades();
		}
	}

	private ArrayList<Barrio> obtenerBarrioMaxProp() {
		int barriocantMax = 0;
		ArrayList<Barrio> barriosMax = new ArrayList<>();

		for (Barrio barrio : barrios) {
			if (barrio.cantProp() > barriocantMax) {
				barriocantMax = barrio.cantProp();
			}
		}
		if (barriocantMax != 0) {
			for (Barrio barrio : barrios) {
				if (barriocantMax == barrio.cantProp()) {
					barriosMax.add(barrio);
				}
			}
		}
		return barriosMax;
	}

	public void mostrarBarrioMaxPror() {
		for (Barrio barriosMaxProp : obtenerBarrioMaxProp()) {
			System.out.println(barriosMaxProp.getNombreBarrio());
		}
	}

	public Propiedad borrarPropiedad(String domicilio) {
		int i = 0;
		Propiedad propBorrar = null;
		while (barrios.size() > i && propBorrar == null) {
			propBorrar = barrios.get(i).borrarPropiedad(domicilio);
			if (propBorrar == null) {
				i++;
			}
		}
		return propBorrar;
	}

	public boolean cambiarPropiedadDeBarrio(String domicilio, Barrio barrio) {
		boolean sePudo = false;
		Propiedad propModificar = null;
		propModificar = borrarPropiedad(domicilio);
		if (propModificar != null) {
			barrio.agregarPropiedad(propModificar);
			sePudo = true;
		}
		return sePudo;
	}

}
