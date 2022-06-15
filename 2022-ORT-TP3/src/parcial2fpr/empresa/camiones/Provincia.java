package parcial2fpr.empresa.camiones;

public class Provincia {
	private String nombreProvincia;
	private String domicilioDelDeposito;

	public Provincia(String nombreProvincia, String domicilioDelDeposito) {
		super();
		this.nombreProvincia = nombreProvincia;
		this.domicilioDelDeposito = domicilioDelDeposito;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	@Override
	public String toString() {
		return "Provincia [nombreProvincia=" + nombreProvincia + ", domicilioDelDeposito=" + domicilioDelDeposito + "]";
	}

}
