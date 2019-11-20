package assignment_16;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * Given a string, compute recursively (no loops) the number of times lowercase
	 * "yo" appears in the string. <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * yoYo("xhyoxx") <b>---></b> 1<br>
	 * yoYo("nyonnyon")<b>---></b> 2 <br>
	 * yoYo("yo") <b>---></b> 1 <br>
	 */

	public static int yoYo(String str) {
		int count = 0;
		String test = "yo";
		if (str.length() <= 1) {
			count = 0;
		} else {
			for (int i = 1; i < str.length(); i++) {
				String yo = String.valueOf(str.charAt(i - 1)) + String.valueOf(str.charAt(i));
				if (yo.equals(test)) {
					count++;
				}
			}
		}
		return count;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}
