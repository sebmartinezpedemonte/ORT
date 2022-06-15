package ejercicio05;

import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException {
		Lector lector1 = new Lector("34146160", "Sebastian", "Charcas 1212", "45678921", "14/10/1988");
		Ejemplar ejemplar1 = new Ejemplar("123456789", "16/10/1988", Estado.BIBLIOTECA);
		Ejemplar ejemplar2 = new Ejemplar("789456123", "17/10/1988", Estado.BIBLIOTECA);
		Ejemplar ejemplar3 = new Ejemplar("741258963", "21/10/1988", Estado.BIBLIOTECA);
		Ejemplar ejemplar4 = new Ejemplar("852369741", "20/10/1988", Estado.BIBLIOTECA);
		//lector1.cantidadDeDias("12/10/1988");
		lector1.agregarEjemplar(ejemplar1);
		lector1.agregarEjemplar(ejemplar2);
		lector1.agregarEjemplar(ejemplar3);
		lector1.agregarEjemplar(ejemplar4);
		System.out.println(lector1.cantidadDeDias(ejemplar1));
		
		
	}
}
