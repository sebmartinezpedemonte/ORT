package ejparcial;

public class Electrodomestico extends Producto{
/*
 * Electrodomestico
-
_-NIVEL_MAXIMO:int = 100_
_-NIVEL_INTERMEDIO:int = 70_
_-NIVEL_BASICO:int = 45_
_-NIVEL_MINIMO:int = 0_
-indicadorUso:int
-
+evaluar():EstadoFuncionamiento
+toString():String
 */
	private final static int NIVEL_MAXIMO = 100; 
	private final static int NIVEL_INTERMEDIO = 70;
	private final static int NIVEL_BASICO = 45;
	private int indicadorUso;
	public Electrodomestico(String nombre, String descripcion, int indicadorUso) {
		super(nombre, descripcion);
		this.indicadorUso = indicadorUso;
	}
	@Override
	public EstadoFuncionamiento evaluar() {
		EstadoFuncionamiento estado = null;
		if(this.indicadorUso >= NIVEL_INTERMEDIO && this.indicadorUso <= NIVEL_MAXIMO) {
			estado = EstadoFuncionamiento.BUENO;
		}else if(this.indicadorUso >= NIVEL_BASICO && this.indicadorUso < NIVEL_INTERMEDIO) {
			estado= EstadoFuncionamiento.REGULAR;
		}else{
			estado = EstadoFuncionamiento.MALO;
		}
		
		return estado;
	}
	@Override
	public String toString() {
		return super.toString() + " Indicador de Uso: " + this.indicadorUso ;
	}
	
	
	
	
}
