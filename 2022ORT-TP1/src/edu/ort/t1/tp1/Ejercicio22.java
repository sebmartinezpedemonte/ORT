package edu.ort.t1.tp1;

public class Ejercicio22 {
	public static void main(String[] args) {
		//el scope de int i esta en el for
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------------------");
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
