package ort.edu.tp1.trabajopractico3.ejercicio1.ejemplo;

import ort.edu.tp1.trabajopractico3.ejercicio1.Asalariado;
import ort.edu.tp1.trabajopractico3.ejercicio1.Subcontratado;

public class TP3Test1 {
	public static void main(String[] args) {
		Asalariado a1 = new Asalariado("Jose", 30, 10000);
		Subcontratado s1 = new Subcontratado("Carlos", 23, 50, 100);
		
		System.out.println(a1);
		System.out.println(s1);
	}

}
