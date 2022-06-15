package ejercicio00VideosCimino;

import java.util.ArrayList;

public class Sucursal {
	private String nombreSucursal;
	private ArrayList<Instrumento> instrumentos;

	public Sucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
		instrumentos = new ArrayList<>();
	}

	public void listarInstrumentos() {
		System.out.println(this.nombreSucursal);
		for (Instrumento instrumento : instrumentos) {
			System.out.println(instrumento.toString());
		}
	}

	public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipoInstrumento) {
		ArrayList<Instrumento> listaInstrumentos = new ArrayList<>();
		for (Instrumento instrumento : instrumentos) {
			if (instrumento.getTipoInstrumento().equals(tipoInstrumento)) {
				listaInstrumentos.add(instrumento);
			}
		}
		return listaInstrumentos;
	}

	public boolean mismoInstrumento(TipoInstrumento tipoInstrumento) {
		boolean mismo = false;
		for (Instrumento instrumento : instrumentos) {
			if (instrumento.getTipoInstrumento().equals(tipoInstrumento)) {
				mismo = true;
			}
		}
		return mismo;
	}

	private Instrumento buscarInstrumento(String ID) {
		Instrumento instrumentoEncontrado = null;
		int i = 0;
		while (instrumentos.size() > i && instrumentoEncontrado == null) {
			if (instrumentos.get(i).getID().equals(ID)) {
				instrumentoEncontrado = instrumentos.get(i);
			} else {
				i++;
			}
		}

		return instrumentoEncontrado;
	}

	public void borrarInstrumento(String ID) {
		Instrumento instrumentoRemover = null;
		instrumentoRemover = buscarInstrumento(ID);
		if (instrumentoRemover != null) {
			instrumentos.remove(instrumentoRemover);
		}

		// return instrumentoRemover;
	}

	public String getNombreSucursal() {
		return this.nombreSucursal;
	}

	public void agregarInstrumento(Instrumento instrumento) {
		instrumentos.add(instrumento);
	}

	public ArrayList<Porcentaje> porcInstrumentosPorTipo() {
		ArrayList <Porcentaje> listaPorcentajes = new ArrayList<>();
		int cuerda = 0;
		int viento = 0;
		int percusion = 0;
		int totalInstrumentos= 0;
		double porcCuerda = 0;
		double porcViento = 0;
		double porcPercusion = 0;
		for (Instrumento instrumento : instrumentos) {
			if (instrumento.getTipoInstrumento().equals(TipoInstrumento.CUERDA)) {
				cuerda++;
			} else if (instrumento.getTipoInstrumento().equals(TipoInstrumento.VIENTO)) {
				viento++;
			} else if (instrumento.getTipoInstrumento().equals(TipoInstrumento.PERCUSION)) {
				percusion++;
			}
			
		}
		totalInstrumentos = cuerda + viento + percusion;
		if(totalInstrumentos!=0) {
		porcCuerda = (double)cuerda*100/totalInstrumentos;
		porcViento = (double)viento*100/totalInstrumentos;
		porcPercusion = (double)percusion*100/totalInstrumentos;
		System.out.println(this.nombreSucursal);
		System.out.println("Cuerda :" + porcCuerda + "% , viento " + porcViento + "% , percusion " + porcPercusion + "%");
		}else {
			System.out.println("No hay instrumentos en la sucursal " + this.nombreSucursal);
		}
		Porcentaje porcentaje1 = new Porcentaje(porcCuerda, porcViento, porcPercusion);
		listaPorcentajes.add(porcentaje1);
		return listaPorcentajes;
	}

	@Override
	public String toString() {
		return "Sucursal [nombreSucursal=" + nombreSucursal + ", instrumentos=" + instrumentos + "]";
	}

}
