package parcial2EnumAtributosToString;

public enum Resultado {
	OPERACION_OK("La operacion ha sido un exito"), 
	AMIGO_YA_EXISTENTE("El amigo ya existe"),
	AMIGO_NO_EXISTENTE("El amigo no existe"),
	PROPUESTA_NO_EXISTENTE("La propuesta no existe");
	
	private final String resultado;
	
	Resultado(String resultado){
		this.resultado = resultado;
	}
	
	public String getResultado() {
		return this.resultado;
	}
	
	@Override
	public String toString() {
		return resultado;
	}
}
