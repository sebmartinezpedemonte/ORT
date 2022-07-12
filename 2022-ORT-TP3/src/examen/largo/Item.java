package examen.largo;

public class Item {
	private int cantidad;
	private Sabor sabor;
	public Item(Sabor sabor, int cantidad) {
		super();
		this.cantidad = cantidad;
		this.sabor = sabor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public Sabor getSabor() {
		return sabor;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
	@Override
	public String toString() {
		return "Item [cantidad=" + cantidad + ", sabor=" + sabor + "]";
	}
	
	
	
}
