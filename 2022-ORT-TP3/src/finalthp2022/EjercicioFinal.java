package finalthp2022;


public class EjercicioFinal {
	private static YaEmpanadas app;

	public static void main(String[] args) {
		app = new YaEmpanadas();

		int nroPedido = app.crearORecuperarPedido("4777-7777", "9 de Julio 77");
		@SuppressWarnings("unused")
		int nroPedido2 = app.crearORecuperarPedido("2456-9785", "Bermudez 977, Piso 4");

		actualizarPedido("4777-7777", Sabor.CARNE, 6);
		actualizarPedido("4777-7777", Sabor.JAMON_Y_QUESO, 0);
		actualizarPedido(-1, Sabor.CARNE, 6);
		actualizarPedido("4777-7777", Sabor.HUMITA, 0);

		listarPedidoCompleto(nroPedido);
		listarPedidoCompleto(5);
		
		actualizarPedido("4777-7777", Sabor.CARNE, 0);
		actualizarPedido("2456-9785", Sabor.CARNE, 6);
		
		cancelarPedido(1);
		cancelarPedido("2456-9785");
		
		listarPedidosCancelados();
		
	}

	private static void listarPedidoCompleto(int nroPedido) {
		app.listarPedidoCompleto(nroPedido);
		System.out.println();
	}

	private static void actualizarPedido(String nroTelefono, Sabor sabor, int cantidad) {
		app.actualizarPedido(nroTelefono, sabor, cantidad);
		System.out.println();
	}
	private static void actualizarPedido(int nroPedido, Sabor sabor, int cantidad) {
		app.cargarEmpanadas(nroPedido, sabor, cantidad);
		System.out.println();
	}
	private static void cancelarPedido(int nroPedido) {
		app.cancelarPedidos(nroPedido);
		
	}
	
	private static void cancelarPedido(String nroTelefono) {
		app.cancelarPedidos(nroTelefono);
		
	}
	
	private static void listarPedidosCancelados() {
		app.listarPedidosCancelados();
		System.out.println();
	}
	
}
