package ejparcial;
/*
 * Los productos tienen un nombre y una descripci�n. Aquellos que son electrodom�sticos adem�s poseer�n un indicador de uso. Cuando este nivel de uso est� entre 70 y 100, su funcionamiento ser� BUENO, si es menor a 70 pero mayor que 45 ser� REGULAR, y, si no, ser� MALO.
Cuando se trate de un juego de mesa poseer� la cantidad de jugadores y cartas disponibles, su calificaci�n ser� BUENO si la cantidad de cartas es m�ltiplo de la cantidad de jugadores, sino ser� MALO (sin posibilidad de ser REGULAR).
Por �ltimo, si el producto se trata de un veh�culo, ser� BUENO cuando su cantidad de kms sea menor a 10kms y ser� MALO si tiene m�s de 50km, siendo REGULAR en el resto de los casos.

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
