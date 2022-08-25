package ort.edu.tp1.clase01.clases;

import java.util.ArrayList;

//Clase o entidad o objeto
public class Persona {

	private static int contadorDeInstancia = 0;
	
	//definir propiedades o atributos
	private String nombre;
	private int edad;
	private String cuit;
	//Objetos modificables
	private Padre padre; //no hacer public Padre getPadre()
	private ArrayList<Hijo> hijos; //no hacer public ArrayList getHijos()
	
	//definir metodos/funciones/responsabilidades de la entidad
	
	public Persona(String nombre, int edad, String cuit, String nombrePadre) {
		super();
		contadorDeInstancia++;
		setNombre(nombre);
		this.padre = new Padre(nombrePadre);
		setEdad(edad);
		setCuit(cuit);
		this.hijos = new ArrayList<>();
		System.out.println("Se crearon " + contadorDeInstancia + " intancias");
	}
	
	private void setEdad(int edad) {
		this.edad = edad;
	}

	private void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public ArrayList<String> getNombreHijos(){
		ArrayList<String> resultado = new ArrayList<>();
		for (Hijo hijo : hijos) {
			resultado.add(hijo.getNombre());			
		}		
		return resultado;
	}
	
	//o hacer esto con una copia
	public ArrayList<Hijo> getCopiaHijos(){
		ArrayList<Hijo> resultado = new ArrayList<>();
		for (Hijo hijo : hijos) {
			resultado.add(hijo.getCopia());			
		}		
		return resultado;
	}
	
	
	public String getNombrePadre() {
		return this.padre.getNombre();
	}
	/*
	 * No hacer getters de objetos y arraylists
	 * Dar solo la informacion que se pide
	 * Delegar responsabilidad al padre
	public Padre getPadre() {
		return this.padre;
	}
	*/
	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getCuit() {
		return cuit;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	


	
	
}
