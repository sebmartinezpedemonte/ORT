package ejercicio11;

public class Test {
	public static void main(String[] args) {
		Carrera carrera1 = new Carrera("4/6/2022", "12.00", Dificultad.AVANZADO, 3);
		
		Carrera carrera2 = new Carrera("1/6/2022", "13.00", Dificultad.AS_DEL_VOLANTE, 5);

		
		Piloto piloto1 = new Piloto("Carlos", "123456789");
		Piloto piloto2 = new Piloto("Sebastian", "34146160");
		Piloto piloto3 = new Piloto("Juan", "987654321");
		Piloto piloto4 = new Piloto("Maria", "2468101214");
		
		
		Vuelta vuelta1 = new Vuelta(30);
		Vuelta vuelta2 = new Vuelta(25);
		Vuelta vuelta3 = new Vuelta(38);
		Vuelta vuelta4 = new Vuelta(29);
		Vuelta vuelta5 = new Vuelta(26);
		Vuelta vuelta6 = new Vuelta(31);
		Vuelta vuelta7 = new Vuelta(27);
		Vuelta vuelta8 = new Vuelta(26);
		Vuelta vuelta9 = new Vuelta(31);
		Vuelta vuelta10 = new Vuelta(30);
		Vuelta vuelta11 = new Vuelta(10);
		
		Empresa empresa1 = new Empresa();
		empresa1.agregarCarrera(carrera1);
		empresa1.agregarCarrera(carrera2);
		
		carrera1.agregarPiloto(piloto1);
		carrera1.agregarPiloto(piloto2);
		carrera2.agregarPiloto(piloto3);
		carrera2.agregarPiloto(piloto4);
		carrera2.agregarPiloto(piloto1);
		
		piloto1.agregarVuelta(vuelta1);
		piloto1.agregarVuelta(vuelta2);
		piloto1.agregarVuelta(vuelta3);
		piloto1.agregarVuelta(vuelta4);
		piloto1.agregarVuelta(vuelta5);	
		piloto1.agregarVuelta(vuelta6);
		piloto1.agregarVuelta(vuelta7);
		piloto1.agregarVuelta(vuelta8);
		piloto1.agregarVuelta(vuelta9);
		piloto1.agregarVuelta(vuelta10);
		
		piloto2.agregarVuelta(vuelta1);
		piloto2.agregarVuelta(vuelta2);
		piloto2.agregarVuelta(vuelta3);
		piloto2.agregarVuelta(vuelta4);
		piloto2.agregarVuelta(vuelta5);	
		piloto2.agregarVuelta(vuelta6);
		piloto2.agregarVuelta(vuelta7);
		piloto2.agregarVuelta(vuelta8);
		piloto2.agregarVuelta(vuelta9);
		piloto2.agregarVuelta(vuelta11);
		
		
		
		System.out.println(empresa1);
		empresa1.buscarCarrera("4/6/2022");
		
		System.out.println(piloto1);
		System.out.println(vuelta1);
		piloto1.calcularVueltaPromedio();
		carrera1.buscarPilotosPorDebajoDe(28);
		carrera1.mostrarMenorPromedio();
		
		empresa1.cantPilotosPorCarrera();
		empresa1.pilotosPorCarrera();
		
	}
}
