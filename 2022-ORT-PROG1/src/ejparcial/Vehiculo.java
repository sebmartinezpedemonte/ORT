package ejparcial;

public class Vehiculo extends Producto{
/*
 * Vehiculo
-
_-CANT_KMS_MIN:int = 10_
_-CANT_KMS_MAX:int = 50_
-cantKms:int
-
+evaluar():EstadoFuncionamiento
+getCantKms():int
+toString():String
 */
	private static final int CANT_KMS_MIN = 10;
	private static final int CANT_KMS_MAX = 50;
	private int cantKms;
	
	public Vehiculo(String nombre, String descripcion, int cantKms) {
		super(nombre, descripcion);
		this.cantKms = cantKms;
	}

	public int getCantKms() {
		return this.cantKms;
	}
	
	@Override
	public EstadoFuncionamiento evaluar() {
		EstadoFuncionamiento estado = null;
		if(this.cantKms < CANT_KMS_MIN) {
			estado = EstadoFuncionamiento.BUENO;
		}else if(this.cantKms <= CANT_KMS_MAX) {
			estado= EstadoFuncionamiento.REGULAR;
		}else{
			estado = EstadoFuncionamiento.MALO;
		}
		
		return estado;
	}
	@Override
	public String toString() {
		return super.toString() + " Cantidad de kilometros: " + this.cantKms  ;
	}
}

	
	
	

