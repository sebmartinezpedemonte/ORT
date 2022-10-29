package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable{
	//TODO A completar
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;
	
	private static String MENSAJE = "Mueble tipo: %s - Modelo: %s - Precio de venta:%.2f \n";

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		super();
		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	//metodo polimorfico
	public abstract float calcularPrecioCosto();
	
	public float calcularPrecioVenta() {
		return this.calcularPrecioCosto() + (this.calcularPrecioCosto() * this.porcentajeGanancia/100);
	}

	protected float getCostoBase() {
		return costoBase;
	}
	
	//Equals, devuelve si el modelo es igual al de la instancia, mismoModelo
	//en vez de usar un getModelo()
	public boolean modeloCorrecto(String modelo) {	
		return modelo == this.modelo;
	}
	
	@Override
	public void mostrar() {
		//String mensajeResultante = String.format(MENSAJE, this.getClass().getSimpleName(), this.modelo, this.calcularPrecioVenta());
		//System.out.println(mensajeResultante);		
		System.out.printf(MENSAJE, this.getClass().getSimpleName(), this.modelo, this.calcularPrecioVenta());
	}

}
