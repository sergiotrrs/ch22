package mx.generation;

public class OperacionesMath {
	
	//instance function
	int sumaEnteros(int a, int b) {
		return a + b;
	}
	
	//class function
	static double sumaDouble(double a, double b) {
		return a + b;
	}
	
	static double piPorNumero(double number) {
		return Math.PI * number;
	}
	
	static double numeroAleatorio() {
		return Math.random();
	}

	static double numeroAleatorio0a10() {
		return Math.random()*10;
	}

}
