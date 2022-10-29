package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> mascotasIngresadas;

	public Veterinaria(String nombre, Doctor doctor) {
		this.nombre = nombre;
		this.doctor = doctor;
		this.mascotasIngresadas = new ArrayList<>();
	}

	public void admitirMascota(Mascota mascota) {
		
		//si no es nula la mascota y no existe el nombre
		if(mascota!= null && buscarMascota(mascota.getNombre())== null) {
			System.out.printf(TXT_INGRESO, mascota.getNombre());
			this.mascotasIngresadas.add(mascota);
		}
		
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		Mascota mascota = null;
		int i = 0;
		while (mascota == null && i < mascotasIngresadas.size()) {
			if(this.mascotasIngresadas.get(i).getNombre().equals(nombreDeMascota)) {
				mascota = this.mascotasIngresadas.get(i);
			}else {
				i++;
			}
		}
		
		return mascota;
	}

	public void vacunar() {
		int contador = 0;
		for(Mascota mascota : mascotasIngresadas) {
			if(!mascota.estaVacunado()) {
				mascota.vacunar();
				contador++;
			}
		}
		System.out.println("Vacunas aplicadas: " + contador);
	}

	@Override
	public void mostrar() {
		System.out.println("Veterinaria "+  this.nombre);
		System.out.println("Doctor: " + this.doctor.getNombre());
		imprimirCantidadPorTipo();
		
	}
	
	private void imprimirCantidadPorTipo() {
		int perros = 0;
		int gatos = 0;
		int conejos = 0;
		
		for(Mascota mascota : mascotasIngresadas) {
			if(mascota instanceof Perro) {
				perros++;
				((Perro) mascota).ladrar();
			}else if(mascota instanceof Gato) {
				gatos++;
			}else {
				conejos++;
			}
		}
		System.out.printf(TXT_CANTIDADES, conejos, gatos, perros);
	}

}
