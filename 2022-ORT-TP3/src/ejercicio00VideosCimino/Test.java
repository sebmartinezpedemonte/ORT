package ejercicio00VideosCimino;

public class Test {
	public static void main(String[] args) {
		Instrumento instrumento1 = new Instrumento("JKD123", 2500, TipoInstrumento.CUERDA);
		Instrumento instrumento2 = new Instrumento("ALT980", 3000, TipoInstrumento.VIENTO);
		Instrumento instrumento3 = new Instrumento("POR456", 4500, TipoInstrumento.VIENTO);
		Instrumento instrumento4 = new Instrumento("LAK098", 6000, TipoInstrumento.PERCUSION);

		Fabrica fabrica1 = new Fabrica();
		Sucursal sucursal1 = new Sucursal("Palermo");
		Sucursal sucursal2 = new Sucursal("Almagro");
		fabrica1.agregarSucursal(sucursal2);
		fabrica1.agregarSucursal(sucursal1);
		
		sucursal1.agregarInstrumento(instrumento1);
		sucursal1.agregarInstrumento(instrumento2);
		sucursal2.agregarInstrumento(instrumento3);
		sucursal1.agregarInstrumento(instrumento4);
		
		fabrica1.listarInstrumentos();
		System.out.println(fabrica1.instrumentosPorTipo(TipoInstrumento.VIENTO));
		System.out.println(sucursal1.instrumentosPorTipo(TipoInstrumento.CUERDA));
		fabrica1.borrarInstrumento("JKD123");
		System.out.println(fabrica1.porcInstrumentosPorTipo(sucursal2));
	}
}
