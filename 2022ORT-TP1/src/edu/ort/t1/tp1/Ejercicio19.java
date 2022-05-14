package edu.ort.t1.tp1;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno= false;
		System.out.println("Ingrese un numero entero");
		num = input.nextInt();
		
		if(num>=-9 && num<=9) {
			esDeUnSoloDigito = true;
			if(num%2!=0) {
				esImpar=true;
				estaEnAmbos=true;
			}
		}else if(num%2!=0) {
			esImpar=true;
		}else{
			noEstaEnNinguno=true;
		}
		System.out.println(num + " esDeUnSoloDigito " + esDeUnSoloDigito);
		System.out.println(num + " esImpar " + esImpar );
		System.out.println(num + " estaEnAmbos " + estaEnAmbos);
		System.out.println(num + " noEstaEnNinguno " + noEstaEnNinguno);
		input.close();
	}
}
