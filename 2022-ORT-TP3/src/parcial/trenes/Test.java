package parcial.trenes;

public class Test {
	public static void main(String[] args) {
		Empresa empresa1 = new Empresa();

		empresa1.crearFormacion();
		empresa1.crearFormacion();
		System.out.println();
		empresa1.agregarVagones(1, 15, TipoVagon.MEDIUM);
		empresa1.agregarVagones(1, 15, TipoVagon.LARGE);
		empresa1.agregarVagones(2, 20, TipoVagon.SMALL);
		empresa1.agregarVagones(2, 20, TipoVagon.MEDIUM);
		System.out.println(empresa1);
		empresa1.agregarVagones(999, 2, TipoVagon.MEDIUM);
		System.out.println();
		empresa1.cargarTren(1, 151.0);
		empresa1.cargarTren(1, 252.0);
		empresa1.cargarTren(2, 353.0);
		empresa1.cargarTren(2, 4567.0);
		empresa1.cargarTren(999, 1.0);
		System.out.println(empresa1);
		empresa1.listarCapacidadTrenes();
		empresa1.sacarVagonesIncompletos(1);
		empresa1.sacarVagonesIncompletos(1);
		empresa1.sacarVagonesIncompletos(999);
		

		
	}

}
