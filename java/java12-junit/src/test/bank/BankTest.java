package test.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.generation.bank.Bank;

class BankTest {
	Bank bank;
	
	@BeforeEach
	public void setUp() {
		bank = new Bank(10_000);
	}
	
	@Test
	@DisplayName("Retiros múltiplos de $50")
	public void retiroExitoso() {
		assertEquals( 9_000 , bank.retiro(1_000), "Retiro de $1,000" );
		assertEquals( 8_950 , bank.retiro(50), "Retiro de $50" );				
		assertEquals( 8_850 , bank.retiro(100), "Retiro de $100" );						
	}

	@Test
	@DisplayName("Retiros con Balance con decimales")
	public void retiroBalanceConDecimales() {
		bank.setBalance(1_000.10);
		assertEquals( 900.1 , bank.retiro(100), "Retiro de $100" );
		assertEquals( 850.1 , bank.retiro(50), "Retiro de $50" );				
								
		bank.setBalance(1_000.20);
		assertEquals( 900.2 , bank.retiro(100), "Retiro de $100" );
		assertEquals( 850.2 , bank.retiro(50), "Retiro de $50" );				

		bank.setBalance(1_000.30);
		assertEquals( 900.3 , bank.retiro(100), "Retiro de $100" );
		assertEquals( 850.3 , bank.retiro(50), "Retiro de $50" );				
		
		bank.setBalance(1_000.40);
		assertEquals( 900.4 , bank.retiro(100), "Retiro de $100" );
		assertEquals( 850.4 , bank.retiro(50), "Retiro de $50" );				
		
	}
	
	@Test
	@DisplayName("Retiros con Excepciones")
	public void retiroConExcepcion() {
		bank.setBalance(50_000);
		assertThrows( IllegalArgumentException.class , ()-> bank.retiro(20) );
		assertThrows( IllegalArgumentException.class , ()-> bank.retiro(90) );
		assertThrows( IllegalArgumentException.class , ()-> bank.retiro(160) );
		assertThrows( IllegalStateException.class , ()-> bank.retiro(100_000) );
		Exception exception = assertThrows( IllegalArgumentException.class , 
				()-> bank.retiro(7_000) );
		assertEquals("No puede retirar más de $6000", exception.getMessage() );
				
	}
	
	

}
