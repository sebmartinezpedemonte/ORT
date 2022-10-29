package ort.edu.p1.tp3.ej15;

import java.util.ArrayList;

public class Inmobiliaria implements Notificable {
	private String nombre, mail;
	private double pjeComisionXVenta;
	private ArrayList<Inmueble> inmuebles;
	public Inmobiliaria(String nombre, String mail, double pjeComisionXVenta) {
		super();
		this.inmuebles = new ArrayList<>();
		this.nombre = nombre;
		this.mail = mail;
		this.pjeComisionXVenta = pjeComisionXVenta;
	}
	@Override
	public void notificar(String info) {
		String mensaje = "Hemos recibido un mail a nuestra casilla " + mail + " con el mensaje: " + info;
		System.out.println(mensaje);
	}
	
	
}
