package ort.edu.tp1.trabajopractico3.ejercicio2;

public class Vendedor extends Subcontratado{
	
	private float porcentaje;
	private static int  idVendedor = 1;
	private int nroVendedor;
	


	public Vendedor() {
		super();
		this.nroVendedor= idVendedor++;
	}

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
		this.nroVendedor = idVendedor++;
	}
	
	@Override
	public float calcularPago() {
		return super.calcularPago()*porcentaje + super.calcularPago(); 
		//otra forma:
		//return (super.getCantHoras()*super.getPrecioHora()*this.porcentaje) + (super.getCantHoras()*super.getPrecioHora());
	}
	
	@Override
	public String toString() {
		return "Vendedor " + this.nroVendedor +  " " + super.getNombre() + " gana:" + this.calcularPago();
	}
	
	

}
