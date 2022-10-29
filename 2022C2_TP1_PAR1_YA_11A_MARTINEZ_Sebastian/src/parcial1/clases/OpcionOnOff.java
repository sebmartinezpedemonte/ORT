package parcial1.clases;

public class OpcionOnOff extends OpcionDeMenu implements Activable{
	
	private boolean activada;

	//Esta clase tiene dos constructores: El primero recibe como par�metros la descripci�n y el
	//caracter de selecci�n. El segundo,adem�s, recibe un booleano que indica el estado
	//inicial de la acci�n (si est� activada o no). Por defecto, cuando no se recibe, elvalordeactivadadebeser
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
	 * El m�todo mostrar() de OpcionOnOff debe escribir, antes de la descripci�n de la opci�n:
	[x], cuando la opci�n est� activa;[ ] (con un espacio en blanco en vez de la �x�) si no est� activa.
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
	 * El m�todo ejecutar() de OpcionOnOff invierte el estado de activaci�n (pasa de activa a inactiva y viceversa).
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
