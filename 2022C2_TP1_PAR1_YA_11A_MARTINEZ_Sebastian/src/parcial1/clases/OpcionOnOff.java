package parcial1.clases;

public class OpcionOnOff extends OpcionDeMenu implements Activable{
	
	private boolean activada;

	//Esta clase tiene dos constructores: El primero recibe como parámetros la descripción y el
	//caracter de selección. El segundo,además, recibe un booleano que indica el estado
	//inicial de la acción (si está activada o no). Por defecto, cuando no se recibe, elvalordeactivadadebeser
	//false
	
	public OpcionOnOff(String descripcion, char charSelector, boolean activada) {
		super(descripcion, charSelector);
		this.activada = activada;
	}
	
	public OpcionOnOff(String descripcion, char charSelector) {
		super(descripcion, charSelector);
		this.activada = false;
	}
	
	/*
	 * El método mostrar() de OpcionOnOff debe escribir, antes de la descripción de la opción:
	[x], cuando la opción está activa;[ ] (con un espacio en blanco en vez de la ‘x’) si no está activa.
	 */
	
	@Override
	public void mostrar() {
		if(this.activada) {
			System.out.print("[x] ");
		}else {
			System.out.print("[ ] ");
		}
		super.mostrar();
	}
	
	/*
	 * El método ejecutar() de OpcionOnOff invierte el estado de activación (pasa de activa a inactiva y viceversa).
	 */
	
	
	
	@Override
	public void ejecutar() {
		if(!this.estaActivada()) {
			this.activar();
		}else {
			this.desactivar();
		}
		
	}

	@Override
	public void activar() {
		this.activada = true;
	}

	@Override
	public void desactivar() {
		this.activada = false;
		
	}

	@Override
	public boolean estaActivada() {		
		return this.activada;
	}
}
