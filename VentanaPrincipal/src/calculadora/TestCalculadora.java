package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testSuma() {
		int res = Calculadora.suma(3, 2);
		int esperado = 5;
		
		assertEquals(esperado, res);
	}
	
	@Test
	public void testResta() {
		int res = Calculadora.resta(2, 3);
		int esperado = 1;
		
		assertEquals(esperado, res);
	}

}
