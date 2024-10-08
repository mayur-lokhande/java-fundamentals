package interview_preparation;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

	public static void main(String[] args) {

		String str = "My name is Mayur";

		// declare a HashMap
		HashMap<Character, Integer> count = new HashMap<>();
		char arr[] = str.toCharArray();

		for (char c : arr) {
			if (c != ' ') { //ignore white spaces
				if (count.containsKey(c)) {
					count.put(c, count.get(c) + 1);
				} else {
					count.put(c, 1);
				}
			}
		}
		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			System.out.println("Occurrences of " + entry.getKey() + " = " + entry.getValue());
		}
	}

}
