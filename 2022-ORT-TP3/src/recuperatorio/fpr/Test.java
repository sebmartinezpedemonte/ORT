package recuperatorio.fpr;

public class Test {
	public static void main(String[] args) {
		Aplicacion aplicacion1= new Aplicacion("Shopping");
		Negocio negocio1 = new Negocio("Pop");
		Negocio negocio2 = new Negocio("Pop");
		Articulo articulo1 = new Articulo("Leche", 4);
		Articulo articulo2 = new Articulo("Papas", 20);
		aplicacion1.cargarCosasAComprar("Papas", 10);
		aplicacion1.cargarCosasAComprar("Leche", 1);
		aplicacion1.cargarCosasAComprar("Carne", 1);
		negocio1.agregarArticulo(articulo1);
		negocio1.agregarArticulo(articulo2);
		aplicacion1.agregarNegocio(negocio1);
		aplicacion1.agregarNegocio(negocio2);
		aplicacion1.salirDeCompras();
		
		
		
	}
}
