import java.util.HashMap;


/**
 * This class will calculate the power function using base and exponent.
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
	
	/**
	 * Method to calculate the power using base and exponent
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static int power(Integer base ,Integer exponent) {
		HashMap<String,Integer> resultOutput=new HashMap<String, Integer>();
		HashMap<Integer,Integer> input=new HashMap<Integer, Integer>();
		input.put(base, exponent);
		
		int result=1;
		
		for (;exponent!=0;exponent--) {
			result *= base;
		}
		resultOutput.put("result", result);
		//System.out.println(input);
		//System.out.println(resultOutput);
		return result;
	}


}
