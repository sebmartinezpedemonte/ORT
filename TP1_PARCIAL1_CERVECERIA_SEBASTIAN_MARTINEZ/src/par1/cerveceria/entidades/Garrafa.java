package par1.cerveceria.entidades;

public class Garrafa extends EnvaseCerveza{
	private Medida tama�o;

	public Garrafa(Sabor sabor, Medida tama�o) {
		super(sabor);
		this.tama�o = tama�o;
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
