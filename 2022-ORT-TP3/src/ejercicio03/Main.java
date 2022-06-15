package ejercicio03;

public class Main {
	public static void main(String[] args) {

		Barrio barrio1 = new Barrio("Palermo");
		Barrio barrio2 = new Barrio("Olivos");

		barrio1.agregarPropiedad("Charcas 1000", 1500000, TipoPropiedad.CASA);
		barrio1.agregarPropiedad("Charcas 3000", 2000000, TipoPropiedad.CASA);
		barrio2.agregarPropiedad("Charcas 1500", 3000000, TipoPropiedad.PH);
		barrio2.agregarPropiedad("Charcas 2715", 1250000, TipoPropiedad.DEPARTAMENTO);

		// barrio1.mostrarPropiedades(TipoPropiedad.CASA);
		Inmobiliaria inmobiliaria1 = new Inmobiliaria("Perez");
		inmobiliaria1.agregarBarrio(barrio1);
		inmobiliaria1.agregarBarrio(barrio2);
		inmobiliaria1.mostrarPropiedades();
		System.out.println(inmobiliaria1.borrarPropiedad("Charcas 1000"));
		// barrio1.mostrarPropiedades();
		// inmobiliaria1.mostrarBarrioMaxProp();
		// inmobiliaria1.alternativaMostrarBarrioMaxProp();

		// inmobiliaria1.cambiarPropiedadDeBarrio("Charcas 2715", barrio2);
		// System.out.println(inmobiliaria1.cambiarPropiedadDeBarrio("Charcas 2715",
		// barrio2));

		inmobiliaria1.mostrarPropiedades();
		inmobiliaria1.alternativaCambiarPropiedadDeBarrio("Charcas 3000", barrio2);
		inmobiliaria1.mostrarPropiedades();
		System.out.println(inmobiliaria1);

	}
}
