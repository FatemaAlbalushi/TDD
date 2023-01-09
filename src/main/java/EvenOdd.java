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
		
		int [] arr1= {};
		int [] arr2= {2,4,6,8};
		int [] arr3= {1,3,5,7};
		int [] arr4= {2,3,7,6,9,4,5,7};
		
		
		System.out.println("Print Even and Odd number");
		EvenOdd(arr4);
		System.out.println();

	}

	/**
	 * This method to find the even and odd number in an array
	 * @param arrayInput
	 */
	public static HashMap<String, ArrayList<Integer>> EvenOdd(int[] arrayInput) {
		// create hashmap 
		HashMap<String,ArrayList<Integer>> evenosshashmap=new HashMap<String, ArrayList<Integer>>();
		// creat two empty arraylist for even and odd number
		ArrayList<Integer>even=new ArrayList<Integer>();
		ArrayList<Integer>odd=new ArrayList<Integer>();
		
		// Adding the even number in even arraylist 
		for(int index=0; index<arrayInput.length;index++) {
			if ( arrayInput[index] %2 == 0) {
				even.add(arrayInput[index]);
				evenosshashmap.put("Even", even);
			}	
		}
		// Adding the odd number in odd arraylist 
		for(int j=0; j<arrayInput.length;j++) {
			if ( arrayInput[j] %2 != 0) {
				odd.add(arrayInput[j]);	
				evenosshashmap.put("Odd", odd);	
			}
		}
		System.out.println( evenosshashmap);
		return evenosshashmap;	
	}
}
