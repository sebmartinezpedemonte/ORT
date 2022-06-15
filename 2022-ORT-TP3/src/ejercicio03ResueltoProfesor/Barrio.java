package ejercicio03ResueltoProfesor;

import java.util.ArrayList;

public class Barrio {
	private String nombreBarrio;
	private ArrayList<Propiedad> propiedades;

	public Barrio(String nombreBarrio) {
		setNombreBarrio(nombreBarrio);
		propiedades = new ArrayList<>();

	}

	public void setNombreBarrio(String nombre) {
		this.nombreBarrio = nombre;
	}

	public String getNombreBarrio() {
		return this.nombreBarrio;
	}

	private Propiedad buscarPropiedad(String domicilio) {
		int i = 0;
		Propiedad propiedadBuscar = null;
		while (this.propiedades.size() > i && propiedadBuscar == null) {
			if (this.propiedades.get(i).getDomicilio().equals(domicilio)) {
				propiedadBuscar = this.propiedades.get(i);
			} else {
				i++;
			}
		}
		return propiedadBuscar;
	}

	public boolean agregarPropiedad(String domicilio, double precio, TipoPropiedad tipoPropiedad) {
		boolean sePudo = false;
		if (buscarPropiedad(domicilio) == null) {
			propiedades.add(new Propiedad(domicilio, precio, tipoPropiedad));
			sePudo = true;
		}
		return sePudo;
	}

	public String getDomicilio() {
		String domicilioPropiedad = "";
		for (Propiedad propiedad : propiedades) {
			domicilioPropiedad = propiedad.getDomicilio();

		}
		return domicilioPropiedad;
	}

	public void mostrarPropiedades() {
		for (Propiedad propiedad : propiedades) {
			System.out.println(propiedad.getDomicilio() + " precio $" + propiedad.getPrecio());
		}
	}

	public int cantProp() {
		return this.propiedades.size();
	}

	public void mostrarPropiedades(TipoPropiedad tipoPropiedad) {
		System.out.println("De tipo " + tipoPropiedad.toString() + ": ");
		for (Propiedad propiedades : propiedades) {
			if (propiedades.getTipoPropiedad().equals(tipoPropiedad)) {
				System.out.println(propiedades.getDomicilio() + " precio $" + propiedades.getPrecio());
			}
		}
	}

	public Propiedad buscarDomicilio(String domicilio) {
		int i = 0;
		Propiedad propiedadBuscado = null;
		while (propiedades.size() > i && propiedadBuscado == null) {
			if (propiedades.get(i).getDomicilio().equals(domicilio)) {
				propiedadBuscado = propiedades.get(i);
			}
		}
		return propiedadBuscado;
	}

	public void borroPropiedad(Propiedad propiedad) {
		propiedades.remove(propiedad);
	}

	public Propiedad borrarPropiedad(String domicilio) {
		Propiedad propBorrar = null;
		propBorrar = buscarPropiedad(domicilio);
		if (propBorrar != null) {
			// borroPropiedad(propBorrar);
			propiedades.remove(propBorrar);
		}

		return propBorrar;
	}

	public void agregarPropiedad(Propiedad propiedad) {
		propiedades.add(propiedad);
	}

}
