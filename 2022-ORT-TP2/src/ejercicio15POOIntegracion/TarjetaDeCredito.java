package ejercicio15POOIntegracion;

public class TarjetaDeCredito {
	private EntidadFinanciera entidadFinanciera;	
	private String nombreEntidadBancaria;
	private String numeroDeTarjeta;
	private double saldoDisponible;
	private Titular titular;
	public TarjetaDeCredito(EntidadFinanciera entidadFinanciera, String nombreEntidadBancaria, String numeroDeTarjeta,
			double saldoDisponible, Titular titular) {
		super();
		this.entidadFinanciera = entidadFinanciera;
		this.nombreEntidadBancaria = nombreEntidadBancaria;
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.saldoDisponible = saldoDisponible;
		this.titular = titular;
	}
	
	
   
	
	
	public double getSaldoDisponible() {
		return saldoDisponible;
	}
	
	public String nombreYApellidoTitular() {
		return titular.getNombre() + " " + titular.getApellido();
	}



    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }

    public boolean tieneSaldoDisponible(double monto) {
        return saldoDisponible >= monto;
    }
    
    public void descontar(double monto) {
    	saldoDisponible = saldoDisponible - monto;
        // saldo -= monto;
    }
    
    

	@Override
	public String toString() {
		return "TarjetaDeCredito [entidadFinanciera=" + entidadFinanciera + ", nombreEntidadBancaria="
				+ nombreEntidadBancaria + ", numeroDeTarjeta=" + numeroDeTarjeta + ", saldoDisponible="
				+ saldoDisponible + ", titular=" + titular + "]";
	}
	
	
	
	
	
}
