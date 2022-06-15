package parcial2fpr.empresa.camiones;

public class Test {
	public static void main(String[] args) {
		Empresa empresa1 = new Empresa("La Mulita");
		Provincia provincia1 = new Provincia("Santa Fe", "Charcas 1212");
		Provincia provincia2 = new Provincia("Corrientes", "Papua 1111");
		Paquete paquete1 = new Paquete(15, 50, provincia1);
		Paquete paquete2 = new Paquete(150, 100, provincia1);
		Camion camion1 = new Camion("123456", 200, 150, provincia1);
		Camion camion2 = new Camion("789456", 350, 300, provincia2);
		
		camion1.agregarPaquete(20, 100, "Santa Fe");
		empresa1.agregarTodo(paquete1, camion1, provincia1);
		empresa1.agregarTodo(paquete2, camion2, provincia1);
		//System.out.println(empresa1);
		empresa1.cargarPaquetes();
		
		empresa1.reincorporarPaquetes();
		System.out.println(camion1);
		
	}
}
