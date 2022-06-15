package ejercicio06;

import java.util.ArrayList;

public class Sitio {
	private String nombre;
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Cliente> clientes;
	private ArrayList<Cliente> listaNegra;

	public Sitio(String nombre) {
		this.listaNegra = new ArrayList<>();
		this.nombre = nombre;
		this.clientes = new ArrayList<>();
		this.peliculas = new ArrayList<>();

	}

	public ResultadoPelicula verPelicula(String DNI, String nombrePelicula) {
		ResultadoPelicula resultado = ResultadoPelicula.CLIENTE_INEXISTENTE;
		Cliente cliente1 = buscarCliente(DNI);
		Pelicula pelicula1 = buscarPelicula(nombrePelicula);
		if (buscarCliente(DNI) == null) {
			resultado = ResultadoPelicula.CLIENTE_INEXISTENTE;
		} else if (buscarPelicula(nombrePelicula) == null) {
			resultado = ResultadoPelicula.CONTENIDO_INEXISTENTE;
		} else if (buscarCliente(DNI).esDeudor()) {
			resultado = ResultadoPelicula.CLIENTE_DEUDOR;
		} else if (buscarPelicula(nombrePelicula).esPremium() && !buscarCliente(DNI).esClientePremium()) {
			resultado = ResultadoPelicula.CONTENIDO_NO_DISPONIBLE;
		} else {
			resultado = ResultadoPelicula.OK;
			cliente1.historialPeliculas(pelicula1);
			// buscarCliente(DNI).historialPeliculas(buscarPelicula(nombrePelicula));
		}
		return resultado;
	}

	public Cliente buscarCliente(String DNI) {
		Cliente clienteBuscar = null;
		int i = 0;
		while (this.clientes.size() > i && clienteBuscar == null) {
			if (this.clientes.get(i).getDNI().equals(DNI)) {
				clienteBuscar = this.clientes.get(i);
			} else {
				i++;
			}
		}
		return clienteBuscar;
	}

	public Pelicula buscarPelicula(String nombrePelicula) {
		Pelicula peliculaBuscar = null;
		int i = 0;
		while (peliculas.size() > i && peliculaBuscar == null) {
			if (peliculas.get(i).getNombre().equals(nombrePelicula)) {
				peliculaBuscar = peliculas.get(i);
			} else {
				i++;
			}
		}
		return peliculaBuscar;
	}

	public ResultadoAlta darDeAlta(String DNI, Categoria categoria) {
		ResultadoAlta resultado = null;
		if (buscarCliente(DNI) != null) {
			resultado = ResultadoAlta.CLIENTE_EXISTENTE;
		} else if (buscarClienteListaNegra(DNI) != null) {
			resultado = ResultadoAlta.CLIENTE_DEUDOR;
		} else if (buscarCliente(DNI) == null) {
			Cliente cliente1 = new Cliente(DNI, "", 0, categoria);
			resultado = ResultadoAlta.ALTA_OK;
			this.clientes.add(cliente1);
		}
		return resultado;
	}

	public ArrayList<Cliente> darDeBaja(String DNI) {

		Cliente clienteRemover = null;
		if (buscarCliente(DNI) != null) {
			clienteRemover = buscarCliente(DNI);
			clientes.remove(clienteRemover);
			if (clienteRemover.esDeudor()) {
				this.listaNegra.add(clienteRemover);
			}
		}
		return listaNegra;
	}

	private Cliente buscarClienteListaNegra(String DNI) {
		Cliente clienteBuscar = null;
		ArrayList<Cliente> listaNegra = darDeBaja(DNI);
		int i = 0;
		while (listaNegra.size() > i && clienteBuscar == null) {
			if (listaNegra.get(i).getDNI().equals(DNI)) {
				clienteBuscar = listaNegra.get(i);
			} else {
				i++;
			}
		}
		return clienteBuscar;
	}

	public void agregarPelicula(Pelicula pelicula) {
		if (buscarPeliculaObjeto(pelicula) == null) {
			peliculas.add(pelicula);
		}

	}

	public Pelicula buscarPeliculaObjeto(Pelicula pelicula) {
		Pelicula peliculaBuscar = null;
		int i = 0;
		while (peliculas.size() > i && peliculaBuscar == null) {
			if (peliculas.get(i).equals(pelicula)) {
				peliculaBuscar = peliculas.get(i);
			} else {
				i++;
			}
		}
		return peliculaBuscar;
	}

	public void depurarListaNegra(double tope) {		
		int i = 0;
		Cliente clienteRemover = null;
		while(listaNegra.size()>i) {
			if(listaNegra.get(i).getSaldo() <= tope) {
				clienteRemover = listaNegra.get(i);
				listaNegra.remove(clienteRemover);
			}
			else {
				i++;
			}
		}
		
		

		
	}

	@Override
	public String toString() {
		return "Sitio [nombre=" + nombre + ", peliculas=" + peliculas + ", clientes=" + clientes + "]";
	}

}
