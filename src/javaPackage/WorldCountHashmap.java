package javaPackage;

import java.util.HashMap;

public class WorldCountHashmap {

	public static void main(String[] args) {

		String s = "aaaaaaaabbbbbbbbbbbbbbbbcccccccccccccccccccccccccccccccccccccccc";
		HashMap<Character, Number> HM = new HashMap<>();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (HM.containsKey(s.charAt(i))) {
				int count = (int) HM.get(s.charAt(i));
				HM.put(s.charAt(i), ++count);
			} else {
				HM.put(s.charAt(i), 1);
			}
		}
		System.out.println(HM);
	}

}
