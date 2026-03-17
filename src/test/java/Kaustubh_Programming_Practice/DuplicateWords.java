package Kaustubh_Programming_Practice;

public class DuplicateWords {

	static void duplicate(String s) {

		String[] s1 = s.toLowerCase().split(" ");

		for (int i = 0; i < s1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count++;
					s1[j] = "";

				}
			}

			if (count > 1) {
				System.out.println(s1[i]);
			}
		}

	}

	public static void main(String[] args) {
		duplicate("Kaustubh is is kaustubh kaustubh work java ");

	}

}
