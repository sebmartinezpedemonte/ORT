package final1.clases;

import java.util.ArrayList;

public class YaEmpanadas {

	private static final String TIT_LISTADO_COMPLETO = "*** Listado completo del pedido %s\n";
	private static final String MSG_CREA_O_RECUPERA_NRO_PEDIDO = "Creacion o recuperacion del pedido para tel. %s (%s)\n";
	private static final String MSG_PEDIDO_NRO = "Pedido nro: %s\n";
	private static final String ERROR_PEDIDO_INEXISTENTE = "Pedido inexistente";
	private int proximoNroPedido;
	private ArrayList<Pedido> pedidos;

	public YaEmpanadas() {
		proximoNroPedido = 1;
		pedidos = new ArrayList<>();
	}

	private Pedido buscarPedido(int nroPedido) {
		Pedido pedido = null;
		int pos = 0;
		while (pos < pedidos.size() && !pedidos.get(pos).mismoPedido(nroPedido))
			pos++;
		if (pos < pedidos.size())
			pedido = pedidos.get(pos);
		return pedido;
	}

	private Pedido buscarPedido(String telefono) {
		Pedido pedido = null;
		int pos = 0;
		while (pos < pedidos.size() && !pedidos.get(pos).mismoPedido(telefono))
			pos++;
		if (pos < pedidos.size())
			pedido = pedidos.get(pos);
		return pedido;
	}

	public void cargarEmpanadas(int nroPedido, Sabor sabor, int cantidad) {
		System.out.println("*** Carga para el pedido " + nroPedido + " (" + cantidad + " de " + sabor.name().replace('_', ' ') + ")");
		Pedido pedido = buscarPedido(nroPedido);
		if (pedido != null)
			System.out.println(pedido.cargarEmpanadas(sabor, cantidad));
		else
			System.out.println(ERROR_PEDIDO_INEXISTENTE);
	}

	private int getProximoNumeroPedido() {
		int actual = proximoNroPedido;
		proximoNroPedido++;
		return actual;
	}

	public void listarPedidoCompleto(int nroPedido) {
		System.out.printf(TIT_LISTADO_COMPLETO, nroPedido);
		Pedido pedido = buscarPedido(nroPedido);
		if (pedido != null)
			pedido.listarCompleto();
		else
			System.out.println(ERROR_PEDIDO_INEXISTENTE);
	}

	public int crearORecuperarPedido(String telefono, String domicilio) {
		System.out.printf(MSG_CREA_O_RECUPERA_NRO_PEDIDO, telefono, domicilio);
		Pedido pedido = buscarPedido(telefono);
		if (pedido == null)
			pedido = registrarPedido(telefono, domicilio);
		int nro = pedido.getNumero();
		System.out.printf(MSG_PEDIDO_NRO, nro);
		return nro;
	}

	private Pedido registrarPedido(String telefono, String domicilio) {
		Pedido pedido = new Pedido(getProximoNumeroPedido(), telefono, domicilio);
		pedidos.add(pedido);
		return pedido;
	}

}