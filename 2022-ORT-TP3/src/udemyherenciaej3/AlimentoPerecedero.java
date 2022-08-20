package udemyherenciaej3;

public class AlimentoPerecedero extends Alimento {
    private int cantidad;
    private int proteinas;

    public AlimentoPerecedero(String nombre, Double precio, boolean dulce, int cantidad, int proteinas) {
        super(nombre, precio, dulce);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return super.toString() + "Lacteo{" +
                "cantidad=" + cantidad +
                ", proteinas=" + proteinas +
                '}';
    }
}
