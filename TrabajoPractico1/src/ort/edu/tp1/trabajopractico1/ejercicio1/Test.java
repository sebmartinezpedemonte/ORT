package ort.edu.tp1.trabajopractico1.ejercicio1;

public class Test {
	
	
	
	public static void main(String[] args) {
		Grupo grupo1 = new Grupo("grupo1");
		
		grupo1.agregarIntegrante("Sebastian Martinez");
		grupo1.agregarIntegrante("Juan");
		grupo1.agregarIntegrante("Miguel");
		grupo1.agregarIntegrante("Matias");
		grupo1.agregarIntegrante("Catalina");
		grupo1.agregarIntegrante("Bea");
		fueAgregado(grupo1,"Juan");
		fueAgregado(grupo1,"Carlo");
		grupo1.mostrar();
		System.out.println(grupo1.removerIntegrante("Bea"));
		System.out.println(grupo1.removerIntegrante("Bea"));
		grupo1.mostrar();
		grupo1.vaciar();
		grupo1.mostrar();
		
			
	}
	public static boolean fueAgregado(Grupo grupo , String nombreIntegrante) {
		boolean fueAgregado = false;
		if(grupo != null) {
			if(grupo.buscarIntegrante(nombreIntegrante) != null) {
				fueAgregado = true;
			}
		}
		if(fueAgregado) {
			System.out.println("El integrante "+ nombreIntegrante + " ya fue agregado");
		}else {
			System.out.println("El integrante "+ nombreIntegrante + " no fue agregado");
		}
		return fueAgregado;
	}
}
