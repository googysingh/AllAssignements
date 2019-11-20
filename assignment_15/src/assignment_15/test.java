package assignment_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		hm.put('a', 1);
		hm.put('b', 2);
		hm.put('A', 1);
		hm.put('a', 0);
		hm.put('A', 3);
		hm.put('1', 2);
		System.out.println(hm.containsKey('B'));
		Set<Map.Entry<Character, Integer>> count = hm.entrySet();

		for (Map.Entry<Character, Integer> me : count) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());

		}

	}

}
