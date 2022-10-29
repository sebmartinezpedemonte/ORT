package parcial1.clases;

public class OpcionTareasCumplidas extends OpcionDeMenu{
	
	//Además de la descripción y el caracter del selección recibe un
	//MenuDeTareas
		
	private MenuDeTareas menu;

	public OpcionTareasCumplidas(String descripcion, char charSelector, MenuDeTareas menu) {
		super(descripcion, charSelector);
		this.menu = menu;
	}

	//Su método	ejecutar()mostrará la cantidad de opciones marcadas 
	//como cumplidas (activadas) en la instancia de 
	//MenuDeTareasrecibida en el constructor.
	
	@Override
	public void ejecutar() {
		System.out.println("Cantidad de tareas cumplidas: " +menu.getTotalTareasCumplidas());
		
	}
	

	
	
	
	
}
