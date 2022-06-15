package parcial.trenes;

import java.util.ArrayList;

public class Tren {
	private final int CANT_MAX_VAGONES = 30;
	private static int id = 1;
	private int nroTren;
	private int cantVagones;
	private double toneladasTotales;
	public ArrayList<Vagon> vagones;

	public Tren() {
		super();
		nroTren = Tren.id++;
		vagones = new ArrayList<>();
		this.cantVagones = vagones.size();
		this.toneladasTotales = 0;

	}

	public int getNroTren() {
		return nroTren;
	}

	public void agregarVagones(int nroVagones, TipoVagon tipoVagon) {
		for (int i = 0; i < nroVagones; i++) {
			vagones.add(new Vagon(tipoVagon));
			cantVagones++;
		}
	}

	public boolean cantVagonesValido() {
		return cantVagones <= CANT_MAX_VAGONES;
	}

	public int getCantVagones() {
		return vagones.size();
	}

	public int getCantVagonesSMALL() {
		int cantSMALL = 0;
		for (Vagon vagon : vagones) {
			if (vagon.getTipoVagon().equals(TipoVagon.SMALL)) {
				cantSMALL++;
			}
		}
		return cantSMALL;
	}

	public int getCantVagonesMEDIUM() {
		int cantMEDIUM = 0;
		for (Vagon vagon : vagones) {
			if (vagon.getTipoVagon().equals(TipoVagon.MEDIUM)) {
				cantMEDIUM++;
			}
		}
		return cantMEDIUM;
	}

	public int getCantVagonesLARGE() {
		int cantLARGE = 0;
		for (Vagon vagon : vagones) {
			if (vagon.getTipoVagon().equals(TipoVagon.LARGE)) {
				cantLARGE++;
			}
		}
		return cantLARGE;
	}

	public int getCargaVagonSMALL() {
		int cargaVagonSMALL = 0;
		for (Vagon vagon : vagones) {
			if (vagon.getTipoVagon().equals(TipoVagon.SMALL)) {
				cargaVagonSMALL = vagon.getCargaPorTipo(TipoVagon.SMALL);
			}
		}
		return cargaVagonSMALL;
	}

	public int getCargaVagonMEDIUM() {
		int cargaVagonMEDIUM = 0;
		for (Vagon vagon : vagones) {
			if (vagon.getTipoVagon().equals(TipoVagon.MEDIUM)) {
				cargaVagonMEDIUM = vagon.getCargaPorTipo(TipoVagon.MEDIUM);
			}
		}
		return cargaVagonMEDIUM;
	}

	public int getCargaVagonLARGE() {
		int cargaVagonLARGE = 0;
		for (Vagon vagon : vagones) {
			if (vagon.getTipoVagon().equals(TipoVagon.LARGE)) {
				cargaVagonLARGE = vagon.getCargaPorTipo(TipoVagon.LARGE);
			}
		}
		return cargaVagonLARGE;
	}

	public int getCargaTotalTren() {
		return getCantVagonesSMALL() * getCargaVagonSMALL() + getCantVagonesMEDIUM() * getCargaVagonMEDIUM()
				+ getCantVagonesLARGE() * getCargaVagonLARGE();
	}

	public double gettoneladasTotales() {
		return this.toneladasTotales;
	}

	public double llenarVagones(double cantToneladasCargar) {
		toneladasTotales += cantToneladasCargar;
		double toneladasNoCargadas = toneladasTotales - getCargaTotalTren();
		if (toneladasNoCargadas < 0) {
			toneladasNoCargadas = 0;
		}
		return toneladasNoCargadas;
	}

	public double listarCapacidadTren() {
		double capacidad = 100 - toneladasTotales * 100 / getCargaTotalTren();
		if (capacidad < 0) {
			capacidad = 0;
		}
		return capacidad;
	}
	/*
	 * Un método llamado sacarVagonesIncompletos que reciba un número de tren y
	 * elimine los vagones que no estén totalmente llenos ni vacíos. Este método
	 * debe retornar cuántos vagones fueron eliminados. Si el tren no existe debe
	 * devolver -1.
	 * Tren: 1 Espacio Libre: 70.15%
Tren: 2 Espacio Libre: 0.00%
sacarVagonesIncompletos(1) -> 1
sacarVagonesIncompletos(1) -> 0
sacarVagonesIncompletos(999) -> -1
403 toneladas en 30 vagones de 40 toneladas y 50 toneladas que pueden cargar un total de 1350 ton
	 */

	public int sacarVagonesIncompletos() {

		//int vagonesASacar = vagones.size();
		int vagonesCompletos = (int) (((100-(int)listarCapacidadTren())) / vagones.size());
		//int vagonesCompletos = (int) (((toneladasTotales * 100 / getCargaTotalTren()) / vagones.size()));
		

		removerVagon(vagonesCompletos);
		return vagonesCompletos;
	}
	
	public void removerVagon(int vagonBorrar) {
		for(int i = 0 ; i< vagonBorrar ; i++) {
			vagones.remove(i);
		}
		
	}

	@Override
	public String toString() {
		return "Tren [CANT_MAX_VAGONES=" + CANT_MAX_VAGONES + ", nroTren=" + nroTren + ", cantVagones=" + vagones.size()
				+ ", toneladasTotales=" + toneladasTotales + ", vagones=" + vagones + "]";
	}
	
	

}
