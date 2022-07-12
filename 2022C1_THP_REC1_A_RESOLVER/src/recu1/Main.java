package recu1;

import recu1.clases.Rubro;
import recu1.clases.VoyDeCompras;

public class Main {

	public static void main(String[] args) {
		VoyDeCompras vdc = new VoyDeCompras();
		vdc.cargarCosasAComprar(Rubro.VERDULERIA,"papas", 8);
		vdc.cargarCosasAComprar(Rubro.CARNICERIA,"carne picada", 1);
		vdc.cargarCosasAComprar(Rubro.ALMACEN,"aceitunas", .25);
		vdc.cargarCosasAComprar(Rubro.VERDULERIA,"cebolla de verdeo", 2);
		vdc.cargarCosasAComprar(Rubro.VERDULERIA,"cebolla de verdeo", 2);
		vdc.cargarCosasAComprar(Rubro.ALMACEN,"huevos", 12);
		vdc.cargarCosasAComprar(Rubro.ALMACEN,"queso rallado", 1);
		vdc.cargarCosasAComprar(Rubro.ALMACEN,"fosforos", 1);
		vdc.salirDeCompras();
	}

}
