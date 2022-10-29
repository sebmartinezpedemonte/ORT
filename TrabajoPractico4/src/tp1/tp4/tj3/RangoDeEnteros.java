package tp1.tp4.tj3;

public class RangoDeEnteros {
	private int limiteInferior;
	private int limiteSuperior;

	public RangoDeEnteros(int limiteInferior, int limiteSuperior) {
		this.setLimiteInferior(limiteInferior);
		this.setLimiteSuperior(limiteSuperior);
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public boolean incluye(int aux) {
		return (aux >= getLimiteInferior() && aux <= getLimiteSuperior());
	}

	private void setLimiteInferior(int limiteInferior) {
		if(this.limiteSuperior > limiteInferior) {
			this.limiteSuperior = limiteInferior;
		}else {
			this.limiteInferior = limiteInferior;
		}
		
	}
	
	private void setLimiteSuperior(int limiteSuperior) {
		if(this.limiteInferior > limiteSuperior) {
			this.limiteInferior = limiteSuperior;
		}else {
			this.limiteSuperior = limiteSuperior;
		}
		
	}
	
}
