package parcial1.clases;


import java.util.Scanner;

public class MenuDeTareas extends Menu{

	
	public MenuDeTareas(String titulo, Scanner input) {
		super(titulo, input);	
	}
	//Su método	registrar()	solamente recibe objetos 
	//de la clase OpcionOnOff

	@Override
	public void registrar(OpcionDeMenu opcion) {
		if(opcion instanceof OpcionOnOff) {
			super.registrar(opcion);
		}
	}
	
	//esto no sirve ya que en el caso que quiera registrar otro OpcionDeMenu
	//va a poder porque llamaria al metodo del padre y lo agrega
	//con mi solucion no lo agrega
	//public void registra(OpcionOnOff opcion) {	//esto esta mal
	//		super.registrar(opcion);
	//}


	//Implementa el método 	getTotalTareasCumplidas():int
	//que devuelve la cantidad de opciones del menú que están marcadas como activas.
	
	public int getTotalTareasCumplidas() {
		int cant = 0;
		for(OpcionDeMenu opcion : this.getItems()) {
			if(opcion instanceof OpcionOnOff)
			if(((OpcionOnOff)opcion).estaActivada()) {
				cant++;
			}
		}			
		return cant;
	}
	
}
