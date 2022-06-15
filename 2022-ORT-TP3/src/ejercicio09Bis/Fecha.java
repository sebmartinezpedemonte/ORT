package ejercicio09Bis;

public class Fecha {

	public static Fecha fechaHoy = new Fecha(2, 6, 2021);

	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		setAnio(anio);
		setMes(mes);
		setDia(dia);
	}

	public boolean estaVencido() {
		return fechaCompleta() < fechaHoy.fechaCompleta();
	}

	private int fechaCompleta() {
		return (this.anio * 100 + this.mes) * 10 + this.dia;
	}

	private void setAnio(int anio) {
		this.anio = anio;
	}

	private void setDia(int dia) {
		int tope = topeMes();
		if (dia < 1) {
			this.dia = 1;
		} else if (dia > tope) {
			this.dia = tope;
		} else {
			this.dia = dia;
		}
	}

	private void setMes(int mes) {
		if (mes < 1) {
			this.mes = 1;
		} else if (mes > 12) {
			this.mes = 12;
		} else {
			this.mes = mes;
		}
	}

	private int topeMes() {
		int tope = 0;
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			tope = 30;
			break;
		case 2:
			tope = 28 + bisiesto();
			break;
		default:
			tope = 31;
		}
		return tope;
	}

	private int bisiesto() {
		int diaExtra = 0;
		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
			diaExtra = 1;
		return diaExtra;
	}

	@Override
	public String toString() {
		return dia + "-" + mes + "-" + anio;
	}

}