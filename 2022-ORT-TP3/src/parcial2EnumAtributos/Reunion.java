package parcial2EnumAtributos;

import java.util.ArrayList;

public class Reunion {
	private String nombreEvento;
	private ArrayList<Amigo> amigos;
	private ArrayList<Propuesta> propuestas;
	private ArrayList<Amigo> amigosFaltantes;
	
	
	public Reunion(String nombreEvento) {
		super();
		this.nombreEvento = nombreEvento;
		amigos = new ArrayList<>();
		propuestas = new ArrayList<>();
		amigosFaltantes = new ArrayList<>();
	}
	
	public Resultado anotarAmigo(String nombre, String domicilio) {		
		Resultado resultado = null;		
		Amigo amigo = buscarAmigo(nombre);
		if(amigo != null) {
			resultado = Resultado.AMIGO_YA_EXISTENTE;
			System.out.println(nombre + " ya existe");
		}else {
			Amigo amigoNuevo = new Amigo(nombre, domicilio);
			amigos.add(amigoNuevo);
			amigosFaltantes.add(amigoNuevo);
			resultado = Resultado.OPERACION_OK;
			System.out.println("Agregando a " + nombre + " que vive en " + domicilio);
		}		
		return resultado;
	}

	
	
	
	public Resultado crearPropuesta(String nombre, Dia dia, Momento momento) {
		
		Resultado resultado = null;
		Amigo amigo = buscarAmigo(nombre);
		if(amigo == null) {
			resultado = Resultado.AMIGO_NO_EXISTENTE;
			System.out.println(resultado);
		}else if(buscarPropuesta(dia,momento)!=null) {
			this.unirAPropuestaBis(nombre, dia,momento);
			resultado = Resultado.OPERACION_OK;
			//System.out.println(resultado);
			System.out.println("Agregando propuesta " + dia.getDia() + "(" + momento.getMomento() +")" +". Propuesta por " + nombre);

		}else {
			Propuesta propuesta = new Propuesta(dia, momento);
			propuestas.add(propuesta);
			propuesta.agregarAmigo(amigo);
			amigosFaltantes.remove(amigo);
			resultado = Resultado.OPERACION_OK;
			System.out.println("Agregando propuesta " + dia.getDia() + "(" + momento.getMomento() +")" +". Propuesta por " + nombre);
		}
		
		
		
		return resultado;
	}
	
	public Resultado unirAPropuesta(String nombre, Dia dia, Momento momento) {
		Resultado resultado = null;
		Propuesta propuesta = buscarPropuesta(dia, momento);
		Amigo amigo = buscarAmigo(nombre);
		if(amigo == null) {
			resultado = Resultado.AMIGO_NO_EXISTENTE;
			System.out.println(nombre + " se quiere agregar al " + dia.getDia()  + "(" + momento.getMomento() +")");
			System.out.println(resultado.getResultado());
		}else if(propuesta == null) {
			resultado = Resultado.PROPUESTA_NO_EXISTENTE;
			System.out.println(resultado.getResultado());

		}else {
			propuesta.agregarAmigo(amigo);
			amigosFaltantes.remove(amigo);
			resultado = Resultado.OPERACION_OK;
			System.out.println(nombre + " se quiere agregar al " + dia.getDia()  + "(" + momento.getMomento() +")");
		}
		return resultado;
	}
	
	private Resultado unirAPropuestaBis(String nombre, Dia dia, Momento momento) {
		Resultado resultado = null;
		Propuesta propuesta = buscarPropuesta(dia, momento);
		Amigo amigo = buscarAmigo(nombre);
		if(amigo == null) {
			resultado = Resultado.AMIGO_NO_EXISTENTE;

		}else if(propuesta == null) {
			resultado = Resultado.PROPUESTA_NO_EXISTENTE;
			System.out.println(resultado.getResultado());

		}else {
			amigosFaltantes.remove(amigo);
			propuesta.agregarAmigo(amigo);
			resultado = Resultado.OPERACION_OK;
		}
		return resultado;
	}

	private Amigo buscarAmigo(String nombre) {
		int i = 0;
		Amigo amigoBuscar = null;
		while(amigos.size() > i && amigoBuscar == null) {
			if(amigos.get(i).getNombre().equals(nombre)) {
				amigoBuscar= amigos.get(i);
			}else {
				i++;
			}
		}		
		return amigoBuscar;
	}
	
