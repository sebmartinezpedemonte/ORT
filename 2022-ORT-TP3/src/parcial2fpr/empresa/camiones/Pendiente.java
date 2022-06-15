package parcial2fpr.empresa.camiones;

public class Pendiente {
	private Motivo motivo;
	private Paquete paquetePendiente;
	
	public Pendiente(Motivo motivo, Paquete paquetePendiente) {
		super();
		this.motivo = motivo;
		this.paquetePendiente = paquetePendiente;
	}
	public Motivo getMotivo() {
		return motivo;
	}
	public Paquete getPaquetePendiente() {
		return paquetePendiente;
	}
	@Override
	public String toString() {
		return "Pendiente [motivo=" + motivo + ", paquetePendiente=" + paquetePendiente + "]";
	}
	
	
}
