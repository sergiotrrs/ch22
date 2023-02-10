package com.generation.cajero;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CajeroPavel {

		public static void main(String[] args) throws IOException, InterruptedException {
			int opc = 0, errorCount = 0;
			double cash = 10_000;
			Scanner sc = new Scanner(System.in);
			ArrayList<String> operaciones = new ArrayList<String>();

			while ( errorCount < 3 && opc != 9) {
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				
				System.out.println("============ Buen dia, bienvenido a MiBanco ============");
				System.out.println("(1) - Retirar saldo");
				System.out.println("(2) - Realizar deposito");
				System.out.println("(3) - Ver estado de cuenta");
				System.out.println("(4) - Realizar una queja");
				System.out.println("(5) - Ultimo movimiento");
				System.out.println("(7) - Hablar con un asesor");
				System.out.println("(9) - Salir");
				System.out.println("========================================================");
				System.out.print("\nSeleccione una opcion: ");
				opc = sc.nextInt();

				switch (opc) {
				// Retiros
				case 1:
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor(); // Limpia la terminal
					
					System.out.println("========================================================");
					System.out.println("Saldo disponible: $" + cash);
					System.out.println("========================================================");
					System.out.println("Ingrese cantidad de retiro (solo multiplos de 50): ");
					int retiro = sc.nextInt();
					// Mensajes de condicionales
					if (retiro%50 != 0) {
						System.out.println("La cantidad solo puede ser multiplo de 50.");
					} else if (retiro > 6000) {
						System.out.println("Lo sentimos, el limite de retiro es de $6000 M.N.");
					} else if (cash-retiro < 0) {
						System.out.println("Lo sentimos, saldo insuficiente en su cuenta.");
					} else {
						cash -= retiro;
						System.out.println("Retiro realizado con exito. Saldo disponible: $" + cash);
						operaciones.add(
								new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
								.format(new Date()) + " - Retiro: " + retiro);
					}
					
					Thread.sleep(5000);
					break;
				case 2:
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					
					System.out.println("========================================================");
					System.out.println("Seleccione el metodo de deposito");
					System.out.println("(1) - Cuenta de cheques");
					System.out.println("(2) - Tarjeta de credito");
					System.out.println("(3) - Cuenta de terceros");
					System.out.println("========================================================");
					System.out.print("Seleccione una opcion: ");
					int opcionDepositar = sc.nextInt();
					switch (opcionDepositar) {
					// Deposito con cheques
					case 1:
						System.out.println("========================================================");
						System.out.print("Ingrese cantidad de retiro (solo multiplos de 50 y/o 100): ");
						int cantidadSumar = sc.nextInt();
						if (cantidadSumar % 50 != 0) {
							System.out.println("La cantidad solo puede ser multiplo de 50 y/o 100.");
						} else {
							cash += cantidadSumar;
							System.out.println("Deposito exitoso. Dinero disponible: $" + cash);
							operaciones.add(
									new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
									.format(new Date()) + " - Deposito: $" + 
											cantidadSumar + " a cuenta de cheques.");
						}
						break;
					// Depositos con tarjeta	
					case 2:
						if (cash-200.10 < 0) {
							System.out.println("========================================================");
							System.out.println("Error, valores negativos en su cuenta.");
						} else {
							cash-=200.10;
							System.out.println("Transferencia exitosa por $200.10. Saldo disponible: $" + cash);
							operaciones.add(
									new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
									.format(new Date())+ " - Deposito: $" + 
											200.10 + " a tarjeta de credito");
						}
						break;
					// Cuentas a terceros
					case 3:
						if (cash-666.22 < 0) {
							System.out.println("========================================================");
							System.out.println("Error, valores negativos en su cuenta.");
						} else {
							cash -= 666.22;
							System.out.println("Transferencia exitosa por $666.22. Saldo disponible: " + cash);
							operaciones.add(
									new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
									.format(new Date()) + " - Deposito: " + 
											666.22 + " a cuenta de terceros");
						}
						break;
					default:
						errorCount++;
						System.out.println("========================================================");
						System.out.print("Opcion no valida. Intenta de nuevo.");
						System.out.println("\t\t\t\t\t\tErrores cometidos: " + errorCount);
						System.out.println("========================================================");
						break;
					}
					Thread.sleep(5000);
					break;
				// Saldo disponible
				case 3:
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					
					System.out.println("========================================================");
					System.out.println("Saldo total disponible en su cuenta: $" + cash + " M.N.");
					System.out.println("========================================================");
					Thread.sleep(5000);
					break;
				// Quejas
				case 4:
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					
					System.out.println("========================================================");
					System.out.println("Lo sentimos, actualmente el servicio se encuentra inactivo. Intente mas tarde");
					System.out.println("========================================================");
					Thread.sleep(5000);
					break;
				// Registro de ultimo movimiento
				case 5:
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					
					System.out.println("========================================================");
					System.out.println("Ultima operacion realizada: ");
					System.out.println("========================================================");
					System.out.println(operaciones.get(operaciones.size() - 1));
					Thread.sleep(5000);
					break;
				// Atencion al cliente
				case 7:
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					
					System.out.println("========================================================");
					System.out.println("Hoy no hay servicio, mañana si. \n(Fuera de horario de servicio)");
					System.out.println("========================================================");
					Thread.sleep(5000);
					break;
				case 9:
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					
					System.out.println("========================================================");
					System.out.println("Sesion finalizada.\nGracias por preferir MiBanco");
					System.out.println("========================================================");
					Thread.sleep(5000);
					break;
				default:
					errorCount++;
					System.out.println("========================================================");
					System.out.print("Opcion no valida. Intenta de nuevo.");
					System.out.println("\t\t\t\t\t\tErrores cometidos: " + errorCount + "/3.");
					System.out.println("========================================================");

				}
				if (errorCount >= 3) {
					System.out.println("========================================================");
					System.out.println("\nAlcanzo el limite de errores (3/3). El programa ha finalizado");
					System.out.println("========================================================");
				}
			}
	}
}