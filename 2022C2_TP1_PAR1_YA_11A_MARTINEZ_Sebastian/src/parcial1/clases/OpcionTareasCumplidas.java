package parcial1.clases;

public class OpcionTareasCumplidas extends OpcionDeMenu{
	
	//Adem�s de la descripci�n y el caracter del selecci�n recibe un
	//MenuDeTareas
		
	private MenuDeTareas menu;

	public OpcionTareasCumplidas(String descripcion, char charSelector, MenuDeTareas menu) {
		super(descripcion, charSelector);
		this.menu = menu;
	}

	//Su m�todo	ejecutar()mostrar� la cantidad de opciones marcadas 
	//como cumplidas (activadas) en la instancia de 
	//MenuDeTareasrecibida en el constructor.
	
	@Override
	public void ejecutar() {
		System.out.println("Cantidad de tareas cumplidas: " +menu.getTotalTareasCumplidas());
		
	}
	

	
	
	
	
}
