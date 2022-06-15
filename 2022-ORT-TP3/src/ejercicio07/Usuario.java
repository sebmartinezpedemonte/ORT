package ejercicio07;

import java.util.ArrayList;

public class Usuario {
	private final String  email ;
	private String apellido;
	private int edad;
	private int cantCancionesEscuchadas;
	private Categoria categoria;
	private ArrayList<Cancion> cancionesEscuchadas;
	public Usuario(String email, String apellido, int edad, Categoria categoria) {
		super();
		this.email = email;
		this.apellido = apellido;
		this.edad = edad;
		this.categoria = categoria;
		cancionesEscuchadas  = new ArrayList<>();
		setCantCancionesEscuchadas();
	}
	
	private void setCantCancionesEscuchadas() {
		this.cantCancionesEscuchadas =cancionesEscuchadas.size(); 
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void agregarCancionALista(Cancion cancion) {
		cancionesEscuchadas.add(cancion);		
	}
	
	public void escucharCancion(Cancion cancion) {
		cancion.escuchar();
	}
	
	public int getcantCancionesEscuchadas() {
		return cancionesEscuchadas.size();
	}
	
	
	
	public boolean esGratuito() {
		return (this.categoria.equals(Categoria.GRATUITO));
	}
	
	public boolean esEstandar() {
		return (this.categoria.equals(Categoria.ESTANDAR));
	}
	
	public boolean esPremium() {
		return (this.categoria.equals(Categoria.PREMIUM));
	}
	
	public void listarCancionesEscuchadas() {
		for(Cancion cancion : cancionesEscuchadas) {
			System.out.println(cancion);
		}
	}
	
	public int cantVecesPorCancion(Cancion cancion) {
		int cant = 0;
		if(cancionesEscuchadas.add(cancion)) {
			cant +=1;
		}
		return cant;
	}
	
	
	public void listarUsuarios() {
		if(cancionesEscuchadas.size()== 0) {
			System.out.println("Usuario con mail " + email + ", de apellido " + apellido + ", con  " + edad + " años de edad, no ha escuchado ninguna cancion");

		}else if(cancionesEscuchadas.size() == 1) {
			System.out.println("Usuario con mail " + email + ", de apellido " + apellido + ", con  " + edad + " años de edad, ha escuchado " + cancionesEscuchadas.size() + " cancion");

		}else {
			System.out.println("Usuario con mail " + email + ", de apellido " + apellido + ", con  " + edad + " años de edad, ha escuchado " + cancionesEscuchadas.size() + " canciones");

		}


	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", apellido=" + apellido + ", edad=" + edad + ", cantCancionesEscuchadas="
				+ cantCancionesEscuchadas + ", categoria=" + categoria + ", cancionesEscuchadas=" + cancionesEscuchadas
				+ "]";
	}
	
	
}
