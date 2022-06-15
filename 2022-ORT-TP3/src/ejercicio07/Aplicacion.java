package ejercicio07;

import java.util.ArrayList;

public class Aplicacion {
	private final int CANT_CANCIONES_GRATUITO = 100;
	private final int CANT_CANCION_PREMIUM = 1000; 
	private String nombre;
	private ArrayList<Cancion> canciones;
	private ArrayList<Usuario> usuarios;
	

	public Aplicacion(String nombre) {
		this.nombre = nombre;
		canciones = new ArrayList<>();
		usuarios = new ArrayList<>();
	}

	private Cancion buscarCancion(String nombre, String autor) {
		Cancion cancionBuscar = null;
		int i = 0;
		while (canciones.size() > i && cancionBuscar == null) {
			if (canciones.get(i).getNombre().equals(nombre) && canciones.get(i).getAutor().equals(autor)) {
				cancionBuscar = canciones.get(i);
			}
			i++;
		}
		return cancionBuscar;
	}

	private Usuario buscarUsuario(String email) {
		Usuario usuarioBuscar = null;
		int i = 0;
		while (usuarios.size() > i && usuarioBuscar == null) {
			if (usuarios.get(i).getEmail().equals(email)) {
				usuarioBuscar = usuarios.get(i);
			}
			i++;
		}
		return usuarioBuscar;
	}
	
	public boolean altaCancion(String nombre, String autor, Genero genero, int diasPublicacion) {
		boolean sePudo = false;
		if(buscarCancion(nombre, autor) == null) {
			Cancion cancionAgregar = new Cancion(nombre, autor, genero, diasPublicacion);
			sePudo = true;
			canciones.add(cancionAgregar);
			System.out.println("Se pudo agregar la cancion " + cancionAgregar);
			//canciones.add(new Cancion(nombre, autor, genero));
		}else {
			System.out.println("La cancion ya esta en sistema");
		}
		return sePudo;
	}
	
	public boolean altaUsuario(String email, String apellido, int edad, Categoria categoria) {
		boolean sePudo = false;
		if(buscarUsuario(email) == null) {
			//usuarios.add(new Usuario(email, apellido, edad, categoria));
			
			Usuario usuarioAgregar = new Usuario(email, apellido, edad, categoria);
			usuarios.add(usuarioAgregar);
			
			sePudo = true;
			
			System.out.println("Se pudo agregar al usuario" + usuarioAgregar);
			
		}else {
			System.out.println("El usuario ya esta en sistema");
		}
		return sePudo;
	}
	
	private boolean gratuitoAlcanzoLimite(String email) {
		/*
		boolean alcanzoLimite = false;
		if(buscarUsuario(email) != null && buscarUsuario(email).esGratuito() && buscarUsuario(email).getcantCancionesEscuchadas() > CANT_CANCIONES_GRATUITO) {
			alcanzoLimite = true;
			}
		return alcanzoLimite;
		*/
		 return (buscarUsuario(email).esGratuito()) &&  buscarUsuario(email).getcantCancionesEscuchadas() > CANT_CANCIONES_GRATUITO;
		}
	private boolean puedeEscucharCancion(String email, String nombre, String autor) {
		boolean puede = false;
		Usuario usuario = buscarUsuario(email);
		Cancion cancion = buscarCancion(nombre, autor);
		if((usuario.esEstandar() || usuario.esGratuito()) && (cantCancionVecesEscuchadaMax(nombre, autor) || cancion.topeDiasPublicacion())){
			puede = true;
		}
		return puede;
		
	}
	private boolean cantCancionVecesEscuchadaMax(String nombre, String autor) {
		return cantVecesCancionEscuchada( nombre, autor) > CANT_CANCION_PREMIUM;
	}
	

	
	
	public Resultado escucharCancion(String email, String nombre, String autor) {
		Resultado resultado = null;
		if(buscarUsuario(email) == null) {
			resultado = Resultado.USUARIO_INEXISTENTE;
			System.out.println("El usuario no existe");
		}else if(buscarCancion(nombre,autor) == null) {
			resultado = Resultado.CANCION_INEXISTENTE;
			System.out.println("La cancion no existe");
		}else if(gratuitoAlcanzoLimite(email)) {
			resultado = Resultado.LIMITE_ALCANZADO;
			System.out.println("Usuario gratuito ha superado su limite de canciones");
		}else if(buscarUsuario(email).esPremium()) {
			resultado = Resultado.CANCION_ESCUCHADA;
			Cancion cancionAAgregar = buscarCancion(nombre,autor);
			buscarUsuario(email).agregarCancionALista(cancionAAgregar);
			buscarUsuario(email).escucharCancion(cancionAAgregar);
			System.out.println("Ha podido escuchar esta cancion satisfactoriamente");
			
		}
			else if(!puedeEscucharCancion(email,nombre,autor)) {
				resultado = Resultado.CANCION_NO_DISPONIBLE;
				System.out.println("Usuario gratuito o Estandar no pueden escuchar esta cancion");			
		}
		else {
			resultado = Resultado.CANCION_ESCUCHADA;
			Cancion cancionAAgregar = buscarCancion(nombre,autor);
			buscarUsuario(email).agregarCancionALista(cancionAAgregar);
			buscarUsuario(email).escucharCancion(cancionAAgregar);
			System.out.println("Ha podido escuchar esta cancion satisfactoriamente");
		}		
		return resultado;
	}
	/*
	public Integer cantVecesCancionEscuchada(String nombre, String autor) {
		ArrayList<Cancion> cantPorCancion = new ArrayList<>();
		Cancion nuevaCancion = buscarCancion(nombre, autor);
		cantPorCancion.add(nuevaCancion);		
		int cantVeces = cantPorCancion.size();		
		return cantVeces;
	}
	*/
	public int cantVecesCancionEscuchada(String nombre, String autor) {
		int cantVeces = 0;
		Cancion cancion = buscarCancion(nombre, autor);
		cantVeces = cancion.getCantReproducciones();
		return cantVeces;
	}
	
	
	public void listarUsuarios() {
		for(Usuario usuario : usuarios) {
			usuario.listarUsuarios();
			//System.out.println(usuario);
		}
	}
	
	public void listarCancionesPorUsuario(String email){
		if(buscarUsuario(email)!=null) {
			System.out.println("Operacion exitosa");
			buscarUsuario(email).listarCancionesEscuchadas();
			}else {
				System.out.println("El usuario es inexistente");
			}
	}

	@Override
	public String toString() {
		return "Aplicacion [CANT_CANCIONES_GRATUITO=" + CANT_CANCIONES_GRATUITO + ", CANT_CANCION_PREMIUM="
				+ CANT_CANCION_PREMIUM + ", nombre=" + nombre + ", canciones=" + canciones + ", usuarios=" + usuarios
				+ "]";
	}


}
