package udemyejerciciointerfaces;

abstract public class Electronico extends Producto implements IElectronico{

    protected String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return this.fabricante;
    }


}
