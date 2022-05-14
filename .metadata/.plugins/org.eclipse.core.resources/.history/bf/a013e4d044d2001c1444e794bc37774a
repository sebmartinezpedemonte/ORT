package ejercicio15POOIntegracion;

public class Posnet {
	
	
	   public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;
	 
	
	

	public static String efectuarPago(TarjetaDeCredito tarjetaDeCredito, double montoAAbonar, int cantidadDeCuotas) {
		String mensaje = null;
		if (tarjetaSaldoSuficiente(tarjetaDeCredito, montoAAbonar, cantidadDeCuotas)
				&& (cantidadDeCuotas >= 1 && cantidadDeCuotas <= 6)) {
			mensaje = tarjetaDeCredito.nombreYApellidoTitular() + " el monto total es de "
					+ montoTotalAbonar(montoAAbonar, cantidadDeCuotas) + " y el monton de cada cuota es de "
					+ montoTotalAbonar(montoAAbonar, cantidadDeCuotas) / cantidadDeCuotas;
		}
		return mensaje;
	}

	

	
	private static boolean tarjetaSaldoSuficiente(TarjetaDeCredito tarjetaDeCredito, double montoAAbonar,
			int cantidadDeCuotas) {
		
		return montoTotalAbonar(montoAAbonar, cantidadDeCuotas) <= tarjetaDeCredito.getSaldoDisponible();
	}

	private static double montoTotalAbonar(double montoAAbonar, int cantidadDeCuotas) {
		double montoTotalAbonar = montoAAbonar;
		switch (cantidadDeCuotas) {
		case 1:
			montoTotalAbonar = montoAAbonar;
			break;
		case 2:
			montoTotalAbonar = montoAAbonar * 1.03;
			break;
		case 3:
			montoTotalAbonar = montoAAbonar * 1.06;
			break;
		case 4:
			montoTotalAbonar = montoAAbonar * 1.09;
			break;
		case 5:
			montoTotalAbonar = montoAAbonar * 1.12;
			break;
		case 6:
			montoTotalAbonar = montoAAbonar * 1.15;
			break;

		}
		return montoTotalAbonar;
	
	}
	
	public static Ticket efectuarPagoConTicket(TarjetaDeCredito tarjetaDeCredito, double montoAAbonar,
			int cantidadDeCuotas) {
		Ticket elTicket = null;

        if (datosValidos(tarjetaDeCredito, montoAAbonar, cantidadDeCuotas)) {
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantidadDeCuotas);
            if (tarjetaDeCredito.tieneSaldoDisponible(montoFinal)) {
            	tarjetaDeCredito.descontar(montoFinal);
                String nomApe = tarjetaDeCredito.nombreCompletoDeTitular();
                double montoPorCuota = montoFinal / cantidadDeCuotas;
                elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }

        return elTicket;
	}
	
	
	 private static boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant) {
	        boolean esTarjetaValida = tarjeta != null;
	        boolean esMontoValido = monto > 0;
	        boolean cantCuotasValidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;

	        return esTarjetaValida && esMontoValido && cantCuotasValidas;
	    }
	
	
    private static double recargoSegunCuotas(int cantCuotas) {
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }
	

}
