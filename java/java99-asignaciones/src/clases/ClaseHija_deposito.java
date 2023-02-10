package clases;

import java.time.LocalDateTime;

public class ClaseHija_deposito extends ClasePadre {

    ClaseHija_movimientos mov;

    public ClaseHija_deposito(ClaseHija_movimientos mov) {
        this.mov = mov;
    }

    @Override
    public void Transacciones() {
        System.out.print("Cuanto deseas depositar: ");
        Deposito();
        restocien = deposito%100;
        restocincuenta = deposito%50;

        if(restocien ==0 || restocincuenta == 0){
            transacciones = getSaldo();
            setSaldo(transacciones + deposito);
            System.out.println("----------------------------------");
            System.out.println("Depositaste: " + deposito);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("------------------------------------");
            mov.guardar("Movimiento: Depósito de efectivo. Fecha y hora de realización: "+(LocalDateTime.now().format(formato)));
        }else {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Solo puedes depositar multiplos de 50 y 100, intenta de nuevo.");
            System.out.println("--------------------------------------------------------------");
        }



    }
}
