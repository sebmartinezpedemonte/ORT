package ejercicio02;

import java.util.ArrayList;

public class Compania {
	private String nombreCompania;
	private ArrayList<Area> areas;

	public Compania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
		this.areas = new ArrayList<>();
	}

	public void informeEmpleados() {
		System.out.println(this.nombreCompania);
		for (Area areas : areas) {
			System.out.println("Area " + areas.getNombreArea());
			System.out.println("***********************");

			areas.informeAreaOficina();
		}

	}

	private Area buscarArea(String nombreArea) {
		int i = 0;
		Area areaBuscar = null;
		while (areaBuscar == null && areas.size() > i) {
			if (this.areas.get(i).getNombreArea().equals(nombreArea)) {
				areaBuscar = this.areas.get(i);
			}
			
		}
		return areaBuscar;
	}

	public boolean agregarArea(Area areaAgregar) {
		boolean sePudo = false;
		if (buscarArea(areaAgregar.getNombreArea()) == null) {
			areas.add(areaAgregar);
			sePudo = true;
		}
		return sePudo;
	}
	
	

}
