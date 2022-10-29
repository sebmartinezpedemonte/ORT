package resueltoprimerparcialprog12022;

public class OpcionDeSalida extends OpcionDeMenu{

	
	public OpcionDeSalida() {
		super("SALIR", 'X');
	}
		
	@Override
	public void ejecutar() {
		//Runtime.getRuntime().exit(0); esta es otra forma de terminar el programa
		System.exit(0);
	}

}
