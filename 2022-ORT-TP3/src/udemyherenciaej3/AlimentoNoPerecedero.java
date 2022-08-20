package udemyherenciaej3;

public class AlimentoNoPerecedero extends Alimento {
    private int contenido;
    private int calorias;

    public AlimentoNoPerecedero(String nombre, Double precio, boolean dulce, int contenido, int calorias) {
        super(nombre, precio, dulce);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }



    @Override
    public String toString() {
        return super.toString() + "NoPerecible{" +
                "contenido=" + contenido +
                ", calorias=" + calorias +
                '}';
    }
}
