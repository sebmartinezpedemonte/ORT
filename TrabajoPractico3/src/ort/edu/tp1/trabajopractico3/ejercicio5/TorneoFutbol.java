package ort.edu.tp1.trabajopractico3.ejercicio5;

import java.util.ArrayList;

public abstract class TorneoFutbol {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	
	public TorneoFutbol() {
		this.jornadas = new ArrayList<>();
		this.equipos = new ArrayList<>();
	}

	public void agregarJornada(Jornada jornada) {
		if(jornada != null && !this.jornadas.contains(jornada)) {
			this.jornadas.add(jornada);
		}
	}
	
	public void eliminarJornada(Jornada jornada) {
		if(jornada != null && this.jornadas.contains(jornada)) {
			this.jornadas.remove(jornada);
		}
	}
	
	public void agregarEquipo(Equipo equipo) {
		if(equipo != null && !this.equipos.contains(equipo)) {
			this.equipos.add(equipo);
		}
	}
	
	public void eliminarEquipo(Equipo equipo) {
		if(equipo != null && this.equipos.contains(equipo)) {
			this.equipos.remove(equipo);
		}
	}
	
	public void finalizarJornada(Jornada jornada) {
		if(jornadas.contains(jornada)) {			
			ArrayList<Partido> partidos = jornada.getPartidos();
			for(Partido partido : partidos) {
				this.calcularPuntos(partido);				
			}
			
		}
	}
	
	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		
		for(Equipo equipo : equipos) {
			System.out.println(equipo); 
		}
	}
	
	public abstract String getTipo();
	
	public void calcularPuntos(Partido partido) {
		int puntosLocal				= 0;
		int puntosVisitante			= 0;
		int golesEquipoLocal 		= partido.getGolesEquipoLocal();
		int golesEquipoVisitante 	= partido.getGolesEquipoVisitante();
		
		if(golesEquipoLocal > golesEquipoVisitante)//Si gana el local
		{
			puntosLocal = this.puntajePartidoGanado();
			puntosVisitante = this.puntajePartidoPerdido();
			if(golesEquipoVisitante == 0) {
				puntosLocal += this.puntajeVallaInvicta();
			}
			if(golesEquipoLocal - golesEquipoVisitante >= 5) {
				puntosLocal += this.puntajeGanador4Goles();
			}
			} else if(golesEquipoLocal < golesEquipoVisitante){//Si gana el visitante

				puntosVisitante = this.puntajePartidoGanado();
				puntosLocal = this.puntajePartidoPerdido();
				if(golesEquipoLocal == 0) {
					puntosVisitante += this.puntajeVallaInvicta();
				}
				if(golesEquipoVisitante - golesEquipoLocal > 5) {
					puntosVisitante += this.puntajeGanador4Goles();
				}
			}else if(golesEquipoLocal == golesEquipoVisitante){
				puntosLocal = this.puntajePartidoEmpatado();
				puntosVisitante = this.puntajePartidoEmpatado();
				if(golesEquipoLocal >=4) {
					puntosLocal += this.puntajeEmpateMas3Goles();
					puntosVisitante += this.puntajeEmpateMas3Goles();
				}
			}
			partido.getEquipoLocal().setPuntos(puntosLocal);
			partido.getEquipoVisitante().setPuntos(puntosVisitante);
			
		}

	// Completar
	//}
	
	public int puntajePartidoEmpatado() {
		return 1;
	}
	public abstract int puntajePartidoGanado();
	
	public abstract int puntajePartidoPerdido();
	
	public abstract int puntajeVallaInvicta();
	
	public abstract int puntajeGanador4Goles();
	
	public abstract int puntajeEmpateMas3Goles();
	
}