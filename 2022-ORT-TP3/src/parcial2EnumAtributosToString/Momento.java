package parcial2EnumAtributosToString;

public enum Momento {
	MEDIODIA("Mediodia"),
	NOCHE("Noche");
	
	private final String momento;
	
	Momento(String momento){
		this.momento = momento;
	}
	
	public String getMomento() {
		return this.momento;
	}
	
	@Override
	public String toString() {
		return momento;
	}
}
