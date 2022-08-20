package udemyejerciciointerfaces;

import java.util.Date;

public class Comics extends Libro{

    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*3;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "personaje='" + personaje + '\'' +
                ", precio=" + precio +
                '}';
    }
}
