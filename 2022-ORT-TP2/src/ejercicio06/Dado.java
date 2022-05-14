package ejercicio06;

public class Dado {
	private int valor;
	
	public Dado(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	//random.nextInt(max - min + 1) + min ??
	//(int)(Math.random() * (max - min + 1) + min);
	public int tirarDado() {
		valor = (int)(Math.random() * (6) +1);
		return valor;
	}
	
	
}
