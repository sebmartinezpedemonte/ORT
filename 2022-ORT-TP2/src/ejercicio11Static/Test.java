package ejercicio11Static;

public class Test {
	public static void main(String[] args) {

		// Asi se haria el constructor de una clase estatica, no?
		// new Turnera(1);

		Turnera.obtenerUltimoNumero();
		Turnera.otorgarProximoTurno();
		Turnera.obtenerUltimoNumero();
		Turnera.resetearContador(-5);
		Turnera.obtenerUltimoNumero();
		Turnera.resetearContador(5);
		Turnera.obtenerUltimoNumero();
		Turnera.resetearContador();
		Turnera.obtenerUltimoNumero();

		/*
		 * Tiene sentido instanciar clases estaticas? es algo que se hace? Yo tengo
		 * estos dos constructores en la clase: public Turnera(int turno) {
		 * Turnera.turno = turno; } public Turnera() { Turnera.turno = 0; } Cree dos por
		 * si queríamos empezar con otro turno o directamente de 0. Para empezar el
		 * turno en otro numero, lo haríamos asi, no? new Turnera(1);
		 * 
		 */
	}
}
