package ar.edu.ort.thp.tp3.ej13;

import java.util.ArrayList;

public class ApareadorItems {

	public static void listarOrdenado(ArrayList<Item> coleccion1, ArrayList<Item> coleccion2) {
		int pos1 = 0;
		int pos2 = 0;
		while (pos1 < coleccion1.size() && pos2 < coleccion2.size()) {
			if (coleccion1.get(pos1).getValorFecha() < coleccion2.get(pos2).getValorFecha()) {
				pos1 = mostrarYAvanzar(coleccion1, pos1);
			} else {
				pos2 = mostrarYAvanzar(coleccion2, pos2);
			}
		}
		if (pos1 < coleccion1.size()) {
			completarRecorrido(coleccion1, pos1);
		} else {
			completarRecorrido(coleccion2, pos2);
		}
	}

	private static void completarRecorrido(ArrayList<Item> coleccion, int pos) {
		while (pos < coleccion.size()) {
			pos = mostrarYAvanzar(coleccion, pos);
		}
	}

	private static int mostrarYAvanzar(ArrayList<Item> coleccion, int pos) {
		System.out.println(coleccion.get(pos));
		return ++pos;
	}
	
}