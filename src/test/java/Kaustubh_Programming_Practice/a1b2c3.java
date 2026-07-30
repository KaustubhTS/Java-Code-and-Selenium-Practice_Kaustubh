package Kaustubh_Programming_Practice;

public class a1b2c3 {

	public static String onlyCharacters(String s) {
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {

				s1 = s1 + s.charAt(i);
			}

			else {

				int x = Character.getNumericValue(s.charAt(i));
				for (int j = 1; j < x; j++) {

					s1 = s1 + s.charAt(i - 1);
				}
			}

		}
		return s1;

	}

	public static void main(String[] args) {

		System.out.println(onlyCharacters("a1b2c3d3f7"));

	}

}
