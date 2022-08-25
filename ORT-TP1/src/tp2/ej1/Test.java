package tp2.ej1;

public class Test {
	
	public static final String TEMPLATE_DE_MENSAJE = "(+ %s ) %s-%s";
	
	public static void main(String[] args) {
		// Con String %s
		System.out.println(String.format("(+ %s ) %s-%s", "555", "3333", "444"));
		
		String mensaje = String.format(TEMPLATE_DE_MENSAJE, "555", "3333", "444");
		
		System.out.println("Mensaje " + mensaje);
		
		//o uso printf todo en uno y hay que agregar esto "%n"
		System.out.printf("Mensaje: " + TEMPLATE_DE_MENSAJE + "%n", "555", "3333", "444");
		
		
		// Con int %d
		System.out.println(String.format("(+ %d ) %d-%d", 555, 3333, 444));

		// %.2f con 2 decimales y redondea
		System.out.println(String.format("(+ %.2f", 10.77687));
		
		// con %s imprime todos los decimales
		System.out.println(String.format("(+ %s", 10.77687));
		
		String email = "nombre.apellido@ort.edu.ar";
		
		String[] partes = email.split("@");
		
		System.out.println("Cuenta: " + partes[0]);
		System.out.println("Dominio: " + partes[1]);
		System.out.println("Email: " + email);
		System.out.println(partes[0] + "@" + partes[1]);
		
		System.out.printf("%s@%s", partes[0], partes[1]);
		System.out.println();
		System.out.printf("%s@%s%n", partes[0], partes[1]);
		//%n tira una nueva linea
		System.out.printf(String.format("%s@%s", partes[0], partes[1]));
		
		
	}
}
