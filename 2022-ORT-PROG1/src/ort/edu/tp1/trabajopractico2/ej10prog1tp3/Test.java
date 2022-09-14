package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public class Test {
public static void main(String[] args) {
	Puerto p1 = new Puerto("Olivos");
	Amarra a1 = new Amarra(120, "I2" );
	Amarra a2 =new Amarra(121, "H2" );
	Amarra a3 =new Amarra(122, "F2" );
	Amarra a4 =new Amarra(123, "D2" );
	Amarra a5 = new Amarra(124, "P1" );
	EmbarcacionDeportiva embdep1 = new EmbarcacionDeportiva("123456", 10, 2002, "Carlos Perez", 1200, 70);
	EmbarcacionDeportivaDeLujo embdep2 = new EmbarcacionDeportivaDeLujo("7776", 32, 2015, "Miguel Perez", 2400, 85);
	p1.agregarAmarra(a1);
	EmbarcacionDeportiva embdep3 = new EmbarcacionDeportiva("99999", 8, 1988, "Juan Perez", 1600, 1);
	EmbarcacionDeportivaDeLujo embdep4 = new EmbarcacionDeportivaDeLujo("2586", 32, 2015, "Maria Perez", 1, 1);
	p1.agregarAmarra(a2);
	p1.agregarAmarra(a3);
	p1.agregarAmarra(a4);
	Velero vel1 = new Velero("7854", 123, 1999, "Juan Lopez", 12);
	p1.agregarAmarra(a5);
	a1.alquilarAmarra(vel1);
	a2.alquilarAmarra(embdep1);
	a3.alquilarAmarra(embdep3);
	a4.alquilarAmarra(embdep4);

	
	System.out.println(p1.barcoConMayorConsumo());

	System.out.println(p1.barcosConAlquilerMayorA(500000));
	System.out.println(p1.barcosConAlquilerMayorA(5000000));
	
	
	
}
}
