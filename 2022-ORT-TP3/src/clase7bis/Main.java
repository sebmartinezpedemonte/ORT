package clase7bis;

public class Main {
	public static void main(String[] args) {
		Concesionaria concesionaria1 = new Concesionaria("Consecionaria Lopez");

		Auto auto1 = new Auto("BMW", "X7", "AA123BB", Color.AZUL);
		Auto auto2 = new Auto("Peugeot", "2008", "AE592DG", Color.BLANCO);
		Auto auto3 = new Auto("Peugeot", "2008", "BB123AA", Color.AZUL);
		/*
		System.out.println(concesionaria1.getNombre());
		concesionaria1.agregarAutoNuevo(auto1);
		concesionaria1.agregarAutoNuevo(auto2);
		concesionaria1.mostrarAutos();
		concesionaria1.eliminarAuto(auto1);
		System.err.println("Se ha vendido el auto " + auto1.toString());

		System.out.println("**********************************");
		concesionaria1.mostrarAutos();
		concesionaria1.agregarAutoUsado("Renault", "19", "TGM 130", Color.GRIS);
		System.out.println("**********************************");
		concesionaria1.mostrar();
		*/
		concesionaria1.agregarAutoNuevo(auto1);
		concesionaria1.agregarAutoNuevo(auto2);
		concesionaria1.agregarAutoNuevo(auto3);
		concesionaria1.mostrarUltimo();
		concesionaria1.modificarColor("BB123AA", Color.NEGRO);
		//concesionaria1.modificarColorBis("BB123AA", Color.BLANCO);
		concesionaria1.mostrar();

	}
}
