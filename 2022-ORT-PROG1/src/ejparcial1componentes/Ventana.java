package ejparcial1componentes;

import java.util.ArrayList;

public class Ventana extends Componente{

	private Estado estado;
	private ArrayList<Componente> componentes;
	
	public Ventana(String texto, String color, int ancho, int altura, int ejeX, int ejeY, boolean hablitado,
			Estado estado) {
		super(texto, color, ancho, altura, ejeX, ejeY, hablitado);
		this.estado = estado;
		this.componentes = new ArrayList<>();
	}
	
	
	
	/*
	 * C)	El método agregar de la clase Ventana que debe permitir agregar sobre 
	 * la misma cualquier componente excepto si es una Ventana. En caso de que el
	 *  componente se pueda agregar devolver true caso contrario si es una Ventana devolver false. 
	 */
	
	public boolean agregarComponente(Componente comp) {
		boolean sePudo = false;
		if(comp!= null && !(comp instanceof Ventana)) {			
			this.componentes.add(comp);
			sePudo = true;
			System.out.println("Se pudo añadir el Componente "  + comp.getClass().getSimpleName());
		}
		return sePudo;
	}

	
	//4	En el caso de cualquier ventana: “Dibujando Ventana con los siguientes componentes:
	//  ” y a continuación se deberán dibujar cada componente que tenga dentro. 
	//(en el caso de que ninguno de los componentes de Campo de Texto que se agregaron
	//a la ventana tenga un cursor activado, activar el primer Campo de Texto  que fue agregado)

	 	
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando Ventana con los siguientes componentes:");
		for(Componente comp : this.componentes) {			
			this.hayCampoDeTextoConCursorActivadoSinoActivar();
			comp.dibujar();
			
			
		}		
	}
	
	private boolean hayCampoDeTextoConCursorActivadoSinoActivar() {
		boolean hayActivado = false;
		int i = 0;
		CampoDeTexto primerCampoDeTexto = null;
		while(i < this.componentes.size() && !hayActivado) {
			if(this.componentes.get(i) instanceof CampoDeTexto) {
				primerCampoDeTexto = (CampoDeTexto)this.componentes.get(i);
				if(((CampoDeTexto)this.componentes.get(i)).isCursorSituado()) {
					hayActivado = true;
				}else {
					i++;
				}
			}else {
				i++;
				
			}
		}
		if(!hayActivado && primerCampoDeTexto != null) {
			primerCampoDeTexto.situarCursor();
		}
		return hayActivado;
	}
	
	/*
	private void activarPrimerCampoDeTexto() {
		int i = 0;
		CampoDeTexto primerCampoDeTexto = null;
		while(i < this.componentes.size() && primerCampoDeTexto == null) {
			if(this.componentes.get(i) instanceof CampoDeTexto) {
				primerCampoDeTexto = (CampoDeTexto)this.componentes.get(i);
			}else {
				i++;
			}
		}		
		primerCampoDeTexto.situarCursor();
	}*/
	
	//C)	El método agregar de la clase Ventana que debe permitir agregar 
	//sobre la misma cualquier componente excepto si es una Ventana. 
	//En caso de que el componente se pueda agregar devolver true caso contrario
	//si es una Ventana devolver false. 
	

	

	
}
