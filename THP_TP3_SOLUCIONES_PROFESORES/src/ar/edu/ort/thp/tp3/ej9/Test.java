package ar.edu.ort.thp.tp3.ej9;

public class Test {

	public static void main(String[] args) {
		Carrera instituto = new Carrera("Ort Argentina - Analistas de Sistemas");
		
		instituto.registrarAlumno("Ela Lumno", "elalumno@ort.edu.ar");
		instituto.registrarAlumno("Elsa Gradinsky", "elsagradinsky@ort.edu.ar");
		instituto.registrarAlumno("Danny Vazquez", "dannyvazquez@ort.edu.ar");
		
		instituto.agregarABolsaDeTrabajo("Ela Lumno");
		instituto.agregarABolsaDeTrabajo("Elsa Gradinsky");
		instituto.agregarABolsaDeTrabajo("Danny Vazquez");

		instituto.agregarABolsaDeTrabajo("Ela Lumno");
		instituto.agregarNotaFinal("Ela Lumno", "Matematicas", 9);
		instituto.agregarNotaFinal("Ela Lumno", "Fundamentos", 7);
		instituto.agregarNotaFinal("Ela Lumno", "THP", 8);
		instituto.agregarNotaFinal("Ela Lumno", "Ingles Tecnico", 6);
		instituto.agregarNotaFinal("Ela Lumno", "Sistemas Operativos", 7);
		instituto.agregarNotaFinal("Elsa Gradinsky", "Sistemas Operativos", 9);
		instituto.agregarNotaFinal("Elsa Gradinsky", "Fundamentos", 10);
		instituto.agregarNotaFinal("Danny Vazquez", "Matematicas", 4);
		instituto.agregarNotaFinal("Danny Vazquez", "Fundamentos", 4);
		instituto.agregarNotaFinal("Danny Vazquez", "THP", 4);
		instituto.agregarNotaFinal("Danny Vazquez", "Ingles Tecnico", 4);
		instituto.agregarNotaFinal("Danny Vazquez", "Sistemas Operativos", 5);
		
		System.out.println("Candidatos con 7 o mas");
		for (Candidato candidato: instituto.obtenerCandidatos(7.0)) {
			System.out.println(candidato);
		}
		System.out.println("Candidatos con 4 o mas");
		for (Candidato candidato: instituto.obtenerCandidatos(4.0)) {
			System.out.println(candidato);
		}

	}

}
