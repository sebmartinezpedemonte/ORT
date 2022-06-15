package ejercicio02;

public class Main {
	public static void main(String[] args) {
		Compania compania1 = new Compania("Sancor");
		Area area1 = new Area("Ventas");
		Area area2 = new Area("RRHH");
		//Area area3 = new Area("Comercio");
		//Area area4 = new Area("Relaciones Publicas");

		Oficina oficina1 = new Oficina("Aguila");
		Oficina oficina2 = new Oficina("Gorrion");
		Oficina oficina3 = new Oficina("Paloma");
		Oficina oficina4 = new Oficina("Alcon");
		Empleado empleado1 = new Empleado("Carlos Gomez");
		Empleado empleado2 = new Empleado("Maria Estevez");
		Empleado empleado3 = new Empleado("Belen Perez");
		Empleado empleado4 = new Empleado("Juan Martinez");
		Empleado empleado5 = new Empleado("Maria Belen");
		Empleado empleado6 = new Empleado("Martin Perez");
		Empleado empleado7 = new Empleado("Angel Gomez");
		Empleado empleado8 = new Empleado("Sebastian Martinez");
		compania1.agregarArea(area1);
		compania1.agregarArea(area2);
		//compania1.agregarArea(area3);
		//compania1.agregarArea(area4);

		area1.agregarOficina(oficina1);
		area1.agregarOficina(oficina2);
		area2.agregarOficina(oficina3);
		area2.agregarOficina(oficina4);
		oficina1.agregarEmpleado(empleado1);
		oficina1.agregarEmpleado(empleado2);
		oficina2.agregarEmpleado(empleado3);
		oficina2.agregarEmpleado(empleado4);
		oficina3.agregarEmpleado(empleado5);
		oficina3.agregarEmpleado(empleado6);
		oficina4.agregarEmpleado(empleado7);
		oficina4.agregarEmpleado(empleado8);
		compania1.informeEmpleados();
		
		
		
	}
}
