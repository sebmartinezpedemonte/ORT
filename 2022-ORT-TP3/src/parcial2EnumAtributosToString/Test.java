package parcial2EnumAtributosToString;

public class Test {
	public static void main(String[] args) {
		Reunion reunion1 = new Reunion("El asadito");
		
		reunion1.anotarAmigo("Amigo 1", "Domicilio 1");
		reunion1.anotarAmigo("Amigo 2", "Domicilio 2");
		reunion1.anotarAmigo("Amigo 3", "Domicilio 3");
		reunion1.anotarAmigo("Amigo 4", "Domicilio 4");
		reunion1.anotarAmigo("Amigo 5", "Domicilio 5");
		
		
		reunion1.crearPropuesta("Amigo 1", Dia.SABADO, Momento.NOCHE);
		reunion1.crearPropuesta("Amigo 2", Dia.DOMINGO, Momento.MEDIODIA);
		reunion1.crearPropuesta("Amigo 3", Dia.SABADO, Momento.NOCHE);
		
		reunion1.unirAPropuesta("Amigo 3", Dia.DOMINGO, Momento.MEDIODIA);
		reunion1.unirAPropuesta("Colado", Dia.SABADO, Momento.NOCHE);
		
		reunion1.bajarDePropuesta("Amigo 3", Dia.SABADO, Momento.MEDIODIA);
		reunion1.bajarDePropuesta("Amigo 3", Dia.DOMINGO, Momento.MEDIODIA);
		reunion1.cambiarDePropuesta("Amigo 2", Dia.DOMINGO, Momento.MEDIODIA, Dia.SABADO, Momento.NOCHE);
		
		reunion1.listarPropuestas();
			
		
	}
}
