package ort.edu.p1.tp3.ej15;

public class Test {
	public static void main(String[] args) {
		Inmueble inmueble1 = new Inmueble("charcas 1111", 60, 2,200000 );
		
		Cliente cliente1 = new Cliente("Martinez", "Sebastian", "1534567489" , "seba@mail.com");
		
		Inmobiliaria inmobiliaria1 = new Inmobiliaria("Pop", "pop@pop.com", 10);
		
		inmueble1.agregarInteresados(inmobiliaria1);
		inmueble1.agregarInteresados(cliente1);
		inmueble1.setPrecio(350000);
		
	}
}
