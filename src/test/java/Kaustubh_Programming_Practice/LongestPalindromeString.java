package Kaustubh_Programming_Practice;

public class LongestPalindromeString {

	public static String LongestPalindrome(String s) {
		if (s.length() < 1 || s == null) {
			return "";
		}
		int Start = 0, End = 0;

		for (int i = 0; i < s.length(); i++) {
			// for Odd Palindrome
			int len1 = expandFromCenter(s, i, i);

			// for even Palindrome
			int len2 = expandFromCenter(s, i, i + 1);

			int len = Math.max(len1, len2);

			if (len > End - Start) {
				Start = i - (len - 1) / 2;
				End = i + len / 2;

			}
		}
		System.out.println("Length of Longest Palindrome String :" + (s.substring(Start, End + 1)).length());
		return "Longest Palindrome String is: " + s.substring(Start, End + 1);

	}

	public static int expandFromCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
			left--;
			right++;

		}

		return right - left - 1;
	}

	public static void main(String[] args) {
		System.out.println(LongestPalindrome("ababacababa"));
	}

}
