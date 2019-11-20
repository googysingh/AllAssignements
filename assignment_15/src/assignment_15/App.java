package assignment_15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import ignore.TestingUtils;

public class App {

	/*
	 * 
	 * Given a string, return the length of the longest streak of the same chars in
	 * the string.
	 * 
	 * <br> <br>
	 * 
	 * <b>EXPECTATIONS:</b><br> longestStreak("hayyeu") <b>---></b> 2<br>
	 * longestStreak("XPNzzzddOOOxx") <b>---></b> 3 <br> longestStreak("")
	 * <b>---></b> 0 <br>
	 */

	public static int longestStreak(String str) {
		/*
		 * int count = 1, temp = 0; if (str.length() < 2 && str.charAt(0) !=
		 * str.charAt(1)) { count = 1; } else { for (int i = 1; i < str.length(); i++) {
		 * if (str.charAt(i - 1) == str.charAt(i)) { count++; if (count > temp) { temp =
		 * count; } else { count = 1; } } } }
		 */

		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c=str.charAt(i);
			if (hm.containsKey(c)==false) {
				hm.put(c, 1);
			} else {
				hm.put(c, hm.get(c) + 1);
			}
		}

		Set<Character> count = hm.keySet();
		int temp = 0, t1 = 0;
		Iterator<Character> it = count.iterator();
		while (it.hasNext()) {
			t1 = hm.get(it.next());
			if (t1 > temp) {
				temp = t1;
			}
		}

		return temp;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}