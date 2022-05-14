package ejercicio09;

public class CuentaBancaria {
	private String CBU;
	private double saldo;
	private TipoDeCuenta tipoDeCuenta;
	private Persona persona;
	
	public CuentaBancaria(TipoDeCuenta tipoDeCuenta, Persona persona) {
		super();
		this.tipoDeCuenta = tipoDeCuenta;
		this.persona = persona;
		this.saldo = 0;
		this.CBU = this.generarCBU();
	}
	
	private String generarCBU() {
		String DNI;
		String primeraParte;
		char ultimoNroDNI;
		if(tipoDeCuenta == TipoDeCuenta.CAJA_DE_AHORRO) {
			primeraParte = "20";
		}else {
			primeraParte = "40";
		}
		DNI = persona.getDNI();
		ultimoNroDNI = DNI.charAt(DNI.length() -1);
		
		return primeraParte + "-" + DNI + "-" + ultimoNroDNI;
	}

	public double obtenerSaldo() {
		System.out.println(saldo);
		return this.saldo;
		
	}
	
	public void depositarSaldo(double cantidadADepositar) {
		this.saldo += cantidadADepositar;
	}
	
	public boolean extraer(double cantidadAExtraer) {
		boolean pudoExtraer = false;
		if(cantidadAExtraer<=this.saldo && cantidadAExtraer > 0) {
			this.saldo -= cantidadAExtraer;
			pudoExtraer = true;
		}		
		return pudoExtraer;
	}

	@Override
	public String toString() {
		return "La CuentaBancaria con CBU: " + CBU + " cuenta con un saldo de " + saldo + ", es una " + tipoDeCuenta + 
				"\n y le pertenece a " + persona;
	}
	
	
	
}
