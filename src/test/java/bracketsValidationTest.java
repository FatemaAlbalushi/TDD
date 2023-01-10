import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

/**
 * This class is for brackets Validation
 */
class bracketsValidationTest extends bracketsValidation {

	/**
	 * 1.Take null as an arguments.
	 * 2.Take an empty string as an argument.
     * 3.Can throw an exception.
	 */
	@Test
	// 1.Take null as an arguments.
	void test() {
		bracketsValidationTest bvinstanc= new bracketsValidationTest();
		Stack<Character> mystack1 = new Stack<Character>();
		String string = null;
		assertEquals(false , bvinstanc.countBarn(string));
		
		
	}
	
	@Test
	// 2.Take an empty string as an argument.
	void test1() {
		bracketsValidationTest bvinstanc= new bracketsValidationTest();
		Stack<Character> mystack1 = new Stack<Character>();
		String string = " ";
		assertEquals(true , bvinstanc.countBarn(string));
		
		
	}
	

	@Test
	// 3.Can throw an exception.
	void test2() {
		bracketsValidationTest bvinstanc= new bracketsValidationTest();
		Stack<Character> mystack1 = new Stack<Character>();
		String string = null;
		assertThrows(NullPointerException.class, () -> {
	           bvinstanc.countBarn(string);
	  });
		//assertEquals(true , bvinstanc.countBarn(string));
	    
		
		
	}


}
