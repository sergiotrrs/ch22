package clases;

import java.util.Scanner;
public class ClaseHija_depositomenu extends ClasePadre {
    Scanner entrada2 = new Scanner(System.in);

    ClaseHija_movimientos mov;

    public ClaseHija_depositomenu(ClaseHija_movimientos mov) {
        this.mov = mov;
    }

    @Override
    public void Transacciones() {
        int bandera = 0;
        int seleccion = 0;

        do {
            do {
                System.out.println("Por favor seleccione la opción correspondiente a donde desea depositar:");
                System.out.println("    1. Cuenta de cheques.");
                System.out.println("    2. Tarjeta de crédito.");
                System.out.println("    3. Cuenta de terceros.");
                System.out.println("    4. Salir de sección depósitos.");

                seleccion = entrada2.nextInt();
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("________________________________________");
                    System.out.println("Opción no disponible, vuelva a intentar.");
                    System.out.println("________________________________________");
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                ClasePadre mensajero = new ClaseHija_deposito(mov);
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                ClasePadre mensajero = new ClaseHija_tarjeta(mov);
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                ClasePadre mensajero = new ClaseHija_terceros(mov);
                mensajero.Transacciones();

            } else if (seleccion == 4) {
                System.out.println("------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("------------------------");
                bandera = 2;
            }
        }while (bandera != 2) ;


    }
}
