package ort.edu.tp1.trabajopractico2.ej10prog1tp3;

public class EmbarcacionDeportivaDeLujo extends EmbarcacionDeportiva {

	public EmbarcacionDeportivaDeLujo(String matricula, int eslora, int a�oFabricacion, String nombreDue�o,
			int potenciaHP, int factorAerodinamico) {
		super(matricula, eslora, a�oFabricacion, nombreDue�o, potenciaHP, factorAerodinamico);
	}
	
	@Override
	public double calcularConsumo() {
		return 2*super.getPotenciaHP()*super.getINDICE_CALCULO_POT();  
		}



}
