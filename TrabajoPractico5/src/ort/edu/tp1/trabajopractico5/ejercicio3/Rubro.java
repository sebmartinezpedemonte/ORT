package ort.edu.tp1.trabajopractico5.ejercicio3;

public class Rubro {
	private final int TOTAL_MESES = 12;
	private static int idRubro = 0;
	private String nombre;
	private int nroRubro;
	private int cantGastosAgregados;
	private double[] gastosPorMes;
	
	
	//Es el constructor. Recibe el nombre o descripción del rubro. Debe inicializar el
	//arreglo de importes.
	public Rubro(String nombre) {
		this.nombre = nombre;
		inicializarGastos();
		this.nroRubro = idRubro++;
		cantGastosAgregados = 0;
	}
	//Inicializa el arreglo de importes.
	private void inicializarGastos() {
		this.gastosPorMes = new double[TOTAL_MESES];
		
	}
	//Acumula el importe en la posición correspondiente al mes indicado.
	public void agregarGastos(Mes mes, double gastos) {
		this.gastosPorMes[mes.ordinal()] += gastos;	
		//cantGastosAgregados++;
	}	
	//Devuelve el nombre del Rubro.
	public String getNombre() {
		return nombre;
	}

	//Devuelve el importe acumulado de gastos para el mes indicado.
	public double getTotalGastos(Mes mes) {
		return this.gastosPorMes[mes.ordinal()];
		
	}
	
	public double getTotalGastosAcumulados() {
	double gastosTotales = 0;	
	for(int i = 0; i < TOTAL_MESES ; i++) {
		gastosTotales += gastosPorMes[i];
	}		
	return gastosTotales;
}
	public double getTotalGastosNroMes(int nroMes) {		
		return this.gastosPorMes[nroMes];
	}
	
	public int getNroRubro() {
		return this.nroRubro;
	}
	
	//este esta mal
	//Devuelve el importe acumulado de gastos para el mes indicado.
	/*public double getTotalGastos(Mes mes) {
		int gastosTotales = 0;
		int numeroDelMes = mes.ordinal() + 1;
		for(int i = 0; i < numeroDelMes ; i++) {
			gastosTotales += gastosPorMes[i];
		}		
		return gastosTotales;
	}*/
	
}
