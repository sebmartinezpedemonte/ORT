package ort.edu.tp1.clase02;
//Contenedora
public class Auto {
	
	
	
	// Composicion
	private Motor motor;
		
	public Auto(String serie, String caballos) {
		this.motor = new Motor(serie, caballos);
	}
	//se pueden referenciar los atributosde una clase contenida
	//no es necesario usar un getter
	public String getMotorNumeroDeSerie() {
		return this.motor.numeroDeSerie;
	}
	
	//Contenida
	private class Motor{		
		private String numeroDeSerie;
		private String caballos;
			
		
		public Motor(String numeroDeSerie, String caballos) {
			this.numeroDeSerie = numeroDeSerie;
			this.caballos = caballos;
		}

		public String getNumeroDeSerie() {
			return numeroDeSerie;
		}

		public void setNumeroDeSerie(String numeroDeSerie) {
			this.numeroDeSerie = numeroDeSerie;
		}
		

	}
	
}
