package ejercicio15POOIntegracion;
//ejercicio video 26 Charly Cimino 

/*
 * Desarrollar el m?todo main del proyecto y generar las instancias necesarias
 *  para poder efectuar un pago de $10000 en 5 cuotas, 
 * usando una tarjeta de cr?dito con 
 * saldo disponible de $15000 (el resto de los datos, pueden inventarse a gusto).
 */

public class Test {
	public static void main(String[] args) {
		
		Titular titular1 = new Titular("12345678", "Carlos" , "Juarez", "1165840923", "Carlos@gmail.com");
		TarjetaDeCredito tarj1 = new TarjetaDeCredito(EntidadFinanciera.BIRZA, "Santander", "123456789", 15000, titular1);

		System.out.println(Posnet.efectuarPago(tarj1, 10000, 5));
		
		System.out.println(tarj1);
		
		System.out.println(Posnet.efectuarPagoConTicket(tarj1, 10000, 5));
		System.out.println(tarj1);
		System.out.println(Posnet.efectuarPagoConTicket(tarj1, 3800, 1));
		System.out.println(tarj1);
		System.out.println(Posnet.efectuarPagoConTicket(tarj1, 3800, 1));
		System.out.println(tarj1);
		
	}
}
