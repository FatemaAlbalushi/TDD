import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	/**
	 * This test to check the reverse string 
	 * 1. Take null as an argument.
   	 * 2. Take an empty string as as argument.
   	 * 3. Take a string with only a single character.
	 */
	void testReverseString() {
		ReverseString TRinstanc= new ReverseString(); 
		String string ="this is a sentence";
		assertEquals("ecnetnes a si siht", TRinstanc.reverseString(string,""));
	}//End of testReverseString method
	
	@Test
	void testReverseString1() {
		ReverseString TRinstanc= new ReverseString(); 
		String string = null;
		assertEquals(null, TRinstanc.reverseString(string,null));
		
		
	}//End of testReverseString1 method
	
	@Test
	void testReverseString3() {
		ReverseString TRinstanc= new ReverseString(); 
		String string =" ";
		assertEquals(" ", TRinstanc.reverseString(string,""));
	}//End of testReverseString2 method

	@Test
	void testReverseString4() {
		ReverseString TRinstanc= new ReverseString(); 
		String string ="t";
		assertEquals("t", TRinstanc.reverseString(string,""));
	}//End of testReverseString3 method
}
