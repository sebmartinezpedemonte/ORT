package ort.edu.tp1.trabajopractico1.ejercicio2;

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
		double min = Double.MAX_VALUE;
		ArrayList<Atleta> ganadores = new ArrayList<>();
		
		for(int i = 0; i < atletas.size(); i++) {
			if(atletas.get(i).getSegundos() < min) {
				min = atletas.get(i).getSegundos();
				if(atletas.get(i+1).getSegundos() <= min) {
					min = atletas.get(i+1).getSegundos();
				}
			}
		}
		for(int i = 0; i < atletas.size(); i++) {
			if(atletas.get(i).getSegundos() == min) {
				ganadores.add(atletas.get(i));
			}
		}
		System.out.println("El/Los ganadores son:");
		for(Atleta g : ganadores) {
			System.out.println(g.getNombre());
		}
		return ganadores;
	}
	
	
}
