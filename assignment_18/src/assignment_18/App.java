package assignment_18;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * 
	 * Given a string, compute recursively a new string where identical chars that
	 * are adjacent in the original string are separated from each other by a "-".
	 * 
	 * <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * repeatHyphen("hello") <b>---></b> hel-lo<br>
	 * repeatHyphen("xxyy") <b>---></b> x-xy-y <br>
	 * repeatHyphen("aaaa") <b>---></b> a-a-a-a <br>
	 */

	public static String hyphenSplit(String str) {
		String result = "";
		int l = str.length();
		if (l < 1 || l < 0) {
			result = str;
		} else {
			result = String.valueOf(str.charAt(0));
			for (int i = 1; i < l; i++) {
				if (str.charAt(i - 1) == str.charAt(i)) {
					result = result + "-" + str.charAt(i);
				} else {
					result = result + str.charAt(i);
				}
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
