package resueltoprimerparcialprog12022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

		/*
		Menu menu1 = new Menu("Menu Principal", input);
		Menu menu2 = new Menu("Opcion 1", input);
		Menu menu3 = new Menu("Opcion 2", input);
		Menu menu4 = new Menu("Acceso a Submenu 1", input);
		Menu menu5 = new Menu("Acceso a Submenu 2", input);
		menu1.registrar(new OpcionAccesoAMenu("Opcion 1", '1', menu2));
		menu1.registrar(new OpcionAccesoAMenu("Opcion 2", '2', menu3));
		menu1.registrar(new OpcionAccesoAMenu("Acceso a Submenu 1", '3', menu4));
		menu4.registrar(new OpcionAccesoAMenu("Acceso a Submenu 2", '1', menu5));
		menu1.ejecutar();*/
	    Menu menu1 = new Menu("Menu principal", input);
		Menu submenu1 = new Menu("Submenu 1", input);
		Menu submenu2 = new Menu("Submenu 2", input);
		
		OpcionDeMenu opcion1 = new OpcionAccesoAMenu("Opcion 1", '1', submenu1);
		OpcionDeMenu opcion2 = new OpcionAccesoAMenu("Opcion 2", '2', submenu2);
		
		menu1.registrar(opcion1);
		menu1.registrar(opcion2);
		menu1.ejecutar();
	}
}
//menu1.registrar(new OpcionAccesoAMenu("Opcion 2", '2', null));//con validacion deberia no ingresarla
//menu1.registrar(new OpcionDeSalida());//con validacion no deberia ingresarla ya que esta en el sistema ya que se crea con el constructor
//menu1.registrar(null);//esta da que no se pueden aceptar null