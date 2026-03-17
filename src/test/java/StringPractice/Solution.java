package StringPractice;

class Solution {
	public static boolean isPalindrome(String s) {

		System.out.println(s);

		String newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(newString);

		StringBuffer sb1 = new StringBuffer(newString);
		String reverseString = sb1.reverse().toString();
		System.out.println(reverseString);

		if (s.equals(" ")) {
			return true;
		}
		if (s.equals(".")) {
			return true;
		}

		if (newString.equals(reverseString)) {
			return true;

		} else
			return false;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	}

}
