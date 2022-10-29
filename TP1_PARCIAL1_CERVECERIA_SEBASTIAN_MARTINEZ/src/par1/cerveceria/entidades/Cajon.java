package par1.cerveceria.entidades;



public class Cajon extends Contenedor{
	
	private Botella[] botellitas;
	
	public Cajon(Sabor sabor) {
		super(sabor);
		this.botellitas = new Botella[12];
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
