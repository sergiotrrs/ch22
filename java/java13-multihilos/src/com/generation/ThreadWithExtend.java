package com.generation;

class MiHilo extends Thread {

	public MiHilo(String nombreHilo) {
		super(nombreHilo);
	}

	@Override
	public void run() {
		// En este método agrego mi recurrencia
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000); // Suspendemos el hilo en ms
				System.out.println("Valor de i: " + i + " del hilo : " + super.getName() + " con id " + super.getId());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class ThreadWithExtend {

	public static void main(String[] args) {

		MiHilo hilo01 = new MiHilo("primero");
		MiHilo hilo02 = new MiHilo("segundo");
		MiHilo hilo03 = new MiHilo("tercero");
		hilo01.start();
		hilo02.start();
		hilo03.start();

		/*
		 * for (int i = 0; i < 10; i++) System.out.println("Valor de i" + i);
		 * 
		 * for (int j = 0; j < 10; j++) System.out.println("Valor de j" + j);
		 * 
		 * for (int k = 0; k < 10; k++) System.out.println("Valor de k" + k);
		 */

	}

}