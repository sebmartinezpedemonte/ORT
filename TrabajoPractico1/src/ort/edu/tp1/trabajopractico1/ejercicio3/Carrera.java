package ort.edu.tp1.trabajopractico1.ejercicio3;

import java.util.ArrayList;

public class Carrera {
	
	private String nombre;
	private int distancia;
	private ArrayList<Atleta> atletas;
	
	public Carrera(String nombre, int distancia) {
		this.atletas = new ArrayList<>();
		setNombre(nombre);
		setDistancia(distancia);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public void agregarAtleta(String nombre, double segundos) {
		if(segundos > 0) {
			Atleta a = new Atleta(nombre, segundos);
			atletas.add(a);
			System.out.println("El atleta " + a.getNombre() + " se ha agregado");
		}
	}
	
	public ArrayList<Atleta> ganador() {
		ArrayList<Atleta> atletasCopia = new ArrayList<>();
		atletasCopia = this.atletas;
		double tiempo = Double.MAX_VALUE;		
		ArrayList<Atleta> ganadoresTerna = new ArrayList<>();
		ArrayList<Atleta> ganadoresSeccion = new ArrayList<>();
		int POSICION_MAXIMA = 3;
		int j = 0;
		
		if(atletasCopia.isEmpty()) {
			System.out.println("No se anotaron corredores en la carrera");
		}
		
		while(atletasCopia.size()>0 && j < POSICION_MAXIMA ) {
		
		for(int i = 0; i < atletasCopia.size(); i++) {
			if(atletasCopia.get(i).getSegundos() < tiempo) {
				tiempo = atletasCopia.get(i).getSegundos();
			}
		}		
		for(int i = 0; i < atletasCopia.size(); i++) {
			if(atletasCopia.get(i).getSegundos() == tiempo) {
				ganadoresSeccion.add(atletasCopia.get(i));				
			}
		}		
		ganadoresTerna.addAll(ganadoresSeccion);
		atletasCopia.removeAll(ganadoresSeccion);
		
		if(ganadoresSeccion.size()==1) {
			System.out.println("El ganadores del podio " + (j+1) + " termino la carrera en " + tiempo +  " segundos y es:");
		}else {
			System.out.println("Los ganadores del podio " + (j+1) + " terminaron la carrera en " + tiempo +  " segundos y son:");

		}
		for(Atleta a : ganadoresSeccion) {
			System.out.println("-" + a.getNombre());
		}
		
		ganadoresSeccion.clear();
		tiempo = Double.MAX_VALUE;
		j++;
		}
		
		return ganadoresTerna;
	}


	
	
}
