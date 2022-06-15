package ejercicio05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.concurrent.TimeUnit;

public class Lector {
	private SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");

	private final static int CANT_MAX_PRESTAMOS = 3;
	private final static int FECHA_EXPIRACION = 7;
	private String DNI;
	private String nombre;
	private String direccion;
	private String telefono;
	private String fechaRetiro;
	private String fechaDevolucion;
	private ArrayList<Ejemplar> ejemplares;
	private boolean deudor;


	public Lector(String dNI, String nombre, String direccion, String telefono, String fechaDevolucion) {
		super();
		this.ejemplares = new ArrayList<>();
		this.DNI = dNI;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaDevolucion = fechaDevolucion;
		this.deudor = false;
	}

	public void agregarEjemplar(Ejemplar ejemplar) throws ParseException {
		this.deudor = validarDeudor(ejemplar);
		if (ejemplares.size() < CANT_MAX_PRESTAMOS && this.deudor) {
			ejemplares.add(ejemplar);
			System.out.println("Se agrego");
			fechaRetiro = ejemplar.getFechaPrestamo();
			// usar metodo buscar
			//for (int i = 0; i < ejemplares.size(); i++) {
			//	ejemplarRetirado = ejemplares.get(i);
			//}

		}else {
			System.out.println("No se agrego");
		}

	}

	
	
	private boolean validarDeudor(Ejemplar ej) throws ParseException {
		//boolean deudor = false;
		if (cantidadDeDias(ej) < FECHA_EXPIRACION) {
			this.deudor = true;
		}else {
			this.deudor=false;
		}
		return this.deudor;
	}
	
	//public boolean sePaso() {		
	//}

	public long cantidadDeDias(Ejemplar ej) throws ParseException {
		Date dateA = myFormat.parse(ej.getFechaPrestamo());
		Date dateB = myFormat.parse(fechaDevolucion);
		long diff = dateA.getTime() - dateB.getTime();
		System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public String getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		return "Lector [myFormat=" + myFormat + ", DNI=" + DNI + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", fechaRetiro=" + fechaRetiro + ", fechaDevolucion=" + fechaDevolucion
				+ ", ejemplares=" + ejemplares;
	}

	/*
	 * private void setEjemplares(ArrayList<Ejemplar> ejemplares) { if
	 * (ejemplares.size() <= CANT_MAX_PRESTAMOS) { ejemplares = new ArrayList<>();
	 * 
	 * } }
	 */
}
