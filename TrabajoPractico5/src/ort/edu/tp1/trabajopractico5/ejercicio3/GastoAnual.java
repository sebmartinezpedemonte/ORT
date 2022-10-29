package ort.edu.tp1.trabajopractico5.ejercicio3;

import java.util.ArrayList;
//La clase GastosAnuales permite guardar los datos de los gastos comunes del año
//separados por rubro y mes. Para eso tiene una colección de rubros, donde cada
//Rubro tiene un nombre y guarda el importe de los gastos de cada uno de los meses
//del año. 


public class GastoAnual {
	private final int TOTAL_MESES = 12;
	private ArrayList<Rubro> rubros;
	private int[][] contador; //Array para contar la cantidad de veces que se agrego un gasto
	

	
	//Es el constructor, e inicializa la colección de Rubros.
	public GastoAnual() {
		this.rubros = new ArrayList<>();
		contador = new int[TOTAL_MESES][999];
	}
	
	//Agrega el importe gastado al rubro que corresponda y en el mes indicado. Si
	//el rubro no se encuentra registrado en la colección se lo agregará, y cuando
	//ya exista se acumulará en este el valor del gasto. Pero debe controlarse que
	//el importe ingresado sea mayor que cero.
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		Rubro rubroAgregarGasto = obtenerRubro(nombreRubro);
		if(importe > 0) {
			rubroAgregarGasto.agregarGastos(mes, importe);			
			cantidadAgregadosPorMes(mes,rubroAgregarGasto);			
		}		
	}
	
	private void cantidadAgregadosPorMes(Mes mes, Rubro rubro) {		
		int nroMes = mes.ordinal();
		int nroRubro = rubros.indexOf(rubro);
		contador[nroMes][nroRubro] +=1;
	}
	
	//Obtiene y devuelve el Rubro a partir de su nombre. Cuando éste no exista
	//deberá crearlo.
	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubroObtener = buscarRubro(nombreRubro);
		if(rubroObtener == null) {
			rubroObtener = new Rubro(nombreRubro);
			rubros.add(rubroObtener);
		}
		return rubroObtener;
	}
	
	//Busca y devuelve un Rubro a partir de su nombre. Cuando no lo encuentre
	//deberá volver null.
	private Rubro buscarRubro(String nombreRubro) {
		Rubro rubroBuscar = null;
		int i = 0;
		while(i < rubros.size() && rubroBuscar==null) {
			if(rubros.get(i).getNombre().equals(nombreRubro)) {
				rubroBuscar = rubros.get(i);
			}else {
				i++;
			}
		}
		return rubroBuscar;
	}
	
	private Rubro buscarRubro(int nroRubro) {
		Rubro rubroBuscar = null;
		int i = 0;
		while(i < rubros.size() && rubroBuscar==null) {
			if(rubros.get(i).getNroRubro() == nroRubro) {
				rubroBuscar = rubros.get(i);
			}else {
				i++;
			}
		}
		return rubroBuscar;
	}
	
	/*Genera un arreglo bidimensional consolidando en una sola estructura todos
	los gastos del año. La matriz debe medir 12 (la cantidad de meses del año)
	por la cantidad de Rubros existentes, y cada celda debe contener el importe
	acumulado para el rubro en ese mes.*/
	private double[][] consolidadoDeGastos(){
		int cantRubrosExistentes = rubros.size();
		int cantMeses=TOTAL_MESES;
		double[][] gastos = new double[cantMeses][cantRubrosExistentes];
		/*int rows = 5;
		int columns = 3;
		int[][] array = new int[rows][columns];
		for (int i = 0; i<rows; i++)
		    for (int j = 0; j<columns; j++)
		        array[i][j] = 0;
		*/
		for(int i = 0; i < cantMeses; i++) {
			for( int j = 0; j< cantRubrosExistentes; j++) {				
				gastos[i][j]= this.gastoPorMesYRubro(i, j);				
			}
		}		
		return gastos;
	}
	
	public double gastoPorMesYRubro(int mes, int rubro) {		
		double gastos = 0; 
		Mes meses = null;
		Rubro rubro2 = null;
		meses = Mes.values()[mes];
		//El metodo anterior reemplaza el uso del siguiente switch
		/*switch(mes) {
		case 0:
			meses = Mes.ENERO;
			break;
		case 1:
			meses = Mes.FEBRERO;
			break;
		case 2:
			meses = Mes.MARZO;
			break;
		case 3:
			meses = Mes.ABRIL;
			break;
		case 4:
			meses = Mes.MAYO;
			break;
		case 5:
			meses = Mes.JUNIO;
			break;
		case 6:
			meses = Mes.JULIO;
			break;
		case 7:
			meses = Mes.AGOSTO;
			break;
		case 8:
			meses = Mes.SEPTIEMBRE;
			break;
		case 9:
			meses = Mes.OCTUBRE;
			break;
		case 10:
			meses = Mes.NOVIEMBRE;
			break;
		case 11:
			meses = Mes.DICIEMBRE;
			break;
		default: 
			meses = Mes.ERROR;
		}*/	
		rubro2 = this.rubros.get(rubro);		
		gastos = rubro2.getTotalGastos(meses);		
		return gastos;
	}
	
	
	//Devuelve el importe del gasto acumulado en el mes indicado.
	public double gastoAcumulado(Mes mes) {
		double gastoTotal = 0;
		for(Rubro rubro : rubros) {
			gastoTotal += rubro.getTotalGastos(mes);
		}
		return gastoTotal;
	}
	
	public double gastoAcumuladoMesNro(int nroMes) {
		double gastoTotal = 0;
		for(Rubro rubro : rubros) {
			gastoTotal += rubro.getTotalGastosNroMes(nroMes);
		}
		return gastoTotal;
	}
	
	
	/*Devuelve el importe del gasto acumulado en el rubro indicado. Si el rubro no
	existe deberá devolver -1.*/
	
	public double gastoAcumulado(String nombreRubro) {
		double gastoTotal = -1;
		Rubro rubroIndicado = buscarRubro(nombreRubro);
		if(rubroIndicado!=null) {
			gastoTotal = rubroIndicado.getTotalGastosAcumulados();
		}
		return gastoTotal;
	}
	
	public double gastoAcumuladoRubroNro(int numeroRubro) {
		double gastoTotal = -1;
		Rubro rubroIndicado = buscarRubro(numeroRubro);
		if(rubroIndicado!=null) {
			gastoTotal = rubroIndicado.getTotalGastosAcumulados();
		}
		return gastoTotal;
	}

	/*Muestra los consumos por mes (discriminado por cada rubro de gasto y
	acumulado).*/	
	public void informarConsumosPorMes() {
		int cantRubrosExistentes = rubros.size();
		Mes[] cantMeses = Mes.values();
		double[][] gastos= this.consolidadoDeGastos();
		System.out.print("                    ");
		for(Rubro rubro : rubros) {
			System.out.print(rubro.getNombre());
			System.out.print(" 	   		");
		}
		System.out.println();
		for(int i = 0; i < cantMeses.length -1 ; i++) {
			System.out.print(cantMeses[i].getNombreMes() + ":");
			for( int j = 0; j< cantRubrosExistentes; j++) {				
				System.out.print("   	|  $");
				System.out.print(gastos[i][j]);
				System.out.print("   |   ");
			}
			System.out.println();
		}
	}
	
	
	//Muestra los consumos promedio por mes en cada rubro.
	//Suma de los consumos dividido por la cantidad de consumos
	public void informarPromedioMensualPorRubro() {
		int cantRubrosExistentes = rubros.size();
		Mes[] cantMeses = Mes.values();
		double[][] gastos= this.consolidadoDeGastos2();
		System.out.print("                    ");
		for(Rubro rubro : rubros) {
			System.out.print(rubro.getNombre());
			System.out.print(" 	   		");
		}
		System.out.println();
		for(int i = 0; i < cantMeses.length -1 ; i++) {
			System.out.print(cantMeses[i].getNombreMes() + ":");
			for( int j = 0; j< cantRubrosExistentes; j++) {			
				System.out.print("   	|  $");
				System.out.printf("%.2f",gastos[i][j]);
				System.out.print("   |   ");
			}
			System.out.println();
		}
	}
	
	private double[][] consolidadoDeGastos2(){
		int cantRubrosExistentes = rubros.size();
		int cantMeses=12;
		double[][] gastos = new double[cantMeses][cantRubrosExistentes];
		for(int i = 0; i < cantMeses; i++) {
			for( int j = 0; j< cantRubrosExistentes; j++) {				
				gastos[i][j]= this.gastoPorMesYRubro2(i, j);				
			}
		}		
		return gastos;
	}
	public double gastoPorMesYRubro2(int mes, int rubro) {		
		double gastos = 0; 
		Mes meses = null;
		Rubro rubro2 = null;
		meses = Mes.values()[mes];		
		//Muestra los consumos promedio por mes en cada rubro.
		//Suma de los consumos dividido por la cantidad de consumos	
		rubro2 = this.rubros.get(rubro);		
		int cantConsumos = contador[mes][rubro];
		if(cantConsumos <1) {
			cantConsumos = 1;
		}
		gastos = rubro2.getTotalGastos(meses)/cantConsumos;		
		return gastos;
	}
	
	
	/*Calcula y muestra nombre e importe acumulado del mes con mayor consumo
	total (puede ser uno o más de uno).*/
	public void informarMesMayorConsumo() {
		double consumoMax = 0;
		double[] consumoTodosRubrosPorMes = new double[TOTAL_MESES];
		double consumoRubrosPorMes = 0;
		int i;
		int j;
		for(i = 0; i < TOTAL_MESES ; i++) {
		for(j = 0; j < this.rubros.size() ; j++) {
			consumoRubrosPorMes += this.gastoPorMesYRubro(i, j);
		}
		if(consumoRubrosPorMes>=consumoMax) {
			consumoMax = consumoRubrosPorMes;
		}
		consumoTodosRubrosPorMes[i] = consumoRubrosPorMes;
		consumoRubrosPorMes = 0;
		}
		
		ArrayList<Integer> mesesMaximos = new ArrayList<>();
		
		for(int l = 0 ; l < TOTAL_MESES ; l++) {
			if(consumoTodosRubrosPorMes[l] == consumoMax) {
				mesesMaximos.add(l);
			}
		}
		for(int m = 0 ; m < mesesMaximos.size() ; m++) {
			System.out.println(Mes.values()[mesesMaximos.get(m)].getNombreMes() + ": $" + consumoMax);
		}		
	}	
}
