package primerparcialmioprog12022;

public class OpcionAccesoAMenu extends OpcionDeMenu{
	
	private Menu menuSecundario;

	
	
	
	public OpcionAccesoAMenu(char caracter, String descripcion) {
		super(caracter, descripcion);
		this.menuSecundario = new Menu(descripcion);
		//ponen setters y no desarrollan los metodos
	}

	@Override
	public void ejecutar() {
		this.menuSecundario.ejecutar();		
	}
	
/*	//esto no es necesario por polimorfismo. El mostrar de clase padre cumple lo mismo para ambos
	@Override
	public void mostrar() {
		System.out.println(this.getCaracter() + " - " + this.getDescripcion());
		
	}*/
	
	
	
}
