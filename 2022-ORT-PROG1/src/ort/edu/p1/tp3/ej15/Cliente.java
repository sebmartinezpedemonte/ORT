package ort.edu.p1.tp3.ej15;

public class Cliente implements Notificable{
	private String apellido, nombre, telefono, mail;

	
	
	public Cliente(String apellido, String nombre, String telefono, String mail) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		this.mail = mail;
	}



	@Override
	public void notificar(String info) {
		String mensaje = "He recibido un SMS en mi teléfono " + telefono + " con el mensaje: "+ info;
		System.out.println(mensaje);
	}
}
