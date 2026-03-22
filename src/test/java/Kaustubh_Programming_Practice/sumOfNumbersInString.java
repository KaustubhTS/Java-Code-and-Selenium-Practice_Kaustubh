package Kaustubh_Programming_Practice;

public class sumOfNumbersInString {

	public static int sumOfNumbersInString(String s) {
		char[] a = s.toCharArray();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i])) {
				int k = Character.getNumericValue(a[i]);
				sum = sum + k;
			}

		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Sumof digits in String is : " + sumOfNumbersInString("a1b2c3d4"));

	}

}
