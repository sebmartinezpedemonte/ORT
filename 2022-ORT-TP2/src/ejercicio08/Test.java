package ejercicio08;

public class Test {
	public static void main(String[] args) {
			
		TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("7478747455554444", "Juan Perez", 10000);
		
		tarjeta1.realizarCompra(4000);
		System.out.println(tarjeta1);
		
		tarjeta1.actualizarLimite(3000);
		tarjeta1.realizarCompra(4000);
		System.out.println(tarjeta1);
		
	}
}
