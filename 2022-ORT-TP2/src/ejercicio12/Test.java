package ejercicio12;

public class Test {
	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora();

		calculadora1.sumar(1, 2);
		calculadora1.restar(1, 2);
		calculadora1.restar(2, 1);
		calculadora1.multiplicar(1, 2);
		calculadora1.dividr(1, 2);
		calculadora1.dividr(2, 1);
		calculadora1.dividr(1, 0);
		calculadora1.dividr(2, 0);
		calculadora1.dividr(0, 1);
		calculadora1.dividr(0, 2);
		
		
		
	}
}
