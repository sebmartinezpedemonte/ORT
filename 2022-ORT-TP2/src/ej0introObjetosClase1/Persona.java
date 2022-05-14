package ej0introObjetosClase1;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	boolean tieneHijos;

	public String nombreCompleto() {
		return nombre + " " + apellido;
	}

	public void mostrarDatos() {
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(edad);
		System.out.println(tieneHijos);
	}

	public void cambiarEdad(int nuevaEdad) {
		if (nuevaEdad > 0 && nuevaEdad < 120) {
			edad = nuevaEdad;
		}
	}

	public void cambiarNombreYApellido(String nuevoNombre, String nuevoApellido) {
		cambiarNombre(nuevoNombre);
		cambiarApellido(nuevoApellido);		
	}
	
	
	
	
	public void cambiarNombre(String nuevoNombre) {
		if (nuevoNombre != null && nuevoNombre.length() >= 3) {
			nombre = nuevoNombre;
		}
	}

	public boolean esMayorDe(int edad) {
		return this.edad > edad;
	}

	
	public void cambiarApellido(String nuevoApellido) {
		if (nuevoApellido != null && nuevoApellido.length() >= 2) {
			apellido = nuevoApellido;
		}
	}
}
