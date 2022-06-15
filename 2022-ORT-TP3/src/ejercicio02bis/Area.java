package ejercicio02bis;

import java.util.ArrayList;

public class Area {
	private String nombreArea;
	private ArrayList<Oficina> oficinas;

	public Area(String nombreArea) {
		super();
		this.nombreArea = nombreArea;
		oficinas = new ArrayList<Oficina>();
	}


	
	

	public String getNombreArea() {
		return this.nombreArea;
	}

	private Oficina buscarOficina(String nombreOficina) {
		Oficina oficinaBuscar = null;
		int i = 0;
		while (oficinas.size() > i && oficinaBuscar == null) {
			if (oficinas.get(i).getNombreOficina().equals(nombreOficina)) {
				oficinaBuscar = oficinas.get(i);
			}
			i++;
		}

		return oficinaBuscar;
	}
	
	public boolean agregarOficina(Oficina oficina) {
		boolean sePudo = false;
		if(buscarOficina(oficina.getNombreOficina()) == null) {
			oficinas.add(oficina);
			sePudo = true;
		}
		
		return sePudo;
	}
	
	public void informeAreaOficina() {
		for(Oficina oficinas : oficinas) {
			System.out.println("Oficina " + oficinas.getNombreOficina());
			oficinas.informeOficina();
			System.out.println("------------------------");
		}
	}
	
	



}
