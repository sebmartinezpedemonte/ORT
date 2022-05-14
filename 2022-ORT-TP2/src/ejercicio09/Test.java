package ejercicio09;

public class Test {
	public static void main(String[] args) {

		Domicilio domicilio1 = new Domicilio("Yatay", "240", "Almagro");
		Domicilio domicilio2 = new Domicilio("Yatay", "240", "Almagro");
		
		Persona persona1 = new Persona("12345678", "Fulano", "Gomez", domicilio1);
		Persona persona2 = new Persona("9123456", "Mengana", "Torres", domicilio2);

		CuentaBancaria cuentaBancaria1 = new CuentaBancaria(TipoDeCuenta.CAJA_DE_AHORRO, persona1);
		CuentaBancaria cuentaBancaria2 = new CuentaBancaria(TipoDeCuenta.CUENTA_CORRIENTE, persona2);

		System.out.println(cuentaBancaria1);
		System.out.println(cuentaBancaria2);	
		cuentaBancaria1.depositarSaldo(300);
		cuentaBancaria1.obtenerSaldo();
		cuentaBancaria1.extraer(200);
		cuentaBancaria1.obtenerSaldo();
		cuentaBancaria1.extraer(200);
		cuentaBancaria1.obtenerSaldo();

		
	}
}
