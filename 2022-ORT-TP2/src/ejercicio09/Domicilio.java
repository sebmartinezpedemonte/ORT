package ejercicio09;

public class Domicilio {
	private String calle;
	private String altura;
	private String barrio;


	public Domicilio(String calle, String altura, String barrio) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}


	@Override
	public String toString() {
		return calle + " " + altura + " en el barrio " + barrio;
	}

}
