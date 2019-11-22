package assignment_17;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * 
	 * Given a string, compute recursively a new string where all the lowercase 'o'
	 * chars have been moved to the end of the string.
	 * 
	 * <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * endoo("oore") <b>---></b> reoo<br>
	 * endoo("oohoi") <b>---></b> hiooo <br>
	 * endoo("oanotgo") <b>---></b> antgooo <br>
	 */

	public static String endoo(String str) {
		String result = "";
		String OO = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'o') {
				result = result + str.charAt(i);
			} else {
				OO = OO + str.charAt(i);
			}
		}
		return result.concat(OO);
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();
	}
}