	private Propuesta buscarPropuesta(Dia dia, Momento momento) {
		int i = 0;
		Propuesta propuestaBuscar = null;
		while(propuestas.size() > i && propuestaBuscar == null) {
			if(propuestas.get(i).getDia().equals(dia) && propuestas.get(i).getMomento().equals(momento)) {
				propuestaBuscar= propuestas.get(i);
			}else {
				i++;
			}
		}		
		return propuestaBuscar;
	}
	
	public Resultado cambiarDePropuesta(String nombre, Dia diaOriginal, Momento momentoOriginal, Dia diaActualizado, Momento momentoActualizado) {
		Resultado resultado = null;
		if(buscarPropuesta(diaOriginal,momentoOriginal) == null || buscarPropuesta(diaActualizado,momentoActualizado) == null ) {
			resultado = Resultado.PROPUESTA_NO_EXISTENTE;
			System.out.println(resultado.getResultado());

		}else if(buscarAmigo(nombre) == null) {
			resultado = Resultado.AMIGO_NO_EXISTENTE;
			

		}else {
			this.bajarDePropuestaBis(nombre, diaOriginal,momentoOriginal);
			this.unirAPropuestaBis(nombre, diaActualizado,momentoActualizado);
			resultado = Resultado.OPERACION_OK;
			
		}
		
		System.out.println(nombre + " se pasa del " + diaOriginal.getDia() + " (" + momentoOriginal.getMomento() + ") al " + diaActualizado.getDia() + " (" + momentoActualizado.getMomento() + ")");
		return resultado;
	}
	
	public Resultado bajarDePropuesta(String nombre, Dia dia, Momento momento) {
		Resultado resultado = null;
		Propuesta propuesta = buscarPropuesta(dia, momento);
		Amigo amigo = buscarAmigo(nombre);
		if(amigo == null) {
			resultado = Resultado.AMIGO_NO_EXISTENTE;
		}else if(propuesta == null) {
			resultado = Resultado.PROPUESTA_NO_EXISTENTE;
			System.out.println(nombre + " se borra del " + dia.getDia()  + "(" + momento.getMomento() +")");
			System.out.println(resultado.getResultado());
		}else {
			propuesta.bajarAmigo(amigo);
			//amigosFaltantes.add(amigo);
			resultado = Resultado.OPERACION_OK;
			System.out.println(nombre + " se borra del " + dia.getDia()  + "(" + momento.getMomento() +")");

			if(propuesta.cantAmigos()==0) {
				propuestas.remove(propuesta);
			}
		}
		return resultado;
	}
	
	private Resultado bajarDePropuestaBis(String nombre, Dia dia, Momento momento) {
		Resultado resultado = null;
		Propuesta propuesta = buscarPropuesta(dia, momento);
		Amigo amigo = buscarAmigo(nombre);
		if(amigo == null) {
			resultado = Resultado.AMIGO_NO_EXISTENTE;
		}else if(propuesta == null) {
			resultado = Resultado.PROPUESTA_NO_EXISTENTE;


		}else {
			propuesta.bajarAmigo(amigo);
			amigosFaltantes.add(amigo);
			resultado = Resultado.OPERACION_OK;


			if(propuesta.cantAmigos()==0) {
				propuestas.remove(propuesta);
			}
		}
		return resultado;
	}
	
	
	/*
	 * yo hice un foreach de amigos anotados que adentro tenía un foreach de propuestas
	 *  entonces para cada amigo recorres todas las propuestas, entonces si el amigo no 
	 *  estaba en ninguna propuesta lo agregue a un array de amigos no anotados, y retorne ese array
	 */
	
	public void listarPropuestas() {
		
		System.out.println("Amigos registrados para " + this.nombreEvento);
		for(Amigo amigo : amigos) {
			System.out.println(amigo.getNombre());
		}
		System.out.println("Propuestas registradas para " + this.nombreEvento);
		for(Propuesta propuesta : propuestas) {
			propuesta.listarAmigos();
		}
		System.out.println("Amigos no registrados en ninguna propuesta: ");			
		for(Amigo amigo : amigosFaltantes) {
			System.out.println(amigo.getNombre());
		}
		
		/*
		for(Amigo amigo : amigos) {
			for(Propuesta propuesta : propuestas) {
				
			}
		}
		*/

		
		}
	
	

	

	@Override
	public String toString() {
		return "Reunion [nombre=" + nombreEvento + ", amigos=" + amigos + ", propuestas=" + propuestas + "]";
	}
	
	
}
