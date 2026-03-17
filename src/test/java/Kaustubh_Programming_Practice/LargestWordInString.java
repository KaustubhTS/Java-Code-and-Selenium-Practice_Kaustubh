package Kaustubh_Programming_Practice;

public class LargestWordInString {

	static String longestWord(String s) {

		String[] s1 = s.split(" ");
		String longestWord = "";

		for (String w : s1) {
			if (w.length() > longestWord.length()) {
				longestWord = w;
			}
		}

		return longestWord;
	}

	public static void main(String[] args) {

		System.out.println(longestWord("Kaustubh is my neme."));
		
		
		

	}

}
