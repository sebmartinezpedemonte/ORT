package parcial.trenes;

import java.util.ArrayList;

public class Empresa {
	private final int CANT_MAX_VAGONES = 30;
	private ArrayList<Tren> trenes;


	public Empresa() {
		trenes = new ArrayList<>();

	}

	public int crearFormacion() {
		Tren trenNuevo = new Tren();
		trenes.add(trenNuevo);
		System.out.println("crearFormacion() ->" + trenNuevo.getNroTren());
		return trenNuevo.getNroTren();
	}

	public Resultado agregarVagones(int nroTren, int cantVagones, TipoVagon tipoVagon) {
		Resultado resultado = null;
		Tren tren = buscarTren(nroTren);
		if (buscarTren(nroTren) == null) {
			System.out.println(
					"agregarVagones(" + nroTren + ", " + cantVagones + ", " + tipoVagon + ") - > NO_EXISTE_TREN");
			resultado = Resultado.NO_EXISTE_TREN;
		} else if (cantVagonesInValido(nroTren, cantVagones)) {
			System.out.println("agregarVagones(" + nroTren + ", " + cantVagones + ", " + tipoVagon
					+ ") - > CANT_VAGONES_INVALIDA");
			resultado = Resultado.CANT_VAGONES_INVALIDA;
		} else {
			
			tren.agregarVagones(cantVagones, tipoVagon);
			System.out.println(
					"agregarVagones(" + nroTren + ", " + cantVagones + ", " + tipoVagon + ") - > AGREGADO_OK");
			resultado = Resultado.AGREGADO_OK;
		}
		return resultado;
	}

	private Tren buscarTren(int nroTren) {
		Tren trenBuscar = null;
		int i = 0;
		while (trenes.size() > i && trenBuscar == null) {
			if (trenes.get(i).getNroTren() == nroTren) {
				trenBuscar = trenes.get(i);
			} else {
				i++;
			}
		}
		return trenBuscar;
	}

	private boolean cantVagonesInValido(int nroTren, int cantVagones) {
		boolean esValido = false;
		Tren tren = buscarTren(nroTren);
		if ((tren.getCantVagones() +cantVagones) > CANT_MAX_VAGONES || (cantVagones<= 0 || cantVagones > CANT_MAX_VAGONES)) {			
			esValido = true;
		}
		return esValido;
	}
	
	public double cargarTren(int nroTren, double cantToneladasCargar) {
		double toneladasNoCargadas = cantToneladasCargar;
		Tren tren = buscarTren(nroTren);
		if(tren!=null) {			
			toneladasNoCargadas = tren.llenarVagones(cantToneladasCargar);			
		}
		System.out.println("cargarTren("+ nroTren +", " +cantToneladasCargar +") -> " +  toneladasNoCargadas);		
		return toneladasNoCargadas;
	}
	
	public void listarCapacidadTrenes() {
		System.out.println("Capacidad disponible en cada tren:");
		for(Tren tren : trenes) {
			System.out.println("Tren: 1 Espacio Libre: " + tren.listarCapacidadTren() + "%");
		}
	}
	
	public int sacarVagonesIncompletos(int nroTren) {
		int vagonesASacar=-1;
		Tren tren = buscarTren(nroTren);
		if(tren != null) {
			vagonesASacar = tren.sacarVagonesIncompletos();
			
		}
		
		
		System.out.println("sacarVagonesIncompletos(" + nroTren + ") -> " + vagonesASacar);
		
		return vagonesASacar;
	}

	@Override
	public String toString() {
		return "Empresa [CANT_MAX_VAGONES=" + CANT_MAX_VAGONES + ", trenes=" + trenes
				 + "]";
	}

	


}
