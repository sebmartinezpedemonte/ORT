package primerparcialmioprog12022;

public class OpcionDeSalida extends OpcionDeMenu{

	private final static String DESCRIPCION_SALIDA = "SALIR";
	private final static char CARACTER_SALIDA= 'X';
	
	//mi idea
	//public OpcionDeSalida() {
	//	this.setCaracter(CARACTER_SALIDA);
	//	this.setDescripcion(DESCRIPCION_SALIDA);
	//}
	//asi esta en el resuelto, queda mas prolijo que el mio, no necesito crear un constructor por defecto ni setters en la clase padre
	public OpcionDeSalida() {
		super(CARACTER_SALIDA, DESCRIPCION_SALIDA);		
	}
	
	
	@Override
	public void ejecutar() {
		//Runtime.getRuntime().exit(0); esta es otra forma de terminar el programa
		System.exit(0);
	}
	//esto no es necesario por polimorfismo
	/*
	@Override
	public void mostrar() {
		System.out.println(this.getCaracter() + " - " + this.getDescripcion());
		
	}
	*/
}
