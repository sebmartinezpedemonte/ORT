package parcial.trenes;

public class Vagon {

	private TipoVagon tipoVagon;
	private int cargaPorTipo;
	private int carga;

	public Vagon(TipoVagon tipoVagon) {
		super();
		this.tipoVagon = tipoVagon;	
		setCarga(carga);
		setCargaPorTipo(tipoVagon);
	}
	
	private void setCargaPorTipo(TipoVagon tipoVagon) {
		if(tipoVagon.equals(TipoVagon.LARGE)) {
			cargaPorTipo = 50;
		}else if(tipoVagon.equals(TipoVagon.MEDIUM)){
			cargaPorTipo = 40;
		}else if(tipoVagon.equals(TipoVagon.SMALL)){
			cargaPorTipo = 30;
		}
	}

	public TipoVagon getTipoVagon() {
		return tipoVagon;
	}
	
	//public int getToneladasVagon() {
	//	return tipoVagon.getCantToneladas();
	//}

	public void setTipoVagon(TipoVagon tipoVagon) {
		this.tipoVagon = tipoVagon;
	}

	public int getCargaPorTipo() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getCargaPorTipo(TipoVagon tipoVagon) {
		if(tipoVagon.equals(TipoVagon.LARGE)) {
			cargaPorTipo = 50;
		}else if(tipoVagon.equals(TipoVagon.MEDIUM)){
			cargaPorTipo = 40;
		}else if(tipoVagon.equals(TipoVagon.SMALL)){
			cargaPorTipo = 30;
		}
		return cargaPorTipo;
	}

	@Override
	public String toString() {
		return "Vagon [tipoVagon=" + tipoVagon + ", cargaPorTipo=" + cargaPorTipo + ", carga=" + carga + "]";
	}
	
	

}
