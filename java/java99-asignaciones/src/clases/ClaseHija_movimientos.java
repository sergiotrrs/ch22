package clases;


import java.util.ArrayList;
import java.util.List;

public class ClaseHija_movimientos extends ClasePadre {
    private static List<String> movimientos = new ArrayList<>();



    public  void guardar(String a){
        movimientos.add(a);
    }
    @Override
    public void Transacciones() {
        System.out.println("-------------------------------");
        System.out.println("Tus últimos movimientos son: ");
        System.out.println("--------------------------------");
        movimientos.forEach(a -> System.out.println(a));

    }


}



