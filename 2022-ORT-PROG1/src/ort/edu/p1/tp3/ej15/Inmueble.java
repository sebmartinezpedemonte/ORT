package ort.edu.p1.tp3.ej15;

import java.util.ArrayList;

public class Inmueble {
	private String domicilio;
	private int supM2;
	private int cantAmb;
	private double precio;
	private ArrayList<Notificable> interesados;
	public Inmueble(String domicilio, int supM2, int cantAmb, double precio) {
		this.interesados = new ArrayList<>();
		this.domicilio = domicilio;
		this.supM2 = supM2;
		this.cantAmb = cantAmb;
		this.precio = precio;
	}
	
	public void setPrecio(double precioNuevo) {
		String mensaje = "El inmueble " + datosInmueble() + " por el que ha demostrado interés cambió su precio de " + this.precio + " a " + precioNuevo;
		this.precio = precioNuevo;
		for(Notificable interesado : interesados){
		interesado.notificar(mensaje);
		}
		
	}
	
	private String datosInmueble() {
		return " que se encuentra en " + domicilio + ", con " + supM2 + " metros cuadrados, de " + cantAmb + " ambientes";
	}
	
	public void agregarInteresados(Notificable interesado) {
		interesados.add(interesado);
	}
}
