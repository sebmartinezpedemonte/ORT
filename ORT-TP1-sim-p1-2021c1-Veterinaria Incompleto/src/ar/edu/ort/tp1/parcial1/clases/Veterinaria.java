package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> mascotas;
	

	public Veterinaria(String nombre, Doctor doctor) {
		this.nombre = nombre;
		this.doctor = doctor;
		this.mascotas = new ArrayList<>();
	}

	public void admitirMascota(Mascota mascota) {
		if(mascota !=null && buscarMascota(mascota.getNombre()) == null) {			
			mascotas.add(mascota);
			System.out.printf(TXT_INGRESO, mascota.getNombre());
		}
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		int i = 0;
		Mascota mascotaBuscar = null;
		while(i < this.mascotas.size() && mascotaBuscar == null) {
			if(this.mascotas.get(i).getNombre().equals(nombreDeMascota)) {
				mascotaBuscar = this.mascotas.get(i);
			}else {
				i++;
			}
		}		
		return mascotaBuscar;
	}
	

	public void vacunar() {
		int cantVacunasAp = 0;
		for(Mascota mascota : this.mascotas) {
			if(!mascota.getVacuna()) {
				cantVacunasAp++;
			}
			mascota.vacunar();
		}
		System.out.println("Vacunas aplicadas: " + cantVacunasAp);
	}

	@Override
	public void mostrar() {
		System.out.println("Veterinaria: " + this.nombre);
		System.out.println("Doctor de Turno: " + this.doctor.getNombre());
		int conejos = 0;
		int gatos = 0;
		int perros = 0;
		
		for(Mascota mascota : this.mascotas) {
			if(mascota instanceof Conejo) {
				conejos++;
			}else if(mascota instanceof Gato) {
				gatos++;
			}else {
				perros++;
			}
		}
		
		
		System.out.printf(TXT_CANTIDADES, conejos, gatos, perros);
	}

}
