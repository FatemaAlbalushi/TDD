import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
/**
 * This test class will test the split method for different case.
 */

class SplitStringTest extends SplitString {

	/**
	 * 1. Take null for both of the arguments.
	 * 2. Take an empty string as the first argument.
	 * 3. Take an empty string as the second argument.
     * 4. Return an empty array.
‌
	 */
	@Test
	//1. Take null for both of the arguments.
	void test1() {
		ArrayList<String> arraylist1 = new ArrayList<>();
		SplitString Ssinstanc= new SplitString(); 
		String sentence = null;
		arraylist1.add("");
		assertEquals(arraylist1, Ssinstanc.Split(sentence, null));
		
	}
	
	@Test
	//2. Take an empty string as the first argument.
	void test2() {
		SplitString Ssinstanc= new SplitString(); 
		ArrayList<String> arraylist1 = new ArrayList<>();
		assertEquals(arraylist1, Ssinstanc.Split("",' '));
	}
	
	@Test
	//3. Take an empty string as the second argument.
	void test3() {
		SplitString Ssinstanc= new SplitString(); 
		ArrayList<String> arraylist1 = new ArrayList<>();
		
		String sentence = "This is a sentence";
		arraylist1.add("This ");
		arraylist1.add("is ");
		arraylist1.add("a ");
		arraylist1.add("sentence");
		assertEquals(arraylist1, Ssinstanc.Split(sentence,' '));
		
	}
	@Test
	//4. Return an empty array.
	void test4() {
		SplitString Ssinstanc= new SplitString(); 
		ArrayList<String> arraylist1 = new ArrayList<>();
		String sentence = "";
		assertEquals(arraylist1, Ssinstanc.Split(sentence,' '));
		
	}

}
