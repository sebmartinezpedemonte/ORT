package parcial1.clases;

public class OpcionOnOff extends OpcionDeMenu implements Activable {

	private static final char INACTIVA = ' ';
	private static final char ACTIVA = 'x';
	private boolean activa;

	public OpcionOnOff(String descripcion, char charSelector) {
		this(descripcion, charSelector, false);
	}
	
	public OpcionOnOff(String descripcion, char charSelector, boolean estadoInicial) {
		super(descripcion, charSelector);
		activa = estadoInicial;
	}

	@Override
	public void ejecutar() {
		activa = !activa;
	}

	@Override
	public void activar() {
		activa = true;
	}

	@Override
	public void desactivar() {
		activa = false;
	}

	@Override
	public boolean estaActivada() {
		return activa;
	}
	
	@Override
	public void mostrar() {
		System.out.print("[" + ((activa) ? ACTIVA : INACTIVA) + "] ");
		super.mostrar();
	}

}
