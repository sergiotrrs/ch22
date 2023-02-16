package com.generation;

class MiHiloRunnable implements Runnable {
	private String name;
	
	public MiHiloRunnable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return Thread.currentThread().getId();
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000); // Suspendemos el hilo en ms
				System.out.println("Valor de i: " + i + " del hilo : " + this.getName() + " con id " + this.getId());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

public class ThreadWithRunnable {
	
	public static void main(String[] args) {		
		MiHiloRunnable myThread = new MiHiloRunnable("PrimerHilo");		
		Thread hilo01 = new Thread( myThread );			

		Thread hilo02 = new Thread( new MiHiloRunnable("SegundoHilo") );
		Thread hilo03 = new Thread( new MiHiloRunnable("TercerHilo") );
		
		hilo01.start();
		hilo02.start();
		hilo03.start();
	}


}
