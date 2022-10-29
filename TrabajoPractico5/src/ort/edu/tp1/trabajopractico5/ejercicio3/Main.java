package ort.edu.tp1.trabajopractico5.ejercicio3;

public class Main {
	public static void main(String[] args) {
			
		GastoAnual gasto = new GastoAnual();
		gasto.agregarGasto(Mes.ENERO, "Contaduria", 100);
		gasto.agregarGasto(Mes.ENERO, "Contaduria", 50);
		gasto.agregarGasto(Mes.ENERO, "Contaduria", 150);
		gasto.agregarGasto(Mes.FEBRERO, "Contaduria", 200);
		gasto.agregarGasto(Mes.FEBRERO, "Contaduria", 210);
		gasto.agregarGasto(Mes.FEBRERO, "Contaduria", 230);
		gasto.agregarGasto(Mes.MARZO, "Contaduria", 300);
		gasto.agregarGasto(Mes.MARZO, "Contaduria", 309);
		gasto.agregarGasto(Mes.MARZO, "Contaduria", 401);
		
		gasto.agregarGasto(Mes.ENERO, "RRHH", 300);
		gasto.agregarGasto(Mes.ENERO, "RRHH", 450);
		gasto.agregarGasto(Mes.ENERO, "RRHH", 100);
		gasto.agregarGasto(Mes.FEBRERO, "RRHH",407);
		gasto.agregarGasto(Mes.FEBRERO, "RRHH",431);
		gasto.agregarGasto(Mes.FEBRERO, "RRHH",12);
		gasto.agregarGasto(Mes.MARZO, "RRHH", 123);
		gasto.agregarGasto(Mes.MARZO, "RRHH", 1009);
		gasto.agregarGasto(Mes.MARZO, "RRHH", 564);
		
		gasto.agregarGasto(Mes.ENERO, "IT", 1000);
		gasto.agregarGasto(Mes.FEBRERO, "IT", 2000);
		gasto.agregarGasto(Mes.MARZO, "IT", 3000);
		gasto.agregarGasto(Mes.ABRIL, "IT", 5706);
		
		
		gasto.informarConsumosPorMes();
		
		gasto.informarPromedioMensualPorRubro();
		
		gasto.informarMesMayorConsumo();
	}
}
