package finalthp2022;

public class Item {

	private int cantidad;
	private Sabor sabor;

	public Item(Sabor sabor, int cantidad) {
		this.sabor = sabor;
		this.setCantidad(cantidad);
	}

	public boolean setCantidad(int cantidad) {
		boolean ok = false;
		if (cantidad > 0) {
			this.cantidad = cantidad;
			ok = true;
		}
		return ok;
	}
	
	

	public Sabor getSabor() {
		return sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return cantidad + " de " + sabor;
	}

	public boolean mismoSabor(Sabor sabor) {
		return this.sabor.equals(sabor);
	}
	
}
