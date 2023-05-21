import java.util.Stack;

/**
 * This class is for bracketsValidation.
 * check if all  open brackets are close. 
 */
public class bracketsValidation {
	/**
	 * Call the countBarn method with different input "String"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "{ int x= (int)(0+1); int[] arr=new arr[10];;; }";
		String str2 = "[{()}]";
		String str3 = "]{()}[";
		String str4 = "([](";
		String str5 = "(arr[10})";
		String str6 = "[arr(10)[";
		String str7 = "([arr{(10)}])";
		System.out.println("Print the validation of the string");
		System.out.println("Valid: " + str1 + " " + countBarn(str1));
		System.out.println("Valid: " + str2 + " " + countBarn(str2));
		System.out.println("Valid: " + str3 + " " + countBarn(str3));
		System.out.println("Valid: " + str4 + " " + countBarn(str4));
		System.out.println("Valid: " + str5 + " " + countBarn(str5));
		System.out.println("Valid: " + str6 + " " + countBarn(str6));
		System.out.println("Valid: " + str7 + " " + countBarn(str7));
		System.out.println();  

	}
	
	/**
	 * method for validate the brackets and check if all  brackets are close.
	 * @param str
	 * @return if the brackets is valid or not
	 */
	public static boolean countBarn(String str) {
		Stack<Character> mystack1 = new Stack<Character>();

			for (int index = 0; index < str.length(); index++) {
				
				
				for (int index1 = 0; index1 < str.length(); index1++) {

					if (str.charAt(index1) == '{') {
						mystack1.push(str.charAt(index1));
					}

					else if (str.charAt(index1) == '}') {
						if (mystack1.empty()) {
							return false;

						} else {
							mystack1.pop();
						}

					}
				}

				for (int index2 = 0; index2 < str.length(); index2++) {

					if (str.charAt(index2) == '(') {
						mystack1.push(str.charAt(index2));
					} else if (str.charAt(index2) == ')') {
						if (mystack1.empty()) {
							return false;

						} else {
							mystack1.pop();
						}

					}
				}

				for (int index3 = 0; index3 < str.length(); index3++) {
					if (str.charAt(index3) == '[') {
						mystack1.push(str.charAt(index3));
					}

					else if (str.charAt(index3) == ']') {
						if (mystack1.empty()) {
							return false;

						} else {
							mystack1.pop();
						}

					}
				}

			}

		if (mystack1.empty()) {
			return true;

		} else {
			return false;
		}

	}

}
