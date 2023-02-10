package clases;

import java.time.LocalDateTime;

public class ClaseHija_consulta extends ClasePadre {

    ClaseHija_movimientos mov;

    public ClaseHija_consulta(ClaseHija_movimientos mov) {
        this.mov = mov;
    }
    @Override
    public void Transacciones() {
        System.out.println("----------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("----------------------------------");
        mov.guardar("Movimiento: Consulta de saldo. Fecha y hora de realización: "+(LocalDateTime.now().format(formato)));
    }

}
