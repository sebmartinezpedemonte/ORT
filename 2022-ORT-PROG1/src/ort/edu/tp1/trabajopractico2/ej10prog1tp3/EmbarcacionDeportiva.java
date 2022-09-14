package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public class EmbarcacionDeportiva extends Barco{
	
	private final double VALOR_BASE_EMB_DEP = 10000;
	private final double VALOR_ADICIONAL_ED = 5000;
	private final double INDICE_CALCULO_POT = 0.35;
	private int potenciaHP;
	private int factorAerodinamico;
	public EmbarcacionDeportiva(String matricula, int eslora, int añoFabricacion, String nombreDueño, int potenciaHP,
			int factorAerodinamico) {
		super(matricula, eslora, añoFabricacion, nombreDueño);
		this.potenciaHP = potenciaHP;
		this.factorAerodinamico = factorAerodinamico;
	}
	@Override
	public double costoDeAlquiler() {
		return precioBase() + adicional();
	}
	
	private double precioBase() {
		return VALOR_BASE_EMB_DEP * super.getEslora();
	}
	
	private double adicional() {
		return VALOR_ADICIONAL_ED * potenciaHP/2;
	}
	
	public double calcularConsumo() {
		return this.potenciaHP/this.factorAerodinamico*INDICE_CALCULO_POT;
	}
	public int getPotenciaHP() {
		return potenciaHP;
	}
	public double getINDICE_CALCULO_POT() {
		return INDICE_CALCULO_POT;
	}
	@Override
	public String toString() {
		return super.toString() + this.getClass().getSimpleName() +  "[VALOR_BASE_EMB_DEP=" + VALOR_BASE_EMB_DEP + ", VALOR_ADICIONAL_ED="
				+ VALOR_ADICIONAL_ED + ", INDICE_CALCULO_POT=" + INDICE_CALCULO_POT + ", potenciaHP=" + potenciaHP
				+ ", factorAerodinamico=" + factorAerodinamico + "]";
	}
	
	
}
