package assignment_12;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * Return a version of the given string, where for every star (*) in the string
	 * the star and the chars immediately to its lef t and right are gone. So "ab*cd"
	 * yields "ad" and "ab**cd" also yields "ad". <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * starKill("cd*zq") <b>---></b>"cq"<br>
	 * starKill("ab**cd") <b>---></b> "ad" <br>
	 * starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */

	public static String starKill(String str) {
		String starKill = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '*' && i - 1 >= 0 && c == str.charAt(i - 1)) {
				starKill += "";
			} else {
				starKill += c;
			}
		}
		String resultLeft = "";
		String resultRight = "";
		for (int i = 0; i < starKill.length(); i++) {
			if (starKill.charAt(i) == '*') {
				int starIndex = starKill.indexOf("*");
				if (starIndex - 1 >= 1)
					resultLeft = starKill.substring(0, starIndex - 1);
				if (!((starIndex + 2) > starKill.length()))
					resultRight = starKill.substring(starIndex + 2);
				starKill = resultLeft + resultRight;
				i = 0;
			}
		}
		return starKill;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}
