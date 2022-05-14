package edu.ort.t1.ejercitacion.parcial1;

import java.util.Scanner;

public class EjParcial1_Fastfood {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);

		final int PEDIDO_MINIMO = 550;
		final int COMBO = 1;
		final int HAMBURGUESA_SOLA = 2;
		final int HAMBURGUESA_CON_QUESO = 3;
		final int GASEOSA = 4;
		final int POSTRE = 5;
		final int PAGAR_COMPRA = 6;
		final int CANCELAR_COMPRA = 7;
		final int PRECIO_COMBO = 550;
		final int PRECIO_HAMBURGUESA_SOLA = 300;
		final int PRECIO_HAMBURGUESA_CON_QUESO = 330;
		final int PRECIO_GASEOSA = 150;
		final int PRECIO_POSTRE = 100;
		int opcion;
		int subTotal = 0;
		int total = 0;
		// cantCombo = 0;
		int cantHamburguesaSola = 0;
		int cantHamburguesaConQueso = 0;
		int cantGaseosa = 0;
		int cantPostre = 0;
		int cantCadaOpcion = 0;

		do {
			System.out.println(
					"Elija una de las siguientes opciones : \n1-Combo $ 550 \n2-Hamburguesa sola $ 300 \n3-Hamburguesa con queso $ 330 \n4-Gaseosa $ 150 \n5-Postre $ 100 \n6-Pagar compra \n7-Cancelar compra");
			opcion = Integer.parseInt(input.nextLine());
		} while (opcion < COMBO || opcion > CANCELAR_COMPRA);

		if (opcion != PAGAR_COMPRA) {

			while (opcion != CANCELAR_COMPRA && (total < PEDIDO_MINIMO || opcion != PAGAR_COMPRA)) {

				if (opcion > COMBO && opcion < PAGAR_COMPRA) {

					System.out.println("Cuantas desea?");
					cantCadaOpcion = Integer.parseInt(input.nextLine());
				}

				for (int i = 0; i <= cantCadaOpcion; i++) {
					switch (opcion) {
					case HAMBURGUESA_SOLA:
						cantHamburguesaSola += i;
						break;
					case HAMBURGUESA_CON_QUESO:
						cantHamburguesaConQueso += i;
						break;
					case GASEOSA:
						cantGaseosa += i;
						break;
					case POSTRE:
						cantPostre += i;
						break;
					default:
						break;
					}
				}

				if (opcion != COMBO) {
					subTotal = cantHamburguesaSola * PRECIO_HAMBURGUESA_SOLA
							+ cantHamburguesaConQueso * PRECIO_HAMBURGUESA_CON_QUESO + cantGaseosa * PRECIO_GASEOSA
							+ cantPostre * PRECIO_POSTRE;

				} else {
					subTotal = PRECIO_COMBO;
				}
				total += subTotal;
				subTotal = total;
				System.out.println("El subtotal es de " + subTotal);
				cantHamburguesaSola = 0;
				cantHamburguesaConQueso = 0;
				cantGaseosa = 0;
				cantPostre = 0;
				subTotal = 0;
				if (total < 550) {
					System.out.println("El minimo de compra es de $550");
				}
				do {
					System.out.println(
							"Elija una de las siguientes opciones : \n1-Combo $ 550 \n2-Hamburguesa sola $ 300 \n3-Hamburguesa con queso $ 330 \n4-Gaseosa $ 150 \n5-Postre $ 100 \n6-Pagar compra \n7-Cancelar compra");
					opcion = Integer.parseInt(input.nextLine());
				} while (opcion < COMBO || opcion > CANCELAR_COMPRA);

			}

		}

		if (opcion != CANCELAR_COMPRA && total > PEDIDO_MINIMO) {
			System.out.println("El total a pagar es de " + total);
		} else {
			System.out.println("Pedido Cancelado");
		}

		input.close();
	}
}
