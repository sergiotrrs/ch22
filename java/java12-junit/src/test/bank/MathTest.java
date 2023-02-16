package test.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.generation.math.Math;

class MathTest {
	Math math = new Math() ;
	
	@Test
	@DisplayName("Sumatoria de números enteros")
	void sumaTest() {
		assertEquals( 10 , math.suma(8, 2), "Suma de 1 unidad" );
		assertEquals( 1_000 , math.suma(700, 300), "suma de centenas" );
		assertEquals( 100_000 , math.suma(8_000, 92_000), "suma de millares" );
		assertEquals( -10 , math.suma(-12, 2), "Suma de 1 unidad negativa" );
		assertEquals( -1000 , math.suma(-400, -600), "suma de centenas negativas" );
		assertEquals( -100_000 , math.suma(-200_000, 100_000), "suma de millares negativos" );			
	}
	
	@Test
	@DisplayName("Sumatoria de números de punto flotante")
	void sumaDoubleTest() {
		assertEquals( 10.1 , math.suma(10, 0.1), "Suma de 1 decimal");
		assertEquals( 10.2 , math.suma(10, 0.2), "Suma de 2 decimales");
		assertEquals( 10.3 , math.suma(10, 0.3), "Suma de 3 decimales");
		assertEquals( 10.4 , math.suma(10, 0.4), "Suma de 4 decimales");
		assertEquals( 10.5 , math.suma(10, 0.5), "Suma de 5 decimales");				
	}
	
	@Test
	@DisplayName("Sumatoria de 2 números de punto flotante")
	void sumaDoubleDoubleTest() {
		double delta = .001 ;
		assertEquals( 0.2 , math.suma(0.1, .1), delta, "Suma de .1 decimal");
		assertEquals( 0.3 , math.suma(0.1, .2), delta, "Suma de .2 decimales");		
		assertEquals( 0.4 , math.suma(0.1, .3), delta ); //0.39 - 0.41
		assertEquals( 0.5 , math.suma(0.1, .4), delta, "Suma de .4 decimales");
		assertEquals( 0.6 , math.suma(0.1, .5), delta, "Suma de .5 decimales");				
		assertEquals( 0.7 , math.suma(0.1, .6), delta, "Suma de .6 decimales");				
		assertEquals( 0.8 , math.suma(0.1, .7), delta, "Suma de .7 decimales");				
		assertEquals( 0.9 , math.suma(0.1, .8 ),delta, "Suma de .8 decimales");				
		assertEquals( 1.0 , math.suma(0.1, .9), delta, "Suma de .9 decimales");
		
	}

	
	
	
	
	
	
	
	
	
	

}
