package ort.edu.tp1.trabajopractico2.ejercicio2;

public class Test {
public static void main(String[] args) {
	Email email = new Email("lio@messi.com");
	Telefono tel = new Telefono("549","114111","2222" , TipoDeTelefono.CELULAR);
	Telefono tel2 = new Telefono("068","032444","5678", TipoDeTelefono.CELULAR);
	Telefono tel3 = new Telefono("054","4411","5472", TipoDeTelefono.FIJO);
	Mascota mas = new Mascota("Bugs", "Conejo");
	
	Persona p = new Persona("Messi", "Lionel");
	p.agregarMascota("Pluto", "Perro");
	p.agregarMascota("Felix", "Gato");
	p.agregarMascota(mas);
	
	
	p.agregarTelefono(tel);
	p.agregarTelefono(tel2);
	p.agregarTelefono(tel3);
	p.agregarEmail(email);
	//use String para los numeros de los telefonos porque sino no mostraba el cero
	p.mostrarTodo();
	System.out.println("Prueba de remover por objeto");
	p.removerEmail(email);
	p.removerMascota(mas);
	p.removerTelefono(tel3);
	p.mostrarTodo();
	p.agregarTelefono(tel3);
	p.agregarMascota(mas);
	p.agregarEmail(email);
	System.out.println("Prueba de remover por String");
	p.removerEmail("lio@messi.com");
	p.removerMascotaPorNombre("Bugs");
	p.removerTelefonoPorString("(+054) 4411-5472");
	p.removerTodasMascotas();
	p.mostrarTodo();


}
}
