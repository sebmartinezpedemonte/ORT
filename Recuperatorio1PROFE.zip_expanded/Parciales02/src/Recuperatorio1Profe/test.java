package Recuperatorio1Profe;



public class test {
public static void main(String[] args) {
	VoyDeCompras aplicacion1 = new VoyDeCompras();	

	Negocio negocio1 = new Negocio("Pop");
	Negocio negocio2 = new Negocio("Pop");
	Articulo articulo1 = new Articulo("Leche", 4);
	Articulo articulo2 = new Articulo("Papas", 2);
	aplicacion1.cargarCosasAComprar("Papas", 10);
	aplicacion1.cargarCosasAComprar("Leche", 10);
	aplicacion1.cargarCosasAComprar("Carne", 1);
	negocio1.agregarArticulo(articulo1);
	negocio1.agregarArticulo(articulo2);
	aplicacion1.agregarNegocio(negocio1);
	aplicacion1.agregarNegocio(negocio2);
	aplicacion1.salirDeCompras();
	
	
	
	
}
}
