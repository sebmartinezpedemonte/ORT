package ejercicio14correctoconparametros;

public class Test {

	public static void main(String[] args) {

		Contador contador1 = new Contador();
		Acumulador acumulador1 = new Acumulador();

		Promedio promedio1 = new Promedio(contador1, acumulador1);
		System.out.println(promedio1.obtenerValor());

		promedio1.incrementar(5);
		System.out.println(promedio1.obtenerValor());
		promedio1.incrementar(3);
		System.out.println(promedio1.obtenerValor());
		promedio1.incrementar(9);
		System.out.println(promedio1.obtenerValor());




	}
}
