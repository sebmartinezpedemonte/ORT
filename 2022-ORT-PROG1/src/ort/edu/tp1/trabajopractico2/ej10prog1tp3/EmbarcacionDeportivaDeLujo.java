package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public class EmbarcacionDeportivaDeLujo extends EmbarcacionDeportiva {

	public EmbarcacionDeportivaDeLujo(String matricula, int eslora, int añoFabricacion, String nombreDueño,
			int potenciaHP, int factorAerodinamico) {
		super(matricula, eslora, añoFabricacion, nombreDueño, potenciaHP, factorAerodinamico);
	}
	
	@Override
	public double calcularConsumo() {
		return 2*super.getPotenciaHP()*super.getINDICE_CALCULO_POT();  
		}



}
