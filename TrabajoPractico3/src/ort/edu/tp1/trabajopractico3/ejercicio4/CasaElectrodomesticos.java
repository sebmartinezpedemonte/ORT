package ort.edu.tp1.trabajopractico3.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class CasaElectrodomesticos {

	private final static Scanner input = new Scanner(System.in);

	String nombre;
	private ArrayList<Electrodomestico> electrodomesticos;
	ArrayList<Electrodomestico> electrodomesticosElegidos;

	public CasaElectrodomesticos(String nombre) {
		this.nombre = nombre;
		this.electrodomesticos = new ArrayList<>();
		electrodomesticosElegidos = new ArrayList<>();
	}
	
	//uso el this para poder encadenar los add
	public CasaElectrodomesticos cargarElectrodomesticos(Electrodomestico elec) {
		electrodomesticos.add(elec);
		return this;
	}

	private void ofrecerProductos() {
		System.out.println("Estos son los electrodomesticos que tenemos:");
		electrodomesticos.forEach(System.out::println);
	}
	
	//electrodomesticos.forEach(e -> System.out.println(e));
	//for (Electrodomestico elec : electrodomesticos) {
	//	System.out.println(elec);
	//}

	public ArrayList<Electrodomestico> comprarElectrodomestico() {
		// ArrayList<Electrodomestico> electrodomesticosElegidos = new ArrayList<>();
		ofrecerProductos();
		System.out.println("Que electrodomesticos desea llevar? Presione 0 si desea acabar la venta");
		try {
		int nroElectro = Integer.parseInt(input.nextLine());
		
		while (electrodomesticos.size() > 0 && nroElectro != 0) {

			Electrodomestico electroComprar = buscarElectrodomestico(nroElectro);
			if (electroComprar == null) {
				System.out.println("Ese item no esta ofrecido, elija entre los ofrecidos");
			} else {
				electrodomesticosElegidos.add(electroComprar);
				electrodomesticos.remove(electroComprar);
			}
			if (electrodomesticos.size() > 0) {
				ofrecerProductos();
				System.out.println("Que electrodomesticos desea llevar? Presione 0 si desea acabar la venta");
				nroElectro = Integer.parseInt(input.nextLine());
			}
		}
		}catch(IllegalArgumentException e) {
			System.out.println("El caracter ingresado es invalido: " + e.getMessage());
			comprarElectrodomestico();
		}
		
		if (electrodomesticosElegidos.size() > 0) {
			// detalleCompleto(electrodomesticosElegidos);
		} else {
			System.out.println("No se ha realizado una compra");
		}
		return electrodomesticosElegidos;
	}

	public ArrayList<Electrodomestico> listaElectrodomesticosComprados() {
		ArrayList<Electrodomestico> lista = new ArrayList<>();
		lista = electrodomesticosElegidos;
		return lista;
	}
	/*
	private Electrodomestico buscarElectrodomestico(int nroSerie) {
		int i = 0;
		Electrodomestico electroBuscar = null;
		while (electrodomesticos.size() > i && electroBuscar == null) {
			if (electrodomesticos.get(i).getNroSerie() == nroSerie) {
				electroBuscar = electrodomesticos.get(i);
			} else {
				i++;
			}
		}
		return electroBuscar;
	}
	*/
	/*private Electrodomestico buscarElectrodomestico(int nroSerie) {
		Electrodomestico elecBuscar = null;
		try {
			elecBuscar = electrodomesticos.stream()
					.filter(a -> a.getNroSerie() == nroSerie)
					.findFirst().get();
		}catch(RuntimeException e) {
			
		}		
		return elecBuscar;
	}*/
	
	private Electrodomestico buscarElectrodomestico(int nroSerie) {
		return electrodomesticos.stream()
					.filter(a -> a.getNroSerie() == nroSerie)
					.findFirst().orElse(null);		
	}

	
	
	/*
	 * Articulos: Heladera Whirlpool, modelo H2745, no frost, capacidad 250 litros:
	 * $14999. Televisor smart Philips 49 pulgadas, modelo 49PGFS: $14370.
	 * Lavarropas Drean semi automático, carga máxima 6kg, modelo CONCEPT 5.05:
	 * $6799. Total: $36168
	 */
	/*
	private void detalleCompleto(ArrayList<Electrodomestico> electrodomesticosElegidos) {
		int total = 0;
		System.out.println("Ticket de venta");
		System.out.println("Articulos:");
		for (Electrodomestico elec : electrodomesticosElegidos) {
			System.out.println(elec.detalleCompleto());
			total += elec.getPrecio();
		}
		System.out.println("Total: $" + total);
	}
	*/
}
