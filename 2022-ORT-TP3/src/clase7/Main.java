package clase7;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> listaNombres = new ArrayList<>();
		listaNombres.add(new String("Pepe"));
		listaNombres.add("Belen");
		System.out.println(listaNombres);
		
		
		
		ArrayList<Persona> personas = new ArrayList<>();
		
		Persona persona1 = new Persona("Maria", "Estevez", "98765432");
		personas.add(persona1);
		personas.add(new Persona("Carlos", "Perez", "123456789"));
		System.out.println(personas);
	}
}
