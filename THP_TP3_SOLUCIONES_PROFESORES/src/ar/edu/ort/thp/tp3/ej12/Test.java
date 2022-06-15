package ar.edu.ort.thp.tp3.ej12;

public class Test {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("La Empresa S.R.L.");
		
		//metodos asociados a la carga de datos
		empresa.agregarArea("Area 1");
		empresa.agregarArea("Area 51");
		empresa.agregarOficina("Are 1", 1);
		empresa.agregarOficina("Area 1", 1);
		empresa.agregarOficina("Area 1", 2);
		empresa.agregarOficina("Area 51", 1);
		empresa.agregarEmpleado("Area 1", 1, "Pepa", "Lajeffa");
		empresa.agregarEmpleado("Area 1", 1, "Wilfredo", "Smitters");
		empresa.agregarEmpleado("Area 1", 2, "Bruno", "Iluomo Pipistrello");
		empresa.agregarEmpleado("Area 51", 1, "Ití", "Fonjom");
		empresa.agregarEmpleado("Area 51", 1, "Jorgito", "Grinman");
		empresa.agregarEmpleado("Area 51", 51, "Elmos", "Truito");
		empresa.agregarEmpleado("Area 1", 1, "Jorgito", "Grinman");
		empresa.asignarResponsable("Area 51", 1, 5);

		// Listado pedido por el enunciado
		empresa.listarEmpleados();

	}

}
