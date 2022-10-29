package parcial1.clases.menues;

import java.util.ArrayList;
import java.util.Scanner;

import parcial1.clases.Ejecutable;
import parcial1.clases.Mostrable;
import parcial1.clases.OpcionDeMenu;
import parcial1.clases.OpcionDeSalida;

public class Menu implements Ejecutable, Mostrable {
	private ArrayList<OpcionDeMenu> items;
	private OpcionDeSalida salida;
	private String titulo;
	private Scanner input;

	public Menu(String titulo, Scanner input) {
		this.input = input;
		setTitulo(titulo);
		items = new ArrayList<>();
		salida = new OpcionDeSalida();
	}

	private OpcionDeMenu buscarOpcion(char caracterIngresado) {
		OpcionDeMenu opcion = null;
		if (caracterIngresado == salida.getCharSelector())
			opcion = salida;
		else {
			int pos = 0;
			while (pos < items.size() && items.get(pos).getCharSelector() != caracterIngresado)
				pos++;
			if (pos < items.size())
				opcion = items.get(pos);
		}
		return opcion;
	}

	@Override
	public void ejecutar() {
		OpcionDeMenu opcion = elegirOpcion();
		while (!opcion.equals(salida)) {
			opcion.ejecutar();
			opcion = elegirOpcion();
		}
	}

	private OpcionDeMenu elegirOpcion() {
		char ch;
		OpcionDeMenu opcion = null;
		mostrar();
		do {
			System.out.println("Ingrese la opcion deseada");
			try {
				ch = input.nextLine().toUpperCase().charAt(0);
				opcion = buscarOpcion(ch);
			} catch (Exception e) {
			}
		} while (opcion == null);
		return opcion;
	}

	public void mostrar() {
		System.out.println("-- " + titulo + " --");
		for (OpcionDeMenu opcion : items) {
			opcion.mostrar();
		}
		salida.mostrar();
	}

	public void registrar(ArrayList<OpcionDeMenu> opciones) {
		for (OpcionDeMenu opcion : opciones) {
			registrar(opcion);
		}
	}

	public void registrar(OpcionDeMenu opcion) {
		if (opcion != null) {
			items.add(opcion);
		}
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected ArrayList<OpcionDeMenu> getItems() {
		ArrayList<OpcionDeMenu> copia = new ArrayList<>();
		for (OpcionDeMenu item : items) {
			// esta no es la mejor forma de hacer la copia de las opciones del menu.
			// pero es la mejor que podemos hacer por ahora.
			copia.add(item);
			
			// esta que dejamos aqui debajo es la manera correcta pues crea una copia de cada objeto.
			// tiene un costo: por favor vean las lineas comentadas y explicadas en la clase OpcionDeMenu.
			// Hablaremos de esto en clase.
			// try {
			//	copia.add(item.clone());
			//} catch (CloneNotSupportedException e) {
			//	e.printStackTrace();
			//}
		}
		return copia;
	}

}
