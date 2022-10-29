package resueltoprimerparcialprog12022;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu implements Ejecutable, Mostrable{
	private Scanner input = new Scanner(System.in);
	private String titulo;
	private ArrayList<OpcionDeMenu> items;
	private OpcionDeSalida salida;
	
	public Menu(String titulo, Scanner scanner) {
		this.input = scanner;
		setTitulo(titulo);
		this.items = new ArrayList<>();
		this.salida = new OpcionDeSalida(); //esto no lo ponen el el resuelto y para mi esta mal que no lo pongan...
	}
	
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void registrar(OpcionDeMenu opcion) {		
		if(opcion != null) {
			items.add(opcion);
		}
	}	


	@Override
	public void mostrar() {
		System.out.println("*** " + titulo + " ***");
		for(OpcionDeMenu opc : this.items) {
			opc.mostrar();
		}
		this.salida.mostrar();
		System.out.println("Ingrese la opcion deseada:");
		
	}

	@Override
	public void ejecutar() {
		OpcionDeMenu opcion;
		opcion = elegirOpcion();
		while(opcion != this.salida) {
			opcion.ejecutar();
			opcion = elegirOpcion();
		}
	}
	
	private OpcionDeMenu elegirOpcion() {
		OpcionDeMenu opcion = null;
		char ch;
		do {
		this.mostrar();
		ch = input.next().charAt(0);
		opcion = buscarOpcion(ch);
		}while(opcion == null);
		return opcion;
	}

	private OpcionDeMenu buscarOpcion(char ch) {
		OpcionDeMenu opcion = null;
		int pos = 0;
		if(ch == salida.getCharSelector()) {
			opcion = this.salida;
		}else {
			while(pos < this.items.size() && opcion == null) {
				if(items.get(pos).getCharSelector()   == ch) {
					opcion = items.get(pos);
				}else {
					pos++;
				}
			}
		}	
		return opcion;
	}


	/*buscarOpcion original del resuelto no anda bien:
	 * private OpcionDeMenu buscarOpcion(char ch) {
		OpcionDeMenu opcion = null;
		int pos = 0;
		if(ch == salida.getCharSelector()) {
			opcion = this.salida;
		}else {
			while(pos < this.items.size() && this.items.get(pos).getCharSelector() != ch) {//esta linea esta dificil de entender
				pos++;
				if(pos < this.items.size()) {
					opcion = this.items.get(pos);
				}
			}
		}	
		return opcion;
	}
	 */
}
