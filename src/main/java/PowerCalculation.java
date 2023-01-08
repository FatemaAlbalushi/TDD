import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class PowerCalculation {

	/**
	 * @param args
	 *  1. base: 0, exponent: 0
        2. base: null, exponent: null
        3. base: <any positive number>, exponent  <any positive number>
        4. base: <any negative number>, exponent  <any negative  number>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("Print exponantial base");
		power(2,3);

	}
	
	public static void power(int base ,int exponrnt) {
		HashMap<String,Integer> resultOutput=new HashMap<String, Integer>();
		HashMap<Integer,Integer> input=new HashMap<Integer, Integer>();
		input.put(base, exponrnt);
		
		int result=1;
		
		for (;exponrnt!=0;exponrnt--) {
			result *= base;
		}
		resultOutput.put("result", result);
		System.out.println(input);
		System.out.println(resultOutput);
	}

}
