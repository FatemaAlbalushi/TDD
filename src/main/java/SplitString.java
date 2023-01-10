import java.util.ArrayList;
import java.util.Stack;
/**
 * This program is able to split the sentence and return 
 *
 */
public class SplitString {
	/**
	 * The main will call the function using the input which is the sentence 
	 * call the split method to return an array list of words.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Reverse me if you can";
		System.out.println();
		System.out.println(Split(sentence, ' '));	
	}
	/**
	 * 
	 * @param str: the sentence to split
	 * @param ch: delimiter character to split.
	 * @return the split sentence without using split method(impliminting the split method) in arraylist
	 */
	public static ArrayList<String> Split(String str, Character ch) {
		ArrayList<String> arraylist1 = new ArrayList<>();
		if  (str == null || ch == null) {
			arraylist1.add("");
		    return arraylist1;
		}
		else {
			char[] charstr = str.toCharArray();
			String wordString = "";
			for (int i = 0; i < charstr.length; i++) {
				wordString = wordString + charstr[i];
				if (charstr[i] == ch || i == charstr.length - 1) {
					arraylist1.add(wordString);
					wordString = ""; 
				}
			}
			return arraylist1;
		}//End of Split method
		
		
	}	
}