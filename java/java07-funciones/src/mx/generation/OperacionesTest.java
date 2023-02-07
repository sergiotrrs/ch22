package mx.generation;

public class OperacionesTest {

	public static void main(String[] args) {
		
		//Las funciones de clase(static) podemos
		//utilizarlas, directamente desde la clase.
		double sumaDouble = OperacionesMath.sumaDouble(2.1, 5);
		System.out.println(sumaDouble);
		
		//Para utiliza los métodos de instancia
		// es necesario hacer una instancia de la clase
		OperacionesMath operaciones = new OperacionesMath();
		int sumaInt = operaciones.sumaEnteros(5, 6);
		System.out.println(sumaInt);
		
		// Se recomienda invocar los métodos estáticos a travéz de 
		// la clase y no de las instancias.
		//double sumaDoubleInstancia = operaciones.sumaDouble(2.1, 2);

		System.out.println("pi * 5 = " + OperacionesMath.piPorNumero(5));
		System.out.println("Número aleatorio: " + OperacionesMath.numeroAleatorio() );
		System.out.printf("Número aleatorio: %3.2f" , OperacionesMath.numeroAleatorio() );
		System.out.printf("Número aleatorio 0 - 9.99: %3.2f" , OperacionesMath.numeroAleatorio0a10() );
		

	}

}
