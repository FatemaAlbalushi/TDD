import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	/**
	 * This test to check the reverse string 
	 */
	void testReverseString() {
		ReverseString TRinstanc= new ReverseString(); 
		String string ="this is a sentence";
		assertEquals("ecnetnes a si siht", TRinstanc.reverseString(string,""));
	}//End of testReverseString method

}
