/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class ReverseString {

	/**
	 * This method is for reversing a string
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string ="This is the string";
		System.out.println();
		System.out.println("Print the Reverse string");
		reverseString(string);
	}
	
	public static void reverseString(String userstring) {
		
		for(int character = userstring.length()-1;character >=0 ; character--) {
			 
			System.out.print(userstring.charAt(character));
		}
		System.out.println();
			
	}

}
