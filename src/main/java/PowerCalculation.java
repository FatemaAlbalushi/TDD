import java.util.HashMap;

/**
 * This class for calculating the power function using base and exeponent.
 *
 */
public class PowerCalculation {

	/**
	 * @param args
	 *  1. base: 0, exponent: 0
        2. base: null, exponent: null
        3. base: <any positive number>, exponent  <any positive number>
        
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("Print exponantial base");
		power(2,3);

	}
	
	public static int power(Integer base ,Integer exponrnt) {
		//HashMap<String,Integer> resultOutput=new HashMap<String, Integer>();
		HashMap<Integer,Integer> input=new HashMap<Integer, Integer>();
		input.put(base, exponrnt);
		
		Integer result=1;
		
		for (;exponrnt!=0;exponrnt--) {
			result *= base;
		}
		//resultOutput.put("result", result);
		//System.out.println(input);
		System.out.println(result);
		return result;
	}

}
