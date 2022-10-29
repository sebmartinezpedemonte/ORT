package par1.cerveceria.entidades;

public class Barril extends Contenedor{


	private final int CAPACIDAD = 30;
	
	public Barril(Sabor sabor) {
		super(sabor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean estaVacio() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected EnvaseCerveza extraer() {
		// TODO Auto-generated method stub
		return null;
	}
}
