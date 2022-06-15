package ejercicio00VideosCimino;

import java.util.ArrayList;

public class Fabrica {

	private ArrayList<Sucursal> sucursales;

	public Fabrica() {
		sucursales = new ArrayList<>();
	}

	public void listarInstrumentos() {
		for (Sucursal sucursal : sucursales) {
			sucursal.listarInstrumentos();
		}
	}

	public void agregarSucursal(Sucursal sucursal) {
		sucursales.add(sucursal);
	}

	public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipoInstrumento) {
		ArrayList<Instrumento> listaInstrumentos = new ArrayList<>();
		for (Sucursal sucursal : sucursales) {
			listaInstrumentos.addAll(sucursal.instrumentosPorTipo(tipoInstrumento));			
		}
		return listaInstrumentos;
	}

	
	public void borrarInstrumento(String ID) {
		for(Sucursal sucursal : sucursales) {
			sucursal.borrarInstrumento(ID);
		}
	}
	
	public ArrayList<Porcentaje> porcInstrumentosPorTipo(Sucursal sucursal){
		ArrayList<Porcentaje> porcentajes = new ArrayList<>();
		porcentajes.addAll(sucursal.porcInstrumentosPorTipo());
		return porcentajes;
	}

	@Override
	public String toString() {
		return "Fabrica [sucursales=" + sucursales + "]";
	}

}
