package Kaustubh_Programming_Practice;

public class findFirstOccurance {

	public static void firstOccurance(String str) {
		char[] ch = str.toLowerCase().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			boolean repeating = false;

			for (int j = i+1; j < ch.length; j++) {
				if ( ch[i] == ch[j]) {
					repeating = true;
					break;
				}
			}

			if (!repeating) {
				System.out.println("First non-repeating: " + ch[i]);
				return;
			}
		}

		System.out.println("No non-repeating character found");
	}

	public static void main(String[] args) {
		firstOccurance("Kkkkkkkkkmaujkkstubhkkk kkk");

	}

}
