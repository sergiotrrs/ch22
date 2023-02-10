package clases;

import java.util.ArrayList;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public abstract class ClasePadre {
    // protected int transacciones, retiro, deposito;
    protected double transacciones, retiro, deposito, restocien, restocincuenta;
    // private static int saldo;
    private static double saldo;






    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    Scanner entrada = new Scanner(System.in);

    public void Operaciones(ClaseHija_movimientos mov) {

        int bandera = 0;
        int seleccion = 0;

        do {
            int contador = 0;
            do {
                System.out.println("Por favor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Realizar depósitos.");
                System.out.println("    4. Quejas.");
                System.out.println("    5. Revisar el último movimiento.");
                System.out.println("    6. Hablar con un asesor.");
                System.out.println("    7. Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 7) {
                    bandera = 1;
                } else {
                    contador++;
                    System.out.println("________________________________________");
                    System.out.println("Opción no disponible, vuelva a intentar.");
                    System.out.println("________________________________________");
                    if (contador > 2) {
                        bandera = 2;
                    }
                }
            } while (bandera == 0);
            if (seleccion == 1) {
                ClasePadre mensajero = new ClaseHija_consulta(mov);
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                ClasePadre mensajero = new ClaseHija_retiro(mov);
                mensajero.Transacciones();

            } else if (seleccion == 3) {

                ClasePadre mensajero = new ClaseHija_depositomenu(mov);
                mensajero.Transacciones();
            } else if (seleccion == 5) {
                ClasePadre mensajero = new ClaseHija_movimientos();
                mensajero.Transacciones();
            } else if (seleccion == 6) {
                System.out.println("---------------------------------------------------------------");
                System.out.println("Nuestro horario de atención terminó. Por favor intenta después.");
                System.out.println("---------------------------------------------------------------");
                bandera = 2;
            } else if (seleccion == 7 || seleccion == 4) {
                System.out.println("------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("-------------------------");
                bandera = 2;
            }
        }
        while (bandera != 2);

    }

    //Método para solicitar cantidad de retiro
    public void Retiro() {
        // retiro = entrada.nextInt();
        retiro = entrada.nextDouble();
    }

    //Método para solicitar depósito
    public void Deposito() {
        // deposito = entrada.nextInt();
        deposito = entrada.nextDouble();
    }

    //Método abstracto
    public abstract void Transacciones();

    //Métodos setter y getter
    // public int getSaldo ()
    public double getSaldo() {
        return saldo;
    }

    //  public void setSaldo ( int saldo)
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}


