package primerparcialmioprog12022;

public class Main {
	public static void main(String[] args) {

		
		Menu menu1 = new Menu("Menu Principal");
		menu1.registrar(new OpcionAccesoAMenu('1', "Opcion 1"));
		menu1.registrar(new OpcionAccesoAMenu('2', "Opcion 2"));
		menu1.registrar(new OpcionAccesoAMenu('2', "Opcion 2"));
		menu1.registrar(new OpcionAccesoAMenu('3', "Acceso a Submenu 1"));
		menu1.registrar(new OpcionDeSalida());//esta da que ya esta en sistema ya que se crea con el constructor
		menu1.registrar(null);//esta da que no se pueden aceptar null
		menu1.ejecutar();
	}
}
