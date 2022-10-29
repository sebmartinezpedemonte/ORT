package primerparcialmioprog12022;

public abstract class OpcionDeMenu implements Ejecutable, Mostrable{


	private char caracter;
	private String descripcion;
	
	public OpcionDeMenu(char caracter, String descripcion) {
		this.caracter = caracter;
		this.descripcion = descripcion;
	}
	
	//public OpcionDeMenu() {
	//	
	//}
	
	public char getCaracter() {
		return this.caracter;
	}
	
	protected String getDescripcion() {
		return this.descripcion;
	}

	protected void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	//con esto nos ahorramos de hacer 2 metodos distintos en las clases hijas
	public void mostrar() {
		System.out.println(this.caracter + " - " + this.descripcion);
	}
	
}
