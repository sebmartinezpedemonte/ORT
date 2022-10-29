package ejparcial;
/*
 * Los productos tienen un nombre y una descripción. Aquellos que son electrodomésticos además poseerán un indicador de uso. Cuando este nivel de uso esté entre 70 y 100, su funcionamiento será BUENO, si es menor a 70 pero mayor que 45 será REGULAR, y, si no, será MALO.
Cuando se trate de un juego de mesa poseerá la cantidad de jugadores y cartas disponibles, su calificación será BUENO si la cantidad de cartas es múltiplo de la cantidad de jugadores, sino será MALO (sin posibilidad de ser REGULAR).
Por último, si el producto se trata de un vehículo, será BUENO cuando su cantidad de kms sea menor a 10kms y será MALO si tiene más de 50km, siendo REGULAR en el resto de los casos.

 */
public class Test {
public static void main(String[] args) {
	Fabrica fab1 = new Fabrica();
	fab1.agregarProductos(new Electrodomestico("Lavarropas", "lava", 80));
	fab1.agregarProductos(new Electrodomestico("Lavarropas2", "lava", 40));
	fab1.agregarProductos(new JuegoDeMesa("Truco", "genial", 4, 40));
	fab1.agregarProductos(new Vehiculo("Ford", "Fiesta", 5));
	fab1.agregarProductos(new Vehiculo("Mercedes", "Clase E", 25));
	fab1.agregarProductos(new Vehiculo("Mercedes", "Clase C", 60));
	fab1.mostrarBuenos();
	System.out.println(fab1.promedioKmsHastaMantenimiento());
	
	
}
}
