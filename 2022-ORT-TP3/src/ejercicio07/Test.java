package ejercicio07;

public class Test {
	public static void main(String[] args) {
	
		Aplicacion aplicacion1 = new Aplicacion("MusicApp");
		aplicacion1.altaCancion("Besame", "Luis Miguel", Genero.BOLERO, 1200);
		aplicacion1.altaCancion("Pop", "L-Gante", Genero.TRAP, 5);
		aplicacion1.altaCancion("Claro", "L-Gante", Genero.TRAP, 100);
		aplicacion1.altaUsuario("carlos@gmail.com", "Perez", 30, Categoria.GRATUITO);
		aplicacion1.altaUsuario("maria@gmail.com", "Perez", 50, Categoria.ESTANDAR);
		aplicacion1.altaUsuario("esteban@gmail.com", "Perez", 20, Categoria.PREMIUM);
		
		
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("carlos@gmail.com", "Pop", "L-Gante");
		//aplicacion1.listarUsuarios();
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		//aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		//aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		//aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		//aplicacion1.escucharCancion("carlos@gmail.com", "Claro", "L-Gante");
		//aplicacion1.listarUsuarios();
		//aplicacion1.listarCancionesPorUsuario("carlos@gmail.com");
		aplicacion1.escucharCancion("maria@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("maria@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("esteban@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("maria@gmail.com", "Claro", "L-Gante");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("esteban@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("esteban@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("esteban@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("esteban@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("maria@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("maria@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("maria@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("maria@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("maria@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("maria@gmail.com", "Besame", "Luis Miguel");

		System.out.println(aplicacion1.cantVecesCancionEscuchada("Besame", "Luis Miguel"));	
		System.out.println(aplicacion1.cantVecesCancionEscuchada("Pop", "L-Gante"));	
		aplicacion1.escucharCancion("maria@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("maria@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("maria@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("maria@gmail.com", "Pop", "L-Gante");
		aplicacion1.escucharCancion("carlos@gmail.com", "Besame", "Luis Miguel");
		System.out.println(aplicacion1.cantVecesCancionEscuchada("Besame", "Luis Miguel"));	
		System.out.println(aplicacion1.cantVecesCancionEscuchada("Pop", "L-Gante"));
		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel");
		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel");
System.out.println(		aplicacion1.escucharCancion("esteban@gmail.com", "Besame", "Luis Miguel")
);
	}
	
	
}
