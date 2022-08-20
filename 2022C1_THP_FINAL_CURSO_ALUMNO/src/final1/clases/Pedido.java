package final1.clases;

import java.util.ArrayList;

public class Pedido {

	private static final String PEDIDO_OK = "Pedido %s actualizado";
	private static final String ERROR_CANTIDAD_INVALIDA = "Cantidad de empanadas incorrecta";
	private int numero;
	private String telefono;
	private String domicilio;
	private ArrayList<Item> items;

	public Pedido(int numero, String telefono, String domicilio) {
		this.numero = numero;
		this.telefono = telefono;
		this.domicilio = domicilio;
		items = new ArrayList<>();
	}

	private Item buscarItem(Sabor sabor) {
		Item item = null;
		int pos = 0;
		while (pos < items.size() && !items.get(pos).mismoSabor(sabor)) {
			pos++;
		}
		if (pos < items.size())
			item = items.get(pos);
		return item;
	}

	public String cargarEmpanadas(Sabor sabor, int cantidad) {
		String mensaje;
		if (cantidad < 1) {
			mensaje = ERROR_CANTIDAD_INVALIDA;
		} else {
			Item item = buscarItem(sabor);
			if (item == null) {
				items.add(new Item(sabor, cantidad));
			} else {
				item.setCantidad(cantidad);
			}
			mensaje = String.format(PEDIDO_OK, numero);
		}
		return mensaje;
	}

	public int getNumero() {
		return numero;
	}

	public void listarCompleto() {
		mostrarDatosPropios();
		for (Item item : items) {
			System.out.println(item);
		}
	}

	private void mostrarDatosPropios() {
		System.out.println("Pedido: " + numero);
		System.out.println("Telefono: " + telefono);
		System.out.println("Domicilio: " + domicilio);
	}

	public boolean mismoPedido(int numero) {
		return this.numero == numero;
	}

	public boolean mismoPedido(String telefono) {
		return this.telefono.equals(telefono);
	}

}
