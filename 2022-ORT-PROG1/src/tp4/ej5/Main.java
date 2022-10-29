package tp4.ej5;

public class Main {
	public static void main(String[] args) {
		
		Empresa empresa1 = new Empresa("Cachito");
		
		Camion camion1 = new Camion(350);
		Camion camion2 = new Camion(450);
		Camion camion3 = new Camion(150);
		Camion camion4 = new Camion(50);
		Camion camion5 = new Camion(90);
		Camion camion6 = new Camion(35);
		Camion camion7 = new Camion(30);
		Camion camion8 = new Camion(550);
		Camion camion9 = new Camion(650);
		Camion camion10 = new Camion(850);
		Chofer chofer1 = new Chofer("1" , "Juan" , 300);
		Chofer chofer2 = new Chofer("2" , "Miguel" , 300);
		Chofer chofer3 = new Chofer("3" , "Juan" , 300);
		Chofer chofer4 = new Chofer("4" , "Juan" , 300);
		Chofer chofer5 = new Chofer("5" , "Juan" , 300);
		Chofer chofer6 = new Chofer("6" , "Juan" , 300);
		Chofer chofer7 = new Chofer("7" , "Juan" , 300);
		Chofer chofer8 = new Chofer("8" , "Juan" , 300);
		Chofer chofer9 = new Chofer("9" , "Juan" , 300);
		Chofer chofer10 = new Chofer("10" , "Juan" , 300);
		Chofer chofer11 = new Chofer("11" , "Juan" , 300);
		Chofer chofer12 = new Chofer("12" , "Juan" , 300);
		Chofer chofer13 = new Chofer("13" , "Juan" , 300);
		Chofer chofer14 = new Chofer("14" , "Juan" , 300);
		Chofer chofer15 = new Chofer("15" , "Juan" , 300);
		Chofer chofer16 = new Chofer("16" , "Juan" , 300);
		Chofer chofer17 = new Chofer("17" , "Juan" , 300);
		Chofer chofer18 = new Chofer("18" , "Juan" , 300);
		Chofer chofer19 = new Chofer("19" , "Juan" , 300);
		Chofer chofer20 = new Chofer("20" , "Juan" , 300);

		
		empresa1.agregarCamion(camion1)
				.agregarCamion(camion2)
				.agregarCamion(camion3)
				.agregarCamion(camion4)
				.agregarCamion(camion5)
				.agregarCamion(camion6)
				.agregarCamion(camion7)
				.agregarCamion(camion8)
				.agregarCamion(camion9)
				.agregarCamion(camion10);
		
		empresa1.agregarChofer(chofer1)
				.agregarChofer(chofer2)
				.agregarChofer(chofer3)
				.agregarChofer(chofer4)
				.agregarChofer(chofer5)
				.agregarChofer(chofer6)
				.agregarChofer(chofer7)
				.agregarChofer(chofer8)
				.agregarChofer(chofer9)
				.agregarChofer(chofer10)
				.agregarChofer(chofer11)
				.agregarChofer(chofer12)
				.agregarChofer(chofer13)
				.agregarChofer(chofer14)
				.agregarChofer(chofer15)
				.agregarChofer(chofer16)
				.agregarChofer(chofer17)
				.agregarChofer(chofer18)
				.agregarChofer(chofer19)
				.agregarChofer(chofer20);
		Viaje viaje1 = new Viaje(1000, camion1.getId(), chofer1.getId());

		
		empresa1.agregarViaje(viaje1);

		
		System.out.println(empresa1.obtenerViajesXChoferCamion());
		System.out.println(empresa1.obtenerCostosDeViajes());
		
	}
	
}
