package ar.edu.ort.thp.tp3.ej10;

public class Test {

	public static void main(String[] args) {
		OrganizadoraDeCarreras correcaminos = new OrganizadoraDeCarreras();
		
		correcaminos.agregarCarrera("2021-05-25 10:00", Dificultad.PRINCIPIANTE, 18);
		
		correcaminos.registrarPiloto("2021-05-25 10:00", "Fan Giú, Lee", 92157345);
		correcaminos.registrarPiloto("2021-05-25 10:00", "Fangio, Juan Manuel", 2457148);
		correcaminos.registrarPiloto("2021-05-25 10:00", "Lodoso, Fango", 39458712);
		
		correcaminos.computarVuelta("2021-05-25 10:00", "Fan Giú, Lee", 58.12); 
		correcaminos.computarVuelta("2021-05-25 10:00", "Fan Giú, Lee", 60.01); 
		
		for (int i=0; i < 18; i++) {
			correcaminos.computarVuelta("2021-05-25 10:00", "Fangio, Juan Manuel", 55 + Math.random());
		}

		for (ResumenCarrera resumen : correcaminos.pilotosPorCarrera()) {
			System.out.println(resumen);
		}
		
		correcaminos.mostrarPromediosPorDebajoDe("2021-05-25 10:00", 58.0);
		
		correcaminos.mostrarMenorPromedioPorCarrera();
	}

}
