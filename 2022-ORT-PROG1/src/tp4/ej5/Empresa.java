package tp4.ej5;

import java.util.ArrayList;

public class Empresa {
	
	private final int CANT_CAMIONES = 10;
	private final int CANT_CHOFERES = 20;
	private final int CANT_VIAJES = CANT_CAMIONES * CANT_CHOFERES;
	private String nombre;
	private Camion[] camiones;
	private Chofer[] choferes;
	private Viaje[] viajes;
	private int cantCamion;
	private int cantChofer;
	private int cantViajes;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		camiones = new Camion[CANT_CAMIONES];
		choferes = new Chofer[CANT_CHOFERES];
		viajes = new Viaje[CANT_VIAJES];
		cantChofer = 0;
		cantCamion = 0;
		cantViajes = 0;
	}
	
	public Empresa agregarChofer(Chofer chofer) {
		if(choferes.length <=CANT_CHOFERES) {
		choferes[cantChofer] = chofer;
		cantChofer++;
		}
		return this;
	}
	
	public Empresa agregarCamion(Camion camion) {
		if(camiones.length <=CANT_CAMIONES) {
		camiones[cantCamion] = camion;
		cantCamion++;
		}
		return this;
	}
	
	public Empresa agregarViaje(Viaje viaje) {
		if(viajes.length <=CANT_VIAJES) {
		viajes[cantViajes] = viaje;
		cantViajes++;
		}
		return this;
	}
	/*
	public void agregarTodoArray(Camion[] camionesArray, Chofer[] choferesArray, Viaje[] viajesArray) {
		
	}
	*/
	/*
	 * La explotaci�n del m�todo obtenerCostosDeViajes que devuelva (no muestre por
consola) el costo aproximado de cada viaje (honorarios + consumo).
	 */
	public double obtenerCostosDeViajes() {
		double costoAprox = 0;
		double costoCamion = 0;
		double costoHumano = 0;
		double cantKms = 0;
		for(Camion camion : camiones) {
			costoCamion += camion.getCostoXKmRecorrido();
		}
		for(Viaje viaje : viajes) {
			cantKms += viaje.getKmsViaje();
		}
		for(Chofer chofer : choferes) {
			costoHumano += chofer.getPagoPorViaje()*this.obtenerViajesXChoferCamion();
		}
		costoAprox = (costoCamion * cantKms) + costoHumano;  
		return costoAprox;
	}
	
/*Una empresa de camiones cuenta con una flota de 10 de ellos y 20 choferes que trabajan en
horarios rotativos (y rotan tambi�n por los camiones de la flota).
 * La explotaci�n del m�todo obtenerViajesXChoferCamion que devuelva (no muestre por
consola) la cantidad de viajes que realiz� cada chofer con cada cami�n.
 */
	public int obtenerViajesXChoferCamion() {
		return camiones.length * choferes.length;
	}
	
}
