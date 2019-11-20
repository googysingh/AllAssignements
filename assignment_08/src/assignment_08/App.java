package assignment_08;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * Given 3 int arguments - a, b, c, return their sum. However, if one of the
	 * arguments is the same as any of the other ones, that number should not count
	 * towards the sum. So basically you only sum unique numbers, not duplicates
	 * <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * sumUnique(1, 2, 3) <b>---></b> 6 <br>
	 * sumUnique(3, 2, 3) <b>---></b> 2 <br>
	 * sumUnique(3, 3, 3) <b>---></b> 0 <br>
	 */

	public static int sumUnique(int a, int b, int c) {
		int sum = a + b + c;
		if (a==b & b==c) {
			sum = 0;
		} else if (a == c) {
			sum = b;
		} else if (b == c) {
			sum = a;
		}else if(a==b){
			sum=c;
		}
		return sum;

	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}
