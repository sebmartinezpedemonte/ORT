package parcial1.clases;

// El siguiente encabezado prepara la clase para poder hacer copias de sus instancias.
// Esta asociado al metodo clone() que esta al final de la clase.
// Lo veremos pronto en clase.
// public abstract class OpcionDeMenu implements Ejecutable, Mostrable, Cloneable {

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

	// Este metodo le "avisa" a Java que podemos hacer copias de las
	// instancias de esta clase (y de cualquiera de sus derivadas)
	// lo veremos pronto en clase.
	//@Override
	//protected OpcionDeMenu clone() throws CloneNotSupportedException {
	//	return (OpcionDeMenu) super.clone();
	//}  

}