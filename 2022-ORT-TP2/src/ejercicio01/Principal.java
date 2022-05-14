package ejercicio01;

public class Principal {
public static void main(String[] args) {
	
	Ejercicio1 ej;
	ej = new Ejercicio1();
	int resultado;
	resultado = ej.sumar(1, 2);
	
	System.out.println(resultado);
	
	int resultado2;
	int min = 2;
	int max = 4;
	resultado2 = ej.pedirNumero("Ingrese un numero menor a " + min + " y mayor a " + max, min, max);
	
	System.out.println(resultado2);

}
	
	
}
