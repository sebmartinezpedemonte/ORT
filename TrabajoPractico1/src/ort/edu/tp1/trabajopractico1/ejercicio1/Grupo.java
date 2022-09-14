package ort.edu.tp1.trabajopractico1.ejercicio1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Grupo {
	
	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre) {
		super();
		setNombre(nombre);
		integrantes = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadintegrantes() {
		return integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if(this.buscarIntegrante(nombreIntegrante)== null) {
			integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante + " fue asignado al grupo " + this.nombre);
		}
	}
	//para que usamos este?
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicion = -1;
		String integrante = null;
		int i = 0;
		while(integrantes.size() > i && integrante == null) {
			if(integrantes.get(i).equals(nombre)) {
				integrante = nombre;
				posicion = i;
			}else {
				i++;
			}
		}		
		return posicion;
	}
	
	public String obtenerIntegrante(int posicion) {
		String integrante = null;
		if(integrantes.size() >= posicion && posicion >0 ) {
		integrante = integrantes.get(posicion-1);
		}
		return integrante;
	}
	

	public String buscarIntegrante(String nombre) {
		String integrante = null;
		int i = 0;
		while(integrantes.size() > i && integrante == null) {
			if(integrantes.get(i).equals(nombre)) {
				integrante = nombre;
			}else {
				i++;
			}
		}		
		return integrante;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String integrante = this.buscarIntegrante(nombreIntegrante);
		if(integrante != null) {
			integrantes.remove(integrante);
		}
		return integrante;
	}
	
	private void mostrarintegrantes() {
		if(integrantes.size()>0) {
		System.out.println("Cantidad de integrantes: " + integrantes.size());
		System.out.println("Integrantes: ");
		for(String integrante : integrantes) {
			System.out.println(integrante);			
		}
		}else {
			System.out.println("No hay integrantes en el grupo");
		}
	}
	
	public void mostrar() {
		System.out.println("Nombre del grupo: "  + nombre);
		this.mostrarintegrantes();
	}
	
	public void vaciar() {
		while(!integrantes.isEmpty()) {
			integrantes.remove(0);
		}
		//integrantes.clear();
	}
	
}
