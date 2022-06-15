package ar.edu.ort.thp.tp3.ej2;

public class Test {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("La Empresa S.R.L.");

		// Metodos asociado a la carga de datos. No es requerido por el
		// ejercicio pero permite su prueba o "testing".
		empresa.agregarAreas();

		// Listado pedido por el enunciado
		empresa.listarEmpleados();

	}

}
