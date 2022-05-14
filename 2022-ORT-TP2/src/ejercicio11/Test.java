package ejercicio11;

public class Test {
public static void main(String[] args) {
	Turnera turnera1 = new Turnera(1);
	Turnera turnera2 = new Turnera();
	
	turnera1.obtenerUltimoNumero();
	
	turnera2.obtenerUltimoNumero();
	turnera2.otorgarProximoTurno();
	turnera2.obtenerUltimoNumero();
	turnera2.resetearContador(-5);
	turnera2.obtenerUltimoNumero();
	turnera2.resetearContador(5);
	turnera2.obtenerUltimoNumero();
	turnera2.resetearContador();
	turnera2.obtenerUltimoNumero();
	
	
}
}
