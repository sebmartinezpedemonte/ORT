package ejercicio12;

public class Calculadora {
	

	public int sumar(int nroA, int nroB) {
		System.out.println(nroA + nroB);
		return nroA + nroB;
	}
	public int restar(int nroA, int nroB) {
		System.out.println(nroA - nroB);
		return nroA + nroB;
	}
	public int multiplicar(int nroA, int nroB) {
		System.out.println(nroA * nroB);
		return nroA + nroB;
	}
	public int dividr(int nroA, int nroB) {
		if(nroA > 0 && nroB >0) {
			System.out.println(nroA / nroB);
			return nroA / nroB;

		}else {
			System.out.println(0);
			return 0;
		}
		
	}
}
