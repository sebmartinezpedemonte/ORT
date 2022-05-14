package ejercicio13;

public class SuperHeroe {
	private String nombre;
	private int fuerza, resistencia, superpoderes;

	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	private int validacionSetter(int nro) {
		if (nro > 100) {
			return 100;
		} else if (nro < 0) {
			return 0;
		} else {
			return nro;
		}
	}

	private void setFuerza(int fuerza) {
		this.fuerza = validacionSetter(fuerza);
	}

	public int getResistencia() {
		return resistencia;
	}

	private void setResistencia(int resistencia) {
		this.resistencia = validacionSetter(resistencia);
	}

	public int getSuperpoderes() {
		return superpoderes;
	}

	private void setSuperpoderes(int superpoderes) {
		this.superpoderes = validacionSetter(superpoderes);
	}

	private boolean competirFuerza(SuperHeroe superHeroeACompetir) {
		return this.fuerza > superHeroeACompetir.getFuerza();
	}

	private boolean competirResistencia(SuperHeroe superHeroeACompetir) {
		return this.resistencia > superHeroeACompetir.getResistencia();
	}

	private boolean competirSuperpoderes(SuperHeroe superHeroeACompetir) {
		return this.superpoderes > superHeroeACompetir.getSuperpoderes();
	}

	private boolean igualesAtributos(SuperHeroe superHeroeACompetir) {
		boolean igualFuerza = this.fuerza == superHeroeACompetir.getFuerza();
		boolean igualResistencia = this.resistencia == superHeroeACompetir.getResistencia();
		boolean igualSuperPoderes = this.superpoderes == superHeroeACompetir.getSuperpoderes();
		return igualFuerza && igualResistencia && igualSuperPoderes;

	}

	public Resultado competir(SuperHeroe superHeroeACompetir) {
		boolean comparar2de3 = (competirFuerza(superHeroeACompetir) && competirResistencia(superHeroeACompetir))
				|| (competirFuerza(superHeroeACompetir) && competirSuperpoderes(superHeroeACompetir))
				|| (competirSuperpoderes(superHeroeACompetir) && competirResistencia(superHeroeACompetir));
		if ((competirFuerza(superHeroeACompetir) && competirResistencia(superHeroeACompetir)
				&& competirSuperpoderes(superHeroeACompetir))) {
			return Resultado.TRIUNFO;
		} else if (comparar2de3) {
			return Resultado.TRIUNFO;
		} else if (igualesAtributos(superHeroeACompetir)) {
			return Resultado.EMPATE;
		} else {
			return Resultado.DERROTA;
		}

	}

	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}

}
