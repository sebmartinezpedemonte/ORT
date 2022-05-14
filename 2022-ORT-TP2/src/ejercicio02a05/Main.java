package ejercicio02a05;

public class Main {
	public static void main(String[] args) {
		Persona pers1 = new Persona();
		Persona pers2 = new Persona();

		pers1.ponerNombre("Fulano");
		pers1.ponerApellido("Gomez");

		String nombreYApellido = pers1.obtenerNombreCompleto();
		System.out.println(nombreYApellido);

		pers2.ponerNombre("Seba");
		pers2.ponerApellido("Martinez");
		System.out.println(pers2.obtenerNombreCompleto());

		System.out.println(pers1);
		Domicilio domicilio1 = new Domicilio();
		System.out.println(domicilio1);
		domicilio1.setCalle("Charcas");
		domicilio1.setNumero("1425");
		domicilio1.setCiudad("Buenos Aires");
		pers1.setDomicilio(domicilio1);
		System.out.println(pers1);
		pers2.setDomicilio(domicilio1);
		System.out.println(pers2);
		domicilio1.setNumero("1111");
		System.out.println(pers2);
		System.out.println(pers1.mostrarDomicilio());

	}
}
