package com.generation.bank;


import java.util.Scanner;

public class Bank {
	private double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

		/**
		 * Retiro de dinero 
		 * @return balance
		 */
		public double retiro(double monto) {
			
			if (monto > balance) {
				throw new IllegalStateException("No puede retirar una cantidad mayor a la disponible");
				//System.out.println("No puede retirar una cantidad mayor a la disponible \n");
			} else if (monto > 6000) {
				throw new IllegalArgumentException("No puede retirar más de $6000");
				//System.out.println("No puede retirar m�s de $6000 \n");
			} else if (monto % 50 != 0 && monto % 100 != 0) {
				throw new IllegalArgumentException("Solo se puede retirar múltiplos de $50");
				//System.out.println("Solo puede retirar m�ltiplos de 50 y 100 \n");
			} else {
				balance -= monto;
				//System.out.println("\tRetiro exitoso por $" + monto);
				//System.out.println("\tTu nuevo saldo es " + balance + "\n");										
			}
			return balance;
		}
		
		public double solicitarCantidadAUsuario() {
			Scanner sc = new Scanner(System.in);
			System.out.println("\t-- RETIRO DE DINERO -- ");
			System.out.println("Ingrese la cantidad que desea retirar: ");
			double monto = sc.nextDouble();
			return monto;
		}

}
