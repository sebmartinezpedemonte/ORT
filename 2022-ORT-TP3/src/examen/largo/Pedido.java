package examen.largo;

import java.util.ArrayList;

public class Pedido {
	private static int ultimoNroPedido = 0;
	private int numPedido;
	private String telefono;
	private String direccion;
	private ArrayList<Item> items;
	

	public Pedido(String telefono, String direccion) {
		super();
		this.numPedido = ++ultimoNroPedido;
		
		this.telefono = telefono;
		this.direccion = direccion;
		items = new ArrayList<>();
	}
	/*
	 * cargarEmpanadas: Recibe un número de pedido (el pedido debe existir), un sabor y una cantidad (debe ser mayor que cero).
Carga la cantidad de unidades y el sabor en un ítem del pedido según estas reglas:
Si el ítem existe (uno con el mismo sabor), reemplaza el valor actual por el nuevo. Solo acepta cantidades mayores que cero.
Si el ítem no existe, lo agrega a los existentes. También debe controlar la cantidad de unidades (como mínimo una empanada).
Si hay un error debe emitir un mensaje de error acorde al error producido. Si todo salió bien debe mostrar un aviso de que el pedido fue actualizado.

	 */

	public void cargarEmpanadas(Sabor sabor, int cantidad) {
		if(cantidad > 0) {
			Item item = buscarItem(sabor);
			if(item != null) {
				item.setCantidad(cantidad);
			}else {
				Item nuevoItem = new Item(sabor, cantidad);
				items.add(nuevoItem);
				System.out.println("El pedido fue actualizado");
			}
		}
	}
	
	private Item buscarItem(Sabor sabor) {
		int pos = 0;
		Item item = null;
		while(items.size() > pos && item == null) {
			if(items.get(pos).getSabor().equals(sabor)) {
				item = items.get(pos);
			}else {
				pos++;
			}
		}
		return item;
	}

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void mostrarInformacion() {
		for(Item item : items) {
			System.out.println(item);			
		}
		
		
	}

	@Override
	public String toString() {
		return "Pedido [numPedido=" + numPedido + ", telefono=" + telefono + ", direccion=" + direccion + ", items="
				+ items + "]";
	}
	
	
	
}
