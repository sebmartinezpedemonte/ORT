package ejercicio06;

import java.util.ArrayList;

public class Cliente {
	private String DNI;
	private String nombre;
	private double saldo;
	private Categoria categoriaCliente;
	private ArrayList<Pelicula> peliculasVistas;//esto no va? es solo relacion de dependencia?

	public Cliente(String DNI, String nombre, double saldo, Categoria categoriaCliente) {
		super();
		peliculasVistas = new ArrayList<>();
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		this.categoriaCliente = categoriaCliente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean esDeudor() {
		boolean esDeudor = false;
		if (this.saldo > 0) {
			esDeudor = true;
		}
		return esDeudor;
	}

	public void historialPeliculas(Pelicula pelicula) {
		//ArrayList<Pelicula> peliculasVistas = new ArrayList<>();
		if (esClientePremium()) {
			this.peliculasVistas.add(pelicula);
		} else if (!EsPeliculaPremium(pelicula) && !esClientePremium()) {
			this.peliculasVistas.add(pelicula);
		}
		
	}

	public boolean esClientePremium() {
		boolean esPremium = false;
		if (this.categoriaCliente.equals(Categoria.PREMIUM)) {
			esPremium = true;
		}
		return esPremium;
	}

	public boolean EsPeliculaPremium(Pelicula pelicula) {
		boolean esPremium = false;
		if (pelicula.getCategoriaPelicula().equals(Categoria.PREMIUM)) {
			esPremium = true;
		}
		return esPremium;
	}

	public String getDNI() {
		return DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public Categoria getCategoriaCliente() {
		return categoriaCliente;
	}

	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", nombre=" + nombre + ", saldo=" + saldo + ", categoriaCliente="
				+ categoriaCliente + ", peliculas=" + peliculasVistas + "]";
	}

}
