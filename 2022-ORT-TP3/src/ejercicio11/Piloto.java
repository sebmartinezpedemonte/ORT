package ejercicio11;

import java.util.ArrayList;

public class Piloto {
	private String nombre;
	private String DNI;
	private double vueltaPromedio;
	private ArrayList<Vuelta> vueltasPorPiloto;
	private int cantVueltasPorPiloto;
	
	public Piloto(String nombre, String dNI) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.vueltaPromedio = 0;
		vueltasPorPiloto = new ArrayList<>();
		this.cantVueltasPorPiloto = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public double getVueltaPromedio() {
		return calcularVueltaPromedio();
	}
	
	public int getCantVueltasPorPiloto() {
		cantVueltasPorPiloto = vueltasPorPiloto.size();
		return cantVueltasPorPiloto;
	}

	public double calcularVueltaPromedio() {
		vueltaPromedio = 0;
		
		double acuSegundos = 0;
		for(Vuelta vuelta : vueltasPorPiloto) {
			acuSegundos += vuelta.getTiempoSegundos();
		}
		if(getCantVueltasPorPiloto()>0) {
			vueltaPromedio = acuSegundos/cantVueltasPorPiloto;
		}
		//System.out.println("Vuelta promedio: " + vueltaPromedio);
		
		return vueltaPromedio;
	}
	
	public void agregarVuelta(Vuelta vuelta) {
		vueltasPorPiloto.add(vuelta);
	}
	
	
	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", DNI=" + DNI + ", vueltaPromedio=" + getVueltaPromedio()
				+ ", vueltasPorPiloto=" + vueltasPorPiloto + "]";
	}
	
	
}
