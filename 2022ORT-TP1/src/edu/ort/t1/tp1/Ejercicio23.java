package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n;
		System.out.println("Ingrese un numero entero");
		n = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + (n * i));
		}

		input.close();
	}
}
