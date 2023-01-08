import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. Empty array as an argument.
   		 * 2. array with all even numbers.
   		 * 3. array with all odd numbers.
   		 * 4. array with mixed even and odd numbers.
   		 * 5. null as an argument, instead of an array.
		 */
		int [] arr1= {};
		int [] arr2= {2,4,6,8};
		int [] arr3= {1,3,5,7};
		int [] arr4= {2,3,7,6,9,4,5,7};
		//int [] arr5= null;
		//int [] number= {2,3,7,6,9,4,5,7};
		
		System.out.println("Print Even and Odd number");
		EvenOdd(arr1);
		System.out.println();

	}

	
	public static void EvenOdd(int[] arrayInput) {
		// create 
		HashMap<String,ArrayList<Integer>> evenosshashmap=new HashMap<String, ArrayList<Integer>>();
		
		ArrayList<Integer>even=new ArrayList<Integer>();
		ArrayList<Integer>odd=new ArrayList<Integer>();
		for(int index=0; index<arrayInput.length;index++) {
			if ( arrayInput[index] %2 == 0) {
				even.add(arrayInput[index]);
				evenosshashmap.put("Even", even);
			}	
		}
		for(int j=0; j<arrayInput.length;j++) {
			if ( arrayInput[j] %2 != 0) {
				odd.add(arrayInput[j]);	
				evenosshashmap.put("Odd", odd);	
			}
		}
		System.out.println( evenosshashmap);	
	}
}
