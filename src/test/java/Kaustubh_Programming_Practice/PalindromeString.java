package Kaustubh_Programming_Practice;

public class PalindromeString {

	public static void Pal_String(String str) {
		String Rev_String = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Rev_String = Rev_String + str.charAt(i);

		}

		if (str.length() == 0 || str.equals("")) {
			System.out.println("String is empty");
		}

		else if (str.equals(Rev_String)) {
			System.out.println("String is Palindrome");
		}

		else {
			System.out.println("String is not palindrome");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pal_String("Kaustubh");
		Pal_String("");
		Pal_String("ababa");
	}

}
