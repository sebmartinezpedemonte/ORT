package finalthp2022;

import java.util.ArrayList;


public class YaEmpanadas {

	private static final String TIT_LISTADO_COMPLETO = "*** Listado completo del pedido %s\n";
	private static final String MSG_CREA_O_RECUPERA_NRO_PEDIDO = "Creacion o recuperacion del pedido para tel. %s (%s)\n";
	private static final String MSG_PEDIDO_NRO = "Pedido nro: %s\n";
	private static final String ERROR_PEDIDO_INEXISTENTE = "Pedido invalido";
	private int proximoNroPedido;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Pedido> pedidosCancelados;

	public YaEmpanadas() {
		proximoNroPedido = 1;
		pedidos = new ArrayList<>();
		pedidosCancelados = new ArrayList<>();
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

	public void actualizarPedido(String telefono, Sabor sabor, int cantidad) {
		Pedido pedido = buscarPedido(telefono);		
		if (pedido != null) {
			System.out.println("* Actualizacion para el pedido " + pedido.getNumero());
			pedido.cargarEmpanadas(sabor, cantidad);
			System.out.println("--- " + cantidad + " de " + sabor);
			pedidos.add(pedido);
			if(cantidad >0) {
			System.out.println("Pedido " + pedido.getNumero() +" actualizado.");}
			else {
				System.out.println("Item inexistente");
			}
		}else
			System.out.println(ERROR_PEDIDO_INEXISTENTE);
			
	
	}
	
	public void cargarEmpanadas(int nroPedido, Sabor sabor, int cantidad) {
		
		Pedido pedido = buscarPedido(nroPedido);
		
		if (pedido != null) {
			System.out.println("* Actualizacion para el pedido " + nroPedido);
			System.out.println("--- " + cantidad + " de " + sabor);
			System.out.println(pedido.cargarEmpanadas(sabor, cantidad));
		}
		else {
			
		System.out.println("* Actualizacion para el pedido " + nroPedido);
		System.out.println("--- " + cantidad + " de " + sabor);
		System.out.println(ERROR_PEDIDO_INEXISTENTE);
		}
	}

	private int getProximoNumeroPedido() {
		int actual = proximoNroPedido;
		proximoNroPedido++;
		return actual;
	}

	public void listarPedidoCompleto(String telefono) {
		System.out.printf(TIT_LISTADO_COMPLETO, telefono);
		Pedido pedido = buscarPedido(telefono);
		if (pedido != null)
			pedido.listarCompleto();
		else
			System.out.println(ERROR_PEDIDO_INEXISTENTE);
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
	public int crearORecuperarPedido(int nroPedido,String telefono, String domicilio) {
		System.out.printf(MSG_CREA_O_RECUPERA_NRO_PEDIDO,nroPedido, domicilio);
		Pedido pedido = buscarPedido(nroPedido);
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
	
	private void bajarPedido(int numPedido, String telefono, String direccion) {
		
		Pedido pedido = new Pedido(numPedido, telefono, direccion);
		Pedido telefonoBuscado = buscarPedido(telefono);
		Pedido nmrBuscado = buscarPedido(numPedido);
		
		if(telefonoBuscado != null || nmrBuscado != null ) {
			pedidosCancelados.add(pedido);
		
			}
		}
			

	public void bajarPedidos(int numPedido, String telefono, String direccion) {
		
		Pedido telefonoBuscado = buscarPedido(telefono);
		Pedido nmrBuscado = buscarPedido(numPedido);
		if(telefonoBuscado != null || nmrBuscado != null ) {
			bajarPedido(numPedido, telefono, direccion);
		}
		
	}
	
	public void cancelarPedidos(int nroPedido) {
		Pedido pedido = buscarPedido(nroPedido);
		if(pedido!=null) {
			pedidosCancelados.add(pedido);
			pedidos.remove(nroPedido);
			System.out.println("* Cancelacion del pedido " + nroPedido);
		}

	}
	
	public void cancelarPedidos(String telefono) {
		Pedido pedido = buscarPedido(telefono);
		if(pedido!=null) {
			System.out.println("* Cancelacion del pedido tel. " + telefono);
			pedidosCancelados.add(pedido);
			pedidos.remove(pedido);
			
		}

	}
	
	public void listarPedidosCancelados() {
		System.out.println("* Pedidos cancelados del dia *");
		for(Pedido pedido : pedidosCancelados) {
			pedido.listarCancelados();
			System.out.println();
		}
	}

	

}