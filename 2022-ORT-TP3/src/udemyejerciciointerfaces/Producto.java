package udemyejerciciointerfaces;

abstract public class Producto implements IProducto{
    protected int precio;

    public Producto(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return this.precio;
    }

    abstract public double getPrecioVenta();

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                '}';
    }
}
