package final1;

import final1.clases.YaEmpanadas;

public class EjercicioFinal {
	private static YaEmpanadas app;

	public static void main(String[] args) {
		app = new YaEmpanadas();

		int nroPedido = app.crearORecuperarPedido("4777-7777", "9 de Julio 77");
		
		cargarEmpanadas(nroPedido, Sabor.CARNE, 6);
		cargarEmpanadas(nroPedido, Sabor.JAMON_Y_QUESO, 0);
		cargarEmpanadas(-1, Sabor.CARNE, 6);
		
		listarPedidoCompleto(nroPedido);
		listarPedidoCompleto(5);
	}

	private static void listarPedidoCompleto(int nroPedido) {
		app.listarPedidoCompleto(nroPedido);
		System.out.println();
	}

	private static void cargarEmpanadas(int nroPedido, Sabor sabor, int cantidad) {
		app.cargarEmpanadas(nroPedido, sabor, cantidad);
		System.out.println();
	}

}
