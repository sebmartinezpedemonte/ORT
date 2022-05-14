package ejercicio01;

public class Main {
	public static void main(String[] args) {
		Agenda agenda1 = new Agenda();
		Domicilio domicilio1 = new Domicilio("Charcas", "1212", "Barrio Norte");
		Domicilio domicilio2 = new Domicilio("Bulnes", "1212", "Palermo");
		
		agenda1.agregarPersona("36925814", "Sebastian", "Martinez", domicilio1);
		agenda1.agregarPersona("35789456", "Maria", "Velez", domicilio2);
		agenda1.agregarPersona("40456789", "Carlos", "Estevez", domicilio2);

		agenda1.removerPersona("132456789");
		agenda1.removerPersona("40456789");
		

		agenda1.modificarDomicilio("123456789", domicilio2);
		agenda1.modificarDomicilio("36925814", domicilio2);
		
		
		
		agenda1.listarPersonas();
	}
}
