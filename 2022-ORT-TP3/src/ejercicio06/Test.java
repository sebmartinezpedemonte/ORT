package ejercicio06;

public class Test {
	public static void main(String[] args) {
		Pelicula pelicula1 = new Pelicula("Batman", Categoria.STANDARD);
		Pelicula pelicula2 = new Pelicula("Superman", Categoria.STANDARD);
		Pelicula pelicula3 = new Pelicula("Dr Strange", Categoria.PREMIUM);
		
		
		Sitio sitio1 = new Sitio("ORTFlix");
		System.out.println(sitio1.darDeAlta("34789456", Categoria.STANDARD));
		Cliente cliente1 = sitio1.buscarCliente("34789456");
		System.out.println(sitio1.darDeAlta("12345678", Categoria.PREMIUM));
		Cliente cliente2 = sitio1.buscarCliente("12345678");
		cliente1.setNombre("Sebastian");
		cliente2.setNombre("Carlos");
		cliente2.setSaldo(100); //seteamos que debe para probar metodos
		/*
		System.out.println(cliente1.esDeudor());
		System.out.println(cliente2.esDeudor());
		System.out.println(cliente1.esClientePremium());
		System.out.println(cliente2.esClientePremium());
		System.out.println(cliente1.historialPeliculas(pelicula1));
		System.out.println(cliente1.historialPeliculas(pelicula2));
		System.out.println(cliente1.historialPeliculas(pelicula3));
		System.out.println(cliente2.historialPeliculas(pelicula1));
		System.out.println(cliente2.historialPeliculas(pelicula3));
		System.out.println(cliente1);
		System.out.println(cliente2);
		*/

		sitio1.agregarPelicula(pelicula1);
		sitio1.agregarPelicula(pelicula2);
		sitio1.agregarPelicula(pelicula3);
		
		System.out.println(sitio1.buscarPelicula("Batman"));
		System.out.println(sitio1);
		sitio1.darDeBaja("12345678");
		System.out.println(sitio1.darDeAlta("987654321", Categoria.STANDARD));
		System.out.println(sitio1.verPelicula("34789456", "Batman"));
		Cliente cliente3 = sitio1.buscarCliente("987654321");
		cliente3.setSaldo(150);
		System.out.println(sitio1.darDeBaja("12345678"));
		System.out.println(sitio1.darDeBaja("987654321"));
		System.out.println(sitio1.darDeAlta("74185296", Categoria.STANDARD));
		System.out.println(sitio1.darDeAlta("12345678", Categoria.PREMIUM));
		cliente2.setSaldo(10);
		sitio1.depurarListaNegra(100);
		System.out.println(sitio1.darDeAlta("12345678", Categoria.PREMIUM));
		System.out.println(sitio1.darDeAlta("987654321", Categoria.STANDARD));


		
		
		
	}
}
