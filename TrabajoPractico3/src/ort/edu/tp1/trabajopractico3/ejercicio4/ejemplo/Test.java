package ort.edu.tp1.trabajopractico3.ejercicio4.ejemplo;

import ort.edu.tp1.trabajopractico3.ejercicio4.*;


public class Test {
	public static void main(String[] args) {
		Televisor tv1 = new Televisor("Philips", "49PGFS", 1, 500, false, 14370, 49, TipoTelevisor.SMART);
		Heladera hela1 = new Heladera("Whirlpool", "H2745", 2, 400, false, 14999, 250, TipoHeladera.NO_FROST);
		Lavarropa lava1 = new Lavarropa("Drean", "CONCEPT 5.05", 3, 600, false, 6799, 6, TipoLavarropas.SEMIAUTOMATICO);
		
		CasaElectrodomesticos casa1 = new CasaElectrodomesticos("Fravega");
		casa1.cargarElectrodomesticos(tv1);
		casa1.cargarElectrodomesticos(hela1);
		casa1.cargarElectrodomesticos(lava1);		
		casa1.comprarElectrodomestico();
		
		Cliente cliente1 = new Cliente("205555654789", "Carlos", "Estevez");
		Ticket ticket1 = new Ticket("12/5/2022", cliente1, casa1.listaElectrodomesticosComprados() );
		ticket1.imprimir();
		
	}
}
