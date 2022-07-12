package examen.largo;

import java.util.ArrayList;

public class YaEmpanadas {
	private ArrayList<Pedido> pedidos;
	
	
	public YaEmpanadas() {
		pedidos = new ArrayList<>();
	}
	
	
	public int crearORecuperarPedido(String telefono, String direccion) {
		Pedido pedido = buscarPedidoPorTelefono(telefono);
		if(pedido == null) {
			pedido = new Pedido(telefono, direccion);
			pedidos.add(pedido);
			}		
		return pedido.getNumPedido();
	}
	
	
	public void cargarEmpanadas(int numPedido, Sabor sabor, int cantidad) {
		Pedido pedido = buscarPedidoPorNro(numPedido);
		if(cantidad <= 0) {
			System.out.println("La cantidad de empanadas es menor o igual a 0");
		}else {
			if(pedido!=null) {
				pedido.cargarEmpanadas(sabor, cantidad);
				}else {
					System.out.println("El pedido no existe");
				}
		}

	}

	
	private Pedido buscarPedidoPorTelefono(String telefono) {
		int pos = 0;
		Pedido pedido = null;
		while(pos<pedidos.size() && pedidos == null) {
			if(pedidos.get(pos).getTelefono().equals(telefono)) {
				pedido = pedidos.get(pos);
			}else {
				pos++;
			}
		}
		return pedido;
	}
	
	private Pedido buscarPedidoPorNro(int nroPedido) {
		int pos = 0;
		Pedido pedido = null;
		while(pos<pedidos.size() && pedido == null) {
			if(pedidos.get(pos).getNumPedido() == (nroPedido)) {
				pedido = pedidos.get(pos);
			}else {
				pos++;
			}
		}
		return pedido;
	}
	
	public void listarPedidoCompleto(int numPedido) {
		Pedido pedido = buscarPedidoPorNro(numPedido);
		if(pedido!= null) {
			System.out.println("El pedido nro " + numPedido + " pidio: ");			
			pedido.mostrarInformacion();			
		}else {
			System.out.println("El pedido no existe");
		}
	}


	@Override
	public String toString() {
		return "YaEmpanadas [pedidos=" + pedidos + "]";
	}
	
	
	
}
