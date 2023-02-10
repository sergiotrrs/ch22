package com.generation.cajero;


import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class CajeroPax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		int dinero = 10000_00;
		ArrayList<String> movimientos = new ArrayList<String>();
		int fallosConsecutivos = 0;

		while (!salir) {
			System.out.println("             _____           _   _            _                      \r\n"
					+ "            |  __ \\         | \\ | |          | |                     \r\n"
					+ "            | |__) |_ ___  _|  \\| | ___  _ __| |_ ___                \r\n"
					+ "==========  |  ___/ _` \\ \\/ / . ` |/ _ \\| '__| __/ _ \\   ==========  \r\n"
					+ "            | |  | (_| |>  <| |\\  | (_) | |  | ||  __/               \r\n"
					+ "            |_|   \\__,_/_/\\_\\_| \\_|\\___/|_|   \\__\\___|               \r\n" + "");
			
			System.out.println("1) Retiro");
			System.out.println("2) Depósito");
			System.out.println("3) Estado de cuenta");
			System.out.println("4) Quejas");
			System.out.println("5) Historial de movimientos");
			System.out.println("7) Contactar asesor");
			System.out.println("9) Salir");
			System.out.print("Introduzca la opción deseada: ");

			if (sc.hasNextInt())
				opcion = sc.nextInt();
			else {
				opcion = 0;
				sc.next();
			}

			switch (opcion) {

			case 1:
				fallosConsecutivos = 0;
				double entrada = 0;
				System.out.printf("Monto disponible: $%.2f%n", dinero / 100f);
				System.out.println("Introduzca cantidad a retirar(debe ser múltiplo de 50): ");
				if (sc.hasNextDouble())
					entrada = sc.nextDouble();
				else {
					System.out.println("Entrada inválida.");
					sc.next();
				}
				int cantidad = (int) entrada * 100;
				if (cantidad <= 0)
					System.out.println("Entrada inválida.");
				else if (dinero - cantidad < 0)
					System.out.println("No hay fondos suficientes.");
				else if (cantidad % 50_00 != 0)
					System.out.println("La cantidad no es múltiplo de 50");
				else if (cantidad > 6000_00)
					System.out.println("Imposible retirar más de 6000");
				else {
					dinero -= cantidad;
					System.out.printf("Retiro exitoso. Monto disponible: $%.2f%n", dinero / 100f);
					movimientos.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + " - Retiro: "
							+ cantidad / 100f);
				}

				break;

			case 2:
				fallosConsecutivos = 0;
				int eleccion;
				System.out.println("¿Dónde desea depositar?");
				System.out.println("1) Cuenta de cheques");
				System.out.println("2) Tarjeta de crédito");
				System.out.println("3) Cuenta de terceros");
				System.out.print("Introduzca su opción: ");
				
				if (sc.hasNextInt())
					eleccion = sc.nextInt();
				else {
					eleccion = 0;
					sc.next();
				}
				
				switch (eleccion) {
					case 1:
						System.out.print("Introduzca monto a depositar(debe ser múltiplo de 50): ");
						int cantidadSumar = sc.nextInt();
						if (cantidadSumar % 50 != 0) {
							System.out.println("La cantidad no es múltiplo de 50");
						} else {
							dinero += cantidadSumar*100;
							System.out.printf("Depósito exitoso. Dinero disponible: $%.2f%n", dinero/100f);
							movimientos.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
								+ " - Deposito: $" + cantidadSumar + " a cuenta de cheques.");
						}
						break;
					case 2:
						if (dinero - 20010 < 0)
							System.out.println("No hay fondos disponibles.");
						else {
							dinero -= 20010;
							System.out.printf("Pago exitoso por $200.10. Dinero disponible: $%.2f%n", dinero/100f);
								movimientos.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
								+ " - Deposito: " + 20010/100f + " a tarjeta de crédito");
						}
						break;
					case 3:
						if (dinero - 66622 < 0) 
							System.out.println("Fondos insuficientes.");
						else{
						dinero -= 66622;
						System.out.printf("Pago exitoso por $666.22. Dinero disponible: $%.2f%n", dinero/100f);
						movimientos.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
								+ " - Deposito: " + 666.22 + " a cuenta de terceros");
						}
						break;
				
					default:
						System.out.println("Opción inválida.");
						break;
				
				}
				
				
				
				
				
				
				
				
				break;

			case 3:
				fallosConsecutivos = 0;
				System.out.printf("Monto disponible: $%.2f%n", dinero / 100f);
				break;

			case 4:

				try {
					Thread.sleep(7000);
				}

				catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				salir = true;

				break;

			case 5:

				fallosConsecutivos = 0;
				System.out.println(movimientos.size());

				if (movimientos.size() == 0) {
					System.out.println("No hay movimientos previos.");
				} else {
					for (String movimiento : movimientos)
						System.out.println(movimiento);
				}
				break;

			case 7:

				fallosConsecutivos = 0;
				System.out.println("Lo sentimos. Estamos fuera del horario de atención.");
				break;

			case 9:

				System.out.println("Gracias por confiarnos su dinero. Vuelva pronto.");
				salir = true;
				break;

			default:

				fallosConsecutivos++;

				if (fallosConsecutivos > 2) {
					System.out.println("\n ATAQUE DETECTADO. FINALIZANDO SESIÓN...");
					salir = true;
				} else
					System.out.println("La opción no es válida. Intente de nuevo.");
				break;
			}

		}
		sc.close();
	}

}