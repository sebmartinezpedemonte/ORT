package ort.edu.tp1.trabajopractico2.ej8prog1tp3;

public class Test {
	public static void main(String[] args) {
		Empresa empresa1 = new Empresa("Chevrolet");

		empresa1.agregarEmpleados(new EmpleadoComision("123456789", "Juan" , "Gomez", 2002, 15, 12000));
		empresa1.agregarEmpleados(new EmpleadoComision("789456123", "Miguel" , "Perez", 2002, 16, 11000));
		empresa1.agregarEmpleados(new EmpleadoSalarioFijo("741258963", "Sebastian" , "Mendez", 2002, 20, 250000));
		
		empresa1.mostrarSalarios();
		System.out.println(empresa1.empleadoConMasClientes());
	}
}
