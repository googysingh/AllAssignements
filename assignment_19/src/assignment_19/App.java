package assignment_19;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * 
	 * Given a string that contains a single pair of brackets, compute recursively a
	 * new string made of only of the brackets and their contents, so "xyz[abc]123"
	 * yields "[abc]".
	 * 
	 * <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
	 * insideBrackets("x[hello]") <b>---></b> [hello] <br>
	 * insideBrackets("[xy]1") <b>---></b> [xy] <br>
	 */

	public static String insideBrackets(String str) {

		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '[') {
				while (str.charAt(i) != ']') {
					result = result + str.charAt(i);
					i++;
				}
				result=result+']';
				break;
			}
		}
		return result;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}
