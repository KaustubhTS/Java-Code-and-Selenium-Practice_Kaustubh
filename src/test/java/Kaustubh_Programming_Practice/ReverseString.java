package Kaustubh_Programming_Practice;

public class ReverseString {

	public static String ReverseString(String str) // Reverse String using String
	{
		String Rev_String = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Rev_String = Rev_String + str.charAt(i);
			// System.out.println(Rev_String);
		}

		return Rev_String;

	}

	// Reverse string using char array

	public static String ReverseStringChar(String str) {
		String Rev_String = "";
		char[] revString = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			Rev_String = Rev_String + revString[i];

		}

		return Rev_String;

	}

	public static String ReverseStringUsingStringBuffer(String str) // Reverse String using String Buffer
	{
		StringBuffer buf = new StringBuffer(str);
		String Rev_String = buf.reverse().toString();
		return Rev_String;
	}

	static void revAlternateWord(String str) {

		String[] s = str.split(" ");
		String altRev = "";
		int pointer = 0;

		for (String w : s) {
			if (pointer % 2 == 0) {
				for (int i = w.length() - 1; i >= 0; i--) {
					altRev = altRev + w.charAt(i);

				}
			}

			else {
				altRev = altRev + w;
			}

			pointer++;

			altRev = altRev + " ";

		}

		System.out.println(altRev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		revAlternateWord("Kaustubh is my name");
	}

}
