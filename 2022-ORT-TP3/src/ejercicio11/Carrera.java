package ejercicio11;

import java.util.ArrayList;

public class Carrera {
	private String fecha;
	private String hora;
	private ArrayList<Piloto> pilotos;

	private Dificultad dificultad;
	private int cantPilotosPorCarrera;
	private int cantVueltas;

	public Carrera(String fecha, String hora, Dificultad dificultad, int cantVueltas) {
		this.fecha = fecha;
		this.hora = hora;
		this.dificultad = dificultad;
		pilotos = new ArrayList<>();

		cantPilotosPorCarrera = 0;
		this.cantVueltas = cantVueltas;
	}

	public String getFecha() {
		return fecha;
	}

	public String getHora() {
		return hora;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public ArrayList<Piloto> buscarPilotosPorDebajoDe(double segundos) {
		int cantVueltasMin = 10;
		ArrayList<Piloto> pilotosDebajo = new ArrayList<>();
		if (pilotos.size() > 0) {
			for (Piloto piloto : pilotos) {
				if (piloto.getCantVueltasPorPiloto() >= cantVueltasMin && piloto.calcularVueltaPromedio() < segundos) {
					pilotosDebajo.add(piloto);
				}
			}
		}
		System.out.println(pilotosDebajo);
		return pilotosDebajo;
	}
	
	public void mostrarMenorPromedio() {
		Piloto pilotoMenorPromedio = null;
		double menorPromedio = Integer.MAX_VALUE;
		for(Piloto piloto : pilotos) {
			if(piloto.getVueltaPromedio() <= menorPromedio) {
				menorPromedio = piloto.getVueltaPromedio();
				pilotoMenorPromedio = piloto;
			}
		}
		
		System.out.println("El nombre del piloto con menor promedio es: " + pilotoMenorPromedio.getNombre() + " y su DNI es: " + pilotoMenorPromedio.getDNI());
	}
	
	public ArrayList<Piloto>  pilotosPorCarrera() {
		ArrayList<Piloto> pilotosPorCarrera = new ArrayList<>();
		for(Piloto piloto : pilotos) {
			pilotosPorCarrera.add(piloto);
		}
		
		return pilotosPorCarrera;
	}
	
	public int getCantPilotosPorCarrera() {
		cantPilotosPorCarrera = pilotos.size();
		return pilotos.size();
	}



	public int getCantVueltas() {
		return cantVueltas;
	}
	
	public void agregarPiloto(Piloto piloto) {
		pilotos.add(piloto);
	}

	@Override
	public String toString() {
		return "Carrera [fecha=" + fecha + ", hora=" + hora + ", pilotos=" + pilotos 
				+ ", dificultad=" + dificultad + ", cantPilotosPorCarrera=" + cantPilotosPorCarrera
				+ ", cantVueltas=" + cantVueltas + "]";
	}

	



}
