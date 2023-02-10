package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHija_movimientos mov = new ClaseHija_movimientos();
        ClasePadre mensajero = new ClaseHija_consulta(mov);
        mensajero.setSaldo(10_000);
        mensajero.Operaciones(mov);
    }


}
