package examen.largo;

public class Test {
	public static void main(String[] args) {
		YaEmpanadas local = new YaEmpanadas();
		
		local.crearORecuperarPedido("123456", "pop");
		local.crearORecuperarPedido("1234567", "pop");
		
		local.cargarEmpanadas(1, Sabor.CARNE, 10);
		local.cargarEmpanadas(1, Sabor.CARNE, 15);
		local.cargarEmpanadas(1, Sabor.JYQ, 10);
		local.cargarEmpanadas(2, Sabor.JYQ, 2);

		local.listarPedidoCompleto(1);
		local.listarPedidoCompleto(2);
		local.listarPedidoCompleto(3);
		
	}
}
