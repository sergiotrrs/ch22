package clases;

import java.time.LocalDateTime;

public class ClaseHija_retiro extends ClasePadre {

    ClaseHija_movimientos mov;

    public ClaseHija_retiro(ClaseHija_movimientos mov) {
        this.mov = mov;
    }
    @Override
    public void Transacciones() {

        System.out.print("Cuanto desear retirar: ");
        Retiro();
        restocien = retiro%100;
        restocincuenta = retiro%50;

        if(restocien ==0 || restocincuenta == 0){
            if (retiro <= getSaldo() && retiro <= 6000) {
                transacciones = getSaldo();
                setSaldo(transacciones - retiro);
                System.out.println("-----------------------------------");
                System.out.println("Retiraste: " + retiro);
                System.out.println("Tu saldo actual es: " + getSaldo());
                System.out.println("-----------------------------------");
                mov.guardar("Movimiento: Retiro de efectivo. Fecha y hora de realización: "+(LocalDateTime.now().format(formato)));

            } else {
                System.out.println("-----------------------------------");
                System.out.println("Saldo insuficiente o mayor a 6,000.");
                System.out.println("-----------------------------------");
            }


        }else {
            System.out.println("------------------------------------------------------------");
            System.out.println("Solo puedes retirar multiplos de 50 y 100, intenta de nuevo.");
            System.out.println("------------------------------------------------------------");
        }


    }
}
