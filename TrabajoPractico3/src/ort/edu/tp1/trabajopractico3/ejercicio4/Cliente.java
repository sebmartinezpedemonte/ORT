package ort.edu.tp1.trabajopractico3.ejercicio4;



public class Cliente {
	private String cuil;
	private String nombre;
	private String apellido;
	//private ArrayList<Electrodomestico> electrodomesticosComprados;
	
	public Cliente(String cuil, String nombre, String apellido /*ArrayList<Electrodomestico> electrodomesticosComprados*/) {
		//this.electrodomesticosComprados = electrodomesticosComprados;
		this.cuil = cuil;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCuil() {
		return cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	
	
}
