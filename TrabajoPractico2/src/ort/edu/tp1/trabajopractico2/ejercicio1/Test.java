package ort.edu.tp1.trabajopractico2.ejercicio1;

public class Test {
public static void main(String[] args) {
	Email email = new Email("lio@messi.com");
	Telefono tel = new Telefono("549","114111","2222" , TipoDeTelefono.CELULAR);
	Telefono tel2 = new Telefono("068","032444","5678", TipoDeTelefono.CELULAR);
	Telefono tel3 = new Telefono("054","4411","5472", TipoDeTelefono.FIJO);
	Persona p = new Persona("Messi", "Lionel");
	
	p.agregarTelefono(tel);
	p.agregarTelefono(tel2);
	p.agregarTelefono(tel3);
	p.agregarEmail(email);
	//use String para los numeros de los telefonos porque sino no mostraba el cero
	p.mostrarTodo();

}
}
