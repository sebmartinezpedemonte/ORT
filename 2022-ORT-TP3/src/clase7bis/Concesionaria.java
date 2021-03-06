package clase7bis;

import java.util.ArrayList;

public class Concesionaria {

	private String nombre;
	private ArrayList<Auto> listaAutos;

	public Concesionaria(String nombre) {
		super();
		setNombre(nombre);
		listaAutos = new ArrayList<Auto>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Concesionaria [nombre=" + nombre + "]";
	}

	// para buscar usamod un while
	private Auto buscarAuto(Auto auto) {
		Auto autoABuscar = null;
		int i = 0;
		while (autoABuscar == null && i < listaAutos.size()) {
			if (listaAutos.get(i).getPatente().equals(auto.getPatente())) {
				autoABuscar = listaAutos.get(i); // guardando el objeto de tipo Auto que encontre
			} else {
				i++;
			}

			// i++;
			// o lo metemos adentro del else

		}
		return autoABuscar;
	}

	private Auto buscarAutoPorPatente(String patente) {
		Auto autoABuscar = null;
		int i = 0;
		while (autoABuscar == null && i < listaAutos.size()) {
			if (listaAutos.get(i).getPatente().equals(patente)) {
				autoABuscar = listaAutos.get(i); // guardando el objeto de tipo Auto que encontre
			} else {
				i++;
			}

		}
		return autoABuscar;
	}

	public boolean modificarColor(String patente, Color color) {
		boolean sePudoCambiar = false;
		if (this.buscarAutoPorPatente(patente) != null
				&& (this.buscarAutoPorPatente(patente).getPatente()).equals(patente)) {
			// Auto AutoACambiarColor = null;
			// AutoACambiarColor = buscarAutoPorPatente(patente);
			this.buscarAutoPorPatente(patente).setColor(color);
			sePudoCambiar = true;
		}
		return sePudoCambiar;
	}

	public boolean modificarColorBis(String patente, Color color) {
		boolean sePudoCambiar = false;
		Auto autoAModificarColor = null;
		autoAModificarColor = buscarAuto(autoAModificarColor);
		if (buscarAuto(autoAModificarColor) != null && autoAModificarColor.getPatente().equals(patente)) {
			autoAModificarColor.setColor(color);
			sePudoCambiar = true;
		}

		return sePudoCambiar;
	}

	public void agregarAutoNuevo(Auto auto) {
		Auto autoAAgregar = null;
		autoAAgregar = buscarAuto(auto);
		if (autoAAgregar == null) {
			listaAutos.add(auto);
			System.out.println("Se ha agregado al auto " + auto);
		} else {
			System.out.println("El auto " + auto + " ya se encuentra en la lista");
		}
	}

	public void agregarAutoUsado(String marca, String modelo, String patente, Color color) {
		// Auto auto1 = new Auto(marca, modelo, patente, color);
		// listaAutos.add(auto1);
		listaAutos.add(new Auto(marca, modelo, patente, color));
	}

	public void eliminarAuto(Auto auto) {
		Auto autoAEliminar = buscarAuto(auto);
		if (autoAEliminar != null) {
			listaAutos.remove(auto);
			System.out.println("El auto " + auto + " se elimino correctamente");
		}
	}

	public void mostrarAutos() {
		int contador = 1;
		for (Auto autos : listaAutos) {
			System.out.println(
					autos.getMarca() + " " + autos.getModelo() + " " + autos.getPatente() + " " + autos.getColor());

			System.out.println(contador);
			contador++;

		}
	}

	// si quiero ver la posicion tengo que hacer esto
	public void mostrar() {
		for (int i = 0; i < listaAutos.size(); i++) {
			System.out.println(listaAutos.get(i));
			System.out.println("El indice es : " + i);
		}
	}

	public void mostrarUltimo() {
		System.out.println(listaAutos.get(listaAutos.size() - 1));
		listaAutos.get(listaAutos.size() - 1);
	}

	public void removerDeAUno() {
		for (int i = 0; i < listaAutos.size(); i++) {
			listaAutos.remove(i);
		}
	}

}
