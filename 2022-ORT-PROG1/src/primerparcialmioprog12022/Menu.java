package primerparcialmioprog12022;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements Ejecutable, Mostrable{
	private static Scanner input = new Scanner(System.in);
	private String titulo;
	private ArrayList<OpcionDeMenu> opcionesDeMenu;
	private OpcionDeSalida opcionSalida;
	
	public Menu(String titulo) {
		//input = new Scanner(System.in); en el resuelto del ns+ lo ponen como parametro
		this.titulo = titulo;
		this.opcionesDeMenu = new ArrayList<>();
		this.opcionSalida = new OpcionDeSalida();
		//tambien en el resuelto no crean la opcion de salida aca
	}

	@Override
	public void mostrar() {
		System.out.println("-- "  + this.titulo + " --");
		for(OpcionDeMenu opcion : this.opcionesDeMenu) {
			opcion.mostrar();
		}
		this.opcionSalida.mostrar();
		System.out.println("Ingrese la opcion deseada:");
		
	}

	@Override
	public void ejecutar() {//ESTE METODO ESTA BASTANTE DISTINTO EN EL RESUELTO
		char opcion;
		this.mostrar();
		OpcionDeMenu opcionExistente = null;
		do{
		opcion = input.next().charAt(0);
		if(opcion == 'X') {
			opcionSalida.ejecutar();
		}
		opcionExistente = this.buscarOpcionDeMenu(opcion);
		//this.mostrar();
		}while(opcionExistente == null);		
		opcionExistente.ejecutar();
		
	}
	
	private OpcionDeMenu buscarOpcionDeMenu(char caracter) {
		int i = 0;
		OpcionDeMenu opcionBuscada = null;
		while(i<opcionesDeMenu.size() && opcionBuscada == null) {
			if(opcionesDeMenu.get(i).getCaracter() == caracter) {
				opcionBuscada = opcionesDeMenu.get(i);
			}else {
				i++;
			}
		}		
		return opcionBuscada;
	}
	//aca puedo usar el metodo buscar para ver si ya esta la opcion o el contains
	public void registrar(OpcionDeMenu opcion) {
		
		if(opcion != null) {
			OpcionDeMenu opcionAgregar = this.buscarOpcionDeMenu(opcion.getCaracter());
		if(!(opcion instanceof OpcionDeSalida) && (opcionAgregar == null) ){
			this.opcionesDeMenu.add(opcion);
				//System.out.println("Se agrego la opcion: " + opcion.getCaracter() + " - " + opcion.getDescripcion() + " con exito");
			}else {
				//System.out.println("La opcion ya esta en el sistema");
			}
		}else {
			//System.out.println("La opcion no puede ser nula");
		}
	}
	
}
