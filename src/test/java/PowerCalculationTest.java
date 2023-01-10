import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerCalculationTest {
	
	/**
	 * This test file test if the power 
	 * 1. base: 0, exponent: 0
     * 2. base: null, exponent: null
     * 3. base: <any positive number>, exponent  <any positive number>
     * 
	 */

	@Test
	//1. base: 0, exponent: 0
	void testPower() {
		PowerCalculation pwerinstanc= new PowerCalculation(); 
		assertEquals(1, pwerinstanc.power(0, 0));
		
	}
	@Test
	//2. base: null, exponent: null
	void testpower2() {
		PowerCalculation pwerinstanc= new PowerCalculation(); 
		assertNull(pwerinstanc.power(null ,null));
		
	}
	
	@Test
	//3. base: <any positive number>, exponent  <any positive number>
	void testpower3() {
		PowerCalculation pwerinstanc= new PowerCalculation(); 
		
		assertEquals(8, pwerinstanc.power(2, 3));
		
	}

}
