package ejercicio11;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Carrera> carreras;

	public Empresa() {
		this.carreras = new ArrayList<>();
	}

	public Carrera buscarCarrera(String fecha) {
		int i = 0;
		Carrera carreraBuscar = null;
		while (carreras.size() > i && carreraBuscar == null) {
			if (carreras.get(i).getFecha().equals(fecha)) {
				carreraBuscar = carreras.get(i);
			} else {
				i++;
			}
		}
		System.out.println(carreraBuscar);
		return carreraBuscar;
	}
	
	public ArrayList<Piloto> pilotosPorCarrera(){
		ArrayList<Piloto> pilotosPorCarrera = new ArrayList<>();
		for(Carrera carrera : carreras) {
			pilotosPorCarrera.addAll(carrera.pilotosPorCarrera());
			System.out.println(carrera.pilotosPorCarrera());
			
		}
		
		return pilotosPorCarrera;
	}
	
	
	public ArrayList<Integer> cantPilotosPorCarrera(){
		ArrayList<Integer> cantPilotosPorCarrera = new ArrayList<>();
		int cantPilotos = 0;		
		String fechaCarrera = "";
		ArrayList<String> fechasCarreras = new ArrayList<>();
		for(Carrera carrera : carreras) {
			cantPilotos = carrera.getCantPilotosPorCarrera();
			cantPilotosPorCarrera.add(cantPilotos);
			fechaCarrera = carrera.getFecha();
			fechasCarreras.add(carrera.getFecha());
			System.out.println(fechaCarrera + " " + cantPilotos);
		}
		
		
		return cantPilotosPorCarrera;
	}
	
	public void agregarCarrera(Carrera carrera) {
		carreras.add(carrera);
	}

	@Override
	public String toString() {
		return "Empresa [carreras=" + carreras + "]";
	}

}
