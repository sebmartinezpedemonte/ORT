package parcial2EnumAtributos;

public enum Dia {
	LUNES("Lunes"),
	MARTES("Martes"),
	MIERCOLES("Miercoles"),
	JUEVES("Jueves"),
	VIERNES("Viernes"),
	SABADO("Sabado"),
	DOMINGO("Domingo");
	
	
	private final String dia;
	
	Dia(String dia){
		this.dia = dia;
	}
	
	public String getDia() {
		return this.dia;
	}
}
