package ejercicio03;

import java.util.ArrayList;

public class Inmobiliaria {


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
		for (Barrio barrio : barrios) {
			System.out.println(barrio.getNombreBarrio());
			barrio.mostrarPropiedades();
		}
	}

	/*
	 * private ArrayList<Barrio> obtenerBarrioMaxProp() { int barriocantMax = 0;
	 * ArrayList<Barrio> barriosMax = new ArrayList<>();
	 * 
	 * for (Barrio barrio : barrios) { if (barrio.getCantPropiedades() >=
	 * barriocantMax) { barriocantMax = barrio.getCantPropiedades(); } } if
	 * (barriocantMax != 0) { for (Barrio barrio : barrios) { if (barriocantMax ==
	 * barrio.getCantPropiedades()) { barriosMax.add(barrio); } } }
	 * 
	 * return barriosMax;
	 * 
	 * }
	 */
	private int barrioCantMax() {
		int cantMax = -1;
		for (Barrio barrio : barrios) {
			if (barrio.getCantPropiedades() > cantMax) {
				cantMax = barrio.getCantPropiedades();
			}
		}
		return cantMax;
	}

	private ArrayList<Barrio> obtenerBarrioMaxProp() {
		ArrayList<Barrio> listaBarriosMaxProp = new ArrayList<>();
		for (Barrio barrio : barrios) {
			if (barrioCantMax() == barrio.getCantPropiedades()) {
				listaBarriosMaxProp.add(barrio);
			}
		}
		return listaBarriosMaxProp;
	}

	// mas eficiente porque recorre un solo for
	public ArrayList<Barrio> alternativaObtenerBarrioMaxProp() {
		ArrayList<Barrio> listaBarriosBis = new ArrayList<>();
		int maxCant = -1;
		for (Barrio barrio : barrios) {
			if (barrio.getCantPropiedades() == maxCant) {
				listaBarriosBis.add(barrio);
			} else if (barrio.getCantPropiedades() > maxCant) {
				maxCant = barrio.getCantPropiedades();
				listaBarriosBis.clear();
				listaBarriosBis.add(barrio);
			}
		}
		return listaBarriosBis;
	}

	public void mostrarBarrioMaxProp() {
		for (Barrio barriosMaxProp : obtenerBarrioMaxProp()) {
			System.out.println(barriosMaxProp.getNombreBarrio());
		}
	}

	public void alternativaMostrarBarrioMaxProp() {
		for (Barrio barriosMaxProp : alternativaObtenerBarrioMaxProp()) {
			System.out.println(barriosMaxProp.getNombreBarrio());
		}
	}
	
	public Propiedad buscarDomicilio(String domicilio) {
		Propiedad propiedadBuscar = null;
		int i = 0;
		while( barrios.size() > i && propiedadBuscar == null) {
			if(barrios.get(i).buscarDomicilio(domicilio) != null) {				
				propiedadBuscar = barrios.get(i).buscarDomicilio(domicilio);
			}else {
				i++;
			}		
		}
		return propiedadBuscar;
	}
	
	
	public Propiedad borrarPropiedad(String domicilio) {		
		Propiedad propiedadRemover = null;
		int i = 0;
		while( barrios.size() > i && propiedadRemover == null) {
			if(barrios.get(i).buscarDomicilio(domicilio) != null) {				
				propiedadRemover = barrios.get(i).buscarDomicilio(domicilio);
				barrios.get(i).borrarPropiedad(domicilio);
			}else {
				i++;
			}
		}		
		return propiedadRemover;
	}
	
	public Propiedad cambiarPropiedadDeBarrio(String domicilio, Barrio barrio) {
		Propiedad propiedadCambiarDomicilio = null;
		if(this.buscarDomicilio(domicilio) != null) {	
			
			propiedadCambiarDomicilio = this.borrarPropiedad(domicilio);;
			barrio.agregarPropiedad(propiedadCambiarDomicilio);			
		}		
		return propiedadCambiarDomicilio;
	}
	
	public boolean alternativaCambiarPropiedadDeBarrio(String domicilio, Barrio barrio) {
		boolean sePudo = false;
		Propiedad propiedadCambiarDomicilio = null;
		propiedadCambiarDomicilio = this.borrarPropiedad(domicilio);
		if(propiedadCambiarDomicilio!=null) {			
			barrio.agregarPropiedad(propiedadCambiarDomicilio);
			sePudo = true;
			System.out.println("hola");
		}		
		return sePudo;
	}
	

	@Override
	public String toString() {
		return "Inmobiliaria [nombre=" + nombre + ", barrios=" + barrios + "]";
	}
	
	

}
