package ejparcial;

public class JuegoDeMesa extends Producto {

	private int cantJugadores;
	private int cartasDisponibles;
	public JuegoDeMesa(String nombre, String descripcion, int cantJugadores, int cartasDisponibles) {
		super(nombre, descripcion);
		this.cantJugadores = cantJugadores;
		this.cartasDisponibles = cartasDisponibles;
	}
	@Override
	public EstadoFuncionamiento evaluar() {
		EstadoFuncionamiento estado = null;
		if(this.cartasDisponibles% this.cantJugadores== 0) {
			estado = EstadoFuncionamiento.BUENO;
		}else {
			estado = EstadoFuncionamiento.MALO;
		}
		return estado;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Cantidad de jugadores: " + this.cantJugadores + ". Cartas disponibles: " + this. cartasDisponibles;
	}
	
}
