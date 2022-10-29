package par1.cerveceria.entidades;

public class Garrafa extends EnvaseCerveza{
	private Medida tamaño;

	public Garrafa(Sabor sabor, Medida tamaño) {
		super(sabor);
		this.tamaño = tamaño;
	}

	@Override
	protected void setPrecioVenta(double precio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
