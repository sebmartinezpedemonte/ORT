package simulacion.segundo.parcial;

import java.util.ArrayList;

public class Deposito {

	private ArrayList<Producto> productos;
	private TipoDeposito tipoDeposito;
	private ArrayList<Requerimiento> requerimientos;

	public Deposito(TipoDeposito tipo) {
		requerimientos = new ArrayList<>();
		setTipoDeposito(tipo);
		productos = new ArrayList<>();
	}

	public void almacenarProducto(Producto producto) {
		Producto productoBuscado = buscarProducto(producto.getNombre());
		if (productoBuscado==null)
			this.productos.add(producto);
		else
			productoBuscado.actualizar(producto);
	}

	private Producto buscarProducto(String nombreProducto) {
		int i = 0;
		Producto producto;
		Producto productoEncontrado = null;

		while (i < productos.size() && productoEncontrado == null) {
			producto = productos.get(i);
			if (producto.getNombre().equals(nombreProducto)) {
				productoEncontrado = producto;
			} else {
				i++;
			}
		}
		return productoEncontrado;
	}

	public int extraerProducto(String nombreProducto, int cantidadRequerida) {
		int extraido = 0;
		Producto producto = buscarProducto(nombreProducto);
		if (producto == null) {
			System.out.println("El producto " + nombreProducto + " no tiene stock en deposito");
			this.agregarNuevoProducto(nombreProducto, cantidadRequerida);
		}else {
			extraido = producto.extraer(cantidadRequerida);		
		}
		return extraido;
	}
	//¿Por que anda el while y no el for(no borra todos)? Y por que con el for each se rompe?
	public void borrarListaProductosVacios() {
		int i = 0;		
		while(productos.size() > i) {
			if(productos.get(i).getCantidad() == 0) {				
				productos.remove(i);
			}else {
				i++;
			}
		}
		/*
		for(int i = 0; i < productos.size() ; i++) {
			if(productos.get(i).getCantidad() == 0) {
				productos.remove(i);
			}
		}		
		
		for(Producto producto : productos) {
			if(producto.getCantidad() == 0) {
				boolean pop = productos.remove(producto);
			}
		}		
		*/		
	}
	
	public ArrayList<Requerimiento> listaRequerimientos(){
		
		ArrayList<Requerimiento> lista = new ArrayList<>();		
		
		for(Producto producto : productos) {
			if(producto.necesitaReposicion()) {
				this.agregarProductoSinStock(producto.getNombre());
			}
		}
		borrarListaProductosVacios();
		lista.addAll(requerimientos);
		requerimientos.clear();
		return lista;
	}

	public boolean isRefrigerado() {
		return tipoDeposito.equals(TipoDeposito.REFRIGERADO);
	}

	private void setTipoDeposito(TipoDeposito tipo) {
		this.tipoDeposito = tipo;
	}
	private void agregarNuevoProducto(String nombreProducto, int cantidadRequerida) {
		double cantidadDouble = cantidadRequerida;
		double cantidadNueva = cantidadDouble + cantidadDouble*0.2;
		Requerimiento nuevoRequerimiento = new Requerimiento(nombreProducto, cantidadNueva);
		requerimientos.add(nuevoRequerimiento);		
	}
	private void agregarProductoSinStock(String nombreProducto) {		
		Producto productoAgregar = buscarProducto(nombreProducto);
		double cantidadDouble = (double)productoAgregar.getFaltante() + (double) productoAgregar.getPuntoReposicion()*.2;
		Requerimiento nuevoRequerimiento = new Requerimiento(nombreProducto, cantidadDouble);
		requerimientos.add(nuevoRequerimiento);		
	}

	
	public void mostrarTodo() {
		for(Producto producto : productos) {
			System.out.println(producto);
		}
	}
	
	@Override
	public String toString() {
		return "Deposito [productos=" + productos + ", tipoDeposito=" + tipoDeposito + ", requerimientos="
				+ requerimientos + "]";
	}
	
}