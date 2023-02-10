package com.generation.cajero;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class CajeroKarla {
	static double balance = 10000;
	static int contador = 0;
	static ArrayList<String> ultimoMovimiento = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int opcion = 0;
		ultimoMovimiento.add("\tNo hay movimientos \n");
		//Switch para la selecci�n de opnes del men�
		while (!exit) {
			opcionesMenu(); //Funci�n impresi�n del men�
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
			} else {
				sc.nextLine(); 	
			}
			switch (opcion) {
			case 1:
				contador = 0;
				balance = retiro();
				break;
			case 2:
				contador = 0;
				balance = deposito();
				break;
			case 3:
				contador = 0;
				System.out.format("Su saldo disponible es de $%8.2f ", balance);
				System.out.println("\n");
				break;
			case 4:
				System.out.println("\t-- QUEJAS --" + "Sesi�n finalizada...\n");
				exit = true;
				break;
			case 5:
				contador = 0;
				System.out.println("\t-- ULT. MOVIMIENTO -- ");
				System.out.println(ultimoMovimiento.get(ultimoMovimiento.size() - 1));
				break;
			case 7:
				contador = 0;
				System.out.println("\t-- COMUNICAR CON UN ASESOR -- "
						+ "No es horario de atenci�n. Por favor, intente de nuevo m�s tarde. \n");
				break;
			case 9:
				System.out.println("\t-- SALIR --");
				System.out.println("Gracias por usar nuestro cajero autom�tico");
				exit = true;
				break;
			default:
				contador++;
				System.out.println("Opci�n inv�lida");
				if (contador == 3) {
					System.out.println("Ha superado el n�mero de intentos permitidos. La sesi�n ha terminado. \n");
					exit = true;
				}
				break;
			}
		}
		sc.close();
	}
	//Funci�n impresi�n del men�
	static void opcionesMenu() {
		System.out.println("\t---MEN�---\n    Cajero Autom�tico");
		System.out.println("Opci�n 1: Retirar dinero");
		System.out.println("Opci�n 2: Hacer dep�sitos");
		System.out.println("Opci�n 3: Ver estado de cuenta");
		System.out.println("Opci�n 4: Quejas");
		System.out.println("Opci�n 5: �ltimo movimiento");
		System.out.println("Opci�n 7: Hablar con un asesor");
		System.out.println("Opci�n 9: Salir del cajero");
		System.out.println("Ingrese su opci�n: ");
	}
	
	//Funci�n Opci�n 1: Retiro de dinero
	public static double retiro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t-- RETIRO DE DINERO -- ");
		System.out.println("Ingrese la cantidad que desea retirar: ");
		double monto = sc.nextDouble();
		if (monto > balance) {
			System.out.println("No puede retirar una cantidad mayor a la disponible \n");
		} else if (monto > 6000) {
			System.out.println("No puede retirar m�s de $6000 \n");
		} else if (monto % 50 != 0 && monto % 100 != 0) {
			System.out.println("Solo puede retirar m�ltiplos de 50 y 100 \n");
		} else {
			balance -= monto;
			System.out.println("\tRetiro exitoso por $" + monto);
			System.out.println("\tTu nuevo saldo es " + balance + "\n");
			ultimoMovimiento.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + "\tRetiro: $"
					+ monto + "\n");
		}
		return balance;
	}

	/**
	 * Función que realiza el depósito en cuenta de terceros y tarjetas de crédito
	 * @return cantidad depositada
	 */
	public static double deposito() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t-- ESTADO DE CUENTA -- ");
		System.out.println("�D�nde desea depositar?");
		System.out.println("1. Cuenta de cheques");
		System.out.println("2. Tarjeta de cr�dito");
		System.out.println("3. Cuenta de terceros");
		int opcionDeposito = 0;
		if (sc.hasNextInt()) {
			opcionDeposito = sc.nextInt();
		} else {
			sc.nextLine(); 	
		}
		switch (opcionDeposito) {
		case 1:
			System.out.println("�Cu�nto deseas depositar en tu cuenta de cheques?");
			double deposito = sc.nextDouble();
			if (deposito % 50 != 0) {
				System.out.println("Solo se pueden depositar montos en m�ltiplos de 50 y 100 \n");
			} else {
				balance += deposito;
				System.out.println("Dep�sito exitoso por $" + deposito);
				System.out.println("Tu nuevo saldo es $" + balance + "\n");
				ultimoMovimiento.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + "\tDeposito: $"
						+ deposito + " a cuenta de cheques.\n" );
			}
			break;
		case 2:
			System.out.println("�Cu�nto deseas depositar en tu tarjeta de cr�dito?");
	        deposito = sc.nextDouble();
	        if (deposito <= balance) {
	          balance -= deposito;
	          System.out.println("Dep�sito exitoso por $" + deposito + " en tu tarjeta de cr�dito.");
	          System.out.println("Tu nuevo saldo es $" + balance + "\n");
	          ultimoMovimiento.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + "\tDeposito: $"
	        		  + deposito + " a tarjeta de cr�dito.\n" );
	        } else {
	          System.out.println("No puedes retirar una cantidad mayor a la disponible \n");
	        }
	        break;
		case 3:
			System.out.println("�Cu�nto deseas depositar en la cuenta de terceros?");
	        deposito = sc.nextDouble();
	        if (deposito <= balance) {
	          balance -= deposito;
	          System.out.println("Dep�sito exitoso por $" + deposito + " en la cuenta de terceros");
	          System.out.println("Tu nuevo saldo es $" + balance + "\n");
	          ultimoMovimiento.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + "\tDeposito: "
	        		  + deposito + " a la cuenta de terceros. \n");
	        } else {
	          System.out.println("No puedes retirar una cantidad mayor a la disponible \n");
	        }
			break;
		default:
			System.out.println("Opci�n inv�lida.");
			break;
		}
		return balance;
	}
}
