package udemyherenciaej3;


import java.util.ArrayList;

/*
Para el ejemplo de la clase main se pide crear dos objetos por
 cada tipo de producto que deben ser almacenados en un arreglo
  del tipo Producto, se debe mostrar iterando el arreglo, por
   cada uno el detalle completo, el precio, nombre y los atributos adicionales.
 */
public class Test {
    public static void main(String[] args) {
        Limpieza limpieza1 = new Limpieza("Mr Musculo", 200.0, "Detergente", 1.5);
        Limpieza limpieza2 = new Limpieza("Ayudin", 150.0, "Lavandina", 2.0);
        AlimentoPerecedero per1= new AlimentoPerecedero("Leche",  150.0, true,  1, 100);
        AlimentoPerecedero per2 = new AlimentoPerecedero("Yogur", 100.0, false, 1, 50);
        AlimentoNoPerecedero noPer1 = new AlimentoNoPerecedero("Galletitas", 170.0, true, 10, 2000);
        AlimentoNoPerecedero noPer2 = new AlimentoNoPerecedero("Pan", 120.0, false, 5,1000);

        ArrayList<Producto> productosList = new ArrayList<>();
        productosList.add(per1);
        productosList.add(per2);
        productosList.add(noPer1);
        productosList.add(noPer2);
        productosList.add(limpieza1);
        productosList.add(limpieza2);


        for(Producto p : productosList){
            System.out.println(p);
        }

    }
}
