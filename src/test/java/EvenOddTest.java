import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

/**
 * This class to test the different case test for the EvenOdd Class.
 *
 */
class EvenOddTest {

	/**
	 * There is 5 main case test which is : 1. Empty array as an argument. 2. array
	 * with all even numbers. 3. array with all odd numbers. 4. array with mixed
	 * even and odd numbers. 5. null as an argument, instead of an array. ‌ Test
	 * method for {@link EvenOdd#EvenOdd(int[])}.
	 */

	// 1. Empty array as an argument.
	// Empty array
	@Test
	void testEvenOdd1() {
		EvenOdd eoinstanc = new EvenOdd();
		HashMap<String, ArrayList<Integer>> evenosshashmap1 = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> Odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		int[] arr1 = new int[] {};
		assertEquals(evenosshashmap1, eoinstanc.EvenOdd(arr1));

	}

	// 2. array with all even numbers.
	// int [] arr2= {2,4,6,8};
	@Test
	void testEvenOdd2() {
		EvenOdd eoinstanc = new EvenOdd();
		HashMap<String, ArrayList<Integer>> evenosshashmap1 = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> Odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		evenosshashmap1.put("Even", even);
		int[] arr2 = new int[] { 2, 4, 6, 8 };
		assertEquals(evenosshashmap1, eoinstanc.EvenOdd(arr2));

	}

	// 3. array with all odd numbers.
	// int [] arr3= {1,3,5,7};
	@Test
	void testEvenOdd3() {
		EvenOdd eoinstanc = new EvenOdd();
		HashMap<String, ArrayList<Integer>> evenosshashmap1 = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> Odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		Odd.add(1);
		Odd.add(3);
		Odd.add(5);
		Odd.add(7);
		evenosshashmap1.put("Odd", Odd);
		int[] arr3 = new int[] { 1, 3, 5, 7 };
		assertEquals(evenosshashmap1, eoinstanc.EvenOdd(arr3));

	}

	// 4. array with mixed even and odd numbers.
	@Test
	void testEvenOdd4() {
		EvenOdd eoinstanc = new EvenOdd();
		HashMap<String, ArrayList<Integer>> evenosshashmap1 = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> Odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		even.add(2);
		Odd.add(3);
		Odd.add(7);
		even.add(6);
		even.add(4);
		Odd.add(9);
		Odd.add(5);
		Odd.add(7);
		evenosshashmap1.put("Even", even);
		evenosshashmap1.put("Odd", Odd);
		int[] arr4 = new int[] { 2, 3, 7, 6, 9, 4, 5, 7 };
		assertEquals(evenosshashmap1, eoinstanc.EvenOdd(arr4));

	}

}


