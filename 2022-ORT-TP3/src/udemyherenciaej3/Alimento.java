package udemyherenciaej3;

public class Alimento extends Producto{
    private boolean dulce;

    public Alimento(String nombre, Double precio, boolean dulce) {
        super(nombre, precio);
        this.dulce = dulce;
    }

    public boolean isDulce() {
        return dulce;
    }

    @Override
    public String toString() {
        return super.toString() + "Alimento{" +
                "dulce=" + dulce +
                '}';
    }
}
