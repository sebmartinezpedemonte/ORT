package parcial2fpr.empresa.camiones;

import java.util.ArrayList;

public class Camion {
	private String patente;
	private double pesoMaximoCarga;
	private double pesoCargaActual;
	private Provincia provinciaAsignada;
	private ArrayList<Paquete> paquetesAEntregarCargados;

	public Camion(String patente, double pesoMaximoCarga, double pesoCargaActual, Provincia provinciaAsignada) {
		super();
		this.patente = patente;
		this.pesoMaximoCarga = pesoMaximoCarga;
		this.pesoCargaActual = pesoCargaActual;
		this.provinciaAsignada = provinciaAsignada;
		paquetesAEntregarCargados = new ArrayList<>();
	}
	
	public boolean agregarPaquete(double peso, double valor, String nombreProvincia) {
		boolean sePudo = false;
		Provincia provinciaATransportar = buscarProvincia(nombreProvincia);
		Paquete paqueteAgregar = new Paquete(peso, valor, provinciaATransportar);
		if(this.hayCapacidad(peso)) {
			paquetesAEntregarCargados.add(paqueteAgregar);
			sePudo = true;
			System.out.println("Se pudo agregar el paquete " + paqueteAgregar + " a la provincia " + provinciaATransportar);
		}else {
			System.out.println("No se pudo agregar el paquete " + paqueteAgregar + " a la provincia " + provinciaATransportar);

		}
		
		return sePudo;
	}
	
	public Provincia buscarProvincia(String nombreProvincia) {
		Provincia provinciaBuscar = null;
		if(provinciaAsignada.getNombreProvincia().equals(nombreProvincia)) {
			provinciaBuscar = provinciaAsignada;
		}
		return provinciaBuscar;
	}
	
	public String getNombreProvinciaAsignada() {
		return this.provinciaAsignada.getNombreProvincia();
	}
	
	public boolean hayCapacidad(double peso) {
		return (peso + this.pesoCargaActual) <= this.pesoMaximoCarga;
	}
	
	public String getPatente() {
		return patente;
	}

	public double getPesoMaximoCarga() {
		return pesoMaximoCarga;
	}

	public double getPesoCargaActual() {
		return pesoCargaActual;
	}

	public Provincia getProvinciaAsignada() {
		return provinciaAsignada;
	}
	

	@Override
	public String toString() {
		return "Camion [patente=" + patente + ", pesoMaximoCarga=" + pesoMaximoCarga + ", pesoCargaActual="
				+ pesoCargaActual + ", provinciaAsignada=" + provinciaAsignada + ", paquetesAEntregarCargados="
				+ paquetesAEntregarCargados + "]";
	}

}
