package ort.edu.tp1.trabajopractico3.ejercicio3.ejemplo;

import ort.edu.tp1.trabajopractico3.ejercicio3.CasaElectrodomesticos;
import ort.edu.tp1.trabajopractico3.ejercicio3.Heladera;
import ort.edu.tp1.trabajopractico3.ejercicio3.Lavarropa;
import ort.edu.tp1.trabajopractico3.ejercicio3.Televisor;
import ort.edu.tp1.trabajopractico3.ejercicio3.TipoHeladera;
import ort.edu.tp1.trabajopractico3.ejercicio3.TipoLavarropas;
import ort.edu.tp1.trabajopractico3.ejercicio3.TipoTelevisor;


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
		
	}
}
