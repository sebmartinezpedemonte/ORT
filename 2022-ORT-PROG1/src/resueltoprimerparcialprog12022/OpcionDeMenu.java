package resueltoprimerparcialprog12022;

public abstract class OpcionDeMenu implements Ejecutable, Mostrable {

	private char charSelector;
	private String descripcion;

	public OpcionDeMenu(String descripcion, char charSelector) {
		setCharSelector(charSelector);
		setDescripcion(descripcion);
	}

	public char getCharSelector() {
		return charSelector;
	}

	private void setCharSelector(char charSelector) {
		this.charSelector = charSelector;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void mostrar() {
		System.out.println(this.charSelector + " - " + this.descripcion);
	}

}
