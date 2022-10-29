package parcial1.clases;

public abstract class OpcionDeMenu implements Ejecutable, Mostrable {

	private char charSelector;
	private String descripcion;

	public OpcionDeMenu(String descripcion, char charSelector) {
		setDescripcion(descripcion);
		setCharSelector(charSelector);
	}

	public char getCharSelector() {
		return charSelector;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public void mostrar() {
		System.out.println(charSelector + " - " + descripcion);
	}

	private void setCharSelector(char charSelector) {
		this.charSelector = charSelector;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}