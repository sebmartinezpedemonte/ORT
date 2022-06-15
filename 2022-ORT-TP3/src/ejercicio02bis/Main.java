package ejercicio02bis;

public class Main {
	public static void main(String[] args) {
		Compania compania1 = new Compania("Sancor");
		Area area1 = new Area("Ventas");
		Area area2 = new Area("RRHH");

		Oficina oficina1 = new Oficina("Aguila", new Empleado("Carlos Gomez"));
		Oficina oficina2 = new Oficina("Gorrion", new Empleado("Maria Estevez"));
		Oficina oficina3 = new Oficina("Paloma", new Empleado("Belen Perez"));
		Oficina oficina4 = new Oficina("Alcon", new Empleado("Juan Martinez"));

		compania1.agregarArea(area1);

		compania1.agregarArea(area2);

		area1.agregarOficina(oficina1);
		area1.agregarOficina(oficina2);
		area2.agregarOficina(oficina3);
		area2.agregarOficina(oficina4);

		compania1.informeEmpleados();
		
		
		
	}
}
