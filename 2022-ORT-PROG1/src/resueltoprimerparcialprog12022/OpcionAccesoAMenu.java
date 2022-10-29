package resueltoprimerparcialprog12022;

public class OpcionAccesoAMenu extends OpcionDeMenu {

	private Menu menuSecundario;

	public OpcionAccesoAMenu(String descripcion, char selector, Menu menuSecundario) {
		super(descripcion, selector);
		setMenuSecundario(menuSecundario);
	}

	private void setMenuSecundario(Menu menuSecundario) {
		this.menuSecundario = menuSecundario;
	}

	@Override
	public void ejecutar() {
		this.menuSecundario.ejecutar();
	}

}
