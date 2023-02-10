package clases;

import java.time.LocalDateTime;

public class ClaseHija_tarjeta extends ClasePadre {

    ClaseHija_movimientos mov;

    public ClaseHija_tarjeta(ClaseHija_movimientos mov) {
        this.mov = mov;
    }

    @Override
    public void Transacciones() {
        System.out.print("Cuanto deseas depositar: ");
        Deposito();

        if(deposito <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - deposito);
            System.out.println("----------------------------------");
            System.out.println("Depositaste: " + deposito);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("------------------------------------");
            mov.guardar("Movimiento: Depósito tarjeta de crédito. Fecha y hora de realización: "+(LocalDateTime.now().format(formato)));

        }else {
            System.out.println("------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("-------------------");
        }

    }
}

