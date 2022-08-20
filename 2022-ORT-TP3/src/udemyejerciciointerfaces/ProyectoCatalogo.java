package udemyejerciciointerfaces;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        Iphone iphone3 = new Iphone(7000, "Apple", "gris", "Iphone 3");
        System.out.println(iphone3.getPrecioVenta());
        IProducto[] productos = new Producto[6];
        productos[0] = new TvLcd(30000, "Samsung", 53);
        productos[1] = iphone3;
        productos[2] = new TvLcd(18000, "Sony", 40);
        productos[3] = new Libro(2000, new Date(), "Eric Gamma", "Elementos reusables POO", "Alguna...");
        productos[4] = new Libro(3000, new Date(), "Martin Fowler", "UML Gota a Gota","Alguna...");
        productos[5] = new Comics(500, new Date(), "Hannah Barbera", "Superman", "Classics", "superman");


        for(IProducto p : productos){
            System.out.println(p);
            System.out.println("Precio venta " + p.getPrecioVenta());

        }


    }

}
