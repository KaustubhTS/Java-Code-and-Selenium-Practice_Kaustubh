package Kaustubh_Programming_Practice;

public class SwapFirstAndLastCharacter {

	static void swap1stAndLast(String s) {

		String[] sA = s.split(" ");

		for (String str : sA) {
			char atStart = str.charAt(0);

			char atLast = str.charAt(str.length() - 1);

			char temp = atStart;
			atStart = atLast;
			atLast = temp;

			System.out.print(atStart + str.substring(1, str.length() - 1) + atLast+" ");

		}

	}

	public static void main(String[] args) {

		swap1stAndLast("Kaustubh is my name");

	}

}
