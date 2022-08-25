package tp2.ej1;

public class Test2 {
public static void main(String[] args) {
	Email email = new Email("nombre.apellido@ort.edu.ar");
	Telefono tel = new Telefono(44,444,444 , TipoDeTelefono.FAX);
	Telefono tel2 = new Telefono(55,555,555, TipoDeTelefono.CELULAR);
	
	Persona p = new Persona("Messi", "Lionel");
	
	p.agregarTelefono(tel);
	p.agregarTelefono(tel2);
	
	p.agregarEmail(email);
	
	p.mostrarTodo();

}
}
