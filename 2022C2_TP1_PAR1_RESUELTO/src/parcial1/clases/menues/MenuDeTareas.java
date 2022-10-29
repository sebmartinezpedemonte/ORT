package parcial1.clases.menues;

import java.util.Scanner;

import parcial1.clases.Activable;
import parcial1.clases.OpcionDeMenu;
import parcial1.clases.OpcionOnOff;

public class MenuDeTareas extends Menu {

	public MenuDeTareas(String titulo, Scanner input) {
		super(titulo, input);
	}
	
	public void registrar(OpcionOnOff opcion) {
		super.registrar(opcion);
	}

	public int getTotalTareasCumplidas() {
		int cant = 0;
		for (OpcionDeMenu opcion : getItems()) {
			if (opcion instanceof Activable && ((Activable) opcion).estaActivada())
				cant++;
		}
		return cant;
	}

}
