package Kaustubh_Programming_Practice;

public class NumberToWord {

	public static void main(String[] args) {
		String a = "a2b3c4";

		for (int i = 0; i < a.length(); i++) {
			if (Character.isAlphabetic(a.charAt(i))) {
				System.out.print(a.charAt(i));
			}

			else {
				int x = Character.getNumericValue(a.charAt(i));
				for (int j = 1; j < x; j++) {
					System.out.print((a.charAt(i - 1)));
				}
			}

		}

	}

}
