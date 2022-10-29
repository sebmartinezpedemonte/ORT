package ort.edu.tp1.trabajopractico5.ejercicio3;

public enum Mes {
 ENERO("Enero"), FEBRERO ("Febrero"), MARZO ("Marzo"),
 ABRIL("Abril"), MAYO("Mayo") , JUNIO("Junio"), 
 JULIO ("Julio"), AGOSTO("Agosto") ,
 SEPTIEMBRE("Septiembre"), OCTUBRE("Octubre"), 
 NOVIEMBRE("Noviembre"), DICIEMBRE("Diciembre"), ERROR("Error, no hay mes con ese numero");
	
	
	private String nombre;
	
	private Mes(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombreMes() {
		return this.nombre;
	}



	
	
}
