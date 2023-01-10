import java.util.Stack;

import javax.xml.stream.events.EndDocument;

/**
 * This program is for reversing a sentence.
 *
 */
public class ReverseString {

	/**
	 * This method is for reversing a string
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String string ="this is a sentence";
		String string = null;
		System.out.println(reverseString(null, null));
	}

	/**
	 * method to return the reverse of a string
	 * 
	 * @param userstring:   the input string which we went to find the reverse of
	 *                      it.
	 * @param reverseString : the userinput after being reversed
	 * @return : the reverseString
	 */
	public static String reverseString(String userstring, String reverseString) {
		if (userstring == null || reverseString == null)
			return null;

		else {
			reverseString = "";
			char[] userstringChar = userstring.toCharArray();
			for (int character = userstring.length() - 1; character >= 0; character--) {

				reverseString = reverseString + userstringChar[character];
			}
			return reverseString;
		}
	}// End the reverseString method

}
