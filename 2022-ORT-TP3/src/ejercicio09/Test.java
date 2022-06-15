package ejercicio09;

public class Test {

	public static void main(String[] args) {
		Recetario recetario = new Recetario();
		Heladera heladera = new Heladera("Philips");
		Alacena alacena = new Alacena("Johnson");

		heladera.agregar("Masa", 1, "10,6,2022");
		heladera.agregar("Carne", 100, "15,6,2022");
		alacena.agregar("Cebolla", 100, "1,7,2022");
		recetario.agregarReceta(1, "Empanada");
		recetario.agregarIngredienteAReceta(1, 1, true, "Masa");
		recetario.agregarIngredienteAReceta(1, 100, true, "Carne");
		recetario.agregarIngredienteAReceta(1, 100, false, "Cebolla");

		recetario.prepararListadoAComprar("Empanada", heladera, alacena, 1);
		recetario.recetasPosiblesAPreparar(heladera, alacena, 1);

	}
}