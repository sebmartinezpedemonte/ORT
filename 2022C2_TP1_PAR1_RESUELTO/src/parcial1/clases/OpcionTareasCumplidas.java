package parcial1.clases;

import parcial1.clases.menues.MenuDeTareas;

public class OpcionTareasCumplidas extends OpcionDeMenu {

	private MenuDeTareas menu;

	public OpcionTareasCumplidas(String descripcion, char charSelector, MenuDeTareas menuSecundario) {
		super(descripcion, charSelector);
		menu = menuSecundario;
	}

	@Override
	public void ejecutar() {
		System.out.println("Cantidad de tareas cumplidas: " + menu.getTotalTareasCumplidas());
	}

}
