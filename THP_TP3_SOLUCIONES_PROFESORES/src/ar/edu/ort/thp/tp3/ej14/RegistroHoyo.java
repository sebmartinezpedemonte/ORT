package ar.edu.ort.thp.tp3.ej14;

public class RegistroHoyo {
	private Hoyo hoyo;
	private int golpes;

	public RegistroHoyo(Hoyo hoyo, int golpes) {
		setHoyo(hoyo);
		setGolpes(golpes);
	}

	public int getGolpes() {
		return golpes;
	}

	public int getNumeroHoyo() {
		return hoyo.getNumero();
	}
	
	public int getValorParHoyo() {
		return hoyo.getValorPar();
	}
	
	public int getPuntaje() {
		return golpes - hoyo.getValorPar();
	}

	private void setGolpes(int golpes) {
		this.golpes = golpes;
	}

	private void setHoyo(Hoyo hoyo) {
		this.hoyo = hoyo;
	}

	@Override
	public String toString() {
		return "RegistroHoyo [hoyo=" + getNumeroHoyo() + "(par " + getValorParHoyo() + "), golpes=" + golpes + ", puntaje=" + getPuntaje() + "]";
	}

}
